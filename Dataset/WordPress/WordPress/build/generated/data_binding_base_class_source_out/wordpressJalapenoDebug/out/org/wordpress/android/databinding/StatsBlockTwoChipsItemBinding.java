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
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsBlockTwoChipsItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Chip choiceChip1;

  @NonNull
  public final Chip choiceChip2;

  @NonNull
  public final ChipGroup choiceChipGroup;

  private StatsBlockTwoChipsItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull Chip choiceChip1, @NonNull Chip choiceChip2, @NonNull ChipGroup choiceChipGroup) {
    this.rootView = rootView;
    this.choiceChip1 = choiceChip1;
    this.choiceChip2 = choiceChip2;
    this.choiceChipGroup = choiceChipGroup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockTwoChipsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockTwoChipsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_two_chips_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockTwoChipsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.choice_chip1;
      Chip choiceChip1 = ViewBindings.findChildViewById(rootView, id);
      if (choiceChip1 == null) {
        break missingId;
      }

      id = R.id.choice_chip2;
      Chip choiceChip2 = ViewBindings.findChildViewById(rootView, id);
      if (choiceChip2 == null) {
        break missingId;
      }

      id = R.id.choice_chip_group;
      ChipGroup choiceChipGroup = ViewBindings.findChildViewById(rootView, id);
      if (choiceChipGroup == null) {
        break missingId;
      }

      return new StatsBlockTwoChipsItemBinding((ConstraintLayout) rootView, choiceChip1,
          choiceChip2, choiceChipGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
