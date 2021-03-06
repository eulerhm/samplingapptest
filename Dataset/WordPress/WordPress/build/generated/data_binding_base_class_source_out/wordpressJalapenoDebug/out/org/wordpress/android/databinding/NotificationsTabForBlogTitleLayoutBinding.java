// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.prefs.notifications.PrefMainSwitchToolbarView;

public final class NotificationsTabForBlogTitleLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final PrefMainSwitchToolbarView mainSwitch;

  private NotificationsTabForBlogTitleLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull PrefMainSwitchToolbarView mainSwitch) {
    this.rootView = rootView;
    this.mainSwitch = mainSwitch;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NotificationsTabForBlogTitleLayoutBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NotificationsTabForBlogTitleLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.notifications_tab_for_blog_title_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NotificationsTabForBlogTitleLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_switch;
      PrefMainSwitchToolbarView mainSwitch = ViewBindings.findChildViewById(rootView, id);
      if (mainSwitch == null) {
        break missingId;
      }

      return new NotificationsTabForBlogTitleLayoutBinding((LinearLayout) rootView, mainSwitch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
