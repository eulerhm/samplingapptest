// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;

public final class StatsBlockLegendItemBinding implements ViewBinding {
  @NonNull
  private final MaterialTextView rootView;

  @NonNull
  public final MaterialTextView legend;

  private StatsBlockLegendItemBinding(@NonNull MaterialTextView rootView,
      @NonNull MaterialTextView legend) {
    this.rootView = rootView;
    this.legend = legend;
  }

  @Override
  @NonNull
  public MaterialTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockLegendItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockLegendItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_legend_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockLegendItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    MaterialTextView legend = (MaterialTextView) rootView;

    return new StatsBlockLegendItemBinding((MaterialTextView) rootView, legend);
  }
}
