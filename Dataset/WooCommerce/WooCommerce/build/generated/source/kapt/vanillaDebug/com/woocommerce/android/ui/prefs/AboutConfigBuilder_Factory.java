// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.prefs;

import com.woocommerce.android.analytics.AnalyticsTrackerWrapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutConfigBuilder_Factory implements Factory<AboutConfigBuilder> {
  private final Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider;

  public AboutConfigBuilder_Factory(
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    this.analyticsTrackerWrapperProvider = analyticsTrackerWrapperProvider;
  }

  @Override
  public AboutConfigBuilder get() {
    return newInstance(analyticsTrackerWrapperProvider.get());
  }

  public static AboutConfigBuilder_Factory create(
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    return new AboutConfigBuilder_Factory(analyticsTrackerWrapperProvider);
  }

  public static AboutConfigBuilder newInstance(AnalyticsTrackerWrapper analyticsTrackerWrapper) {
    return new AboutConfigBuilder(analyticsTrackerWrapper);
  }
}
