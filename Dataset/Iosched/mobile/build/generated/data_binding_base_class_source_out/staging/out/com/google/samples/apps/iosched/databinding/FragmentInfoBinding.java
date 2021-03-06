// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.widget.FadingSnackbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentInfoBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CoordinatorLayout infoContainer;

  @NonNull
  public final FadingSnackbar snackbar;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ViewPager2 viewpager;

  protected FragmentInfoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, CoordinatorLayout infoContainer, FadingSnackbar snackbar, TabLayout tabs,
      Toolbar toolbar, ViewPager2 viewpager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.infoContainer = infoContainer;
    this.snackbar = snackbar;
    this.tabs = tabs;
    this.toolbar = toolbar;
    this.viewpager = viewpager;
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentInfoBinding>inflateInternal(inflater, R.layout.fragment_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentInfoBinding>inflateInternal(inflater, R.layout.fragment_info, null, false, component);
  }

  public static FragmentInfoBinding bind(@NonNull View view) {
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
  public static FragmentInfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentInfoBinding)bind(component, view, R.layout.fragment_info);
  }
}
