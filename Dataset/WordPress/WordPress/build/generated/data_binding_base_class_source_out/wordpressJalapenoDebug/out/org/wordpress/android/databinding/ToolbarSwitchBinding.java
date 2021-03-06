// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;

public final class ToolbarSwitchBinding implements ViewBinding {
  @NonNull
  private final SwitchCompat rootView;

  @NonNull
  public final SwitchCompat toolbarSwitch;

  private ToolbarSwitchBinding(@NonNull SwitchCompat rootView,
      @NonNull SwitchCompat toolbarSwitch) {
    this.rootView = rootView;
    this.toolbarSwitch = toolbarSwitch;
  }

  @Override
  @NonNull
  public SwitchCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarSwitchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarSwitchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_switch, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarSwitchBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    SwitchCompat toolbarSwitch = (SwitchCompat) rootView;

    return new ToolbarSwitchBinding((SwitchCompat) rootView, toolbarSwitch);
  }
}
