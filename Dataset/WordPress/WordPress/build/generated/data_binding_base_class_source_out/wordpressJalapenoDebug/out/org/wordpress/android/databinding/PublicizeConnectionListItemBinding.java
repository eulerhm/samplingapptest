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
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class PublicizeConnectionListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView name;

  @NonNull
  public final ImageView profilePic;

  @NonNull
  public final MaterialRadioButton radioButton;

  private PublicizeConnectionListItemBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView name, @NonNull ImageView profilePic,
      @NonNull MaterialRadioButton radioButton) {
    this.rootView = rootView;
    this.name = name;
    this.profilePic = profilePic;
    this.radioButton = radioButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PublicizeConnectionListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PublicizeConnectionListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.publicize_connection_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PublicizeConnectionListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.name;
      MaterialTextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.profile_pic;
      ImageView profilePic = ViewBindings.findChildViewById(rootView, id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.radio_button;
      MaterialRadioButton radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      return new PublicizeConnectionListItemBinding((LinearLayout) rootView, name, profilePic,
          radioButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
