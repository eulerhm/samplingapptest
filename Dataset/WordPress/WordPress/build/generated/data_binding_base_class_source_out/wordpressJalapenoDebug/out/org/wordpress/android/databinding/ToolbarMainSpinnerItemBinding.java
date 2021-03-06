// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class ToolbarMainSpinnerItemBinding implements ViewBinding {
  @NonNull
  private final WPTextView rootView;

  @NonNull
  public final WPTextView text;

  private ToolbarMainSpinnerItemBinding(@NonNull WPTextView rootView, @NonNull WPTextView text) {
    this.rootView = rootView;
    this.text = text;
  }

  @Override
  @NonNull
  public WPTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarMainSpinnerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarMainSpinnerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_main_spinner_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarMainSpinnerItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    WPTextView text = (WPTextView) rootView;

    return new ToolbarMainSpinnerItemBinding((WPTextView) rootView, text);
  }
}
