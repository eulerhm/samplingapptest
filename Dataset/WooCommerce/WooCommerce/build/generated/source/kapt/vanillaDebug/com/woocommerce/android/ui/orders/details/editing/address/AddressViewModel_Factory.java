// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.details.editing.address;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.model.GetLocations;
import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCDataStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddressViewModel_Factory implements Factory<AddressViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<WCDataStore> dataStoreProvider;

  private final Provider<GetLocations> getLocationsProvider;

  public AddressViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<WCDataStore> dataStoreProvider,
      Provider<GetLocations> getLocationsProvider) {
    this.savedStateProvider = savedStateProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.dataStoreProvider = dataStoreProvider;
    this.getLocationsProvider = getLocationsProvider;
  }

  @Override
  public AddressViewModel get() {
    return newInstance(savedStateProvider.get(), selectedSiteProvider.get(), dataStoreProvider.get(), getLocationsProvider.get());
  }

  public static AddressViewModel_Factory create(Provider<SavedStateHandle> savedStateProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<WCDataStore> dataStoreProvider,
      Provider<GetLocations> getLocationsProvider) {
    return new AddressViewModel_Factory(savedStateProvider, selectedSiteProvider, dataStoreProvider, getLocationsProvider);
  }

  public static AddressViewModel newInstance(SavedStateHandle savedState, SelectedSite selectedSite,
      WCDataStore dataStore, GetLocations getLocations) {
    return new AddressViewModel(savedState, selectedSite, dataStore, getLocations);
  }
}
