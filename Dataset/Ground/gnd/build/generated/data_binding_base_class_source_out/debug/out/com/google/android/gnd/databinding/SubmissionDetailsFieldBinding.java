// Generated by data binding compiler. Do not edit!
package com.google.android.gnd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.gnd.R;
import com.google.android.gnd.model.task.Field;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SubmissionDetailsFieldBinding extends ViewDataBinding {
  @NonNull
  public final TextView fieldLabel;

  @NonNull
  public final TextView fieldValue;

  @Bindable
  protected Field mField;

  protected SubmissionDetailsFieldBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView fieldLabel, TextView fieldValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fieldLabel = fieldLabel;
    this.fieldValue = fieldValue;
  }

  public abstract void setField(@Nullable Field field);

  @Nullable
  public Field getField() {
    return mField;
  }

  @NonNull
  public static SubmissionDetailsFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.submission_details_field, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SubmissionDetailsFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SubmissionDetailsFieldBinding>inflateInternal(inflater, R.layout.submission_details_field, root, attachToRoot, component);
  }

  @NonNull
  public static SubmissionDetailsFieldBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.submission_details_field, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SubmissionDetailsFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SubmissionDetailsFieldBinding>inflateInternal(inflater, R.layout.submission_details_field, null, false, component);
  }

  public static SubmissionDetailsFieldBinding bind(@NonNull View view) {
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
  public static SubmissionDetailsFieldBinding bind(@NonNull View view, @Nullable Object component) {
    return (SubmissionDetailsFieldBinding)bind(component, view, R.layout.submission_details_field);
  }
}
