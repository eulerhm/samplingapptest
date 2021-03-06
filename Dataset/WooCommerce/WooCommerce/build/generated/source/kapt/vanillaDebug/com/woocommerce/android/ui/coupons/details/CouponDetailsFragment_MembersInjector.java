// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.coupons.details;

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
public final class CouponDetailsFragment_MembersInjector implements MembersInjector<CouponDetailsFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public CouponDetailsFragment_MembersInjector(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<CouponDetailsFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new CouponDetailsFragment_MembersInjector(uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(CouponDetailsFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.coupons.details.CouponDetailsFragment.uiMessageResolver")
  public static void injectUiMessageResolver(CouponDetailsFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}
