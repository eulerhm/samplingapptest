// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SkeletonShippingLabelPaymentListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View description;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final View name;

  @NonNull
  public final View price;

  @NonNull
  public final View radiobox;

  private SkeletonShippingLabelPaymentListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull View description, @NonNull ConstraintLayout linearLayout, @NonNull View name,
      @NonNull View price, @NonNull View radiobox) {
    this.rootView = rootView;
    this.description = description;
    this.linearLayout = linearLayout;
    this.name = name;
    this.price = price;
    this.radiobox = radiobox;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_shipping_label_payment_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      View description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.name;
      View name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.price;
      View price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.radiobox;
      View radiobox = ViewBindings.findChildViewById(rootView, id);
      if (radiobox == null) {
        break missingId;
      }

      return new SkeletonShippingLabelPaymentListItemBinding((ConstraintLayout) rootView,
          description, linearLayout, name, price, radiobox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
