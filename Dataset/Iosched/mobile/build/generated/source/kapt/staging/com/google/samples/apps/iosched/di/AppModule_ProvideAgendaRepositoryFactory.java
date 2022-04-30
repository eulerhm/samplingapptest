package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository;
import com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource;
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
public final class AppModule_ProvideAgendaRepositoryFactory implements Factory<AgendaRepository> {
  private final AppModule module;

  private final Provider<AppConfigDataSource> appConfigDataSourceProvider;

  public AppModule_ProvideAgendaRepositoryFactory(AppModule module,
      Provider<AppConfigDataSource> appConfigDataSourceProvider) {
    this.module = module;
    this.appConfigDataSourceProvider = appConfigDataSourceProvider;
  }

  @Override
  public AgendaRepository get() {
    return provideAgendaRepository(module, appConfigDataSourceProvider.get());
  }

  public static AppModule_ProvideAgendaRepositoryFactory create(AppModule module,
      Provider<AppConfigDataSource> appConfigDataSourceProvider) {
    return new AppModule_ProvideAgendaRepositoryFactory(module, appConfigDataSourceProvider);
  }

  public static AgendaRepository provideAgendaRepository(AppModule instance,
      AppConfigDataSource appConfigDataSource) {
    return Preconditions.checkNotNull(instance.provideAgendaRepository(appConfigDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
