// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.settings.SettingsViewModel;
import com.google.samples.apps.iosched.widget.FadingSnackbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSettingsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView openSourceLicense;

  @NonNull
  public final TextView privacyPolicy;

  @NonNull
  public final TextView settingsChooseTheme;

  @NonNull
  public final SwitchMaterial settingsEnableNotifications;

  @NonNull
  public final LinearLayout settingsLayout;

  @NonNull
  public final NestedScrollView settingsScroll;

  @NonNull
  public final SwitchMaterial settingsSendAnonymousUsageStatistics;

  @NonNull
  public final SwitchMaterial settingsTimeZone;

  @NonNull
  public final FadingSnackbar snackbar;

  @NonNull
  public final TextView termsOfService;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView versionBuildNumber;

  @Bindable
  protected SettingsViewModel mViewModel;

  protected FragmentSettingsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, TextView openSourceLicense, TextView privacyPolicy,
      TextView settingsChooseTheme, SwitchMaterial settingsEnableNotifications,
      LinearLayout settingsLayout, NestedScrollView settingsScroll,
      SwitchMaterial settingsSendAnonymousUsageStatistics, SwitchMaterial settingsTimeZone,
      FadingSnackbar snackbar, TextView termsOfService, Toolbar toolbar,
      TextView versionBuildNumber) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.openSourceLicense = openSourceLicense;
    this.privacyPolicy = privacyPolicy;
    this.settingsChooseTheme = settingsChooseTheme;
    this.settingsEnableNotifications = settingsEnableNotifications;
    this.settingsLayout = settingsLayout;
    this.settingsScroll = settingsScroll;
    this.settingsSendAnonymousUsageStatistics = settingsSendAnonymousUsageStatistics;
    this.settingsTimeZone = settingsTimeZone;
    this.snackbar = snackbar;
    this.termsOfService = termsOfService;
    this.toolbar = toolbar;
    this.versionBuildNumber = versionBuildNumber;
  }

  public abstract void setViewModel(@Nullable SettingsViewModel viewModel);

  @Nullable
  public SettingsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_settings, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingsBinding>inflateInternal(inflater, R.layout.fragment_settings, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_settings, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingsBinding>inflateInternal(inflater, R.layout.fragment_settings, null, false, component);
  }

  public static FragmentSettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSettingsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSettingsBinding)bind(component, view, R.layout.fragment_settings);
  }
}
