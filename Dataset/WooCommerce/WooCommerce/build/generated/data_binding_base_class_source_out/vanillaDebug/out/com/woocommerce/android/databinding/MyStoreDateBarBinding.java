// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyStoreDateBarBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final MaterialTextView dashboardDateRangeValue;

  private MyStoreDateBarBinding(@NonNull View rootView,
      @NonNull MaterialTextView dashboardDateRangeValue) {
    this.rootView = rootView;
    this.dashboardDateRangeValue = dashboardDateRangeValue;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static MyStoreDateBarBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.my_store_date_bar, parent);
    return bind(parent);
  }

  @NonNull
  public static MyStoreDateBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dashboard_date_range_value;
      MaterialTextView dashboardDateRangeValue = ViewBindings.findChildViewById(rootView, id);
      if (dashboardDateRangeValue == null) {
        break missingId;
      }

      return new MyStoreDateBarBinding(rootView, dashboardDateRangeValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
