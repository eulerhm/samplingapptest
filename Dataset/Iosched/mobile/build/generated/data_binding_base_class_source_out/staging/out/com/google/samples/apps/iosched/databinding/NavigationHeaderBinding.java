// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NavigationHeaderBinding extends ViewDataBinding {
  @NonNull
  public final View divider;

  @NonNull
  public final ImageView ioLogo;

  @NonNull
  public final LinearLayout navigationHeader;

  protected NavigationHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View divider, ImageView ioLogo, LinearLayout navigationHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.divider = divider;
    this.ioLogo = ioLogo;
    this.navigationHeader = navigationHeader;
  }

  @NonNull
  public static NavigationHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.navigation_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NavigationHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NavigationHeaderBinding>inflateInternal(inflater, R.layout.navigation_header, root, attachToRoot, component);
  }

  @NonNull
  public static NavigationHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.navigation_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NavigationHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NavigationHeaderBinding>inflateInternal(inflater, R.layout.navigation_header, null, false, component);
  }

  public static NavigationHeaderBinding bind(@NonNull View view) {
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
  public static NavigationHeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (NavigationHeaderBinding)bind(component, view, R.layout.navigation_header);
  }
}
