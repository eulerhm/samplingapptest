// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.shippinglabels.creation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingLabelsStateMachine_Factory implements Factory<ShippingLabelsStateMachine> {
  @Override
  public ShippingLabelsStateMachine get() {
    return newInstance();
  }

  public static ShippingLabelsStateMachine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ShippingLabelsStateMachine newInstance() {
    return new ShippingLabelsStateMachine();
  }

  private static final class InstanceHolder {
    private static final ShippingLabelsStateMachine_Factory INSTANCE = new ShippingLabelsStateMachine_Factory();
  }
}
