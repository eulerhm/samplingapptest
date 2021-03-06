// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.cardreader.payment;

import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider;
import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WooCommerceStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderPaymentCurrencySupportedChecker_Factory implements Factory<CardReaderPaymentCurrencySupportedChecker> {
  private final Provider<CoroutineDispatchers> dispatchersProvider;

  private final Provider<WooCommerceStore> wooStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<CardReaderCountryConfigProvider> cardReaderCountryConfigProvider;

  public CardReaderPaymentCurrencySupportedChecker_Factory(
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<CardReaderCountryConfigProvider> cardReaderCountryConfigProvider) {
    this.dispatchersProvider = dispatchersProvider;
    this.wooStoreProvider = wooStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.cardReaderCountryConfigProvider = cardReaderCountryConfigProvider;
  }

  @Override
  public CardReaderPaymentCurrencySupportedChecker get() {
    return newInstance(dispatchersProvider.get(), wooStoreProvider.get(), selectedSiteProvider.get(), cardReaderCountryConfigProvider.get());
  }

  public static CardReaderPaymentCurrencySupportedChecker_Factory create(
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<CardReaderCountryConfigProvider> cardReaderCountryConfigProvider) {
    return new CardReaderPaymentCurrencySupportedChecker_Factory(dispatchersProvider, wooStoreProvider, selectedSiteProvider, cardReaderCountryConfigProvider);
  }

  public static CardReaderPaymentCurrencySupportedChecker newInstance(
      CoroutineDispatchers dispatchers, WooCommerceStore wooStore, SelectedSite selectedSite,
      CardReaderCountryConfigProvider cardReaderCountryConfigProvider) {
    return new CardReaderPaymentCurrencySupportedChecker(dispatchers, wooStore, selectedSite, cardReaderCountryConfigProvider);
  }
}
