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
public final class SessionViewPoolModule_ProvidesTagViewPoolFactory implements Factory<RecyclerView.RecycledViewPool> {
  private final SessionViewPoolModule module;

  public SessionViewPoolModule_ProvidesTagViewPoolFactory(SessionViewPoolModule module) {
    this.module = module;
  }

  @Override
  public RecyclerView.RecycledViewPool get() {
    return providesTagViewPool(module);
  }

  public static SessionViewPoolModule_ProvidesTagViewPoolFactory create(
      SessionViewPoolModule module) {
    return new SessionViewPoolModule_ProvidesTagViewPoolFactory(module);
  }

  public static RecyclerView.RecycledViewPool providesTagViewPool(SessionViewPoolModule instance) {
    return Preconditions.checkNotNull(instance.providesTagViewPool(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
