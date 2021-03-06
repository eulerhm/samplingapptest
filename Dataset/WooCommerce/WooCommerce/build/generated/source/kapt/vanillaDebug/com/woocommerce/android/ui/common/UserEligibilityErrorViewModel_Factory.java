// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.common;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.AppPrefs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.store.AccountStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserEligibilityErrorViewModel_Factory implements Factory<UserEligibilityErrorViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<AppPrefs> appPrefsProvider;

  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<AccountStore> accountStoreProvider;

  private final Provider<UserEligibilityFetcher> userEligibilityFetcherProvider;

  public UserEligibilityErrorViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<AppPrefs> appPrefsProvider, Provider<Dispatcher> dispatcherProvider,
      Provider<AccountStore> accountStoreProvider,
      Provider<UserEligibilityFetcher> userEligibilityFetcherProvider) {
    this.savedStateProvider = savedStateProvider;
    this.appPrefsProvider = appPrefsProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.accountStoreProvider = accountStoreProvider;
    this.userEligibilityFetcherProvider = userEligibilityFetcherProvider;
  }

  @Override
  public UserEligibilityErrorViewModel get() {
    return newInstance(savedStateProvider.get(), appPrefsProvider.get(), dispatcherProvider.get(), accountStoreProvider.get(), userEligibilityFetcherProvider.get());
  }

  public static UserEligibilityErrorViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider, Provider<AppPrefs> appPrefsProvider,
      Provider<Dispatcher> dispatcherProvider, Provider<AccountStore> accountStoreProvider,
      Provider<UserEligibilityFetcher> userEligibilityFetcherProvider) {
    return new UserEligibilityErrorViewModel_Factory(savedStateProvider, appPrefsProvider, dispatcherProvider, accountStoreProvider, userEligibilityFetcherProvider);
  }

  public static UserEligibilityErrorViewModel newInstance(SavedStateHandle savedState,
      AppPrefs appPrefs, Dispatcher dispatcher, AccountStore accountStore,
      UserEligibilityFetcher userEligibilityFetcher) {
    return new UserEligibilityErrorViewModel(savedState, appPrefs, dispatcher, accountStore, userEligibilityFetcher);
  }
}
