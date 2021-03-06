// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.offlinebasemap.viewer;

import com.google.android.gnd.ui.common.Navigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OfflineAreaViewerViewModel_MembersInjector implements MembersInjector<OfflineAreaViewerViewModel> {
  private final Provider<Navigator> navigatorProvider;

  public OfflineAreaViewerViewModel_MembersInjector(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<OfflineAreaViewerViewModel> create(
      Provider<Navigator> navigatorProvider) {
    return new OfflineAreaViewerViewModel_MembersInjector(navigatorProvider);
  }

  @Override
  public void injectMembers(OfflineAreaViewerViewModel instance) {
    injectNavigator(instance, navigatorProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.offlinebasemap.viewer.OfflineAreaViewerViewModel.navigator")
  public static void injectNavigator(OfflineAreaViewerViewModel instance, Navigator navigator) {
    instance.navigator = navigator;
  }
}
