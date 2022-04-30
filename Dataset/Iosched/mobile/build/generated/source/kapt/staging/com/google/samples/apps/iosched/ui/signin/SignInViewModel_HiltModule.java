package com.google.samples.apps.iosched.ui.signin;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = SignInViewModel.class
)
public interface SignInViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.google.samples.apps.iosched.ui.signin.SignInViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SignInViewModel_AssistedFactory factory);
}
