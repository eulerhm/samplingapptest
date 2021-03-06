// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShippingLabelCreatePackageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ViewPager2 createPackagePager;

  @NonNull
  public final TabLayout createPackageTabLayout;

  private FragmentShippingLabelCreatePackageBinding(@NonNull LinearLayout rootView,
      @NonNull ViewPager2 createPackagePager, @NonNull TabLayout createPackageTabLayout) {
    this.rootView = rootView;
    this.createPackagePager = createPackagePager;
    this.createPackageTabLayout = createPackageTabLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShippingLabelCreatePackageBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShippingLabelCreatePackageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_shipping_label_create_package, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShippingLabelCreatePackageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.create_packagePager;
      ViewPager2 createPackagePager = ViewBindings.findChildViewById(rootView, id);
      if (createPackagePager == null) {
        break missingId;
      }

      id = R.id.create_packageTabLayout;
      TabLayout createPackageTabLayout = ViewBindings.findChildViewById(rootView, id);
      if (createPackageTabLayout == null) {
        break missingId;
      }

      return new FragmentShippingLabelCreatePackageBinding((LinearLayout) rootView,
          createPackagePager, createPackageTabLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
