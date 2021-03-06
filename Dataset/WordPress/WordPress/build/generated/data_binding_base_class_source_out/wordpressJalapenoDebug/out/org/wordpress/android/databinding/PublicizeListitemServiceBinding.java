// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class PublicizeListitemServiceBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView imageIcon;

  @NonNull
  public final WPTextView textService;

  @NonNull
  public final WPTextView textUser;

  private PublicizeListitemServiceBinding(@NonNull RelativeLayout rootView, @NonNull View divider,
      @NonNull ImageView imageIcon, @NonNull WPTextView textService, @NonNull WPTextView textUser) {
    this.rootView = rootView;
    this.divider = divider;
    this.imageIcon = imageIcon;
    this.textService = textService;
    this.textUser = textUser;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PublicizeListitemServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PublicizeListitemServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.publicize_listitem_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PublicizeListitemServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.image_icon;
      ImageView imageIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageIcon == null) {
        break missingId;
      }

      id = R.id.text_service;
      WPTextView textService = ViewBindings.findChildViewById(rootView, id);
      if (textService == null) {
        break missingId;
      }

      id = R.id.text_user;
      WPTextView textUser = ViewBindings.findChildViewById(rootView, id);
      if (textUser == null) {
        break missingId;
      }

      return new PublicizeListitemServiceBinding((RelativeLayout) rootView, divider, imageIcon,
          textService, textUser);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
