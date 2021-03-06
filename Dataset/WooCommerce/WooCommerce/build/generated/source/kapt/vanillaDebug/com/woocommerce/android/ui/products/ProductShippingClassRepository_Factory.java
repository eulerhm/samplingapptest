// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.store.WCProductStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductShippingClassRepository_Factory implements Factory<ProductShippingClassRepository> {
  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<WCProductStore> productStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public ProductShippingClassRepository_Factory(Provider<Dispatcher> dispatcherProvider,
      Provider<WCProductStore> productStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.productStoreProvider = productStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public ProductShippingClassRepository get() {
    return newInstance(dispatcherProvider.get(), productStoreProvider.get(), selectedSiteProvider.get());
  }

  public static ProductShippingClassRepository_Factory create(
      Provider<Dispatcher> dispatcherProvider, Provider<WCProductStore> productStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new ProductShippingClassRepository_Factory(dispatcherProvider, productStoreProvider, selectedSiteProvider);
  }

  public static ProductShippingClassRepository newInstance(Dispatcher dispatcher,
      WCProductStore productStore, SelectedSite selectedSite) {
    return new ProductShippingClassRepository(dispatcher, productStore, selectedSite);
  }
}
