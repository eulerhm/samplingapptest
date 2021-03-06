// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.home.featuredetails;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SubmissionListItemViewModel_Factory implements Factory<SubmissionListItemViewModel> {
  private final Provider<Application> applicationProvider;

  public SubmissionListItemViewModel_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SubmissionListItemViewModel get() {
    return newInstance(applicationProvider.get());
  }

  public static SubmissionListItemViewModel_Factory create(
      Provider<Application> applicationProvider) {
    return new SubmissionListItemViewModel_Factory(applicationProvider);
  }

  public static SubmissionListItemViewModel newInstance(Application application) {
    return new SubmissionListItemViewModel(application);
  }
}
