// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.tracking;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.ui.orders.details.OrderDetailRepository;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddOrderTrackingProviderListViewModel_Factory implements Factory<AddOrderTrackingProviderListViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<OrderShipmentProvidersRepository> shipmentProvidersRepositoryProvider;

  private final Provider<OrderDetailRepository> orderDetailRepositoryProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public AddOrderTrackingProviderListViewModel_Factory(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<OrderShipmentProvidersRepository> shipmentProvidersRepositoryProvider,
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    this.savedStateProvider = savedStateProvider;
    this.shipmentProvidersRepositoryProvider = shipmentProvidersRepositoryProvider;
    this.orderDetailRepositoryProvider = orderDetailRepositoryProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public AddOrderTrackingProviderListViewModel get() {
    return newInstance(savedStateProvider.get(), shipmentProvidersRepositoryProvider.get(), orderDetailRepositoryProvider.get(), resourceProvider.get());
  }

  public static AddOrderTrackingProviderListViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<OrderShipmentProvidersRepository> shipmentProvidersRepositoryProvider,
      Provider<OrderDetailRepository> orderDetailRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    return new AddOrderTrackingProviderListViewModel_Factory(savedStateProvider, shipmentProvidersRepositoryProvider, orderDetailRepositoryProvider, resourceProvider);
  }

  public static AddOrderTrackingProviderListViewModel newInstance(SavedStateHandle savedState,
      OrderShipmentProvidersRepository shipmentProvidersRepository,
      OrderDetailRepository orderDetailRepository, ResourceProvider resourceProvider) {
    return new AddOrderTrackingProviderListViewModel(savedState, shipmentProvidersRepository, orderDetailRepository, resourceProvider);
  }
}
