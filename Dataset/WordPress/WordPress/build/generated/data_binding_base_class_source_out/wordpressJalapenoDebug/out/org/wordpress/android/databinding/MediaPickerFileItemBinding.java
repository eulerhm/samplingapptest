// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class MediaPickerFileItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout mediaGridItemFileContainer;

  @NonNull
  public final WPTextView mediaItemFiletype;

  @NonNull
  public final ImageView mediaItemFiletypeImage;

  @NonNull
  public final WPTextView mediaItemName;

  private MediaPickerFileItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout mediaGridItemFileContainer, @NonNull WPTextView mediaItemFiletype,
      @NonNull ImageView mediaItemFiletypeImage, @NonNull WPTextView mediaItemName) {
    this.rootView = rootView;
    this.mediaGridItemFileContainer = mediaGridItemFileContainer;
    this.mediaItemFiletype = mediaItemFiletype;
    this.mediaItemFiletypeImage = mediaItemFiletypeImage;
    this.mediaItemName = mediaItemName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MediaPickerFileItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MediaPickerFileItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.media_picker_file_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MediaPickerFileItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.media_grid_item_file_container;
      RelativeLayout mediaGridItemFileContainer = ViewBindings.findChildViewById(rootView, id);
      if (mediaGridItemFileContainer == null) {
        break missingId;
      }

      id = R.id.media_item_filetype;
      WPTextView mediaItemFiletype = ViewBindings.findChildViewById(rootView, id);
      if (mediaItemFiletype == null) {
        break missingId;
      }

      id = R.id.media_item_filetype_image;
      ImageView mediaItemFiletypeImage = ViewBindings.findChildViewById(rootView, id);
      if (mediaItemFiletypeImage == null) {
        break missingId;
      }

      id = R.id.media_item_name;
      WPTextView mediaItemName = ViewBindings.findChildViewById(rootView, id);
      if (mediaItemName == null) {
        break missingId;
      }

      return new MediaPickerFileItemBinding((ConstraintLayout) rootView, mediaGridItemFileContainer,
          mediaItemFiletype, mediaItemFiletypeImage, mediaItemName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
