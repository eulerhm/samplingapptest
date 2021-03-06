// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.util;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BitmapUtil_Factory implements Factory<BitmapUtil> {
  private final Provider<Context> contextProvider;

  public BitmapUtil_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BitmapUtil get() {
    return newInstance(contextProvider.get());
  }

  public static BitmapUtil_Factory create(Provider<Context> contextProvider) {
    return new BitmapUtil_Factory(contextProvider);
  }

  public static BitmapUtil newInstance(Context context) {
    return new BitmapUtil(context);
  }
}
