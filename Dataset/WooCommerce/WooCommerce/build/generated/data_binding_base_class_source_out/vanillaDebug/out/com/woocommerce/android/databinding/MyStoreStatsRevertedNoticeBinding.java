// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyStoreStatsRevertedNoticeBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final MaterialButton btnDismiss;

  @NonNull
  public final MaterialButton btnLearnMore;

  @NonNull
  public final MaterialTextView myStoreRevertedMessage;

  @NonNull
  public final ConstraintLayout myStoreRevertedMorePanel;

  @NonNull
  public final ToggleButton myStoreRevertedViewMore;

  private MyStoreStatsRevertedNoticeBinding(@NonNull View rootView,
      @NonNull MaterialButton btnDismiss, @NonNull MaterialButton btnLearnMore,
      @NonNull MaterialTextView myStoreRevertedMessage,
      @NonNull ConstraintLayout myStoreRevertedMorePanel,
      @NonNull ToggleButton myStoreRevertedViewMore) {
    this.rootView = rootView;
    this.btnDismiss = btnDismiss;
    this.btnLearnMore = btnLearnMore;
    this.myStoreRevertedMessage = myStoreRevertedMessage;
    this.myStoreRevertedMorePanel = myStoreRevertedMorePanel;
    this.myStoreRevertedViewMore = myStoreRevertedViewMore;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static MyStoreStatsRevertedNoticeBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.my_store_stats_reverted_notice, parent);
    return bind(parent);
  }

  @NonNull
  public static MyStoreStatsRevertedNoticeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dismiss;
      MaterialButton btnDismiss = ViewBindings.findChildViewById(rootView, id);
      if (btnDismiss == null) {
        break missingId;
      }

      id = R.id.btn_learn_more;
      MaterialButton btnLearnMore = ViewBindings.findChildViewById(rootView, id);
      if (btnLearnMore == null) {
        break missingId;
      }

      id = R.id.my_store_reverted_message;
      MaterialTextView myStoreRevertedMessage = ViewBindings.findChildViewById(rootView, id);
      if (myStoreRevertedMessage == null) {
        break missingId;
      }

      id = R.id.my_store_reverted_morePanel;
      ConstraintLayout myStoreRevertedMorePanel = ViewBindings.findChildViewById(rootView, id);
      if (myStoreRevertedMorePanel == null) {
        break missingId;
      }

      id = R.id.my_store_reverted_viewMore;
      ToggleButton myStoreRevertedViewMore = ViewBindings.findChildViewById(rootView, id);
      if (myStoreRevertedViewMore == null) {
        break missingId;
      }

      return new MyStoreStatsRevertedNoticeBinding(rootView, btnDismiss, btnLearnMore,
          myStoreRevertedMessage, myStoreRevertedMorePanel, myStoreRevertedViewMore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
