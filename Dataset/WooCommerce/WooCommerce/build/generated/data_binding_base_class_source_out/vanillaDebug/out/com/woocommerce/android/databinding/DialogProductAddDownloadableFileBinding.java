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
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogProductAddDownloadableFileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView addDownloadableFromDevice;

  @NonNull
  public final MaterialTextView addDownloadableFromWpmediaLibrary;

  @NonNull
  public final MaterialTextView addDownloadableManually;

  @NonNull
  public final MaterialTextView productAddDownloadableTitle;

  private DialogProductAddDownloadableFileBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView addDownloadableFromDevice,
      @NonNull MaterialTextView addDownloadableFromWpmediaLibrary,
      @NonNull MaterialTextView addDownloadableManually,
      @NonNull MaterialTextView productAddDownloadableTitle) {
    this.rootView = rootView;
    this.addDownloadableFromDevice = addDownloadableFromDevice;
    this.addDownloadableFromWpmediaLibrary = addDownloadableFromWpmediaLibrary;
    this.addDownloadableManually = addDownloadableManually;
    this.productAddDownloadableTitle = productAddDownloadableTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogProductAddDownloadableFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogProductAddDownloadableFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_product_add_downloadable_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogProductAddDownloadableFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_downloadable_from_device;
      MaterialTextView addDownloadableFromDevice = ViewBindings.findChildViewById(rootView, id);
      if (addDownloadableFromDevice == null) {
        break missingId;
      }

      id = R.id.add_downloadable_from_wpmedia_library;
      MaterialTextView addDownloadableFromWpmediaLibrary = ViewBindings.findChildViewById(rootView, id);
      if (addDownloadableFromWpmediaLibrary == null) {
        break missingId;
      }

      id = R.id.add_downloadable_manually;
      MaterialTextView addDownloadableManually = ViewBindings.findChildViewById(rootView, id);
      if (addDownloadableManually == null) {
        break missingId;
      }

      id = R.id.product_add_downloadable_title;
      MaterialTextView productAddDownloadableTitle = ViewBindings.findChildViewById(rootView, id);
      if (productAddDownloadableTitle == null) {
        break missingId;
      }

      return new DialogProductAddDownloadableFileBinding((LinearLayout) rootView,
          addDownloadableFromDevice, addDownloadableFromWpmediaLibrary, addDownloadableManually,
          productAddDownloadableTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
