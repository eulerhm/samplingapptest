// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.common.wpcomwebview;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.wordpress.android.fluxc.network.UserAgent;
import org.wordpress.android.fluxc.store.AccountStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WPComWebViewFragment_MembersInjector implements MembersInjector<WPComWebViewFragment> {
  private final Provider<AccountStore> accountStoreProvider;

  private final Provider<UserAgent> userAgentProvider;

  public WPComWebViewFragment_MembersInjector(Provider<AccountStore> accountStoreProvider,
      Provider<UserAgent> userAgentProvider) {
    this.accountStoreProvider = accountStoreProvider;
    this.userAgentProvider = userAgentProvider;
  }

  public static MembersInjector<WPComWebViewFragment> create(
      Provider<AccountStore> accountStoreProvider, Provider<UserAgent> userAgentProvider) {
    return new WPComWebViewFragment_MembersInjector(accountStoreProvider, userAgentProvider);
  }

  @Override
  public void injectMembers(WPComWebViewFragment instance) {
    injectAccountStore(instance, accountStoreProvider.get());
    injectUserAgent(instance, userAgentProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment.accountStore")
  public static void injectAccountStore(WPComWebViewFragment instance, AccountStore accountStore) {
    instance.accountStore = accountStore;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment.userAgent")
  public static void injectUserAgent(WPComWebViewFragment instance, UserAgent userAgent) {
    instance.userAgent = userAgent;
  }
}
