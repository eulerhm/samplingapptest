// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SkeletonShippingLabelPaymentListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private SkeletonShippingLabelPaymentListBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_shipping_label_payment_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonShippingLabelPaymentListBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new SkeletonShippingLabelPaymentListBinding((LinearLayout) rootView);
  }
}
