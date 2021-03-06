// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.coupons;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CouponListHandler_Factory implements Factory<CouponListHandler> {
  private final Provider<CouponRepository> repositoryProvider;

  public CouponListHandler_Factory(Provider<CouponRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CouponListHandler get() {
    return newInstance(repositoryProvider.get());
  }

  public static CouponListHandler_Factory create(Provider<CouponRepository> repositoryProvider) {
    return new CouponListHandler_Factory(repositoryProvider);
  }

  public static CouponListHandler newInstance(CouponRepository repository) {
    return new CouponListHandler(repository);
  }
}
