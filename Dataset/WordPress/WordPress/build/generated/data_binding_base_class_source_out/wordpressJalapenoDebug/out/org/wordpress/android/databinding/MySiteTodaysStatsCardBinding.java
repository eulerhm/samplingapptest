// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class MySiteTodaysStatsCardBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MySiteCardFooterLinkBinding footerLink;

  @NonNull
  public final MaterialTextView getMoreViewsMessage;

  @NonNull
  public final MaterialTextView likesCount;

  @NonNull
  public final ConstraintLayout likesLayout;

  @NonNull
  public final MaterialTextView likesTitle;

  @NonNull
  public final ConstraintLayout mySiteTodaysStatCard;

  @NonNull
  public final MaterialTextView title;

  @NonNull
  public final MaterialTextView viewsCount;

  @NonNull
  public final ConstraintLayout viewsLayout;

  @NonNull
  public final MaterialTextView viewsTitle;

  @NonNull
  public final MaterialTextView visitorsCount;

  @NonNull
  public final ConstraintLayout visitorsLayout;

  @NonNull
  public final MaterialTextView visitorsTitle;

  private MySiteTodaysStatsCardBinding(@NonNull MaterialCardView rootView,
      @NonNull MySiteCardFooterLinkBinding footerLink,
      @NonNull MaterialTextView getMoreViewsMessage, @NonNull MaterialTextView likesCount,
      @NonNull ConstraintLayout likesLayout, @NonNull MaterialTextView likesTitle,
      @NonNull ConstraintLayout mySiteTodaysStatCard, @NonNull MaterialTextView title,
      @NonNull MaterialTextView viewsCount, @NonNull ConstraintLayout viewsLayout,
      @NonNull MaterialTextView viewsTitle, @NonNull MaterialTextView visitorsCount,
      @NonNull ConstraintLayout visitorsLayout, @NonNull MaterialTextView visitorsTitle) {
    this.rootView = rootView;
    this.footerLink = footerLink;
    this.getMoreViewsMessage = getMoreViewsMessage;
    this.likesCount = likesCount;
    this.likesLayout = likesLayout;
    this.likesTitle = likesTitle;
    this.mySiteTodaysStatCard = mySiteTodaysStatCard;
    this.title = title;
    this.viewsCount = viewsCount;
    this.viewsLayout = viewsLayout;
    this.viewsTitle = viewsTitle;
    this.visitorsCount = visitorsCount;
    this.visitorsLayout = visitorsLayout;
    this.visitorsTitle = visitorsTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static MySiteTodaysStatsCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MySiteTodaysStatsCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_site_todays_stats_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MySiteTodaysStatsCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.footer_link;
      View footerLink = ViewBindings.findChildViewById(rootView, id);
      if (footerLink == null) {
        break missingId;
      }
      MySiteCardFooterLinkBinding binding_footerLink = MySiteCardFooterLinkBinding.bind(footerLink);

      id = R.id.get_more_views_message;
      MaterialTextView getMoreViewsMessage = ViewBindings.findChildViewById(rootView, id);
      if (getMoreViewsMessage == null) {
        break missingId;
      }

      id = R.id.likes_count;
      MaterialTextView likesCount = ViewBindings.findChildViewById(rootView, id);
      if (likesCount == null) {
        break missingId;
      }

      id = R.id.likes_layout;
      ConstraintLayout likesLayout = ViewBindings.findChildViewById(rootView, id);
      if (likesLayout == null) {
        break missingId;
      }

      id = R.id.likes_title;
      MaterialTextView likesTitle = ViewBindings.findChildViewById(rootView, id);
      if (likesTitle == null) {
        break missingId;
      }

      id = R.id.my_site_todays_stat_card;
      ConstraintLayout mySiteTodaysStatCard = ViewBindings.findChildViewById(rootView, id);
      if (mySiteTodaysStatCard == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.views_count;
      MaterialTextView viewsCount = ViewBindings.findChildViewById(rootView, id);
      if (viewsCount == null) {
        break missingId;
      }

      id = R.id.views_layout;
      ConstraintLayout viewsLayout = ViewBindings.findChildViewById(rootView, id);
      if (viewsLayout == null) {
        break missingId;
      }

      id = R.id.views_title;
      MaterialTextView viewsTitle = ViewBindings.findChildViewById(rootView, id);
      if (viewsTitle == null) {
        break missingId;
      }

      id = R.id.visitors_count;
      MaterialTextView visitorsCount = ViewBindings.findChildViewById(rootView, id);
      if (visitorsCount == null) {
        break missingId;
      }

      id = R.id.visitors_layout;
      ConstraintLayout visitorsLayout = ViewBindings.findChildViewById(rootView, id);
      if (visitorsLayout == null) {
        break missingId;
      }

      id = R.id.visitors_title;
      MaterialTextView visitorsTitle = ViewBindings.findChildViewById(rootView, id);
      if (visitorsTitle == null) {
        break missingId;
      }

      return new MySiteTodaysStatsCardBinding((MaterialCardView) rootView, binding_footerLink,
          getMoreViewsMessage, likesCount, likesLayout, likesTitle, mySiteTodaysStatCard, title,
          viewsCount, viewsLayout, viewsTitle, visitorsCount, visitorsLayout, visitorsTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
