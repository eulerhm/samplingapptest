// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class BaseSiteListitemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageBlavatar;

  @NonNull
  public final WPTextView textDomain;

  @NonNull
  public final WPTextView textTitle;

  private BaseSiteListitemBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageBlavatar,
      @NonNull WPTextView textDomain, @NonNull WPTextView textTitle) {
    this.rootView = rootView;
    this.imageBlavatar = imageBlavatar;
    this.textDomain = textDomain;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BaseSiteListitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BaseSiteListitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.base_site_listitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BaseSiteListitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_blavatar;
      ImageView imageBlavatar = ViewBindings.findChildViewById(rootView, id);
      if (imageBlavatar == null) {
        break missingId;
      }

      id = R.id.text_domain;
      WPTextView textDomain = ViewBindings.findChildViewById(rootView, id);
      if (textDomain == null) {
        break missingId;
      }

      id = R.id.text_title;
      WPTextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new BaseSiteListitemBinding((LinearLayout) rootView, imageBlavatar, textDomain,
          textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
