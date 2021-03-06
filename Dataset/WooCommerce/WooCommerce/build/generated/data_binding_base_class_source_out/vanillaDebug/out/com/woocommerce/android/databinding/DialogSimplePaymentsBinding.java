// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogSimplePaymentsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton buttonDone;

  @NonNull
  public final MaterialTextView captionText;

  @NonNull
  public final View divider;

  @NonNull
  public final WCMaterialOutlinedCurrencyEditTextView editPrice;

  @NonNull
  public final ImageView imageClose;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final MaterialTextView titleText;

  private DialogSimplePaymentsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton buttonDone, @NonNull MaterialTextView captionText,
      @NonNull View divider, @NonNull WCMaterialOutlinedCurrencyEditTextView editPrice,
      @NonNull ImageView imageClose, @NonNull ProgressBar progressBar,
      @NonNull MaterialTextView titleText) {
    this.rootView = rootView;
    this.buttonDone = buttonDone;
    this.captionText = captionText;
    this.divider = divider;
    this.editPrice = editPrice;
    this.imageClose = imageClose;
    this.progressBar = progressBar;
    this.titleText = titleText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogSimplePaymentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogSimplePaymentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_simple_payments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogSimplePaymentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDone;
      MaterialButton buttonDone = ViewBindings.findChildViewById(rootView, id);
      if (buttonDone == null) {
        break missingId;
      }

      id = R.id.captionText;
      MaterialTextView captionText = ViewBindings.findChildViewById(rootView, id);
      if (captionText == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.editPrice;
      WCMaterialOutlinedCurrencyEditTextView editPrice = ViewBindings.findChildViewById(rootView, id);
      if (editPrice == null) {
        break missingId;
      }

      id = R.id.imageClose;
      ImageView imageClose = ViewBindings.findChildViewById(rootView, id);
      if (imageClose == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.titleText;
      MaterialTextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      return new DialogSimplePaymentsBinding((ConstraintLayout) rootView, buttonDone, captionText,
          divider, editPrice, imageClose, progressBar, titleText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
