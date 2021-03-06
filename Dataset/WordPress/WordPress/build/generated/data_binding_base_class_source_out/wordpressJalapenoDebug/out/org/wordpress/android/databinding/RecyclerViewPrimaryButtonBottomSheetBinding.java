// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class RecyclerViewPrimaryButtonBottomSheetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View bottomShadow;

  @NonNull
  public final RecyclerView contentRecyclerView;

  @NonNull
  public final BottomSheetHandleViewBinding handle;

  @NonNull
  public final MaterialButton primaryButton;

  private RecyclerViewPrimaryButtonBottomSheetBinding(@NonNull ConstraintLayout rootView,
      @NonNull View bottomShadow, @NonNull RecyclerView contentRecyclerView,
      @NonNull BottomSheetHandleViewBinding handle, @NonNull MaterialButton primaryButton) {
    this.rootView = rootView;
    this.bottomShadow = bottomShadow;
    this.contentRecyclerView = contentRecyclerView;
    this.handle = handle;
    this.primaryButton = primaryButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerViewPrimaryButtonBottomSheetBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerViewPrimaryButtonBottomSheetBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_view_primary_button_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerViewPrimaryButtonBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_shadow;
      View bottomShadow = ViewBindings.findChildViewById(rootView, id);
      if (bottomShadow == null) {
        break missingId;
      }

      id = R.id.content_recycler_view;
      RecyclerView contentRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (contentRecyclerView == null) {
        break missingId;
      }

      id = R.id.handle;
      View handle = ViewBindings.findChildViewById(rootView, id);
      if (handle == null) {
        break missingId;
      }
      BottomSheetHandleViewBinding binding_handle = BottomSheetHandleViewBinding.bind(handle);

      id = R.id.primary_button;
      MaterialButton primaryButton = ViewBindings.findChildViewById(rootView, id);
      if (primaryButton == null) {
        break missingId;
      }

      return new RecyclerViewPrimaryButtonBottomSheetBinding((ConstraintLayout) rootView,
          bottomShadow, contentRecyclerView, binding_handle, primaryButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
