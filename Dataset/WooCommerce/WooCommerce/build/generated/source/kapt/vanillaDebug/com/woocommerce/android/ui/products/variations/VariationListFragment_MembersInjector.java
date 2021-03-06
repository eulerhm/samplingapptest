// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.variations;

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
public final class VariationListFragment_MembersInjector implements MembersInjector<VariationListFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public VariationListFragment_MembersInjector(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<VariationListFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new VariationListFragment_MembersInjector(uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(VariationListFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.variations.VariationListFragment.uiMessageResolver")
  public static void injectUiMessageResolver(VariationListFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}
