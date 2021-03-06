// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class ActivityLogListActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Chip activityTypeFilter;

  @NonNull
  public final AppBarLayout appbarMain;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final Chip dateRangePicker;

  @NonNull
  public final ImageView filterIcon;

  @NonNull
  public final HorizontalScrollView filtersBar;

  @NonNull
  public final View filtersBarDivider;

  @NonNull
  public final MaterialToolbar toolbarMain;

  private ActivityLogListActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Chip activityTypeFilter, @NonNull AppBarLayout appbarMain,
      @NonNull CoordinatorLayout coordinatorLayout, @NonNull Chip dateRangePicker,
      @NonNull ImageView filterIcon, @NonNull HorizontalScrollView filtersBar,
      @NonNull View filtersBarDivider, @NonNull MaterialToolbar toolbarMain) {
    this.rootView = rootView;
    this.activityTypeFilter = activityTypeFilter;
    this.appbarMain = appbarMain;
    this.coordinatorLayout = coordinatorLayout;
    this.dateRangePicker = dateRangePicker;
    this.filterIcon = filterIcon;
    this.filtersBar = filtersBar;
    this.filtersBarDivider = filtersBarDivider;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogListActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogListActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_log_list_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogListActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_type_filter;
      Chip activityTypeFilter = ViewBindings.findChildViewById(rootView, id);
      if (activityTypeFilter == null) {
        break missingId;
      }

      id = R.id.appbar_main;
      AppBarLayout appbarMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarMain == null) {
        break missingId;
      }

      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.date_range_picker;
      Chip dateRangePicker = ViewBindings.findChildViewById(rootView, id);
      if (dateRangePicker == null) {
        break missingId;
      }

      id = R.id.filter_icon;
      ImageView filterIcon = ViewBindings.findChildViewById(rootView, id);
      if (filterIcon == null) {
        break missingId;
      }

      id = R.id.filters_bar;
      HorizontalScrollView filtersBar = ViewBindings.findChildViewById(rootView, id);
      if (filtersBar == null) {
        break missingId;
      }

      id = R.id.filters_bar_divider;
      View filtersBarDivider = ViewBindings.findChildViewById(rootView, id);
      if (filtersBarDivider == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new ActivityLogListActivityBinding((CoordinatorLayout) rootView, activityTypeFilter,
          appbarMain, coordinatorLayout, dateRangePicker, filterIcon, filtersBar, filtersBarDivider,
          toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
