// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCEmptyView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchFilterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final WCEmptyView emptyView;

  @NonNull
  public final AppCompatEditText searchEditText;

  @NonNull
  public final RecyclerView searchItemsList;

  @NonNull
  public final FrameLayout searchViewContainer;

  private FragmentSearchFilterBinding(@NonNull RelativeLayout rootView,
      @NonNull WCEmptyView emptyView, @NonNull AppCompatEditText searchEditText,
      @NonNull RecyclerView searchItemsList, @NonNull FrameLayout searchViewContainer) {
    this.rootView = rootView;
    this.emptyView = emptyView;
    this.searchEditText = searchEditText;
    this.searchItemsList = searchItemsList;
    this.searchViewContainer = searchViewContainer;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search_filter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchFilterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyView;
      WCEmptyView emptyView = ViewBindings.findChildViewById(rootView, id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.searchEditText;
      AppCompatEditText searchEditText = ViewBindings.findChildViewById(rootView, id);
      if (searchEditText == null) {
        break missingId;
      }

      id = R.id.searchItemsList;
      RecyclerView searchItemsList = ViewBindings.findChildViewById(rootView, id);
      if (searchItemsList == null) {
        break missingId;
      }

      id = R.id.searchViewContainer;
      FrameLayout searchViewContainer = ViewBindings.findChildViewById(rootView, id);
      if (searchViewContainer == null) {
        break missingId;
      }

      return new FragmentSearchFilterBinding((RelativeLayout) rootView, emptyView, searchEditText,
          searchItemsList, searchViewContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
