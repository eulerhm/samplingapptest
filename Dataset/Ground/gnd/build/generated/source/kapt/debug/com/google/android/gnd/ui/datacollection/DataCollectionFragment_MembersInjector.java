// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.datacollection;

import com.google.android.gnd.ui.common.AbstractFragment_MembersInjector;
import com.google.android.gnd.ui.common.FeatureHelper;
import com.google.android.gnd.ui.common.Navigator;
import com.google.android.gnd.ui.common.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataCollectionFragment_MembersInjector implements MembersInjector<DataCollectionFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<FeatureHelper> featureHelperProvider;

  public DataCollectionFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<Navigator> navigatorProvider, Provider<FeatureHelper> featureHelperProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.navigatorProvider = navigatorProvider;
    this.featureHelperProvider = featureHelperProvider;
  }

  public static MembersInjector<DataCollectionFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider, Provider<Navigator> navigatorProvider,
      Provider<FeatureHelper> featureHelperProvider) {
    return new DataCollectionFragment_MembersInjector(viewModelFactoryProvider, navigatorProvider, featureHelperProvider);
  }

  @Override
  public void injectMembers(DataCollectionFragment instance) {
    AbstractFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectFeatureHelper(instance, featureHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.datacollection.DataCollectionFragment.navigator")
  public static void injectNavigator(DataCollectionFragment instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.datacollection.DataCollectionFragment.featureHelper")
  public static void injectFeatureHelper(DataCollectionFragment instance,
      FeatureHelper featureHelper) {
    instance.featureHelper = featureHelper;
  }
}
