// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class ReaderInterestsFragmentLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout backButton;

  @NonNull
  public final MaterialCardView bottomBar;

  @NonNull
  public final MaterialButton doneButton;

  @NonNull
  public final Guideline guidelineBeginning;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final ReaderFullscreenErrorWithRetryBinding includeErrorLayout;

  @NonNull
  public final ChipGroup interestsChipGroup;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final MaterialTextView title;

  private ReaderInterestsFragmentLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout backButton, @NonNull MaterialCardView bottomBar,
      @NonNull MaterialButton doneButton, @NonNull Guideline guidelineBeginning,
      @NonNull Guideline guidelineEnd,
      @NonNull ReaderFullscreenErrorWithRetryBinding includeErrorLayout,
      @NonNull ChipGroup interestsChipGroup, @NonNull ProgressBar progressBar,
      @NonNull ScrollView scrollView, @NonNull MaterialTextView title) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.bottomBar = bottomBar;
    this.doneButton = doneButton;
    this.guidelineBeginning = guidelineBeginning;
    this.guidelineEnd = guidelineEnd;
    this.includeErrorLayout = includeErrorLayout;
    this.interestsChipGroup = interestsChipGroup;
    this.progressBar = progressBar;
    this.scrollView = scrollView;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderInterestsFragmentLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderInterestsFragmentLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_interests_fragment_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderInterestsFragmentLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      RelativeLayout backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.bottom_bar;
      MaterialCardView bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      id = R.id.done_button;
      MaterialButton doneButton = ViewBindings.findChildViewById(rootView, id);
      if (doneButton == null) {
        break missingId;
      }

      id = R.id.guideline_beginning;
      Guideline guidelineBeginning = ViewBindings.findChildViewById(rootView, id);
      if (guidelineBeginning == null) {
        break missingId;
      }

      id = R.id.guideline_end;
      Guideline guidelineEnd = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEnd == null) {
        break missingId;
      }

      id = R.id.include_error_layout;
      View includeErrorLayout = ViewBindings.findChildViewById(rootView, id);
      if (includeErrorLayout == null) {
        break missingId;
      }
      ReaderFullscreenErrorWithRetryBinding binding_includeErrorLayout = ReaderFullscreenErrorWithRetryBinding.bind(includeErrorLayout);

      id = R.id.interests_chip_group;
      ChipGroup interestsChipGroup = ViewBindings.findChildViewById(rootView, id);
      if (interestsChipGroup == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ReaderInterestsFragmentLayoutBinding((ConstraintLayout) rootView, backButton,
          bottomBar, doneButton, guidelineBeginning, guidelineEnd, binding_includeErrorLayout,
          interestsChipGroup, progressBar, scrollView, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
