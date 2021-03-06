// Generated by view binder compiler. Do not edit!
package org.wordpress.android.imageeditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.imageeditor.R;

public final class LayoutRetryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout errorLayout;

  @NonNull
  public final TextView errorTextView;

  @NonNull
  public final ImageView retry;

  private LayoutRetryBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout errorLayout, @NonNull TextView errorTextView,
      @NonNull ImageView retry) {
    this.rootView = rootView;
    this.errorLayout = errorLayout;
    this.errorTextView = errorTextView;
    this.retry = retry;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutRetryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutRetryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_retry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutRetryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout errorLayout = (ConstraintLayout) rootView;

      id = R.id.error_text_view;
      TextView errorTextView = ViewBindings.findChildViewById(rootView, id);
      if (errorTextView == null) {
        break missingId;
      }

      id = R.id.retry;
      ImageView retry = ViewBindings.findChildViewById(rootView, id);
      if (retry == null) {
        break missingId;
      }

      return new LayoutRetryBinding((ConstraintLayout) rootView, errorLayout, errorTextView, retry);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
