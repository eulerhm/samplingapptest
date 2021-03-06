// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.coupons;

import com.woocommerce.android.ui.base.UIMessageResolver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CouponListFragment_MembersInjector implements MembersInjector<CouponListFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public CouponListFragment_MembersInjector(Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<CouponListFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new CouponListFragment_MembersInjector(uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(CouponListFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.coupons.CouponListFragment.uiMessageResolver")
  public static void injectUiMessageResolver(CouponListFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}
