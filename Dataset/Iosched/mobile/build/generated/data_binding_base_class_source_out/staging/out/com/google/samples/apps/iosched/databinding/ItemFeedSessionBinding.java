// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.model.userdata.UserSession;
import com.google.samples.apps.iosched.ui.feed.FeedEventListener;
import java.lang.Deprecated;
import java.lang.Object;
import org.threeten.bp.ZoneId;

public abstract class ItemFeedSessionBinding extends ViewDataBinding {
  @NonNull
  public final Button detailsButton;

  @NonNull
  public final LinearLayout footerButtons;

  @NonNull
  public final Guideline keylineBottom;

  @NonNull
  public final Guideline keylineLeft;

  @NonNull
  public final Guideline keylineRight;

  @NonNull
  public final TextView location;

  @NonNull
  public final Button mapButton;

  @NonNull
  public final ImageView reservedIcon;

  @NonNull
  public final ImageView starredIcon;

  @NonNull
  public final TextView time;

  @NonNull
  public final TextView title;

  @Bindable
  protected Boolean mIsMapFeatureEnabled;

  @Bindable
  protected ZoneId mTimeZoneId;

  @Bindable
  protected UserSession mUserSession;

  @Bindable
  protected FeedEventListener mEventListener;

  protected ItemFeedSessionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button detailsButton, LinearLayout footerButtons, Guideline keylineBottom,
      Guideline keylineLeft, Guideline keylineRight, TextView location, Button mapButton,
      ImageView reservedIcon, ImageView starredIcon, TextView time, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailsButton = detailsButton;
    this.footerButtons = footerButtons;
    this.keylineBottom = keylineBottom;
    this.keylineLeft = keylineLeft;
    this.keylineRight = keylineRight;
    this.location = location;
    this.mapButton = mapButton;
    this.reservedIcon = reservedIcon;
    this.starredIcon = starredIcon;
    this.time = time;
    this.title = title;
  }

  public abstract void setIsMapFeatureEnabled(@Nullable Boolean isMapFeatureEnabled);

  @Nullable
  public Boolean getIsMapFeatureEnabled() {
    return mIsMapFeatureEnabled;
  }

  public abstract void setTimeZoneId(@Nullable ZoneId timeZoneId);

  @Nullable
  public ZoneId getTimeZoneId() {
    return mTimeZoneId;
  }

  public abstract void setUserSession(@Nullable UserSession userSession);

  @Nullable
  public UserSession getUserSession() {
    return mUserSession;
  }

  public abstract void setEventListener(@Nullable FeedEventListener eventListener);

  @Nullable
  public FeedEventListener getEventListener() {
    return mEventListener;
  }

  @NonNull
  public static ItemFeedSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_feed_session, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFeedSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFeedSessionBinding>inflateInternal(inflater, R.layout.item_feed_session, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFeedSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_feed_session, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFeedSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFeedSessionBinding>inflateInternal(inflater, R.layout.item_feed_session, null, false, component);
  }

  public static ItemFeedSessionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemFeedSessionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFeedSessionBinding)bind(component, view, R.layout.item_feed_session);
  }
}
