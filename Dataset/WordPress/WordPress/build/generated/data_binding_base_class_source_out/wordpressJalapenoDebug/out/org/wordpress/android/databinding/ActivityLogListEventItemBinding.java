// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

public final class ActivityLogListEventItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton actionButton;

  @NonNull
  public final ImageView actionIcon;

  @NonNull
  public final WPTextView actionSummary;

  @NonNull
  public final WPTextView actionText;

  @NonNull
  public final RelativeLayout activityContentContainer;

  private ActivityLogListEventItemBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton actionButton, @NonNull ImageView actionIcon,
      @NonNull WPTextView actionSummary, @NonNull WPTextView actionText,
      @NonNull RelativeLayout activityContentContainer) {
    this.rootView = rootView;
    this.actionButton = actionButton;
    this.actionIcon = actionIcon;
    this.actionSummary = actionSummary;
    this.actionText = actionText;
    this.activityContentContainer = activityContentContainer;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogListEventItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogListEventItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_log_list_event_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogListEventItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_button;
      ImageButton actionButton = ViewBindings.findChildViewById(rootView, id);
      if (actionButton == null) {
        break missingId;
      }

      id = R.id.action_icon;
      ImageView actionIcon = ViewBindings.findChildViewById(rootView, id);
      if (actionIcon == null) {
        break missingId;
      }

      id = R.id.action_summary;
      WPTextView actionSummary = ViewBindings.findChildViewById(rootView, id);
      if (actionSummary == null) {
        break missingId;
      }

      id = R.id.action_text;
      WPTextView actionText = ViewBindings.findChildViewById(rootView, id);
      if (actionText == null) {
        break missingId;
      }

      RelativeLayout activityContentContainer = (RelativeLayout) rootView;

      return new ActivityLogListEventItemBinding((RelativeLayout) rootView, actionButton,
          actionIcon, actionSummary, actionText, activityContentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
