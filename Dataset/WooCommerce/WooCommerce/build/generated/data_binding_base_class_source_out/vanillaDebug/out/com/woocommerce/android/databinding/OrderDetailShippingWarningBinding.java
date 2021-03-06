// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderDetailShippingWarningBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageView shippingMethodNoticeIcon;

  @NonNull
  public final MaterialTextView shippingMethodNoticeTitle;

  private OrderDetailShippingWarningBinding(@NonNull View rootView,
      @NonNull ImageView shippingMethodNoticeIcon,
      @NonNull MaterialTextView shippingMethodNoticeTitle) {
    this.rootView = rootView;
    this.shippingMethodNoticeIcon = shippingMethodNoticeIcon;
    this.shippingMethodNoticeTitle = shippingMethodNoticeTitle;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderDetailShippingWarningBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.order_detail_shipping_warning, parent);
    return bind(parent);
  }

  @NonNull
  public static OrderDetailShippingWarningBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.shipping_method_notice_icon;
      ImageView shippingMethodNoticeIcon = ViewBindings.findChildViewById(rootView, id);
      if (shippingMethodNoticeIcon == null) {
        break missingId;
      }

      id = R.id.shipping_method_notice_title;
      MaterialTextView shippingMethodNoticeTitle = ViewBindings.findChildViewById(rootView, id);
      if (shippingMethodNoticeTitle == null) {
        break missingId;
      }

      return new OrderDetailShippingWarningBinding(rootView, shippingMethodNoticeIcon,
          shippingMethodNoticeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
