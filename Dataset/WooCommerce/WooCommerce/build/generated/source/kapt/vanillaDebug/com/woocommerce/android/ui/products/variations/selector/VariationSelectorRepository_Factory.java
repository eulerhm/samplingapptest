// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.variations.selector;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCProductStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VariationSelectorRepository_Factory implements Factory<VariationSelectorRepository> {
  private final Provider<WCProductStore> productStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public VariationSelectorRepository_Factory(Provider<WCProductStore> productStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.productStoreProvider = productStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public VariationSelectorRepository get() {
    return newInstance(productStoreProvider.get(), selectedSiteProvider.get());
  }

  public static VariationSelectorRepository_Factory create(
      Provider<WCProductStore> productStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    return new VariationSelectorRepository_Factory(productStoreProvider, selectedSiteProvider);
  }

  public static VariationSelectorRepository newInstance(WCProductStore productStore,
      SelectedSite selectedSite) {
    return new VariationSelectorRepository(productStore, selectedSite);
  }
}
