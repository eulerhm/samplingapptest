package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource;
import com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInModule_ProvideAuthStateUserDataSourceFactory implements Factory<AuthStateUserDataSource> {
  private final SignInModule module;

  private final Provider<Context> contextProvider;

  private final Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider;

  public SignInModule_ProvideAuthStateUserDataSourceFactory(SignInModule module,
      Provider<Context> contextProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.notificationAlarmUpdaterProvider = notificationAlarmUpdaterProvider;
  }

  @Override
  public AuthStateUserDataSource get() {
    return provideAuthStateUserDataSource(module, contextProvider.get(), notificationAlarmUpdaterProvider.get());
  }

  public static SignInModule_ProvideAuthStateUserDataSourceFactory create(SignInModule module,
      Provider<Context> contextProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider) {
    return new SignInModule_ProvideAuthStateUserDataSourceFactory(module, contextProvider, notificationAlarmUpdaterProvider);
  }

  public static AuthStateUserDataSource provideAuthStateUserDataSource(SignInModule instance,
      Context context, NotificationAlarmUpdater notificationAlarmUpdater) {
    return Preconditions.checkNotNull(instance.provideAuthStateUserDataSource(context, notificationAlarmUpdater), "Cannot return null from a non-@Nullable @Provides method");
  }
}
