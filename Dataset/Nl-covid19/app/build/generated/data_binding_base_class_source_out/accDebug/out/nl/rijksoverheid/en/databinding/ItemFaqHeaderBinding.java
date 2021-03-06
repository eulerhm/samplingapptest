// Generated by data binding compiler. Do not edit!
package nl.rijksoverheid.en.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import nl.rijksoverheid.en.R;

public abstract class ItemFaqHeaderBinding extends ViewDataBinding {
  @Bindable
  protected Integer mText;

  protected ItemFaqHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setText(@Nullable Integer text);

  @Nullable
  public Integer getText() {
    return mText;
  }

  @NonNull
  public static ItemFaqHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFaqHeaderBinding>inflateInternal(inflater, R.layout.item_faq_header, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFaqHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFaqHeaderBinding>inflateInternal(inflater, R.layout.item_faq_header, null, false, component);
  }

  public static ItemFaqHeaderBinding bind(@NonNull View view) {
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
  public static ItemFaqHeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFaqHeaderBinding)bind(component, view, R.layout.item_faq_header);
  }
}
