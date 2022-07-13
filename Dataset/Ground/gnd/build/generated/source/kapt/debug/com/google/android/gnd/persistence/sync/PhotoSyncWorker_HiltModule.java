package com.google.android.gnd.persistence.sync;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = PhotoSyncWorker.class
)
public interface PhotoSyncWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.google.android.gnd.persistence.sync.PhotoSyncWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(PhotoSyncWorker_AssistedFactory factory);
}
