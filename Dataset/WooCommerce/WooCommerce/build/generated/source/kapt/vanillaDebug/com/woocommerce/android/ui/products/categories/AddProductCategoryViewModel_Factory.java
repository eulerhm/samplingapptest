// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.categories;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddProductCategoryViewModel_Factory implements Factory<AddProductCategoryViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ProductCategoriesRepository> productCategoriesRepositoryProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public AddProductCategoryViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<ProductCategoriesRepository> productCategoriesRepositoryProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<ResourceProvider> resourceProvider) {
    this.savedStateProvider = savedStateProvider;
    this.productCategoriesRepositoryProvider = productCategoriesRepositoryProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public AddProductCategoryViewModel get() {
    return newInstance(savedStateProvider.get(), productCategoriesRepositoryProvider.get(), networkStatusProvider.get(), resourceProvider.get());
  }

  public static AddProductCategoryViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ProductCategoriesRepository> productCategoriesRepositoryProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<ResourceProvider> resourceProvider) {
    return new AddProductCategoryViewModel_Factory(savedStateProvider, productCategoriesRepositoryProvider, networkStatusProvider, resourceProvider);
  }

  public static AddProductCategoryViewModel newInstance(SavedStateHandle savedState,
      ProductCategoriesRepository productCategoriesRepository, NetworkStatus networkStatus,
      ResourceProvider resourceProvider) {
    return new AddProductCategoryViewModel(savedState, productCategoriesRepository, networkStatus, resourceProvider);
  }
}
