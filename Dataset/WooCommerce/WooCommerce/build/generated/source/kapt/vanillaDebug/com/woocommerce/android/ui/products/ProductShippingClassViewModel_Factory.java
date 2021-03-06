// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductShippingClassViewModel_Factory implements Factory<ProductShippingClassViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ProductShippingClassRepository> productRepositoryProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public ProductShippingClassViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<ProductShippingClassRepository> productRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    this.savedStateProvider = savedStateProvider;
    this.productRepositoryProvider = productRepositoryProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public ProductShippingClassViewModel get() {
    return newInstance(savedStateProvider.get(), productRepositoryProvider.get(), resourceProvider.get());
  }

  public static ProductShippingClassViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ProductShippingClassRepository> productRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    return new ProductShippingClassViewModel_Factory(savedStateProvider, productRepositoryProvider, resourceProvider);
  }

  public static ProductShippingClassViewModel newInstance(SavedStateHandle savedState,
      ProductShippingClassRepository productRepository, ResourceProvider resourceProvider) {
    return new ProductShippingClassViewModel(savedState, productRepository, resourceProvider);
  }
}
