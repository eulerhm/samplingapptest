// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SkeletonListHeaderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final ConstraintLayout skeletonHeader;

  @NonNull
  public final View view5;

  private SkeletonListHeaderBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline4, @NonNull ConstraintLayout skeletonHeader,
      @NonNull View view5) {
    this.rootView = rootView;
    this.guideline4 = guideline4;
    this.skeletonHeader = skeletonHeader;
    this.view5 = view5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonListHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_list_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonListHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline4;
      Guideline guideline4 = ViewBindings.findChildViewById(rootView, id);
      if (guideline4 == null) {
        break missingId;
      }

      ConstraintLayout skeletonHeader = (ConstraintLayout) rootView;

      id = R.id.view5;
      View view5 = ViewBindings.findChildViewById(rootView, id);
      if (view5 == null) {
        break missingId;
      }

      return new SkeletonListHeaderBinding((ConstraintLayout) rootView, guideline4, skeletonHeader,
          view5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
