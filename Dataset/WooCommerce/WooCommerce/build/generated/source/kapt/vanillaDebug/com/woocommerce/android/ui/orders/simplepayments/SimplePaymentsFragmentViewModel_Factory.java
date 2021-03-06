// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.simplepayments;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.ui.orders.creation.OrderCreationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimplePaymentsFragmentViewModel_Factory implements Factory<SimplePaymentsFragmentViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<SimplePaymentsRepository> simplePaymentsRepositoryProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<OrderCreationRepository> orderCreationRepositoryProvider;

  public SimplePaymentsFragmentViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<SimplePaymentsRepository> simplePaymentsRepositoryProvider,
      Provider<NetworkStatus> networkStatusProvider,
      Provider<OrderCreationRepository> orderCreationRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.simplePaymentsRepositoryProvider = simplePaymentsRepositoryProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.orderCreationRepositoryProvider = orderCreationRepositoryProvider;
  }

  @Override
  public SimplePaymentsFragmentViewModel get() {
    return newInstance(savedStateProvider.get(), simplePaymentsRepositoryProvider.get(), networkStatusProvider.get(), orderCreationRepositoryProvider.get());
  }

  public static SimplePaymentsFragmentViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<SimplePaymentsRepository> simplePaymentsRepositoryProvider,
      Provider<NetworkStatus> networkStatusProvider,
      Provider<OrderCreationRepository> orderCreationRepositoryProvider) {
    return new SimplePaymentsFragmentViewModel_Factory(savedStateProvider, simplePaymentsRepositoryProvider, networkStatusProvider, orderCreationRepositoryProvider);
  }

  public static SimplePaymentsFragmentViewModel newInstance(SavedStateHandle savedState,
      SimplePaymentsRepository simplePaymentsRepository, NetworkStatus networkStatus,
      OrderCreationRepository orderCreationRepository) {
    return new SimplePaymentsFragmentViewModel(savedState, simplePaymentsRepository, networkStatus, orderCreationRepository);
  }
}
