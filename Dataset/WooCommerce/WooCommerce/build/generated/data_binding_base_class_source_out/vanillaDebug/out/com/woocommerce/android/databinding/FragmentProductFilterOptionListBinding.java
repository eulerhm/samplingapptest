// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCElevatedLinearLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductFilterOptionListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View bottomDivider;

  @NonNull
  public final RecyclerView filterOptionList;

  @NonNull
  public final WCElevatedLinearLayout filterOptionListBtnFrame;

  @NonNull
  public final MaterialButton filterOptionListBtnShowProducts;

  @NonNull
  public final ProgressBar loadMoreProgress;

  private FragmentProductFilterOptionListBinding(@NonNull ConstraintLayout rootView,
      @NonNull View bottomDivider, @NonNull RecyclerView filterOptionList,
      @NonNull WCElevatedLinearLayout filterOptionListBtnFrame,
      @NonNull MaterialButton filterOptionListBtnShowProducts,
      @NonNull ProgressBar loadMoreProgress) {
    this.rootView = rootView;
    this.bottomDivider = bottomDivider;
    this.filterOptionList = filterOptionList;
    this.filterOptionListBtnFrame = filterOptionListBtnFrame;
    this.filterOptionListBtnShowProducts = filterOptionListBtnShowProducts;
    this.loadMoreProgress = loadMoreProgress;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductFilterOptionListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductFilterOptionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product_filter_option_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductFilterOptionListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomDivider;
      View bottomDivider = ViewBindings.findChildViewById(rootView, id);
      if (bottomDivider == null) {
        break missingId;
      }

      id = R.id.filterOptionList;
      RecyclerView filterOptionList = ViewBindings.findChildViewById(rootView, id);
      if (filterOptionList == null) {
        break missingId;
      }

      id = R.id.filterOptionList_btnFrame;
      WCElevatedLinearLayout filterOptionListBtnFrame = ViewBindings.findChildViewById(rootView, id);
      if (filterOptionListBtnFrame == null) {
        break missingId;
      }

      id = R.id.filterOptionList_btnShowProducts;
      MaterialButton filterOptionListBtnShowProducts = ViewBindings.findChildViewById(rootView, id);
      if (filterOptionListBtnShowProducts == null) {
        break missingId;
      }

      id = R.id.loadMoreProgress;
      ProgressBar loadMoreProgress = ViewBindings.findChildViewById(rootView, id);
      if (loadMoreProgress == null) {
        break missingId;
      }

      return new FragmentProductFilterOptionListBinding((ConstraintLayout) rootView, bottomDivider,
          filterOptionList, filterOptionListBtnFrame, filterOptionListBtnShowProducts,
          loadMoreProgress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
