// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.widgets.NestedWebView;

public final class LayoutPickerPreviewFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final MaterialButton chooseButton;

  @NonNull
  public final TextView desktopPreviewHint;

  @NonNull
  public final ActionableEmptyView errorView;

  @NonNull
  public final ImageButton previewTypeSelectorButton;

  @NonNull
  public final FrameLayout progressBar;

  @NonNull
  public final TextView title;

  @NonNull
  public final NestedWebView webView;

  private LayoutPickerPreviewFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton backButton, @NonNull MaterialButton chooseButton,
      @NonNull TextView desktopPreviewHint, @NonNull ActionableEmptyView errorView,
      @NonNull ImageButton previewTypeSelectorButton, @NonNull FrameLayout progressBar,
      @NonNull TextView title, @NonNull NestedWebView webView) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.chooseButton = chooseButton;
    this.desktopPreviewHint = desktopPreviewHint;
    this.errorView = errorView;
    this.previewTypeSelectorButton = previewTypeSelectorButton;
    this.progressBar = progressBar;
    this.title = title;
    this.webView = webView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutPickerPreviewFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutPickerPreviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_picker_preview_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutPickerPreviewFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.chooseButton;
      MaterialButton chooseButton = ViewBindings.findChildViewById(rootView, id);
      if (chooseButton == null) {
        break missingId;
      }

      id = R.id.desktopPreviewHint;
      TextView desktopPreviewHint = ViewBindings.findChildViewById(rootView, id);
      if (desktopPreviewHint == null) {
        break missingId;
      }

      id = R.id.errorView;
      ActionableEmptyView errorView = ViewBindings.findChildViewById(rootView, id);
      if (errorView == null) {
        break missingId;
      }

      id = R.id.previewTypeSelectorButton;
      ImageButton previewTypeSelectorButton = ViewBindings.findChildViewById(rootView, id);
      if (previewTypeSelectorButton == null) {
        break missingId;
      }

      id = R.id.progressBar;
      FrameLayout progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.webView;
      NestedWebView webView = ViewBindings.findChildViewById(rootView, id);
      if (webView == null) {
        break missingId;
      }

      return new LayoutPickerPreviewFragmentBinding((LinearLayout) rootView, backButton,
          chooseButton, desktopPreviewHint, errorView, previewTypeSelectorButton, progressBar,
          title, webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
