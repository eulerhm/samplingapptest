// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsBlockPieChartItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final PieChart chart;

  @NonNull
  public final LinearLayout legends;

  @NonNull
  public final TextView totalText;

  private StatsBlockPieChartItemBinding(@NonNull ConstraintLayout rootView, @NonNull PieChart chart,
      @NonNull LinearLayout legends, @NonNull TextView totalText) {
    this.rootView = rootView;
    this.chart = chart;
    this.legends = legends;
    this.totalText = totalText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockPieChartItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockPieChartItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_pie_chart_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockPieChartItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chart;
      PieChart chart = ViewBindings.findChildViewById(rootView, id);
      if (chart == null) {
        break missingId;
      }

      id = R.id.legends;
      LinearLayout legends = ViewBindings.findChildViewById(rootView, id);
      if (legends == null) {
        break missingId;
      }

      id = R.id.total_text;
      TextView totalText = ViewBindings.findChildViewById(rootView, id);
      if (totalText == null) {
        break missingId;
      }

      return new StatsBlockPieChartItemBinding((ConstraintLayout) rootView, chart, legends,
          totalText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
