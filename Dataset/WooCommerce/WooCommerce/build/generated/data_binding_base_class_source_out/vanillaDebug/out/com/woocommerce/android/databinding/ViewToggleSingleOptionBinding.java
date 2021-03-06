// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewToggleSingleOptionBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final SwitchMaterial switchSettingSwitch;

  @NonNull
  public final MaterialTextView switchSettingTitle;

  private ViewToggleSingleOptionBinding(@NonNull View rootView,
      @NonNull SwitchMaterial switchSettingSwitch, @NonNull MaterialTextView switchSettingTitle) {
    this.rootView = rootView;
    this.switchSettingSwitch = switchSettingSwitch;
    this.switchSettingTitle = switchSettingTitle;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewToggleSingleOptionBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.view_toggle_single_option, parent);
    return bind(parent);
  }

  @NonNull
  public static ViewToggleSingleOptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.switchSetting_switch;
      SwitchMaterial switchSettingSwitch = ViewBindings.findChildViewById(rootView, id);
      if (switchSettingSwitch == null) {
        break missingId;
      }

      id = R.id.switchSetting_title;
      MaterialTextView switchSettingTitle = ViewBindings.findChildViewById(rootView, id);
      if (switchSettingTitle == null) {
        break missingId;
      }

      return new ViewToggleSingleOptionBinding(rootView, switchSettingSwitch, switchSettingTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
