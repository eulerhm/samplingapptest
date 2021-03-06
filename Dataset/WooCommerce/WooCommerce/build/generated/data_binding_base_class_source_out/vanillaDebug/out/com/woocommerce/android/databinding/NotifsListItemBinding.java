// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NotifsListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialTextView notifDesc;

  @NonNull
  public final View notifDivider;

  @NonNull
  public final ImageView notifIcon;

  @NonNull
  public final RatingBar notifRating;

  @NonNull
  public final MaterialTextView notifTitle;

  private NotifsListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialTextView notifDesc, @NonNull View notifDivider, @NonNull ImageView notifIcon,
      @NonNull RatingBar notifRating, @NonNull MaterialTextView notifTitle) {
    this.rootView = rootView;
    this.notifDesc = notifDesc;
    this.notifDivider = notifDivider;
    this.notifIcon = notifIcon;
    this.notifRating = notifRating;
    this.notifTitle = notifTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NotifsListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NotifsListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.notifs_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NotifsListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.notif_desc;
      MaterialTextView notifDesc = ViewBindings.findChildViewById(rootView, id);
      if (notifDesc == null) {
        break missingId;
      }

      id = R.id.notif_divider;
      View notifDivider = ViewBindings.findChildViewById(rootView, id);
      if (notifDivider == null) {
        break missingId;
      }

      id = R.id.notif_icon;
      ImageView notifIcon = ViewBindings.findChildViewById(rootView, id);
      if (notifIcon == null) {
        break missingId;
      }

      id = R.id.notif_rating;
      RatingBar notifRating = ViewBindings.findChildViewById(rootView, id);
      if (notifRating == null) {
        break missingId;
      }

      id = R.id.notif_title;
      MaterialTextView notifTitle = ViewBindings.findChildViewById(rootView, id);
      if (notifTitle == null) {
        break missingId;
      }

      return new NotifsListItemBinding((MaterialCardView) rootView, notifDesc, notifDivider,
          notifIcon, notifRating, notifTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
