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
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsBlockValueItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView change;

  @NonNull
  public final MaterialTextView unit;

  @NonNull
  public final MaterialTextView value;

  @NonNull
  public final LinearLayout valueContainer;

  private StatsBlockValueItemBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView change, @NonNull MaterialTextView unit,
      @NonNull MaterialTextView value, @NonNull LinearLayout valueContainer) {
    this.rootView = rootView;
    this.change = change;
    this.unit = unit;
    this.value = value;
    this.valueContainer = valueContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockValueItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockValueItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_value_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockValueItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.change;
      MaterialTextView change = ViewBindings.findChildViewById(rootView, id);
      if (change == null) {
        break missingId;
      }

      id = R.id.unit;
      MaterialTextView unit = ViewBindings.findChildViewById(rootView, id);
      if (unit == null) {
        break missingId;
      }

      id = R.id.value;
      MaterialTextView value = ViewBindings.findChildViewById(rootView, id);
      if (value == null) {
        break missingId;
      }

      LinearLayout valueContainer = (LinearLayout) rootView;

      return new StatsBlockValueItemBinding((LinearLayout) rootView, change, unit, value,
          valueContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
