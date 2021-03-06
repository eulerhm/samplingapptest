// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class SiteSettingsFormatDialogBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputEditText editCustom;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final MaterialTextView textHelp;

  @NonNull
  public final MaterialTextView textTitle;

  private SiteSettingsFormatDialogBinding(@NonNull ScrollView rootView,
      @NonNull TextInputEditText editCustom, @NonNull RadioGroup radioGroup,
      @NonNull MaterialTextView textHelp, @NonNull MaterialTextView textTitle) {
    this.rootView = rootView;
    this.editCustom = editCustom;
    this.radioGroup = radioGroup;
    this.textHelp = textHelp;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static SiteSettingsFormatDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SiteSettingsFormatDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.site_settings_format_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SiteSettingsFormatDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit_custom;
      TextInputEditText editCustom = ViewBindings.findChildViewById(rootView, id);
      if (editCustom == null) {
        break missingId;
      }

      id = R.id.radio_group;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.text_help;
      MaterialTextView textHelp = ViewBindings.findChildViewById(rootView, id);
      if (textHelp == null) {
        break missingId;
      }

      id = R.id.text_title;
      MaterialTextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new SiteSettingsFormatDialogBinding((ScrollView) rootView, editCustom, radioGroup,
          textHelp, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
