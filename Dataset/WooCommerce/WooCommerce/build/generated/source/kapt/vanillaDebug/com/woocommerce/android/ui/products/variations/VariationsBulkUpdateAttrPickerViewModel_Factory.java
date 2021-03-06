// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.variations;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.ui.products.ParameterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VariationsBulkUpdateAttrPickerViewModel_Factory implements Factory<VariationsBulkUpdateAttrPickerViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ParameterRepository> parameterRepositoryProvider;

  public VariationsBulkUpdateAttrPickerViewModel_Factory(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.parameterRepositoryProvider = parameterRepositoryProvider;
  }

  @Override
  public VariationsBulkUpdateAttrPickerViewModel get() {
    return newInstance(savedStateProvider.get(), parameterRepositoryProvider.get());
  }

  public static VariationsBulkUpdateAttrPickerViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider) {
    return new VariationsBulkUpdateAttrPickerViewModel_Factory(savedStateProvider, parameterRepositoryProvider);
  }

  public static VariationsBulkUpdateAttrPickerViewModel newInstance(SavedStateHandle savedState,
      ParameterRepository parameterRepository) {
    return new VariationsBulkUpdateAttrPickerViewModel(savedState, parameterRepository);
  }
}
