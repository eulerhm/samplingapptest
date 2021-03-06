// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.util.crashlogging;

import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.util.BuildConfigWrapper;
import com.woocommerce.android.util.locale.LocaleProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.AccountStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WCCrashLoggingDataProvider_Factory implements Factory<WCCrashLoggingDataProvider> {
  private final Provider<LocaleProvider> localeProvider;

  private final Provider<AccountStore> accountStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<AppPrefs> appPrefsProvider;

  private final Provider<EnqueueSendingEncryptedLogs> enqueueSendingEncryptedLogsProvider;

  private final Provider<UuidGenerator> uuidGeneratorProvider;

  private final Provider<BuildConfigWrapper> buildConfigProvider;

  public WCCrashLoggingDataProvider_Factory(Provider<LocaleProvider> localeProvider,
      Provider<AccountStore> accountStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<AppPrefs> appPrefsProvider,
      Provider<EnqueueSendingEncryptedLogs> enqueueSendingEncryptedLogsProvider,
      Provider<UuidGenerator> uuidGeneratorProvider,
      Provider<BuildConfigWrapper> buildConfigProvider) {
    this.localeProvider = localeProvider;
    this.accountStoreProvider = accountStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.appPrefsProvider = appPrefsProvider;
    this.enqueueSendingEncryptedLogsProvider = enqueueSendingEncryptedLogsProvider;
    this.uuidGeneratorProvider = uuidGeneratorProvider;
    this.buildConfigProvider = buildConfigProvider;
  }

  @Override
  public WCCrashLoggingDataProvider get() {
    return newInstance(localeProvider.get(), accountStoreProvider.get(), selectedSiteProvider.get(), appPrefsProvider.get(), enqueueSendingEncryptedLogsProvider.get(), uuidGeneratorProvider.get(), buildConfigProvider.get());
  }

  public static WCCrashLoggingDataProvider_Factory create(Provider<LocaleProvider> localeProvider,
      Provider<AccountStore> accountStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<AppPrefs> appPrefsProvider,
      Provider<EnqueueSendingEncryptedLogs> enqueueSendingEncryptedLogsProvider,
      Provider<UuidGenerator> uuidGeneratorProvider,
      Provider<BuildConfigWrapper> buildConfigProvider) {
    return new WCCrashLoggingDataProvider_Factory(localeProvider, accountStoreProvider, selectedSiteProvider, appPrefsProvider, enqueueSendingEncryptedLogsProvider, uuidGeneratorProvider, buildConfigProvider);
  }

  public static WCCrashLoggingDataProvider newInstance(LocaleProvider localeProvider,
      AccountStore accountStore, SelectedSite selectedSite, AppPrefs appPrefs,
      EnqueueSendingEncryptedLogs enqueueSendingEncryptedLogs, UuidGenerator uuidGenerator,
      BuildConfigWrapper buildConfig) {
    return new WCCrashLoggingDataProvider(localeProvider, accountStore, selectedSite, appPrefs, enqueueSendingEncryptedLogs, uuidGenerator, buildConfig);
  }
}
