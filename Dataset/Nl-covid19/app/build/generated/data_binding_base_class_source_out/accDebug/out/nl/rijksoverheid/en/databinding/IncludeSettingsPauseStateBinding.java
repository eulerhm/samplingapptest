// Generated by data binding compiler. Do not edit!
package nl.rijksoverheid.en.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.settings.SettingsViewModel;

public abstract class IncludeSettingsPauseStateBinding extends ViewDataBinding {
  @NonNull
  public final ImageView infoBoxImage;

  @NonNull
  public final ConstraintLayout pauseStatus;

  @Bindable
  protected SettingsViewModel mViewModel;

  protected IncludeSettingsPauseStateBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView infoBoxImage, ConstraintLayout pauseStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.infoBoxImage = infoBoxImage;
    this.pauseStatus = pauseStatus;
  }

  public abstract void setViewModel(@Nullable SettingsViewModel viewModel);

  @Nullable
  public SettingsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static IncludeSettingsPauseStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_settings_pause_state, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static IncludeSettingsPauseStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<IncludeSettingsPauseStateBinding>inflateInternal(inflater, R.layout.include_settings_pause_state, root, attachToRoot, component);
  }

  @NonNull
  public static IncludeSettingsPauseStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_settings_pause_state, null, false, component)
   */
  @NonNull
  @Deprecated
  public static IncludeSettingsPauseStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<IncludeSettingsPauseStateBinding>inflateInternal(inflater, R.layout.include_settings_pause_state, null, false, component);
  }

  public static IncludeSettingsPauseStateBinding bind(@NonNull View view) {
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
  public static IncludeSettingsPauseStateBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (IncludeSettingsPauseStateBinding)bind(component, view, R.layout.include_settings_pause_state);
  }
}
