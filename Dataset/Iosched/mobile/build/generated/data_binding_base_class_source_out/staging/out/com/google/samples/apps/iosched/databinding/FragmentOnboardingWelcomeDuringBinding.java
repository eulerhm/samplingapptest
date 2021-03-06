// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOnboardingWelcomeDuringBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonSignin;

  @NonNull
  public final TextView dateLocation;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final ImageView ioHashtag;

  @NonNull
  public final Space spacer;

  @NonNull
  public final TextView welcomeDuringMessage;

  @Bindable
  protected OnboardingViewModel mActivityViewModel;

  protected FragmentOnboardingWelcomeDuringBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button buttonSignin, TextView dateLocation, Guideline guidelineEnd,
      Guideline guidelineStart, ImageView ioHashtag, Space spacer, TextView welcomeDuringMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonSignin = buttonSignin;
    this.dateLocation = dateLocation;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.ioHashtag = ioHashtag;
    this.spacer = spacer;
    this.welcomeDuringMessage = welcomeDuringMessage;
  }

  public abstract void setActivityViewModel(@Nullable OnboardingViewModel activityViewModel);

  @Nullable
  public OnboardingViewModel getActivityViewModel() {
    return mActivityViewModel;
  }

  @NonNull
  public static FragmentOnboardingWelcomeDuringBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_welcome_during, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingWelcomeDuringBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingWelcomeDuringBinding>inflateInternal(inflater, R.layout.fragment_onboarding_welcome_during, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOnboardingWelcomeDuringBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_welcome_during, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingWelcomeDuringBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingWelcomeDuringBinding>inflateInternal(inflater, R.layout.fragment_onboarding_welcome_during, null, false, component);
  }

  public static FragmentOnboardingWelcomeDuringBinding bind(@NonNull View view) {
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
  public static FragmentOnboardingWelcomeDuringBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentOnboardingWelcomeDuringBinding)bind(component, view, R.layout.fragment_onboarding_welcome_during);
  }
}
