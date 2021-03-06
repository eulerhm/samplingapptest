// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.shipping;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InstallWcShippingFlowViewModel_Factory implements Factory<InstallWcShippingFlowViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  public InstallWcShippingFlowViewModel_Factory(Provider<SavedStateHandle> savedStateProvider) {
    this.savedStateProvider = savedStateProvider;
  }

  @Override
  public InstallWcShippingFlowViewModel get() {
    return newInstance(savedStateProvider.get());
  }

  public static InstallWcShippingFlowViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider) {
    return new InstallWcShippingFlowViewModel_Factory(savedStateProvider);
  }

  public static InstallWcShippingFlowViewModel newInstance(SavedStateHandle savedState) {
    return new InstallWcShippingFlowViewModel(savedState);
  }
}
