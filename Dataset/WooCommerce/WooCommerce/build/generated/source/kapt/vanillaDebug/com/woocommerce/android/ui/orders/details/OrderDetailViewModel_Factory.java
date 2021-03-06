// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.details;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.analytics.AnalyticsTrackerWrapper;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.tools.ProductImageMap;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.ui.cardreader.CardReaderTracker;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker;
import com.woocommerce.android.ui.products.addons.AddonRepository;
import com.woocommerce.android.util.CoroutineDispatchers;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OrderDetailViewModel_Factory implements Factory<OrderDetailViewModel> {
  private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;

  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<AppPrefs> appPrefsProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<ResourceProvider> resourceProvider;

  private final Provider<OrderDetailRepository> orderDetailRepositoryProvider;

  private final Provider<AddonRepository> addonsRepositoryProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<ProductImageMap> productImageMapProvider;

  private final Provider<CardReaderPaymentCollectibilityChecker> paymentCollectibilityCheckerProvider;

  private final Provider<CardReaderTracker> cardReaderTrackerProvider;

  private final Provider<AnalyticsTrackerWrapper> trackerWrapperProvider;

  private final Provider<ShippingLabelOnboardingRepository> shippingLabelOnboardingRepositoryProvider;

  public OrderDetailViewModel_Factory(Provider<CoroutineDispatchers> coroutineDispatchersProvider,
      Provider<SavedStateHandle> savedStateProvider, Provider<AppPrefs> appPrefsProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<ResourceProvider> resourceProvider,
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<AddonRepository> addonsRepositoryProvider,
      Provider<SelectedSite> selectedSiteProvider,
      Provider<ProductImageMap> productImageMapProvider,
      Provider<CardReaderPaymentCollectibilityChecker> paymentCollectibilityCheckerProvider,
      Provider<CardReaderTracker> cardReaderTrackerProvider,
      Provider<AnalyticsTrackerWrapper> trackerWrapperProvider,
      Provider<ShippingLabelOnboardingRepository> shippingLabelOnboardingRepositoryProvider) {
    this.coroutineDispatchersProvider = coroutineDispatchersProvider;
    this.savedStateProvider = savedStateProvider;
    this.appPrefsProvider = appPrefsProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.resourceProvider = resourceProvider;
    this.orderDetailRepositoryProvider = orderDetailRepositoryProvider;
    this.addonsRepositoryProvider = addonsRepositoryProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.productImageMapProvider = productImageMapProvider;
    this.paymentCollectibilityCheckerProvider = paymentCollectibilityCheckerProvider;
    this.cardReaderTrackerProvider = cardReaderTrackerProvider;
    this.trackerWrapperProvider = trackerWrapperProvider;
    this.shippingLabelOnboardingRepositoryProvider = shippingLabelOnboardingRepositoryProvider;
  }

  @Override
  public OrderDetailViewModel get() {
    return newInstance(coroutineDispatchersProvider.get(), savedStateProvider.get(), appPrefsProvider.get(), networkStatusProvider.get(), resourceProvider.get(), orderDetailRepositoryProvider.get(), addonsRepositoryProvider.get(), selectedSiteProvider.get(), productImageMapProvider.get(), paymentCollectibilityCheckerProvider.get(), cardReaderTrackerProvider.get(), trackerWrapperProvider.get(), shippingLabelOnboardingRepositoryProvider.get());
  }

  public static OrderDetailViewModel_Factory create(
      Provider<CoroutineDispatchers> coroutineDispatchersProvider,
      Provider<SavedStateHandle> savedStateProvider, Provider<AppPrefs> appPrefsProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<ResourceProvider> resourceProvider,
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<AddonRepository> addonsRepositoryProvider,
      Provider<SelectedSite> selectedSiteProvider,
      Provider<ProductImageMap> productImageMapProvider,
      Provider<CardReaderPaymentCollectibilityChecker> paymentCollectibilityCheckerProvider,
      Provider<CardReaderTracker> cardReaderTrackerProvider,
      Provider<AnalyticsTrackerWrapper> trackerWrapperProvider,
      Provider<ShippingLabelOnboardingRepository> shippingLabelOnboardingRepositoryProvider) {
    return new OrderDetailViewModel_Factory(coroutineDispatchersProvider, savedStateProvider, appPrefsProvider, networkStatusProvider, resourceProvider, orderDetailRepositoryProvider, addonsRepositoryProvider, selectedSiteProvider, productImageMapProvider, paymentCollectibilityCheckerProvider, cardReaderTrackerProvider, trackerWrapperProvider, shippingLabelOnboardingRepositoryProvider);
  }

  public static OrderDetailViewModel newInstance(CoroutineDispatchers coroutineDispatchers,
      SavedStateHandle savedState, AppPrefs appPrefs, NetworkStatus networkStatus,
      ResourceProvider resourceProvider, OrderDetailRepository orderDetailRepository,
      AddonRepository addonsRepository, SelectedSite selectedSite, ProductImageMap productImageMap,
      CardReaderPaymentCollectibilityChecker paymentCollectibilityChecker,
      CardReaderTracker cardReaderTracker, AnalyticsTrackerWrapper trackerWrapper,
      ShippingLabelOnboardingRepository shippingLabelOnboardingRepository) {
    return new OrderDetailViewModel(coroutineDispatchers, savedState, appPrefs, networkStatus, resourceProvider, orderDetailRepository, addonsRepository, selectedSite, productImageMap, paymentCollectibilityChecker, cardReaderTracker, trackerWrapper, shippingLabelOnboardingRepository);
  }
}
