// Generated by @AssistedModule. Do not modify!
package com.haroldadmin.moonshot.features.search.di;

import com.haroldadmin.moonshot.features.search.SearchViewModel;
import com.haroldadmin.moonshot.features.search.SearchViewModel_AssistedFactory;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class AssistedInject_SearchModule {
  private AssistedInject_SearchModule() {
  }

  @Binds
  abstract SearchViewModel.Factory bind_com_haroldadmin_moonshot_features_search_SearchViewModel(
      SearchViewModel_AssistedFactory factory);
}
