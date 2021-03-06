// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StoriesIntroDialogFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton createStoryIntroButton;

  @NonNull
  public final MaterialCardView createStoryIntroButtonContainer;

  @NonNull
  public final MaterialTextView featureMainSubtitle;

  @NonNull
  public final MaterialTextView featureSubtitleFirst;

  @NonNull
  public final MaterialTextView featureSubtitleSecond;

  @NonNull
  public final MaterialTextView featureTitleFirst;

  @NonNull
  public final MaterialTextView featureTitleSecond;

  @NonNull
  public final ImageButton storiesIntroBackButton;

  @NonNull
  public final MaterialTextView storiesIntroDialogLabel;

  @NonNull
  public final ImageView storyImageFirst;

  @NonNull
  public final ImageView storyImageSecond;

  @NonNull
  public final ConstraintLayout storyImages;

  private StoriesIntroDialogFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton createStoryIntroButton,
      @NonNull MaterialCardView createStoryIntroButtonContainer,
      @NonNull MaterialTextView featureMainSubtitle, @NonNull MaterialTextView featureSubtitleFirst,
      @NonNull MaterialTextView featureSubtitleSecond, @NonNull MaterialTextView featureTitleFirst,
      @NonNull MaterialTextView featureTitleSecond, @NonNull ImageButton storiesIntroBackButton,
      @NonNull MaterialTextView storiesIntroDialogLabel, @NonNull ImageView storyImageFirst,
      @NonNull ImageView storyImageSecond, @NonNull ConstraintLayout storyImages) {
    this.rootView = rootView;
    this.createStoryIntroButton = createStoryIntroButton;
    this.createStoryIntroButtonContainer = createStoryIntroButtonContainer;
    this.featureMainSubtitle = featureMainSubtitle;
    this.featureSubtitleFirst = featureSubtitleFirst;
    this.featureSubtitleSecond = featureSubtitleSecond;
    this.featureTitleFirst = featureTitleFirst;
    this.featureTitleSecond = featureTitleSecond;
    this.storiesIntroBackButton = storiesIntroBackButton;
    this.storiesIntroDialogLabel = storiesIntroDialogLabel;
    this.storyImageFirst = storyImageFirst;
    this.storyImageSecond = storyImageSecond;
    this.storyImages = storyImages;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StoriesIntroDialogFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StoriesIntroDialogFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stories_intro_dialog_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StoriesIntroDialogFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.create_story_intro_button;
      MaterialButton createStoryIntroButton = ViewBindings.findChildViewById(rootView, id);
      if (createStoryIntroButton == null) {
        break missingId;
      }

      id = R.id.create_story_intro_button_container;
      MaterialCardView createStoryIntroButtonContainer = ViewBindings.findChildViewById(rootView, id);
      if (createStoryIntroButtonContainer == null) {
        break missingId;
      }

      id = R.id.feature_main_subtitle;
      MaterialTextView featureMainSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (featureMainSubtitle == null) {
        break missingId;
      }

      id = R.id.feature_subtitle_first;
      MaterialTextView featureSubtitleFirst = ViewBindings.findChildViewById(rootView, id);
      if (featureSubtitleFirst == null) {
        break missingId;
      }

      id = R.id.feature_subtitle_second;
      MaterialTextView featureSubtitleSecond = ViewBindings.findChildViewById(rootView, id);
      if (featureSubtitleSecond == null) {
        break missingId;
      }

      id = R.id.feature_title_first;
      MaterialTextView featureTitleFirst = ViewBindings.findChildViewById(rootView, id);
      if (featureTitleFirst == null) {
        break missingId;
      }

      id = R.id.feature_title_second;
      MaterialTextView featureTitleSecond = ViewBindings.findChildViewById(rootView, id);
      if (featureTitleSecond == null) {
        break missingId;
      }

      id = R.id.stories_intro_back_button;
      ImageButton storiesIntroBackButton = ViewBindings.findChildViewById(rootView, id);
      if (storiesIntroBackButton == null) {
        break missingId;
      }

      id = R.id.stories_intro_dialog_label;
      MaterialTextView storiesIntroDialogLabel = ViewBindings.findChildViewById(rootView, id);
      if (storiesIntroDialogLabel == null) {
        break missingId;
      }

      id = R.id.story_image_first;
      ImageView storyImageFirst = ViewBindings.findChildViewById(rootView, id);
      if (storyImageFirst == null) {
        break missingId;
      }

      id = R.id.story_image_second;
      ImageView storyImageSecond = ViewBindings.findChildViewById(rootView, id);
      if (storyImageSecond == null) {
        break missingId;
      }

      id = R.id.story_images;
      ConstraintLayout storyImages = ViewBindings.findChildViewById(rootView, id);
      if (storyImages == null) {
        break missingId;
      }

      return new StoriesIntroDialogFragmentBinding((ConstraintLayout) rootView,
          createStoryIntroButton, createStoryIntroButtonContainer, featureMainSubtitle,
          featureSubtitleFirst, featureSubtitleSecond, featureTitleFirst, featureTitleSecond,
          storiesIntroBackButton, storiesIntroDialogLabel, storyImageFirst, storyImageSecond,
          storyImages);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
