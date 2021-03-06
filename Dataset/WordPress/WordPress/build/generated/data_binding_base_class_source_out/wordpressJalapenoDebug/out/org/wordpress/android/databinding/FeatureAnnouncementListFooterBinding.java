// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class FeatureAnnouncementListFooterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton featureAnnouncementFindModeButton;

  private FeatureAnnouncementListFooterBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton featureAnnouncementFindModeButton) {
    this.rootView = rootView;
    this.featureAnnouncementFindModeButton = featureAnnouncementFindModeButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FeatureAnnouncementListFooterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeatureAnnouncementListFooterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feature_announcement_list_footer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeatureAnnouncementListFooterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.feature_announcement_find_mode_button;
      MaterialButton featureAnnouncementFindModeButton = ViewBindings.findChildViewById(rootView, id);
      if (featureAnnouncementFindModeButton == null) {
        break missingId;
      }

      return new FeatureAnnouncementListFooterBinding((ConstraintLayout) rootView,
          featureAnnouncementFindModeButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
