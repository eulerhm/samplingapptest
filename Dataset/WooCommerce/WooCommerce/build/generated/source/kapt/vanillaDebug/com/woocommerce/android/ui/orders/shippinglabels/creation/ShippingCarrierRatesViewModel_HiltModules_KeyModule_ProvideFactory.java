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
public final class ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ShippingCarrierRatesViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
