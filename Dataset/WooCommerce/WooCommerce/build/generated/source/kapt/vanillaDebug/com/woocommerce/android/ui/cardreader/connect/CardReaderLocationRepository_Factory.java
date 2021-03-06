// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.cardreader.connect;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCInPersonPaymentsStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderLocationRepository_Factory implements Factory<CardReaderLocationRepository> {
  private final Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public CardReaderLocationRepository_Factory(
      Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.inPersonPaymentsStoreProvider = inPersonPaymentsStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public CardReaderLocationRepository get() {
    return newInstance(inPersonPaymentsStoreProvider.get(), selectedSiteProvider.get());
  }

  public static CardReaderLocationRepository_Factory create(
      Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new CardReaderLocationRepository_Factory(inPersonPaymentsStoreProvider, selectedSiteProvider);
  }

  public static CardReaderLocationRepository newInstance(
      WCInPersonPaymentsStore inPersonPaymentsStore, SelectedSite selectedSite) {
    return new CardReaderLocationRepository(inPersonPaymentsStore, selectedSite);
  }
}
