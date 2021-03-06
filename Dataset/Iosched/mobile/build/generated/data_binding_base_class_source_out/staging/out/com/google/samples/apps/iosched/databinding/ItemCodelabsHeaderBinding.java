// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCodelabsHeaderBinding extends ViewDataBinding {
  @NonNull
  public final Button codelabsBuilding;

  @NonNull
  public final Button codelabsWebsite;

  @Bindable
  protected CodelabsActionsHandler mActionHandler;

  @Bindable
  protected boolean mMapEnabled;

  protected ItemCodelabsHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button codelabsBuilding, Button codelabsWebsite) {
    super(_bindingComponent, _root, _localFieldCount);
    this.codelabsBuilding = codelabsBuilding;
    this.codelabsWebsite = codelabsWebsite;
  }

  public abstract void setActionHandler(@Nullable CodelabsActionsHandler actionHandler);

  @Nullable
  public CodelabsActionsHandler getActionHandler() {
    return mActionHandler;
  }

  public abstract void setMapEnabled(boolean mapEnabled);

  public boolean getMapEnabled() {
    return mMapEnabled;
  }

  @NonNull
  public static ItemCodelabsHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_codelabs_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCodelabsHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCodelabsHeaderBinding>inflateInternal(inflater, R.layout.item_codelabs_header, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCodelabsHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_codelabs_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCodelabsHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCodelabsHeaderBinding>inflateInternal(inflater, R.layout.item_codelabs_header, null, false, component);
  }

  public static ItemCodelabsHeaderBinding bind(@NonNull View view) {
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
  public static ItemCodelabsHeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCodelabsHeaderBinding)bind(component, view, R.layout.item_codelabs_header);
  }
}
