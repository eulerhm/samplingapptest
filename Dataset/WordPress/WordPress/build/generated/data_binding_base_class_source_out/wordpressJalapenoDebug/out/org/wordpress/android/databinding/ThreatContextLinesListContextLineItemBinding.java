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
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class ThreatContextLinesListContextLineItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView content;

  @NonNull
  public final MaterialTextView lineNumber;

  private ThreatContextLinesListContextLineItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView content, @NonNull MaterialTextView lineNumber) {
    this.rootView = rootView;
    this.content = content;
    this.lineNumber = lineNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ThreatContextLinesListContextLineItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ThreatContextLinesListContextLineItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.threat_context_lines_list_context_line_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ThreatContextLinesListContextLineItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content;
      MaterialTextView content = ViewBindings.findChildViewById(rootView, id);
      if (content == null) {
        break missingId;
      }

      id = R.id.line_number;
      MaterialTextView lineNumber = ViewBindings.findChildViewById(rootView, id);
      if (lineNumber == null) {
        break missingId;
      }

      return new ThreatContextLinesListContextLineItemBinding((ConstraintLayout) rootView, content,
          lineNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
