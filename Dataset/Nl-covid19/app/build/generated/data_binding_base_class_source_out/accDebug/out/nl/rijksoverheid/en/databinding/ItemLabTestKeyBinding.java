// Generated by data binding compiler. Do not edit!
package nl.rijksoverheid.en.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.labtest.items.LabTestKeyItem;

public abstract class ItemLabTestKeyBinding extends ViewDataBinding {
  @NonNull
  public final TextView circleCounter;

  @NonNull
  public final TextView errorText;

  @NonNull
  public final ConstraintLayout keyContainer;

  @NonNull
  public final ProgressBar spinner;

  @Bindable
  protected LabTestKeyItem.ViewState mViewState;

  protected ItemLabTestKeyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView circleCounter, TextView errorText, ConstraintLayout keyContainer,
      ProgressBar spinner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.circleCounter = circleCounter;
    this.errorText = errorText;
    this.keyContainer = keyContainer;
    this.spinner = spinner;
  }

  public abstract void setViewState(@Nullable LabTestKeyItem.ViewState viewState);

  @Nullable
  public LabTestKeyItem.ViewState getViewState() {
    return mViewState;
  }

  @NonNull
  public static ItemLabTestKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_lab_test_key, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLabTestKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLabTestKeyBinding>inflateInternal(inflater, R.layout.item_lab_test_key, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLabTestKeyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_lab_test_key, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLabTestKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLabTestKeyBinding>inflateInternal(inflater, R.layout.item_lab_test_key, null, false, component);
  }

  public static ItemLabTestKeyBinding bind(@NonNull View view) {
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
  public static ItemLabTestKeyBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLabTestKeyBinding)bind(component, view, R.layout.item_lab_test_key);
  }
}
