// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.shippinglabels.creation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ShippingPackageSelectorViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
