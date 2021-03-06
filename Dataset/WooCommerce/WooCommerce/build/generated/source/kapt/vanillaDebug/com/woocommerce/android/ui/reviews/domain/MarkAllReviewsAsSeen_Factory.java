// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.reviews.domain;

import com.woocommerce.android.push.NotificationMessageHandler;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.ui.reviews.ReviewListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MarkAllReviewsAsSeen_Factory implements Factory<MarkAllReviewsAsSeen> {
  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<ReviewListRepository> repositoryProvider;

  private final Provider<NotificationMessageHandler> notificationHandlerProvider;

  public MarkAllReviewsAsSeen_Factory(Provider<SelectedSite> selectedSiteProvider,
      Provider<ReviewListRepository> repositoryProvider,
      Provider<NotificationMessageHandler> notificationHandlerProvider) {
    this.selectedSiteProvider = selectedSiteProvider;
    this.repositoryProvider = repositoryProvider;
    this.notificationHandlerProvider = notificationHandlerProvider;
  }

  @Override
  public MarkAllReviewsAsSeen get() {
    return newInstance(selectedSiteProvider.get(), repositoryProvider.get(), notificationHandlerProvider.get());
  }

  public static MarkAllReviewsAsSeen_Factory create(Provider<SelectedSite> selectedSiteProvider,
      Provider<ReviewListRepository> repositoryProvider,
      Provider<NotificationMessageHandler> notificationHandlerProvider) {
    return new MarkAllReviewsAsSeen_Factory(selectedSiteProvider, repositoryProvider, notificationHandlerProvider);
  }

  public static MarkAllReviewsAsSeen newInstance(SelectedSite selectedSite,
      ReviewListRepository repository, NotificationMessageHandler notificationHandler) {
    return new MarkAllReviewsAsSeen(selectedSite, repository, notificationHandler);
  }
}
