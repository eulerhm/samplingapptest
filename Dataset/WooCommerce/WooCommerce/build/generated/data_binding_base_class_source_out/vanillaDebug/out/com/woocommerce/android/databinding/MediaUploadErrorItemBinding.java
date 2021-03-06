// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MediaUploadErrorItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final MaterialTextView mediaFileErrorText;

  @NonNull
  public final MaterialTextView mediaFileName;

  @NonNull
  public final FrameLayout mediaFrame;

  @NonNull
  public final LinearLayout mediaInfoContainer;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final ImageButton uploadErrorBtnRetry;

  private MediaUploadErrorItemBinding(@NonNull ConstraintLayout rootView, @NonNull View divider,
      @NonNull ConstraintLayout linearLayout, @NonNull MaterialTextView mediaFileErrorText,
      @NonNull MaterialTextView mediaFileName, @NonNull FrameLayout mediaFrame,
      @NonNull LinearLayout mediaInfoContainer, @NonNull ImageView productImage,
      @NonNull ImageButton uploadErrorBtnRetry) {
    this.rootView = rootView;
    this.divider = divider;
    this.linearLayout = linearLayout;
    this.mediaFileErrorText = mediaFileErrorText;
    this.mediaFileName = mediaFileName;
    this.mediaFrame = mediaFrame;
    this.mediaInfoContainer = mediaInfoContainer;
    this.productImage = productImage;
    this.uploadErrorBtnRetry = uploadErrorBtnRetry;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MediaUploadErrorItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MediaUploadErrorItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.media_upload_error_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MediaUploadErrorItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.mediaFileErrorText;
      MaterialTextView mediaFileErrorText = ViewBindings.findChildViewById(rootView, id);
      if (mediaFileErrorText == null) {
        break missingId;
      }

      id = R.id.mediaFileName;
      MaterialTextView mediaFileName = ViewBindings.findChildViewById(rootView, id);
      if (mediaFileName == null) {
        break missingId;
      }

      id = R.id.mediaFrame;
      FrameLayout mediaFrame = ViewBindings.findChildViewById(rootView, id);
      if (mediaFrame == null) {
        break missingId;
      }

      id = R.id.mediaInfoContainer;
      LinearLayout mediaInfoContainer = ViewBindings.findChildViewById(rootView, id);
      if (mediaInfoContainer == null) {
        break missingId;
      }

      id = R.id.productImage;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.uploadError_btnRetry;
      ImageButton uploadErrorBtnRetry = ViewBindings.findChildViewById(rootView, id);
      if (uploadErrorBtnRetry == null) {
        break missingId;
      }

      return new MediaUploadErrorItemBinding((ConstraintLayout) rootView, divider, linearLayout,
          mediaFileErrorText, mediaFileName, mediaFrame, mediaInfoContainer, productImage,
          uploadErrorBtnRetry);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
