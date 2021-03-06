// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCSelectableTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderDetailNoteItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView orderNoteHeader;

  @NonNull
  public final ImageView orderNoteIcon;

  @NonNull
  public final WCSelectableTextView orderNoteNote;

  private OrderDetailNoteItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView orderNoteHeader, @NonNull ImageView orderNoteIcon,
      @NonNull WCSelectableTextView orderNoteNote) {
    this.rootView = rootView;
    this.orderNoteHeader = orderNoteHeader;
    this.orderNoteIcon = orderNoteIcon;
    this.orderNoteNote = orderNoteNote;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderDetailNoteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderDetailNoteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.order_detail_note_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderDetailNoteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.orderNote_header;
      MaterialTextView orderNoteHeader = ViewBindings.findChildViewById(rootView, id);
      if (orderNoteHeader == null) {
        break missingId;
      }

      id = R.id.orderNote_icon;
      ImageView orderNoteIcon = ViewBindings.findChildViewById(rootView, id);
      if (orderNoteIcon == null) {
        break missingId;
      }

      id = R.id.orderNote_note;
      WCSelectableTextView orderNoteNote = ViewBindings.findChildViewById(rootView, id);
      if (orderNoteNote == null) {
        break missingId;
      }

      return new OrderDetailNoteItemBinding((ConstraintLayout) rootView, orderNoteHeader,
          orderNoteIcon, orderNoteNote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
