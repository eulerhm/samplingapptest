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

package ch.threema.app.preference;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.TwoStatePreference;
import ch.threema.app.R;
import ch.threema.app.ThreemaApplication;
import ch.threema.app.activities.BlackListActivity;
import ch.threema.app.activities.ExcludedSyncIdentitiesActivity;
import ch.threema.app.dialogs.CancelableHorizontalProgressDialog;
import ch.threema.app.dialogs.GenericProgressDialog;
import ch.threema.app.exceptions.FileSystemNotPresentException;
import ch.threema.app.listeners.SynchronizeContactsListener;
import ch.threema.app.managers.ListenerManager;
import ch.threema.app.managers.ServiceManager;
import ch.threema.app.routines.SynchronizeContactsRoutine;
import ch.threema.app.services.SynchronizeContactsService;
import ch.threema.app.utils.AppRestrictionUtil;
import ch.threema.app.utils.ConfigUtils;
import ch.threema.app.utils.DialogUtil;
import ch.threema.app.utils.RuntimeUtil;
import ch.threema.app.utils.SynchronizeContactsUtil;
import ch.threema.localcrypto.MasterKeyLockedException;

public class SettingsPrivacyFragment extends ThreemaPreferenceFragment implements CancelableHorizontalProgressDialog.ProgressDialogClickListener {
	private static final Logger logger = LoggerFactory.getLogger(SettingsPrivacyFragment.class);

	private static final String DIALOG_TAG_VALIDATE = "vali";
	private static final String DIALOG_TAG_SYNC_CONTACTS = "syncC";
	private static final String DIALOG_TAG_DISABLE_SYNC = "dissync";

	private static final int PERMISSION_REQUEST_CONTACTS = 1;

	private ServiceManager serviceManager = ThreemaApplication.getServiceManager();
	private SynchronizeContactsService synchronizeContactsService;
	private TwoStatePreference contactSyncPreference;
	private CheckBoxPreference disableScreenshot;
	private boolean disableScreenshotChecked = false;

	private final SynchronizeContactsListener synchronizeContactsListener = new SynchronizeContactsListener() {
		@Override
		public void onStarted(SynchronizeContactsRoutine startedRoutine) {
			RuntimeUtil.runOnUiThread(new Runnable() {
				@Override
				public void run() {
					updateView();
					GenericProgressDialog.newInstance(R.string.wizard1_sync_contacts, R.string.please_wait).show(getFragmentManager(), DIALOG_TAG_SYNC_CONTACTS);
				}
			});
		}

		@Override
		public void onFinished(SynchronizeContactsRoutine finishedRoutine) {
			RuntimeUtil.runOnUiThread(new Runnable() {
				@Override
				public void run() {
					updateView();
					if(SettingsPrivacyFragment.this.isAdded()) {
						DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_SYNC_CONTACTS, true);
					}
				}
			});
		}

		@Override
		public void onError(SynchronizeContactsRoutine finishedRoutine) {
			RuntimeUtil.runOnUiThread(new Runnable() {
				@Override
				public void run() {
					updateView();
					if(SettingsPrivacyFragment.this.isAdded()) {
						DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_SYNC_CONTACTS, true);
					}
				}
			});
		}
	};

	@Override
	public void onCreatePreferencesFix(@Nullable Bundle savedInstanceState, String rootKey) {
		addPreferencesFromResource(R.xml.preference_privacy);

		try {
			if(this.requireInstances()) {
				this.synchronizeContactsService = this.serviceManager.getSynchronizeContactsService();
			}
		} catch (MasterKeyLockedException | FileSystemNotPresentException e) {
			logger.error("Exception", e);
		}

		this.disableScreenshot = (CheckBoxPreference) findPreference(getString(R.string.preferences__hide_screenshots));
		this.disableScreenshotChecked = this.disableScreenshot.isChecked();

		this.contactSyncPreference = (TwoStatePreference) findPreference(getResources().getString(R.string.preferences__sync_contacts));
		CheckBoxPreference blockUnknown = (CheckBoxPreference) findPreference(getString(R.string.preferences__block_unknown));

		if (SynchronizeContactsUtil.isRestrictedProfile(getActivity())) {
			// restricted android profile (e.g. guest user)
			this.contactSyncPreference.setChecked(false);
			this.contactSyncPreference.setEnabled(false);
			this.contactSyncPreference.setSelectable(false);
		} else {
			this.contactSyncPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					boolean newCheckedValue = newValue.equals(true);
					if (((TwoStatePreference) preference).isChecked() != newCheckedValue) {
						if (newCheckedValue) {
							enableSync();
						} else {
							disableSync();
						}
					}
					//always return true, fix samsung preferences handler
					return true;
				}
			});
		}

		if (ConfigUtils.isWorkRestricted()) {
			Boolean value = AppRestrictionUtil.getBooleanRestriction(getString(R.string.restriction__block_unknown));
			if (value != null) {
				blockUnknown.setEnabled(false);
				blockUnknown.setSelectable(false);
			}
			value = AppRestrictionUtil.getBooleanRestriction(getString(R.string.restriction__disable_screenshots));
			if (value != null) {
				this.disableScreenshot.setEnabled(false);
				this.disableScreenshot.setSelectable(false);
			}
			value = AppRestrictionUtil.getBooleanRestriction(getString(R.string.restriction__contact_sync));
			if (value != null) {
				this.contactSyncPreference.setEnabled(false);
				this.contactSyncPreference.setSelectable(false);
			}
		}

		if (ConfigUtils.getScreenshotsDisabled(ThreemaApplication.getServiceManager().getPreferenceService(),
						ThreemaApplication.getServiceManager().getLockAppService())) {
			this.disableScreenshot.setEnabled(false);
			this.disableScreenshot.setSelectable(false);
		}

		findPreference("pref_excluded_sync_identities").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				startActivity(new Intent(getActivity(), ExcludedSyncIdentitiesActivity.class));
				return false;
			}
		});

		findPreference("pref_black_list").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				startActivity(new Intent(getActivity(), BlackListActivity.class));
				return false;
			}
		});

		if (Build.VERSION.SDK_INT < 29) {
			PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_key_other");
			if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
				preferenceCategory.removePreference(findPreference(getResources().getString(R.string.preferences__direct_share)));
			}
			preferenceCategory.removePreference(findPreference(getResources().getString(R.string.preferences__disable_smart_replies)));
		}

		this.updateView();
	}

	private void updateView() {
		if(this.synchronizeContactsService.isSynchronizationInProgress()) {
			//disable switcher
			if(this.contactSyncPreference != null) {
				this.contactSyncPreference.setEnabled(false);
			}
		}
		else {
			if(this.contactSyncPreference != null) {
				this.contactSyncPreference.setEnabled(true);
			}
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ListenerManager.synchronizeContactsListeners.add(this.synchronizeContactsListener);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onDestroyView() {
		ListenerManager.synchronizeContactsListeners.remove(this.synchronizeContactsListener);

		if (isAdded()) {
			DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_VALIDATE, true);
			DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_SYNC_CONTACTS, true);
			DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_DISABLE_SYNC, true);
		}

		super.onDestroyView();
	}

	private boolean requireInstances() {
		if(this.serviceManager != null) {
			return true;
		}

		this.serviceManager = ThreemaApplication.getServiceManager();
		return this.serviceManager != null;
	}

	private boolean enableSync() {
		if(this.requireInstances()) {
			SynchronizeContactsService synchronizeContactsService;
			try {
				synchronizeContactsService = this.serviceManager.getSynchronizeContactsService();
				if(synchronizeContactsService != null) {
					if(synchronizeContactsService.enableSync()) {
						if (ConfigUtils.requestContactPermissions(getActivity(), SettingsPrivacyFragment.this, PERMISSION_REQUEST_CONTACTS)) {
							launchContactsSync();
							return true;
						}
					}
				}
			} catch (MasterKeyLockedException | FileSystemNotPresentException e) {
				logger.error("Exception", e);
			}
		}

		return false;
	}

	private void launchContactsSync() {
		//start a Sync
		synchronizeContactsService.instantiateSynchronizationAndRun();
	}

	private boolean disableSync() {
		if(this.requireInstances()) {
			final SynchronizeContactsService synchronizeContactsService;
			try {
				synchronizeContactsService = this.serviceManager.getSynchronizeContactsService();
			} catch (MasterKeyLockedException | FileSystemNotPresentException e) {
				logger.error("Exception", e);
				return false;
			}

			GenericProgressDialog.newInstance(R.string.app_name, R.string.please_wait).show(getFragmentManager(), DIALOG_TAG_DISABLE_SYNC);

				new Thread(new Runnable() {
					@Override
					public void run() {
							if(synchronizeContactsService != null) {
								synchronizeContactsService.disableSync(new Runnable() {
									@Override
									public void run() {
										RuntimeUtil.runOnUiThread(new Runnable() {
											@Override
											public void run() {
												DialogUtil.dismissDialog(getFragmentManager(), DIALOG_TAG_DISABLE_SYNC, true);
												contactSyncPreference.setChecked(false);
											}
										});
									}
								});
							}
					}
				}).start();
			return true;
		}

		return false;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		preferenceFragmentCallbackInterface.setToolbarTitle(R.string.prefs_privacy);
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onDetach() {
		super.onDetach();

		if (this.disableScreenshot.isChecked() != this.disableScreenshotChecked) {
			ConfigUtils.recreateActivity(getActivity());
		}
	}

	@Override
	public void onRequestPermissionsResult(int requestCode,
										   @NonNull String permissions[], @NonNull int[] grantResults) {
		switch (requestCode) {
			case PERMISSION_REQUEST_CONTACTS:
				if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
					launchContactsSync();
				} else {
					disableSync();
				}
				break;
		}
	}

	@Override
	public void onCancel(String tag, Object object) { }
}
