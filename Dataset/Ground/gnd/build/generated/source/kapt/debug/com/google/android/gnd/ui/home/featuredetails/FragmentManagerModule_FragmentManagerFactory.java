// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.home.featuredetails;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentManagerModule_FragmentManagerFactory implements Factory<FragmentManager> {
  private final FragmentManagerModule module;

  private final Provider<Fragment> fragmentProvider;

  public FragmentManagerModule_FragmentManagerFactory(FragmentManagerModule module,
      Provider<Fragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public FragmentManager get() {
    return fragmentManager(module, fragmentProvider.get());
  }

  public static FragmentManagerModule_FragmentManagerFactory create(FragmentManagerModule module,
      Provider<Fragment> fragmentProvider) {
    return new FragmentManagerModule_FragmentManagerFactory(module, fragmentProvider);
  }

  public static FragmentManager fragmentManager(FragmentManagerModule instance, Fragment fragment) {
    return Preconditions.checkNotNullFromProvides(instance.fragmentManager(fragment));
  }
}
