/*  _____ _
 * |_   _| |_  _ _ ___ ___ _ __  __ _
 *   | | | ' \| '_/ -_) -_) '  \/ _` |_
 *   |_| |_||_|_| \___\___|_|_|_\__,_(_)
 *
 * Threema for Android
 * Copyright (c) 2013-2021 Threema GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package ch.threema.app.stores;

import android.os.NetworkOnMainThreadException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.threema.app.collections.Functional;
import ch.threema.app.collections.IPredicateNonNull;
import ch.threema.app.listeners.ContactListener;
import ch.threema.app.managers.ListenerManager;
import ch.threema.app.services.IdListService;
import ch.threema.app.services.PreferenceService;
import ch.threema.app.utils.ColorUtil;
import ch.threema.app.utils.SynchronizeContactsUtil;
import ch.threema.app.utils.TestUtil;
import ch.threema.base.Contact;
import ch.threema.base.ThreemaException;
import ch.threema.base.VerificationLevel;
import ch.threema.client.APIConnector;
import ch.threema.client.ContactStoreInterface;
import ch.threema.client.ContactStoreObserver;
import ch.threema.client.IdentityState;
import ch.threema.storage.DatabaseServiceNew;
import ch.threema.storage.factories.ContactModelFactory;
import ch.threema.storage.models.ContactModel;

public class ContactStore implements ContactStoreInterface {
	private static final Logger logger = LoggerFactory.getLogger(ContactStore.class);

	private APIConnector apiConnector;
	private final PreferenceService preferenceService;
	private DatabaseServiceNew databaseServiceNew;
	private final IdListService blackListService;
	private final IdListService excludeListService;
	private final HashMap<String, ContactModel> cache = new HashMap<>();

	public ContactStore(APIConnector apiConnector,
	                    PreferenceService preferenceService,
	                    DatabaseServiceNew databaseServiceNew,
	                    IdListService blackListService,
	                    IdListService excludeListService) {
		this.apiConnector = apiConnector;
		this.preferenceService = preferenceService;
		this.databaseServiceNew = databaseServiceNew;
		this.blackListService = blackListService;
		this.excludeListService = excludeListService;
	}

	@Override
	public byte[] getPublicKeyForIdentity(String identity, boolean fetch) {
		Contact contact = this.getContactForIdentity(identity);

		if (contact == null) {
			if (fetch) {
				try {
					//check if identity is on black list
					if(this.blackListService != null && this.blackListService.has(identity)) {
						return null;
					}

					if (this.preferenceService != null) {
						if (this.preferenceService.isSyncContacts()) {
							//check if is on exclude list
							if (this.excludeListService != null && !this.excludeListService.has(identity)) {
								SynchronizeContactsUtil.startDirectly(identity);

								//try to select again
								contact = this.getContactForIdentity(identity);
								if (contact != null) {
									return contact.getPublicKey();
								}
							}
						}

						//do not fetch if block unknown is enabled
						if (this.preferenceService.isBlockUnknown()) {
							return null;
						}
					}

					return this.fetchPublicKeyForIdentity(identity);
				} catch (Exception e) {
					logger.error("Exception", e);
					return null;
				}
			}
			return null;
		}

		return contact.getPublicKey();
	}

	/**
	 * Fetch a public key for a identity and save the contact
	 *
	 * @param identity
	 * @throws ThreemaException if a contact with this identity already exists
	 * @return
	 */
	public byte[] fetchPublicKeyForIdentity(String identity) throws FileNotFoundException {

		APIConnector.FetchIdentityResult result = null;
		try {
			Contact contact = this.getContactForIdentity(identity);
			if(contact != null) {
				//cannot fetch and save... contact already exists
				throw new ThreemaException("contact already exists, cannot fetch and save");
			}

			result = this.apiConnector.fetchIdentity(identity);
		}
		catch (FileNotFoundException e) {
			throw e;
		} catch (NetworkOnMainThreadException e) {
			throw e;
		} catch (Exception e) {
			//do nothing
			return null;
		}
		byte[] b = result.publicKey;

		if(b != null) {
			ContactModel contact = new ContactModel(identity, b);
			contact.setFeatureMask(result.featureMask);
			contact.setVerificationLevel(VerificationLevel.UNVERIFIED);
			contact.setDateCreated(new Date());
			contact.setType(result.type);
			switch (result.state) {
				case IdentityState.ACTIVE:
					contact.setState(ContactModel.State.ACTIVE);
					break;
				case IdentityState.INACTIVE:
					contact.setState(ContactModel.State.INACTIVE);
					break;
				case IdentityState.INVALID:
					contact.setState(ContactModel.State.INVALID);
					break;

			}

			this.addContact(contact);

			return b;
		}

		return null;
	}

	@Override
	@Nullable
	public Contact getContactForIdentity(String identity) {
		return this.databaseServiceNew.getContactModelFactory().getByIdentity(identity);
	}

	/**
	 * @param identity
	 * @return
	 */
	@Nullable
	public ContactModel getContactModelForIdentity(String identity) {
		if (!this.cache.containsKey(identity)) {
			return this.databaseServiceNew.getContactModelFactory().getByIdentity(identity);
		}

		return this.cache.get(identity);
	}

	@Nullable
	public ContactModel getContactModelForPublicKey(final byte[] publicKey) {
		//check cache first
		for(String identity: this.cache.keySet()) {
			if (Arrays.equals(publicKey, this.cache.get(identity).getPublicKey())) {
				return this.cache.get(identity);
			}
		}

		return this.databaseServiceNew.getContactModelFactory().getByPublicKey(publicKey);
		/*
		return Functional.select(ContactModelFactory.getAll(this.databaseServiceNew)this.databaseService.getContactDao().queryForAll(), new IPredicateNonNull<ContactModel>() {
			@Override
			public boolean apply(ContactModel contactModel) {
				return Arrays.equals(publicKey, contactModel.getPublicKey());
			}
		});*/
	}

	@Nullable
	public ContactModel getContactModelForLookupKey(final String lookupKey) {
		return this.databaseServiceNew.getContactModelFactory().getByLookupKey(lookupKey);
	}

	@Override
	public Collection<Contact> getAllContacts() {
		Collection<Contact> contacts = new ArrayList<>();

		contacts.addAll(this.databaseServiceNew.getContactModelFactory().getAll());

		return contacts;

	}

	@Override
	public void addContact(Contact contact) {
		ContactModel contactModel = (ContactModel)contact;
		boolean isUpdate = false;

		ContactModelFactory contactModelFactory = this.databaseServiceNew.getContactModelFactory();
		//get db record
		ContactModel existingModel = contactModelFactory.getByIdentity(contactModel.getIdentity());

		if (existingModel != null) {
			isUpdate = true;
			//check for modifications!
			if(TestUtil.compare(contactModel.getModifiedValueCandidates(), existingModel.getModifiedValueCandidates())) {
				logger.debug("do not save unmodified contact");
				return;
			}
		}

		if (contactModel.getColor() == 0) {
			// rebuild color for the contact model
			long count = this.databaseServiceNew.getContactModelFactory().count();
			contactModel.setColor(ColorUtil.getInstance().getRecordColor((int) count));
		}
		contactModelFactory.createOrUpdate(contactModel);

		if (!isUpdate) {
			this.fireOnNewContact(contactModel);
		} else {
			this.fireOnModifiedContact(contactModel);
		}
	}

	@Override
	public void hideContact(Contact contact, boolean hide) {
		ContactModel contactModel = (ContactModel)contact;
		contactModel.setIsHidden(hide);

		ContactModelFactory contactModelFactory = this.databaseServiceNew.getContactModelFactory();
		contactModelFactory.createOrUpdate(contactModel);

		if (hide) {
			this.fireOnRemovedContact(contactModel);
		} else {
			this.fireOnNewContact(contactModel);
		}
	}

	@Override
	public void removeContact(Contact contact) {
		this.removeContact((ContactModel)contact);
	}

	public void removeContact(final ContactModel contactModel) {
		this.databaseServiceNew.getContactModelFactory().delete(contactModel);

		synchronized (this.cache) {
			this.cache.remove(contactModel.getIdentity());
		}

		fireOnRemovedContact(contactModel);
	}

	@Override
	@Deprecated
	public void addContactStoreObserver(ContactStoreObserver observer) {
		//NOT IN USE
	}

	@Override
	@Deprecated
	public void removeContactStoreObserver(ContactStoreObserver observer) {
		//NOT IN USE
	}

	private void fireOnNewContact(final ContactModel createdContactModel) {
		ListenerManager.contactListeners.handle(new ListenerManager.HandleListener<ContactListener>() {
			@Override
			public void handle(ContactListener listener) {
				if(listener.handle(createdContactModel.getIdentity())) {
					listener.onNew(createdContactModel);
				}
			}
		});
	}

	private void fireOnModifiedContact(final ContactModel modifiedContactModel) {
		ListenerManager.contactListeners.handle(new ListenerManager.HandleListener<ContactListener>() {
			@Override
			public void handle(ContactListener listener) {
				if(listener.handle(modifiedContactModel.getIdentity())) {
					listener.onModified(modifiedContactModel);
				}
			}
		});
	}

	private void fireOnRemovedContact(final ContactModel removedContactModel) {
		ListenerManager.contactListeners.handle(new ListenerManager.HandleListener<ContactListener>() {
			@Override
			public void handle(ContactListener listener) {
				if(listener.handle(removedContactModel.getIdentity())) {
					listener.onRemoved(removedContactModel);
				}
			}
		});
	}

	public void reset(final ContactModel contactModel) {
		synchronized (this.cache) {
			ContactModel cached = Functional.select(this.cache, new IPredicateNonNull<ContactModel>() {
				@Override
				public boolean apply(@NonNull ContactModel contact) {
					return contact.getIdentity().equals(contactModel.getIdentity());
				}
			});
			if(cached != null) {
//				this.cache.put(contactModel.getIdentity(), contactModel);
			}
		}
	}
}
