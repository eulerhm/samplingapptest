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

public final class PeopleListRowBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final WPTextView followerSubscribedDate;

  @NonNull
  public final RelativeLayout peopleListRow;

  @NonNull
  public final ImageView personAvatar;

  @NonNull
  public final WPTextView personDisplayName;

  @NonNull
  public final WPTextView personRole;

  @NonNull
  public final WPTextView personUsername;

  private PeopleListRowBinding(@NonNull RelativeLayout rootView,
      @NonNull WPTextView followerSubscribedDate, @NonNull RelativeLayout peopleListRow,
      @NonNull ImageView personAvatar, @NonNull WPTextView personDisplayName,
      @NonNull WPTextView personRole, @NonNull WPTextView personUsername) {
    this.rootView = rootView;
    this.followerSubscribedDate = followerSubscribedDate;
    this.peopleListRow = peopleListRow;
    this.personAvatar = personAvatar;
    this.personDisplayName = personDisplayName;
    this.personRole = personRole;
    this.personUsername = personUsername;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PeopleListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PeopleListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.people_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PeopleListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.follower_subscribed_date;
      WPTextView followerSubscribedDate = ViewBindings.findChildViewById(rootView, id);
      if (followerSubscribedDate == null) {
        break missingId;
      }

      RelativeLayout peopleListRow = (RelativeLayout) rootView;

      id = R.id.person_avatar;
      ImageView personAvatar = ViewBindings.findChildViewById(rootView, id);
      if (personAvatar == null) {
        break missingId;
      }

      id = R.id.person_display_name;
      WPTextView personDisplayName = ViewBindings.findChildViewById(rootView, id);
      if (personDisplayName == null) {
        break missingId;
      }

      id = R.id.person_role;
      WPTextView personRole = ViewBindings.findChildViewById(rootView, id);
      if (personRole == null) {
        break missingId;
      }

      id = R.id.person_username;
      WPTextView personUsername = ViewBindings.findChildViewById(rootView, id);
      if (personUsername == null) {
        break missingId;
      }

      return new PeopleListRowBinding((RelativeLayout) rootView, followerSubscribedDate,
          peopleListRow, personAvatar, personDisplayName, personRole, personUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
