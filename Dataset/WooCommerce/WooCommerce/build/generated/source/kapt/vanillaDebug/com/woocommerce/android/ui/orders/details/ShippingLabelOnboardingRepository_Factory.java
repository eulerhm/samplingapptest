// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.details;

import com.woocommerce.android.AppPrefsWrapper;
import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingLabelOnboardingRepository_Factory implements Factory<ShippingLabelOnboardingRepository> {
  private final Provider<OrderDetailRepository> orderDetailRepositoryProvider;

  private final Provider<AppPrefsWrapper> appSharedPrefsProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public ShippingLabelOnboardingRepository_Factory(
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<AppPrefsWrapper> appSharedPrefsProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.orderDetailRepositoryProvider = orderDetailRepositoryProvider;
    this.appSharedPrefsProvider = appSharedPrefsProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public ShippingLabelOnboardingRepository get() {
    return newInstance(orderDetailRepositoryProvider.get(), appSharedPrefsProvider.get(), selectedSiteProvider.get());
  }

  public static ShippingLabelOnboardingRepository_Factory create(
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<AppPrefsWrapper> appSharedPrefsProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new ShippingLabelOnboardingRepository_Factory(orderDetailRepositoryProvider, appSharedPrefsProvider, selectedSiteProvider);
  }

  public static ShippingLabelOnboardingRepository newInstance(
      OrderDetailRepository orderDetailRepository, AppPrefsWrapper appSharedPrefs,
      SelectedSite selectedSite) {
    return new ShippingLabelOnboardingRepository(orderDetailRepository, appSharedPrefs, selectedSite);
  }
}
