// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class NumberPickerDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final NumberPicker numberPicker;

  @NonNull
  public final WPTextView numberPickerHeader;

  @NonNull
  public final SwitchCompat numberPickerSwitch;

  @NonNull
  public final WPTextView numberPickerText;

  @NonNull
  public final LinearLayout numberPickerToggleable;

  private NumberPickerDialogBinding(@NonNull LinearLayout rootView,
      @NonNull NumberPicker numberPicker, @NonNull WPTextView numberPickerHeader,
      @NonNull SwitchCompat numberPickerSwitch, @NonNull WPTextView numberPickerText,
      @NonNull LinearLayout numberPickerToggleable) {
    this.rootView = rootView;
    this.numberPicker = numberPicker;
    this.numberPickerHeader = numberPickerHeader;
    this.numberPickerSwitch = numberPickerSwitch;
    this.numberPickerText = numberPickerText;
    this.numberPickerToggleable = numberPickerToggleable;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NumberPickerDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NumberPickerDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.number_picker_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NumberPickerDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.number_picker;
      NumberPicker numberPicker = ViewBindings.findChildViewById(rootView, id);
      if (numberPicker == null) {
        break missingId;
      }

      id = R.id.number_picker_header;
      WPTextView numberPickerHeader = ViewBindings.findChildViewById(rootView, id);
      if (numberPickerHeader == null) {
        break missingId;
      }

      id = R.id.number_picker_switch;
      SwitchCompat numberPickerSwitch = ViewBindings.findChildViewById(rootView, id);
      if (numberPickerSwitch == null) {
        break missingId;
      }

      id = R.id.number_picker_text;
      WPTextView numberPickerText = ViewBindings.findChildViewById(rootView, id);
      if (numberPickerText == null) {
        break missingId;
      }

      id = R.id.number_picker_toggleable;
      LinearLayout numberPickerToggleable = ViewBindings.findChildViewById(rootView, id);
      if (numberPickerToggleable == null) {
        break missingId;
      }

      return new NumberPickerDialogBinding((LinearLayout) rootView, numberPicker,
          numberPickerHeader, numberPickerSwitch, numberPickerText, numberPickerToggleable);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
