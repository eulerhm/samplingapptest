// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.filters;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(OrderFilterCategoriesViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
