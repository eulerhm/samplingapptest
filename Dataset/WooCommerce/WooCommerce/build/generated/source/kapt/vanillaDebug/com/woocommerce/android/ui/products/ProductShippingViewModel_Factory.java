// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductShippingViewModel_Factory implements Factory<ProductShippingViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ParameterRepository> parameterRepositoryProvider;

  private final Provider<ProductDetailRepository> productRepositoryProvider;

  public ProductShippingViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider,
      Provider<ProductDetailRepository> productRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.parameterRepositoryProvider = parameterRepositoryProvider;
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public ProductShippingViewModel get() {
    return newInstance(savedStateProvider.get(), parameterRepositoryProvider.get(), productRepositoryProvider.get());
  }

  public static ProductShippingViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider,
      Provider<ProductDetailRepository> productRepositoryProvider) {
    return new ProductShippingViewModel_Factory(savedStateProvider, parameterRepositoryProvider, productRepositoryProvider);
  }

  public static ProductShippingViewModel newInstance(SavedStateHandle savedState,
      ParameterRepository parameterRepository, ProductDetailRepository productRepository) {
    return new ProductShippingViewModel(savedState, parameterRepository, productRepository);
  }
}
