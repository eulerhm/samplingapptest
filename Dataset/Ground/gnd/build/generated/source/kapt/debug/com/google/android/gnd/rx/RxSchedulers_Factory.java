// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.rx;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RxSchedulers_Factory implements Factory<RxSchedulers> {
  @Override
  public RxSchedulers get() {
    return newInstance();
  }

  public static RxSchedulers_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RxSchedulers newInstance() {
    return new RxSchedulers();
  }

  private static final class InstanceHolder {
    private static final RxSchedulers_Factory INSTANCE = new RxSchedulers_Factory();
  }
}
