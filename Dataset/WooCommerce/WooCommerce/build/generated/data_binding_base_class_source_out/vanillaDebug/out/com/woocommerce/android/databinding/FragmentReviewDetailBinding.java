// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.BorderedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentReviewDetailBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final View divider;

  @NonNull
  public final Flow flowButtons;

  @NonNull
  public final ToggleButton reviewApprove;

  @NonNull
  public final MaterialTextView reviewDescription;

  @NonNull
  public final ImageView reviewGravatar;

  @NonNull
  public final LinearLayout reviewOpenProduct;

  @NonNull
  public final BorderedImageView reviewProductIcon;

  @NonNull
  public final MaterialTextView reviewProductName;

  @NonNull
  public final RatingBar reviewRatingBar;

  @NonNull
  public final MaterialButton reviewSpam;

  @NonNull
  public final MaterialTextView reviewTime;

  @NonNull
  public final MaterialButton reviewTrash;

  @NonNull
  public final MaterialTextView reviewUserName;

  @NonNull
  public final NestedScrollView scrollView;

  private FragmentReviewDetailBinding(@NonNull NestedScrollView rootView,
      @NonNull ConstraintLayout container, @NonNull View divider, @NonNull Flow flowButtons,
      @NonNull ToggleButton reviewApprove, @NonNull MaterialTextView reviewDescription,
      @NonNull ImageView reviewGravatar, @NonNull LinearLayout reviewOpenProduct,
      @NonNull BorderedImageView reviewProductIcon, @NonNull MaterialTextView reviewProductName,
      @NonNull RatingBar reviewRatingBar, @NonNull MaterialButton reviewSpam,
      @NonNull MaterialTextView reviewTime, @NonNull MaterialButton reviewTrash,
      @NonNull MaterialTextView reviewUserName, @NonNull NestedScrollView scrollView) {
    this.rootView = rootView;
    this.container = container;
    this.divider = divider;
    this.flowButtons = flowButtons;
    this.reviewApprove = reviewApprove;
    this.reviewDescription = reviewDescription;
    this.reviewGravatar = reviewGravatar;
    this.reviewOpenProduct = reviewOpenProduct;
    this.reviewProductIcon = reviewProductIcon;
    this.reviewProductName = reviewProductName;
    this.reviewRatingBar = reviewRatingBar;
    this.reviewSpam = reviewSpam;
    this.reviewTime = reviewTime;
    this.reviewTrash = reviewTrash;
    this.reviewUserName = reviewUserName;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReviewDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReviewDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_review_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReviewDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      ConstraintLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.flow_buttons;
      Flow flowButtons = ViewBindings.findChildViewById(rootView, id);
      if (flowButtons == null) {
        break missingId;
      }

      id = R.id.review_approve;
      ToggleButton reviewApprove = ViewBindings.findChildViewById(rootView, id);
      if (reviewApprove == null) {
        break missingId;
      }

      id = R.id.review_description;
      MaterialTextView reviewDescription = ViewBindings.findChildViewById(rootView, id);
      if (reviewDescription == null) {
        break missingId;
      }

      id = R.id.review_gravatar;
      ImageView reviewGravatar = ViewBindings.findChildViewById(rootView, id);
      if (reviewGravatar == null) {
        break missingId;
      }

      id = R.id.review_open_product;
      LinearLayout reviewOpenProduct = ViewBindings.findChildViewById(rootView, id);
      if (reviewOpenProduct == null) {
        break missingId;
      }

      id = R.id.review_product_icon;
      BorderedImageView reviewProductIcon = ViewBindings.findChildViewById(rootView, id);
      if (reviewProductIcon == null) {
        break missingId;
      }

      id = R.id.review_product_name;
      MaterialTextView reviewProductName = ViewBindings.findChildViewById(rootView, id);
      if (reviewProductName == null) {
        break missingId;
      }

      id = R.id.review_rating_bar;
      RatingBar reviewRatingBar = ViewBindings.findChildViewById(rootView, id);
      if (reviewRatingBar == null) {
        break missingId;
      }

      id = R.id.review_spam;
      MaterialButton reviewSpam = ViewBindings.findChildViewById(rootView, id);
      if (reviewSpam == null) {
        break missingId;
      }

      id = R.id.review_time;
      MaterialTextView reviewTime = ViewBindings.findChildViewById(rootView, id);
      if (reviewTime == null) {
        break missingId;
      }

      id = R.id.review_trash;
      MaterialButton reviewTrash = ViewBindings.findChildViewById(rootView, id);
      if (reviewTrash == null) {
        break missingId;
      }

      id = R.id.review_user_name;
      MaterialTextView reviewUserName = ViewBindings.findChildViewById(rootView, id);
      if (reviewUserName == null) {
        break missingId;
      }

      NestedScrollView scrollView = (NestedScrollView) rootView;

      return new FragmentReviewDetailBinding((NestedScrollView) rootView, container, divider,
          flowButtons, reviewApprove, reviewDescription, reviewGravatar, reviewOpenProduct,
          reviewProductIcon, reviewProductName, reviewRatingBar, reviewSpam, reviewTime,
          reviewTrash, reviewUserName, scrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
