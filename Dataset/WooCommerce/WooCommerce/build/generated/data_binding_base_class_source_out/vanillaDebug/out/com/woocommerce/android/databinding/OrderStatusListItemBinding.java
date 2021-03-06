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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderStatusListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialTextView orderStatusItemCount;

  @NonNull
  public final MaterialTextView orderStatusItemName;

  @NonNull
  public final ConstraintLayout orderStatusListItemRoot;

  private OrderStatusListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialTextView orderStatusItemCount, @NonNull MaterialTextView orderStatusItemName,
      @NonNull ConstraintLayout orderStatusListItemRoot) {
    this.rootView = rootView;
    this.orderStatusItemCount = orderStatusItemCount;
    this.orderStatusItemName = orderStatusItemName;
    this.orderStatusListItemRoot = orderStatusListItemRoot;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderStatusListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderStatusListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.order_status_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderStatusListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.orderStatusItem_count;
      MaterialTextView orderStatusItemCount = ViewBindings.findChildViewById(rootView, id);
      if (orderStatusItemCount == null) {
        break missingId;
      }

      id = R.id.orderStatusItem_name;
      MaterialTextView orderStatusItemName = ViewBindings.findChildViewById(rootView, id);
      if (orderStatusItemName == null) {
        break missingId;
      }

      id = R.id.order_status_list_item_root;
      ConstraintLayout orderStatusListItemRoot = ViewBindings.findChildViewById(rootView, id);
      if (orderStatusListItemRoot == null) {
        break missingId;
      }

      return new OrderStatusListItemBinding((MaterialCardView) rootView, orderStatusItemCount,
          orderStatusItemName, orderStatusListItemRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
