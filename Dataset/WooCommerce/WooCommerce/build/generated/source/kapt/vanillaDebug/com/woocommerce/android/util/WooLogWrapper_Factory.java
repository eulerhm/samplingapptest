// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WooLogWrapper_Factory implements Factory<WooLogWrapper> {
  @Override
  public WooLogWrapper get() {
    return newInstance();
  }

  public static WooLogWrapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WooLogWrapper newInstance() {
    return new WooLogWrapper();
  }

  private static final class InstanceHolder {
    private static final WooLogWrapper_Factory INSTANCE = new WooLogWrapper_Factory();
  }
}
