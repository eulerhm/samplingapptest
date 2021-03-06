// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.ui.prefs.EmptyViewRecyclerView;

public final class SiteSettingsTagListActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final AppBarLayout appbarMain;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final FloatingActionButton fabButton;

  @NonNull
  public final EmptyViewRecyclerView tagsRecyclerView;

  @NonNull
  public final MaterialToolbar toolbarMain;

  private SiteSettingsTagListActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull AppBarLayout appbarMain,
      @NonNull FrameLayout container, @NonNull FloatingActionButton fabButton,
      @NonNull EmptyViewRecyclerView tagsRecyclerView, @NonNull MaterialToolbar toolbarMain) {
    this.rootView = rootView;
    this.actionableEmptyView = actionableEmptyView;
    this.appbarMain = appbarMain;
    this.container = container;
    this.fabButton = fabButton;
    this.tagsRecyclerView = tagsRecyclerView;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SiteSettingsTagListActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SiteSettingsTagListActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.site_settings_tag_list_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SiteSettingsTagListActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      id = R.id.appbar_main;
      AppBarLayout appbarMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarMain == null) {
        break missingId;
      }

      id = R.id.container;
      FrameLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.fab_button;
      FloatingActionButton fabButton = ViewBindings.findChildViewById(rootView, id);
      if (fabButton == null) {
        break missingId;
      }

      id = R.id.tags_recycler_view;
      EmptyViewRecyclerView tagsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (tagsRecyclerView == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new SiteSettingsTagListActivityBinding((CoordinatorLayout) rootView,
          actionableEmptyView, appbarMain, container, fabButton, tagsRecyclerView, toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
