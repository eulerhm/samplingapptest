// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.MySiteTitleAndSubtitleLabelView;
import org.wordpress.android.widgets.QuickStartFocusPoint;

public final class MySiteInfoHeaderCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView blavatarContainer;

  @NonNull
  public final ImageView mySiteBlavatar;

  @NonNull
  public final ProgressBar mySiteIconProgress;

  @NonNull
  public final QuickStartFocusPoint quickStartIconFocusPoint;

  @NonNull
  public final QuickStartFocusPoint quickStartSubTitleFocusPoint;

  @NonNull
  public final QuickStartFocusPoint quickStartTitleFocusPoint;

  @NonNull
  public final ConstraintLayout siteInfoCard;

  @NonNull
  public final MySiteTitleAndSubtitleLabelView siteInfoContainer;

  @NonNull
  public final ImageButton switchSite;

  private MySiteInfoHeaderCardBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView blavatarContainer, @NonNull ImageView mySiteBlavatar,
      @NonNull ProgressBar mySiteIconProgress,
      @NonNull QuickStartFocusPoint quickStartIconFocusPoint,
      @NonNull QuickStartFocusPoint quickStartSubTitleFocusPoint,
      @NonNull QuickStartFocusPoint quickStartTitleFocusPoint,
      @NonNull ConstraintLayout siteInfoCard,
      @NonNull MySiteTitleAndSubtitleLabelView siteInfoContainer, @NonNull ImageButton switchSite) {
    this.rootView = rootView;
    this.blavatarContainer = blavatarContainer;
    this.mySiteBlavatar = mySiteBlavatar;
    this.mySiteIconProgress = mySiteIconProgress;
    this.quickStartIconFocusPoint = quickStartIconFocusPoint;
    this.quickStartSubTitleFocusPoint = quickStartSubTitleFocusPoint;
    this.quickStartTitleFocusPoint = quickStartTitleFocusPoint;
    this.siteInfoCard = siteInfoCard;
    this.siteInfoContainer = siteInfoContainer;
    this.switchSite = switchSite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MySiteInfoHeaderCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MySiteInfoHeaderCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_site_info_header_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MySiteInfoHeaderCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blavatar_container;
      MaterialCardView blavatarContainer = ViewBindings.findChildViewById(rootView, id);
      if (blavatarContainer == null) {
        break missingId;
      }

      id = R.id.my_site_blavatar;
      ImageView mySiteBlavatar = ViewBindings.findChildViewById(rootView, id);
      if (mySiteBlavatar == null) {
        break missingId;
      }

      id = R.id.my_site_icon_progress;
      ProgressBar mySiteIconProgress = ViewBindings.findChildViewById(rootView, id);
      if (mySiteIconProgress == null) {
        break missingId;
      }

      id = R.id.quick_start_icon_focus_point;
      QuickStartFocusPoint quickStartIconFocusPoint = ViewBindings.findChildViewById(rootView, id);
      if (quickStartIconFocusPoint == null) {
        break missingId;
      }

      id = R.id.quick_start_sub_title_focus_point;
      QuickStartFocusPoint quickStartSubTitleFocusPoint = ViewBindings.findChildViewById(rootView, id);
      if (quickStartSubTitleFocusPoint == null) {
        break missingId;
      }

      id = R.id.quick_start_title_focus_point;
      QuickStartFocusPoint quickStartTitleFocusPoint = ViewBindings.findChildViewById(rootView, id);
      if (quickStartTitleFocusPoint == null) {
        break missingId;
      }

      ConstraintLayout siteInfoCard = (ConstraintLayout) rootView;

      id = R.id.site_info_container;
      MySiteTitleAndSubtitleLabelView siteInfoContainer = ViewBindings.findChildViewById(rootView, id);
      if (siteInfoContainer == null) {
        break missingId;
      }

      id = R.id.switch_site;
      ImageButton switchSite = ViewBindings.findChildViewById(rootView, id);
      if (switchSite == null) {
        break missingId;
      }

      return new MySiteInfoHeaderCardBinding((ConstraintLayout) rootView, blavatarContainer,
          mySiteBlavatar, mySiteIconProgress, quickStartIconFocusPoint,
          quickStartSubTitleFocusPoint, quickStartTitleFocusPoint, siteInfoCard, siteInfoContainer,
          switchSite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
