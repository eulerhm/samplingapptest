// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsWidgetTitleDarkBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView widgetSiteIcon;

  @NonNull
  public final TextView widgetTitle;

  @NonNull
  public final LinearLayout widgetTitleContainer;

  private StatsWidgetTitleDarkBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView widgetSiteIcon, @NonNull TextView widgetTitle,
      @NonNull LinearLayout widgetTitleContainer) {
    this.rootView = rootView;
    this.widgetSiteIcon = widgetSiteIcon;
    this.widgetTitle = widgetTitle;
    this.widgetTitleContainer = widgetTitleContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsWidgetTitleDarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsWidgetTitleDarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_widget_title_dark, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsWidgetTitleDarkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.widget_site_icon;
      ImageView widgetSiteIcon = ViewBindings.findChildViewById(rootView, id);
      if (widgetSiteIcon == null) {
        break missingId;
      }

      id = R.id.widget_title;
      TextView widgetTitle = ViewBindings.findChildViewById(rootView, id);
      if (widgetTitle == null) {
        break missingId;
      }

      LinearLayout widgetTitleContainer = (LinearLayout) rootView;

      return new StatsWidgetTitleDarkBinding((LinearLayout) rootView, widgetSiteIcon, widgetTitle,
          widgetTitleContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
