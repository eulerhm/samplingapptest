// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.NetworkStatus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductSelectionListViewModel_Factory implements Factory<ProductSelectionListViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<ProductListRepository> productRepositoryProvider;

  public ProductSelectionListViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<NetworkStatus> networkStatusProvider,
      Provider<ProductListRepository> productRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public ProductSelectionListViewModel get() {
    return newInstance(savedStateProvider.get(), networkStatusProvider.get(), productRepositoryProvider.get());
  }

  public static ProductSelectionListViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider, Provider<NetworkStatus> networkStatusProvider,
      Provider<ProductListRepository> productRepositoryProvider) {
    return new ProductSelectionListViewModel_Factory(savedStateProvider, networkStatusProvider, productRepositoryProvider);
  }

  public static ProductSelectionListViewModel newInstance(SavedStateHandle savedState,
      NetworkStatus networkStatus, ProductListRepository productRepository) {
    return new ProductSelectionListViewModel(savedState, networkStatus, productRepository);
  }
}
