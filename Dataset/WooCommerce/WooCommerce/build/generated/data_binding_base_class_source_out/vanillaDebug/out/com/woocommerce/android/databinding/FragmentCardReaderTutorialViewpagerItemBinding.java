// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentCardReaderTutorialViewpagerItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView detailTextView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final MaterialTextView labelTextView;

  private FragmentCardReaderTutorialViewpagerItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView detailTextView, @NonNull ImageView imageView,
      @NonNull MaterialTextView labelTextView) {
    this.rootView = rootView;
    this.detailTextView = detailTextView;
    this.imageView = imageView;
    this.labelTextView = labelTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCardReaderTutorialViewpagerItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCardReaderTutorialViewpagerItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_card_reader_tutorial_viewpager_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCardReaderTutorialViewpagerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detailTextView;
      MaterialTextView detailTextView = ViewBindings.findChildViewById(rootView, id);
      if (detailTextView == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.labelTextView;
      MaterialTextView labelTextView = ViewBindings.findChildViewById(rootView, id);
      if (labelTextView == null) {
        break missingId;
      }

      return new FragmentCardReaderTutorialViewpagerItemBinding((ConstraintLayout) rootView,
          detailTextView, imageView, labelTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
