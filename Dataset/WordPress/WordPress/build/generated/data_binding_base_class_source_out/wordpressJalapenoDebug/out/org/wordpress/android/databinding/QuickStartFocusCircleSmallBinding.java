// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class QuickStartFocusCircleSmallBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView quickStartFocusInnerCircle;

  @NonNull
  public final ImageView quickStartFocusOuterCircle;

  private QuickStartFocusCircleSmallBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView quickStartFocusInnerCircle,
      @NonNull ImageView quickStartFocusOuterCircle) {
    this.rootView = rootView;
    this.quickStartFocusInnerCircle = quickStartFocusInnerCircle;
    this.quickStartFocusOuterCircle = quickStartFocusOuterCircle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static QuickStartFocusCircleSmallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QuickStartFocusCircleSmallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.quick_start_focus_circle_small, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QuickStartFocusCircleSmallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.quick_start_focus_inner_circle;
      ImageView quickStartFocusInnerCircle = ViewBindings.findChildViewById(rootView, id);
      if (quickStartFocusInnerCircle == null) {
        break missingId;
      }

      id = R.id.quick_start_focus_outer_circle;
      ImageView quickStartFocusOuterCircle = ViewBindings.findChildViewById(rootView, id);
      if (quickStartFocusOuterCircle == null) {
        break missingId;
      }

      return new QuickStartFocusCircleSmallBinding((RelativeLayout) rootView,
          quickStartFocusInnerCircle, quickStartFocusOuterCircle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
