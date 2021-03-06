// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.reader.views.ReaderRecyclerView;
import org.wordpress.android.util.widgets.CustomSwipeRefreshLayout;
import org.wordpress.android.widgets.WPTextView;

public final class ReaderActivityCommentListBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbarMain;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final RelativeLayout layoutBottom;

  @NonNull
  public final ReaderIncludeCommentBoxBinding layoutCommentBox;

  @NonNull
  public final ProgressBar progressLoading;

  @NonNull
  public final ReaderRecyclerView recyclerView;

  @NonNull
  public final CustomSwipeRefreshLayout swipeToRefresh;

  @NonNull
  public final WPTextView textCommentsClosed;

  @NonNull
  public final WPTextView textEmpty;

  @NonNull
  public final MaterialToolbar toolbarMain;

  private ReaderActivityCommentListBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbarMain, @NonNull CoordinatorLayout coordinatorLayout,
      @NonNull RelativeLayout layoutBottom,
      @NonNull ReaderIncludeCommentBoxBinding layoutCommentBox,
      @NonNull ProgressBar progressLoading, @NonNull ReaderRecyclerView recyclerView,
      @NonNull CustomSwipeRefreshLayout swipeToRefresh, @NonNull WPTextView textCommentsClosed,
      @NonNull WPTextView textEmpty, @NonNull MaterialToolbar toolbarMain) {
    this.rootView = rootView;
    this.appbarMain = appbarMain;
    this.coordinatorLayout = coordinatorLayout;
    this.layoutBottom = layoutBottom;
    this.layoutCommentBox = layoutCommentBox;
    this.progressLoading = progressLoading;
    this.recyclerView = recyclerView;
    this.swipeToRefresh = swipeToRefresh;
    this.textCommentsClosed = textCommentsClosed;
    this.textEmpty = textEmpty;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderActivityCommentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderActivityCommentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_activity_comment_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderActivityCommentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar_main;
      AppBarLayout appbarMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarMain == null) {
        break missingId;
      }

      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.layout_bottom;
      RelativeLayout layoutBottom = ViewBindings.findChildViewById(rootView, id);
      if (layoutBottom == null) {
        break missingId;
      }

      id = R.id.layout_comment_box;
      View layoutCommentBox = ViewBindings.findChildViewById(rootView, id);
      if (layoutCommentBox == null) {
        break missingId;
      }
      ReaderIncludeCommentBoxBinding binding_layoutCommentBox = ReaderIncludeCommentBoxBinding.bind(layoutCommentBox);

      id = R.id.progress_loading;
      ProgressBar progressLoading = ViewBindings.findChildViewById(rootView, id);
      if (progressLoading == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      ReaderRecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.swipe_to_refresh;
      CustomSwipeRefreshLayout swipeToRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeToRefresh == null) {
        break missingId;
      }

      id = R.id.text_comments_closed;
      WPTextView textCommentsClosed = ViewBindings.findChildViewById(rootView, id);
      if (textCommentsClosed == null) {
        break missingId;
      }

      id = R.id.text_empty;
      WPTextView textEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textEmpty == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new ReaderActivityCommentListBinding((CoordinatorLayout) rootView, appbarMain,
          coordinatorLayout, layoutBottom, binding_layoutCommentBox, progressLoading, recyclerView,
          swipeToRefresh, textCommentsClosed, textEmpty, toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
