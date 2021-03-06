// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.persistence.local;

import com.google.android.gnd.persistence.local.room.LocalDatabase;
import com.google.android.gnd.persistence.local.room.dao.FeatureMutationDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataStoreModule_FeatureMutationDaoFactory implements Factory<FeatureMutationDao> {
  private final Provider<LocalDatabase> localDatabaseProvider;

  public LocalDataStoreModule_FeatureMutationDaoFactory(
      Provider<LocalDatabase> localDatabaseProvider) {
    this.localDatabaseProvider = localDatabaseProvider;
  }

  @Override
  public FeatureMutationDao get() {
    return featureMutationDao(localDatabaseProvider.get());
  }

  public static LocalDataStoreModule_FeatureMutationDaoFactory create(
      Provider<LocalDatabase> localDatabaseProvider) {
    return new LocalDataStoreModule_FeatureMutationDaoFactory(localDatabaseProvider);
  }

  public static FeatureMutationDao featureMutationDao(LocalDatabase localDatabase) {
    return Preconditions.checkNotNullFromProvides(LocalDataStoreModule.featureMutationDao(localDatabase));
  }
}
