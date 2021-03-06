// Generated by data binding compiler. Do not edit!
package nl.rijksoverheid.en.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.status.StatusPausedItem;

public abstract class ItemStatusPausedBinding extends ViewDataBinding {
  @NonNull
  public final Barrier headerBarrier;

  @NonNull
  public final Button infoBoxButton;

  @NonNull
  public final ImageView infoBoxImage;

  @NonNull
  public final TextView infoBoxText;

  @NonNull
  public final TextView infoBoxTitle;

  @Bindable
  protected StatusPausedItem.ViewState mViewState;

  protected ItemStatusPausedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier headerBarrier, Button infoBoxButton, ImageView infoBoxImage, TextView infoBoxText,
      TextView infoBoxTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerBarrier = headerBarrier;
    this.infoBoxButton = infoBoxButton;
    this.infoBoxImage = infoBoxImage;
    this.infoBoxText = infoBoxText;
    this.infoBoxTitle = infoBoxTitle;
  }

  public abstract void setViewState(@Nullable StatusPausedItem.ViewState viewState);

  @Nullable
  public StatusPausedItem.ViewState getViewState() {
    return mViewState;
  }

  @NonNull
  public static ItemStatusPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_status_paused, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemStatusPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemStatusPausedBinding>inflateInternal(inflater, R.layout.item_status_paused, root, attachToRoot, component);
  }

  @NonNull
  public static ItemStatusPausedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_status_paused, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemStatusPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemStatusPausedBinding>inflateInternal(inflater, R.layout.item_status_paused, null, false, component);
  }

  public static ItemStatusPausedBinding bind(@NonNull View view) {
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
  public static ItemStatusPausedBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemStatusPausedBinding)bind(component, view, R.layout.item_status_paused);
  }
}
