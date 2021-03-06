// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.coupons.edit;

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
public final class EditCouponFragment_MembersInjector implements MembersInjector<EditCouponFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public EditCouponFragment_MembersInjector(Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<EditCouponFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new EditCouponFragment_MembersInjector(uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(EditCouponFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.coupons.edit.EditCouponFragment.uiMessageResolver")
  public static void injectUiMessageResolver(EditCouponFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}
