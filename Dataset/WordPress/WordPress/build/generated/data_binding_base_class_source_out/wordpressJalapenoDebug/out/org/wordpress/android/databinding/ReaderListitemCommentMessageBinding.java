// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class ReaderListitemCommentMessageBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final WPTextView textEmpty;

  private ReaderListitemCommentMessageBinding(@NonNull FrameLayout rootView,
      @NonNull WPTextView textEmpty) {
    this.rootView = rootView;
    this.textEmpty = textEmpty;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderListitemCommentMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderListitemCommentMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_listitem_comment_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderListitemCommentMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_empty;
      WPTextView textEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textEmpty == null) {
        break missingId;
      }

      return new ReaderListitemCommentMessageBinding((FrameLayout) rootView, textEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
