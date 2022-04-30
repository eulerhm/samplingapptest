package com.google.samples.apps.iosched.ui.sessioncommon;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionViewPoolModule_ProvidesSessionViewPoolFactory implements Factory<RecyclerView.RecycledViewPool> {
  private final SessionViewPoolModule module;

  public SessionViewPoolModule_ProvidesSessionViewPoolFactory(SessionViewPoolModule module) {
    this.module = module;
  }

  @Override
  public RecyclerView.RecycledViewPool get() {
    return providesSessionViewPool(module);
  }

  public static SessionViewPoolModule_ProvidesSessionViewPoolFactory create(
      SessionViewPoolModule module) {
    return new SessionViewPoolModule_ProvidesSessionViewPoolFactory(module);
  }

  public static RecyclerView.RecycledViewPool providesSessionViewPool(
      SessionViewPoolModule instance) {
    return Preconditions.checkNotNull(instance.providesSessionViewPool(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
