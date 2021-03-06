// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPScrollView;
import org.wordpress.android.widgets.WPTextView;

public final class FollowedSitesDialogBinding implements ViewBinding {
  @NonNull
  private final WPScrollView rootView;

  @NonNull
  public final SwitchCompat emailNewCommentsSwitch;

  @NonNull
  public final MaterialRadioButton emailNewPostsRadioButtonDaily;

  @NonNull
  public final MaterialRadioButton emailNewPostsRadioButtonInstantly;

  @NonNull
  public final MaterialRadioButton emailNewPostsRadioButtonWeekly;

  @NonNull
  public final RadioGroup emailNewPostsRadioGroup;

  @NonNull
  public final SwitchCompat emailNewPostsSwitch;

  @NonNull
  public final SwitchCompat notificationNewPostsSwitch;

  @NonNull
  public final WPTextView notificationsNewPostsDescription;

  private FollowedSitesDialogBinding(@NonNull WPScrollView rootView,
      @NonNull SwitchCompat emailNewCommentsSwitch,
      @NonNull MaterialRadioButton emailNewPostsRadioButtonDaily,
      @NonNull MaterialRadioButton emailNewPostsRadioButtonInstantly,
      @NonNull MaterialRadioButton emailNewPostsRadioButtonWeekly,
      @NonNull RadioGroup emailNewPostsRadioGroup, @NonNull SwitchCompat emailNewPostsSwitch,
      @NonNull SwitchCompat notificationNewPostsSwitch,
      @NonNull WPTextView notificationsNewPostsDescription) {
    this.rootView = rootView;
    this.emailNewCommentsSwitch = emailNewCommentsSwitch;
    this.emailNewPostsRadioButtonDaily = emailNewPostsRadioButtonDaily;
    this.emailNewPostsRadioButtonInstantly = emailNewPostsRadioButtonInstantly;
    this.emailNewPostsRadioButtonWeekly = emailNewPostsRadioButtonWeekly;
    this.emailNewPostsRadioGroup = emailNewPostsRadioGroup;
    this.emailNewPostsSwitch = emailNewPostsSwitch;
    this.notificationNewPostsSwitch = notificationNewPostsSwitch;
    this.notificationsNewPostsDescription = notificationsNewPostsDescription;
  }

  @Override
  @NonNull
  public WPScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FollowedSitesDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FollowedSitesDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.followed_sites_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FollowedSitesDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_new_comments_switch;
      SwitchCompat emailNewCommentsSwitch = ViewBindings.findChildViewById(rootView, id);
      if (emailNewCommentsSwitch == null) {
        break missingId;
      }

      id = R.id.email_new_posts_radio_button_daily;
      MaterialRadioButton emailNewPostsRadioButtonDaily = ViewBindings.findChildViewById(rootView, id);
      if (emailNewPostsRadioButtonDaily == null) {
        break missingId;
      }

      id = R.id.email_new_posts_radio_button_instantly;
      MaterialRadioButton emailNewPostsRadioButtonInstantly = ViewBindings.findChildViewById(rootView, id);
      if (emailNewPostsRadioButtonInstantly == null) {
        break missingId;
      }

      id = R.id.email_new_posts_radio_button_weekly;
      MaterialRadioButton emailNewPostsRadioButtonWeekly = ViewBindings.findChildViewById(rootView, id);
      if (emailNewPostsRadioButtonWeekly == null) {
        break missingId;
      }

      id = R.id.email_new_posts_radio_group;
      RadioGroup emailNewPostsRadioGroup = ViewBindings.findChildViewById(rootView, id);
      if (emailNewPostsRadioGroup == null) {
        break missingId;
      }

      id = R.id.email_new_posts_switch;
      SwitchCompat emailNewPostsSwitch = ViewBindings.findChildViewById(rootView, id);
      if (emailNewPostsSwitch == null) {
        break missingId;
      }

      id = R.id.notification_new_posts_switch;
      SwitchCompat notificationNewPostsSwitch = ViewBindings.findChildViewById(rootView, id);
      if (notificationNewPostsSwitch == null) {
        break missingId;
      }

      id = R.id.notifications_new_posts_description;
      WPTextView notificationsNewPostsDescription = ViewBindings.findChildViewById(rootView, id);
      if (notificationsNewPostsDescription == null) {
        break missingId;
      }

      return new FollowedSitesDialogBinding((WPScrollView) rootView, emailNewCommentsSwitch,
          emailNewPostsRadioButtonDaily, emailNewPostsRadioButtonInstantly,
          emailNewPostsRadioButtonWeekly, emailNewPostsRadioGroup, emailNewPostsSwitch,
          notificationNewPostsSwitch, notificationsNewPostsDescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
