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
import com.google.android.material.chip.Chip;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.filters.FilterChip;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFilterChipSelectableBinding extends ViewDataBinding {
  @NonNull
  public final Chip filterLabel;

  @Bindable
  protected FilterChip mFilterChip;

  @Bindable
  protected FiltersViewModelDelegate mViewModel;

  protected ItemFilterChipSelectableBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Chip filterLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.filterLabel = filterLabel;
  }

  public abstract void setFilterChip(@Nullable FilterChip filterChip);

  @Nullable
  public FilterChip getFilterChip() {
    return mFilterChip;
  }

  public abstract void setViewModel(@Nullable FiltersViewModelDelegate viewModel);

  @Nullable
  public FiltersViewModelDelegate getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemFilterChipSelectableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_filter_chip_selectable, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFilterChipSelectableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFilterChipSelectableBinding>inflateInternal(inflater, R.layout.item_filter_chip_selectable, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFilterChipSelectableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_filter_chip_selectable, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFilterChipSelectableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFilterChipSelectableBinding>inflateInternal(inflater, R.layout.item_filter_chip_selectable, null, false, component);
  }

  public static ItemFilterChipSelectableBinding bind(@NonNull View view) {
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
  public static ItemFilterChipSelectableBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemFilterChipSelectableBinding)bind(component, view, R.layout.item_filter_chip_selectable);
  }
}
