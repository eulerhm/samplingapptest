// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class MyProfileFragmentBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final WPTextView aboutMe;

  @NonNull
  public final LinearLayout aboutMeRow;

  @NonNull
  public final WPTextView displayName;

  @NonNull
  public final LinearLayout displayNameRow;

  @NonNull
  public final WPTextView firstName;

  @NonNull
  public final LinearLayout firstNameRow;

  @NonNull
  public final WPTextView lastName;

  @NonNull
  public final LinearLayout lastNameRow;

  @NonNull
  public final NestedScrollView nestedScrollView;

  private MyProfileFragmentBinding(@NonNull NestedScrollView rootView, @NonNull WPTextView aboutMe,
      @NonNull LinearLayout aboutMeRow, @NonNull WPTextView displayName,
      @NonNull LinearLayout displayNameRow, @NonNull WPTextView firstName,
      @NonNull LinearLayout firstNameRow, @NonNull WPTextView lastName,
      @NonNull LinearLayout lastNameRow, @NonNull NestedScrollView nestedScrollView) {
    this.rootView = rootView;
    this.aboutMe = aboutMe;
    this.aboutMeRow = aboutMeRow;
    this.displayName = displayName;
    this.displayNameRow = displayNameRow;
    this.firstName = firstName;
    this.firstNameRow = firstNameRow;
    this.lastName = lastName;
    this.lastNameRow = lastNameRow;
    this.nestedScrollView = nestedScrollView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static MyProfileFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_profile_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyProfileFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_me;
      WPTextView aboutMe = ViewBindings.findChildViewById(rootView, id);
      if (aboutMe == null) {
        break missingId;
      }

      id = R.id.about_me_row;
      LinearLayout aboutMeRow = ViewBindings.findChildViewById(rootView, id);
      if (aboutMeRow == null) {
        break missingId;
      }

      id = R.id.display_name;
      WPTextView displayName = ViewBindings.findChildViewById(rootView, id);
      if (displayName == null) {
        break missingId;
      }

      id = R.id.display_name_row;
      LinearLayout displayNameRow = ViewBindings.findChildViewById(rootView, id);
      if (displayNameRow == null) {
        break missingId;
      }

      id = R.id.first_name;
      WPTextView firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.first_name_row;
      LinearLayout firstNameRow = ViewBindings.findChildViewById(rootView, id);
      if (firstNameRow == null) {
        break missingId;
      }

      id = R.id.last_name;
      WPTextView lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.last_name_row;
      LinearLayout lastNameRow = ViewBindings.findChildViewById(rootView, id);
      if (lastNameRow == null) {
        break missingId;
      }

      NestedScrollView nestedScrollView = (NestedScrollView) rootView;

      return new MyProfileFragmentBinding((NestedScrollView) rootView, aboutMe, aboutMeRow,
          displayName, displayNameRow, firstName, firstNameRow, lastName, lastNameRow,
          nestedScrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
