// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.refunds;

import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCInPersonPaymentsStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentChargeRepository_Factory implements Factory<PaymentChargeRepository> {
  private final Provider<WCInPersonPaymentsStore> ippStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<AppPrefs> appPrefsProvider;

  private final Provider<CardReaderOnboardingChecker> cardReaderOnboardingCheckerProvider;

  public PaymentChargeRepository_Factory(Provider<WCInPersonPaymentsStore> ippStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<AppPrefs> appPrefsProvider,
      Provider<CardReaderOnboardingChecker> cardReaderOnboardingCheckerProvider) {
    this.ippStoreProvider = ippStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.appPrefsProvider = appPrefsProvider;
    this.cardReaderOnboardingCheckerProvider = cardReaderOnboardingCheckerProvider;
  }

  @Override
  public PaymentChargeRepository get() {
    return newInstance(ippStoreProvider.get(), selectedSiteProvider.get(), appPrefsProvider.get(), cardReaderOnboardingCheckerProvider.get());
  }

  public static PaymentChargeRepository_Factory create(
      Provider<WCInPersonPaymentsStore> ippStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<AppPrefs> appPrefsProvider,
      Provider<CardReaderOnboardingChecker> cardReaderOnboardingCheckerProvider) {
    return new PaymentChargeRepository_Factory(ippStoreProvider, selectedSiteProvider, appPrefsProvider, cardReaderOnboardingCheckerProvider);
  }

  public static PaymentChargeRepository newInstance(WCInPersonPaymentsStore ippStore,
      SelectedSite selectedSite, AppPrefs appPrefs,
      CardReaderOnboardingChecker cardReaderOnboardingChecker) {
    return new PaymentChargeRepository(ippStore, selectedSite, appPrefs, cardReaderOnboardingChecker);
  }
}
