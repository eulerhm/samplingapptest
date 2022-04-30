package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource;
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
public final class SignInModule_ProvideRegisteredUserDataSourceFactory implements Factory<RegisteredUserDataSource> {
  private final SignInModule module;

  private final Provider<Context> contextProvider;

  public SignInModule_ProvideRegisteredUserDataSourceFactory(SignInModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public RegisteredUserDataSource get() {
    return provideRegisteredUserDataSource(module, contextProvider.get());
  }

  public static SignInModule_ProvideRegisteredUserDataSourceFactory create(SignInModule module,
      Provider<Context> contextProvider) {
    return new SignInModule_ProvideRegisteredUserDataSourceFactory(module, contextProvider);
  }

  public static RegisteredUserDataSource provideRegisteredUserDataSource(SignInModule instance,
      Context context) {
    return Preconditions.checkNotNull(instance.provideRegisteredUserDataSource(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
