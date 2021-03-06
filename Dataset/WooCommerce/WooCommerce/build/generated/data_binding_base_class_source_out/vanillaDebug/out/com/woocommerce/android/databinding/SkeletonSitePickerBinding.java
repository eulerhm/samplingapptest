// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCElevatedLinearLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SkeletonSitePickerBinding implements ViewBinding {
  @NonNull
  private final WCElevatedLinearLayout rootView;

  @NonNull
  public final View description;

  @NonNull
  public final View divider;

  @NonNull
  public final View icon;

  @NonNull
  public final View primary;

  @NonNull
  public final View secondary;

  @NonNull
  public final View title;

  private SkeletonSitePickerBinding(@NonNull WCElevatedLinearLayout rootView,
      @NonNull View description, @NonNull View divider, @NonNull View icon, @NonNull View primary,
      @NonNull View secondary, @NonNull View title) {
    this.rootView = rootView;
    this.description = description;
    this.divider = divider;
    this.icon = icon;
    this.primary = primary;
    this.secondary = secondary;
    this.title = title;
  }

  @Override
  @NonNull
  public WCElevatedLinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonSitePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonSitePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_site_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonSitePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      View description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.icon;
      View icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.primary;
      View primary = ViewBindings.findChildViewById(rootView, id);
      if (primary == null) {
        break missingId;
      }

      id = R.id.secondary;
      View secondary = ViewBindings.findChildViewById(rootView, id);
      if (secondary == null) {
        break missingId;
      }

      id = R.id.title;
      View title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new SkeletonSitePickerBinding((WCElevatedLinearLayout) rootView, description, divider,
          icon, primary, secondary, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
