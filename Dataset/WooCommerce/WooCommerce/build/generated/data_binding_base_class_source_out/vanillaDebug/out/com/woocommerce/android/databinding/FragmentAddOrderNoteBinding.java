// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCToggleSingleOptionView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddOrderNoteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialCardView addNoteEditContainer;

  @NonNull
  public final EditText addNoteEditor;

  @NonNull
  public final ImageView addNoteIcon;

  @NonNull
  public final WCToggleSingleOptionView addNoteSwitch;

  @NonNull
  public final LinearLayout snackRoot;

  private FragmentAddOrderNoteBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialCardView addNoteEditContainer, @NonNull EditText addNoteEditor,
      @NonNull ImageView addNoteIcon, @NonNull WCToggleSingleOptionView addNoteSwitch,
      @NonNull LinearLayout snackRoot) {
    this.rootView = rootView;
    this.addNoteEditContainer = addNoteEditContainer;
    this.addNoteEditor = addNoteEditor;
    this.addNoteIcon = addNoteIcon;
    this.addNoteSwitch = addNoteSwitch;
    this.snackRoot = snackRoot;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddOrderNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddOrderNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_order_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddOrderNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addNote_editContainer;
      MaterialCardView addNoteEditContainer = ViewBindings.findChildViewById(rootView, id);
      if (addNoteEditContainer == null) {
        break missingId;
      }

      id = R.id.addNote_editor;
      EditText addNoteEditor = ViewBindings.findChildViewById(rootView, id);
      if (addNoteEditor == null) {
        break missingId;
      }

      id = R.id.addNote_icon;
      ImageView addNoteIcon = ViewBindings.findChildViewById(rootView, id);
      if (addNoteIcon == null) {
        break missingId;
      }

      id = R.id.addNote_switch;
      WCToggleSingleOptionView addNoteSwitch = ViewBindings.findChildViewById(rootView, id);
      if (addNoteSwitch == null) {
        break missingId;
      }

      LinearLayout snackRoot = (LinearLayout) rootView;

      return new FragmentAddOrderNoteBinding((LinearLayout) rootView, addNoteEditContainer,
          addNoteEditor, addNoteIcon, addNoteSwitch, snackRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
