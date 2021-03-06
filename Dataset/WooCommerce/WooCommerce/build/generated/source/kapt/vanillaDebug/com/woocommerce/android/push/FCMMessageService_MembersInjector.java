// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.push;

import com.woocommerce.android.AppPrefsWrapper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.InvalidateDeviceRegistration;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FCMMessageService_MembersInjector implements MembersInjector<FCMMessageService> {
  private final Provider<NotificationMessageHandler> notificationMessageHandlerProvider;

  private final Provider<AppPrefsWrapper> appPrefsWrapperProvider;

  private final Provider<RegisterDevice> registerDeviceProvider;

  private final Provider<InvalidateDeviceRegistration> invalidateDeviceRegistrationProvider;

  public FCMMessageService_MembersInjector(
      Provider<NotificationMessageHandler> notificationMessageHandlerProvider,
      Provider<AppPrefsWrapper> appPrefsWrapperProvider,
      Provider<RegisterDevice> registerDeviceProvider,
      Provider<InvalidateDeviceRegistration> invalidateDeviceRegistrationProvider) {
    this.notificationMessageHandlerProvider = notificationMessageHandlerProvider;
    this.appPrefsWrapperProvider = appPrefsWrapperProvider;
    this.registerDeviceProvider = registerDeviceProvider;
    this.invalidateDeviceRegistrationProvider = invalidateDeviceRegistrationProvider;
  }

  public static MembersInjector<FCMMessageService> create(
      Provider<NotificationMessageHandler> notificationMessageHandlerProvider,
      Provider<AppPrefsWrapper> appPrefsWrapperProvider,
      Provider<RegisterDevice> registerDeviceProvider,
      Provider<InvalidateDeviceRegistration> invalidateDeviceRegistrationProvider) {
    return new FCMMessageService_MembersInjector(notificationMessageHandlerProvider, appPrefsWrapperProvider, registerDeviceProvider, invalidateDeviceRegistrationProvider);
  }

  @Override
  public void injectMembers(FCMMessageService instance) {
    injectNotificationMessageHandler(instance, notificationMessageHandlerProvider.get());
    injectAppPrefsWrapper(instance, appPrefsWrapperProvider.get());
    injectRegisterDevice(instance, registerDeviceProvider.get());
    injectInvalidateDeviceRegistration(instance, invalidateDeviceRegistrationProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.push.FCMMessageService.notificationMessageHandler")
  public static void injectNotificationMessageHandler(FCMMessageService instance,
      NotificationMessageHandler notificationMessageHandler) {
    instance.notificationMessageHandler = notificationMessageHandler;
  }

  @InjectedFieldSignature("com.woocommerce.android.push.FCMMessageService.appPrefsWrapper")
  public static void injectAppPrefsWrapper(FCMMessageService instance,
      AppPrefsWrapper appPrefsWrapper) {
    instance.appPrefsWrapper = appPrefsWrapper;
  }

  @InjectedFieldSignature("com.woocommerce.android.push.FCMMessageService.registerDevice")
  public static void injectRegisterDevice(FCMMessageService instance,
      RegisterDevice registerDevice) {
    instance.registerDevice = registerDevice;
  }

  @InjectedFieldSignature("com.woocommerce.android.push.FCMMessageService.invalidateDeviceRegistration")
  public static void injectInvalidateDeviceRegistration(FCMMessageService instance,
      InvalidateDeviceRegistration invalidateDeviceRegistration) {
    instance.invalidateDeviceRegistration = invalidateDeviceRegistration;
  }
}
