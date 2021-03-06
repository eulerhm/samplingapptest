// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.di;

import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.cardreader.CardReaderStore;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.util.CapturePaymentResponseMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCInPersonPaymentsStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderModule_ProvideInPersonPaymentsStoreFactory implements Factory<CardReaderStore> {
  private final CardReaderModule module;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider;

  private final Provider<CapturePaymentResponseMapper> responseMapperProvider;

  private final Provider<AppPrefs> appPrefsProvider;

  public CardReaderModule_ProvideInPersonPaymentsStoreFactory(CardReaderModule module,
      Provider<SelectedSite> selectedSiteProvider,
      Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider,
      Provider<CapturePaymentResponseMapper> responseMapperProvider,
      Provider<AppPrefs> appPrefsProvider) {
    this.module = module;
    this.selectedSiteProvider = selectedSiteProvider;
    this.inPersonPaymentsStoreProvider = inPersonPaymentsStoreProvider;
    this.responseMapperProvider = responseMapperProvider;
    this.appPrefsProvider = appPrefsProvider;
  }

  @Override
  public CardReaderStore get() {
    return provideInPersonPaymentsStore(module, selectedSiteProvider.get(), inPersonPaymentsStoreProvider.get(), responseMapperProvider.get(), appPrefsProvider.get());
  }

  public static CardReaderModule_ProvideInPersonPaymentsStoreFactory create(CardReaderModule module,
      Provider<SelectedSite> selectedSiteProvider,
      Provider<WCInPersonPaymentsStore> inPersonPaymentsStoreProvider,
      Provider<CapturePaymentResponseMapper> responseMapperProvider,
      Provider<AppPrefs> appPrefsProvider) {
    return new CardReaderModule_ProvideInPersonPaymentsStoreFactory(module, selectedSiteProvider, inPersonPaymentsStoreProvider, responseMapperProvider, appPrefsProvider);
  }

  public static CardReaderStore provideInPersonPaymentsStore(CardReaderModule instance,
      SelectedSite selectedSite, WCInPersonPaymentsStore inPersonPaymentsStore,
      CapturePaymentResponseMapper responseMapper, AppPrefs appPrefs) {
    return Preconditions.checkNotNullFromProvides(instance.provideInPersonPaymentsStore(selectedSite, inPersonPaymentsStore, responseMapper, appPrefs));
  }
}
