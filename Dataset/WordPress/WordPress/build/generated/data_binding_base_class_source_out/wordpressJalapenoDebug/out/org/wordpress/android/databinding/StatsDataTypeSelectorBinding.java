// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsDataTypeSelectorBinding implements ViewBinding {
  @NonNull
  private final RadioGroup rootView;

  @NonNull
  public final RadioGroup dataTypes;

  @NonNull
  public final MaterialRadioButton statsWidgetComments;

  @NonNull
  public final MaterialRadioButton statsWidgetLikes;

  @NonNull
  public final MaterialRadioButton statsWidgetViews;

  @NonNull
  public final MaterialRadioButton statsWidgetVisitors;

  private StatsDataTypeSelectorBinding(@NonNull RadioGroup rootView, @NonNull RadioGroup dataTypes,
      @NonNull MaterialRadioButton statsWidgetComments,
      @NonNull MaterialRadioButton statsWidgetLikes, @NonNull MaterialRadioButton statsWidgetViews,
      @NonNull MaterialRadioButton statsWidgetVisitors) {
    this.rootView = rootView;
    this.dataTypes = dataTypes;
    this.statsWidgetComments = statsWidgetComments;
    this.statsWidgetLikes = statsWidgetLikes;
    this.statsWidgetViews = statsWidgetViews;
    this.statsWidgetVisitors = statsWidgetVisitors;
  }

  @Override
  @NonNull
  public RadioGroup getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsDataTypeSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsDataTypeSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_data_type_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsDataTypeSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RadioGroup dataTypes = (RadioGroup) rootView;

      id = R.id.stats_widget_comments;
      MaterialRadioButton statsWidgetComments = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetComments == null) {
        break missingId;
      }

      id = R.id.stats_widget_likes;
      MaterialRadioButton statsWidgetLikes = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetLikes == null) {
        break missingId;
      }

      id = R.id.stats_widget_views;
      MaterialRadioButton statsWidgetViews = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetViews == null) {
        break missingId;
      }

      id = R.id.stats_widget_visitors;
      MaterialRadioButton statsWidgetVisitors = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetVisitors == null) {
        break missingId;
      }

      return new StatsDataTypeSelectorBinding((RadioGroup) rootView, dataTypes, statsWidgetComments,
          statsWidgetLikes, statsWidgetViews, statsWidgetVisitors);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
