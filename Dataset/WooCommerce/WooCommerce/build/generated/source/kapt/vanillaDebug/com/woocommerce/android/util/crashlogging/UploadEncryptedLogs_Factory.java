// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.util.crashlogging;

import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.EncryptedLogStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UploadEncryptedLogs_Factory implements Factory<UploadEncryptedLogs> {
  private final Provider<CoroutineDispatchers> dispatchersProvider;

  private final Provider<EncryptedLogStore> encryptedLogStoreProvider;

  public UploadEncryptedLogs_Factory(Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<EncryptedLogStore> encryptedLogStoreProvider) {
    this.dispatchersProvider = dispatchersProvider;
    this.encryptedLogStoreProvider = encryptedLogStoreProvider;
  }

  @Override
  public UploadEncryptedLogs get() {
    return newInstance(dispatchersProvider.get(), encryptedLogStoreProvider.get());
  }

  public static UploadEncryptedLogs_Factory create(
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<EncryptedLogStore> encryptedLogStoreProvider) {
    return new UploadEncryptedLogs_Factory(dispatchersProvider, encryptedLogStoreProvider);
  }

  public static UploadEncryptedLogs newInstance(CoroutineDispatchers dispatchers,
      EncryptedLogStore encryptedLogStore) {
    return new UploadEncryptedLogs(dispatchers, encryptedLogStore);
  }
}
