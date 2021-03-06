// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class DebugCookiesFragmentBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbarLayout;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final TextInputEditText hostInput;

  @NonNull
  public final TextInputEditText nameInput;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialButton setCookieButton;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final TextInputEditText valueInput;

  private DebugCookiesFragmentBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbarLayout, @NonNull CoordinatorLayout coordinatorLayout,
      @NonNull TextInputEditText hostInput, @NonNull TextInputEditText nameInput,
      @NonNull RecyclerView recyclerView, @NonNull MaterialButton setCookieButton,
      @NonNull MaterialToolbar toolbar, @NonNull TextInputEditText valueInput) {
    this.rootView = rootView;
    this.appbarLayout = appbarLayout;
    this.coordinatorLayout = coordinatorLayout;
    this.hostInput = hostInput;
    this.nameInput = nameInput;
    this.recyclerView = recyclerView;
    this.setCookieButton = setCookieButton;
    this.toolbar = toolbar;
    this.valueInput = valueInput;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DebugCookiesFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DebugCookiesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.debug_cookies_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DebugCookiesFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar_layout;
      AppBarLayout appbarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appbarLayout == null) {
        break missingId;
      }

      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.host_input;
      TextInputEditText hostInput = ViewBindings.findChildViewById(rootView, id);
      if (hostInput == null) {
        break missingId;
      }

      id = R.id.name_input;
      TextInputEditText nameInput = ViewBindings.findChildViewById(rootView, id);
      if (nameInput == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.set_cookie_button;
      MaterialButton setCookieButton = ViewBindings.findChildViewById(rootView, id);
      if (setCookieButton == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.value_input;
      TextInputEditText valueInput = ViewBindings.findChildViewById(rootView, id);
      if (valueInput == null) {
        break missingId;
      }

      return new DebugCookiesFragmentBinding((CoordinatorLayout) rootView, appbarLayout,
          coordinatorLayout, hostInput, nameInput, recyclerView, setCookieButton, toolbar,
          valueInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
