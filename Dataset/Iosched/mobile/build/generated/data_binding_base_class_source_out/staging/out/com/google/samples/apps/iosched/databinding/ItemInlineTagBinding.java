// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.model.Tag;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemInlineTagBinding extends ViewDataBinding {
  @Bindable
  protected Tag mTag;

  protected ItemInlineTagBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTag(@Nullable Tag tag);

  @Nullable
  public Tag getTag() {
    return mTag;
  }

  @NonNull
  public static ItemInlineTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_inline_tag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemInlineTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemInlineTagBinding>inflateInternal(inflater, R.layout.item_inline_tag, root, attachToRoot, component);
  }

  @NonNull
  public static ItemInlineTagBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_inline_tag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemInlineTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemInlineTagBinding>inflateInternal(inflater, R.layout.item_inline_tag, null, false, component);
  }

  public static ItemInlineTagBinding bind(@NonNull View view) {
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
  public static ItemInlineTagBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemInlineTagBinding)bind(component, view, R.layout.item_inline_tag);
  }
}
