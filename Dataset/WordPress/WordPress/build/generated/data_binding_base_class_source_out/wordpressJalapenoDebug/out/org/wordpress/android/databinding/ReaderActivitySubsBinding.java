// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.reader.views.ReaderFollowButton;
import org.wordpress.android.widgets.WPViewPager;

public final class ReaderActivitySubsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ReaderFollowButton btnAdd;

  @NonNull
  public final View dividerList;

  @NonNull
  public final TextInputEditText editAdd;

  @NonNull
  public final FloatingActionButton fabButton;

  @NonNull
  public final RelativeLayout layoutBottom;

  @NonNull
  public final ProgressBar progressFollow;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final MaterialToolbar toolbarMain;

  @NonNull
  public final WPViewPager viewpager;

  private ReaderActivitySubsBinding(@NonNull RelativeLayout rootView, @NonNull AppBarLayout appbar,
      @NonNull ReaderFollowButton btnAdd, @NonNull View dividerList,
      @NonNull TextInputEditText editAdd, @NonNull FloatingActionButton fabButton,
      @NonNull RelativeLayout layoutBottom, @NonNull ProgressBar progressFollow,
      @NonNull TabLayout tabLayout, @NonNull MaterialToolbar toolbarMain,
      @NonNull WPViewPager viewpager) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.btnAdd = btnAdd;
    this.dividerList = dividerList;
    this.editAdd = editAdd;
    this.fabButton = fabButton;
    this.layoutBottom = layoutBottom;
    this.progressFollow = progressFollow;
    this.tabLayout = tabLayout;
    this.toolbarMain = toolbarMain;
    this.viewpager = viewpager;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderActivitySubsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderActivitySubsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_activity_subs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderActivitySubsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.btn_add;
      ReaderFollowButton btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.divider_list;
      View dividerList = ViewBindings.findChildViewById(rootView, id);
      if (dividerList == null) {
        break missingId;
      }

      id = R.id.edit_add;
      TextInputEditText editAdd = ViewBindings.findChildViewById(rootView, id);
      if (editAdd == null) {
        break missingId;
      }

      id = R.id.fab_button;
      FloatingActionButton fabButton = ViewBindings.findChildViewById(rootView, id);
      if (fabButton == null) {
        break missingId;
      }

      id = R.id.layout_bottom;
      RelativeLayout layoutBottom = ViewBindings.findChildViewById(rootView, id);
      if (layoutBottom == null) {
        break missingId;
      }

      id = R.id.progress_follow;
      ProgressBar progressFollow = ViewBindings.findChildViewById(rootView, id);
      if (progressFollow == null) {
        break missingId;
      }

      id = R.id.tab_layout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      id = R.id.viewpager;
      WPViewPager viewpager = ViewBindings.findChildViewById(rootView, id);
      if (viewpager == null) {
        break missingId;
      }

      return new ReaderActivitySubsBinding((RelativeLayout) rootView, appbar, btnAdd, dividerList,
          editAdd, fabButton, layoutBottom, progressFollow, tabLayout, toolbarMain, viewpager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
