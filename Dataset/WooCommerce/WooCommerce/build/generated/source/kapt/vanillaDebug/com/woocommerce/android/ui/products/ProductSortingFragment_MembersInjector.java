// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import com.woocommerce.android.util.CurrencyFormatter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductSortingFragment_MembersInjector implements MembersInjector<ProductSortingFragment> {
  private final Provider<CurrencyFormatter> currencyFormatterProvider;

  public ProductSortingFragment_MembersInjector(
      Provider<CurrencyFormatter> currencyFormatterProvider) {
    this.currencyFormatterProvider = currencyFormatterProvider;
  }

  public static MembersInjector<ProductSortingFragment> create(
      Provider<CurrencyFormatter> currencyFormatterProvider) {
    return new ProductSortingFragment_MembersInjector(currencyFormatterProvider);
  }

  @Override
  public void injectMembers(ProductSortingFragment instance) {
    injectCurrencyFormatter(instance, currencyFormatterProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.ProductSortingFragment.currencyFormatter")
  public static void injectCurrencyFormatter(ProductSortingFragment instance,
      CurrencyFormatter currencyFormatter) {
    instance.currencyFormatter = currencyFormatter;
  }
}
