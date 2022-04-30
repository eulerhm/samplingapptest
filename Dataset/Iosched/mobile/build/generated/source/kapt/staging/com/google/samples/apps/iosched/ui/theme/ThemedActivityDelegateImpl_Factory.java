package com.google.samples.apps.iosched.ui.theme;

import com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.ObserveThemeModeUseCase;
import dagger.internal.Factory;
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
public final class ThemedActivityDelegateImpl_Factory implements Factory<ThemedActivityDelegateImpl> {
  private final Provider<ObserveThemeModeUseCase> observeThemeUseCaseProvider;

  private final Provider<GetThemeUseCase> getThemeUseCaseProvider;

  public ThemedActivityDelegateImpl_Factory(
      Provider<ObserveThemeModeUseCase> observeThemeUseCaseProvider,
      Provider<GetThemeUseCase> getThemeUseCaseProvider) {
    this.observeThemeUseCaseProvider = observeThemeUseCaseProvider;
    this.getThemeUseCaseProvider = getThemeUseCaseProvider;
  }

  @Override
  public ThemedActivityDelegateImpl get() {
    return newInstance(observeThemeUseCaseProvider.get(), getThemeUseCaseProvider.get());
  }

  public static ThemedActivityDelegateImpl_Factory create(
      Provider<ObserveThemeModeUseCase> observeThemeUseCaseProvider,
      Provider<GetThemeUseCase> getThemeUseCaseProvider) {
    return new ThemedActivityDelegateImpl_Factory(observeThemeUseCaseProvider, getThemeUseCaseProvider);
  }

  public static ThemedActivityDelegateImpl newInstance(ObserveThemeModeUseCase observeThemeUseCase,
      GetThemeUseCase getThemeUseCase) {
    return new ThemedActivityDelegateImpl(observeThemeUseCase, getThemeUseCase);
  }
}
