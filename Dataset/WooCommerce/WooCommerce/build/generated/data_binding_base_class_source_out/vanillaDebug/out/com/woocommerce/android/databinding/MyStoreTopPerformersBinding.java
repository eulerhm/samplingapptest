// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyStoreTopPerformersBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RelativeLayout dashboardTopPerformersContainer;

  @NonNull
  public final LinearLayout topPerformersEmptyViewLinearLayout;

  @NonNull
  public final ImageView topPerformersError;

  @NonNull
  public final LinearLayout topPerformersLinearLayout;

  @NonNull
  public final FrameLayout topPerformersListHeader;

  @NonNull
  public final RecyclerView topPerformersRecycler;

  @NonNull
  public final MaterialTextView topPerformersTitle;

  private MyStoreTopPerformersBinding(@NonNull LinearLayout rootView,
      @NonNull RelativeLayout dashboardTopPerformersContainer,
      @NonNull LinearLayout topPerformersEmptyViewLinearLayout,
      @NonNull ImageView topPerformersError, @NonNull LinearLayout topPerformersLinearLayout,
      @NonNull FrameLayout topPerformersListHeader, @NonNull RecyclerView topPerformersRecycler,
      @NonNull MaterialTextView topPerformersTitle) {
    this.rootView = rootView;
    this.dashboardTopPerformersContainer = dashboardTopPerformersContainer;
    this.topPerformersEmptyViewLinearLayout = topPerformersEmptyViewLinearLayout;
    this.topPerformersError = topPerformersError;
    this.topPerformersLinearLayout = topPerformersLinearLayout;
    this.topPerformersListHeader = topPerformersListHeader;
    this.topPerformersRecycler = topPerformersRecycler;
    this.topPerformersTitle = topPerformersTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyStoreTopPerformersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyStoreTopPerformersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_store_top_performers, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyStoreTopPerformersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dashboard_top_performers_container;
      RelativeLayout dashboardTopPerformersContainer = ViewBindings.findChildViewById(rootView, id);
      if (dashboardTopPerformersContainer == null) {
        break missingId;
      }

      id = R.id.topPerformersEmptyViewLinearLayout;
      LinearLayout topPerformersEmptyViewLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (topPerformersEmptyViewLinearLayout == null) {
        break missingId;
      }

      id = R.id.topPerformers_error;
      ImageView topPerformersError = ViewBindings.findChildViewById(rootView, id);
      if (topPerformersError == null) {
        break missingId;
      }

      LinearLayout topPerformersLinearLayout = (LinearLayout) rootView;

      id = R.id.topPerformers_list_header;
      FrameLayout topPerformersListHeader = ViewBindings.findChildViewById(rootView, id);
      if (topPerformersListHeader == null) {
        break missingId;
      }

      id = R.id.topPerformers_recycler;
      RecyclerView topPerformersRecycler = ViewBindings.findChildViewById(rootView, id);
      if (topPerformersRecycler == null) {
        break missingId;
      }

      id = R.id.topPerformers_title;
      MaterialTextView topPerformersTitle = ViewBindings.findChildViewById(rootView, id);
      if (topPerformersTitle == null) {
        break missingId;
      }

      return new MyStoreTopPerformersBinding((LinearLayout) rootView,
          dashboardTopPerformersContainer, topPerformersEmptyViewLinearLayout, topPerformersError,
          topPerformersLinearLayout, topPerformersListHeader, topPerformersRecycler,
          topPerformersTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
