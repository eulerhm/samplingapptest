// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductDownloadsSettingsBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final WCMaterialOutlinedEditTextView productDownloadExpiry;

  @NonNull
  public final MaterialTextView productDownloadExpiryInfo;

  @NonNull
  public final WCMaterialOutlinedEditTextView productDownloadLimit;

  @NonNull
  public final MaterialTextView productDownloadLimitInfo;

  private FragmentProductDownloadsSettingsBinding(@NonNull NestedScrollView rootView,
      @NonNull WCMaterialOutlinedEditTextView productDownloadExpiry,
      @NonNull MaterialTextView productDownloadExpiryInfo,
      @NonNull WCMaterialOutlinedEditTextView productDownloadLimit,
      @NonNull MaterialTextView productDownloadLimitInfo) {
    this.rootView = rootView;
    this.productDownloadExpiry = productDownloadExpiry;
    this.productDownloadExpiryInfo = productDownloadExpiryInfo;
    this.productDownloadLimit = productDownloadLimit;
    this.productDownloadLimitInfo = productDownloadLimitInfo;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductDownloadsSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductDownloadsSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product_downloads_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductDownloadsSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_download_expiry;
      WCMaterialOutlinedEditTextView productDownloadExpiry = ViewBindings.findChildViewById(rootView, id);
      if (productDownloadExpiry == null) {
        break missingId;
      }

      id = R.id.product_download_expiry_info;
      MaterialTextView productDownloadExpiryInfo = ViewBindings.findChildViewById(rootView, id);
      if (productDownloadExpiryInfo == null) {
        break missingId;
      }

      id = R.id.product_download_limit;
      WCMaterialOutlinedEditTextView productDownloadLimit = ViewBindings.findChildViewById(rootView, id);
      if (productDownloadLimit == null) {
        break missingId;
      }

      id = R.id.product_download_limit_info;
      MaterialTextView productDownloadLimitInfo = ViewBindings.findChildViewById(rootView, id);
      if (productDownloadLimitInfo == null) {
        break missingId;
      }

      return new FragmentProductDownloadsSettingsBinding((NestedScrollView) rootView,
          productDownloadExpiry, productDownloadExpiryInfo, productDownloadLimit,
          productDownloadLimitInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
