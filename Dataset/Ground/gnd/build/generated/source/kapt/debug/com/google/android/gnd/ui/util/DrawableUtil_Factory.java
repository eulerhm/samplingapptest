// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.util;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DrawableUtil_Factory implements Factory<DrawableUtil> {
  private final Provider<Application> contextProvider;

  public DrawableUtil_Factory(Provider<Application> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DrawableUtil get() {
    return newInstance(contextProvider.get());
  }

  public static DrawableUtil_Factory create(Provider<Application> contextProvider) {
    return new DrawableUtil_Factory(contextProvider);
  }

  public static DrawableUtil newInstance(Application context) {
    return new DrawableUtil(context);
  }
}
