// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.categories;

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
public final class ProductCategoriesRepository_Factory implements Factory<ProductCategoriesRepository> {
  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<WCProductStore> productStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public ProductCategoriesRepository_Factory(Provider<Dispatcher> dispatcherProvider,
      Provider<WCProductStore> productStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.productStoreProvider = productStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public ProductCategoriesRepository get() {
    return newInstance(dispatcherProvider.get(), productStoreProvider.get(), selectedSiteProvider.get());
  }

  public static ProductCategoriesRepository_Factory create(Provider<Dispatcher> dispatcherProvider,
      Provider<WCProductStore> productStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    return new ProductCategoriesRepository_Factory(dispatcherProvider, productStoreProvider, selectedSiteProvider);
  }

  public static ProductCategoriesRepository newInstance(Dispatcher dispatcher,
      WCProductStore productStore, SelectedSite selectedSite) {
    return new ProductCategoriesRepository(dispatcher, productStore, selectedSite);
  }
}
