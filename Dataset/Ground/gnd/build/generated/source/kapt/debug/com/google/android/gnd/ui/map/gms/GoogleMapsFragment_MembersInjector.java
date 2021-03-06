// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.map.gms;

import com.google.android.gnd.ui.MarkerIconFactory;
import com.google.android.gnd.ui.util.BitmapUtil;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GoogleMapsFragment_MembersInjector implements MembersInjector<GoogleMapsFragment> {
  private final Provider<BitmapUtil> bitmapUtilProvider;

  private final Provider<MarkerIconFactory> markerIconFactoryProvider;

  public GoogleMapsFragment_MembersInjector(Provider<BitmapUtil> bitmapUtilProvider,
      Provider<MarkerIconFactory> markerIconFactoryProvider) {
    this.bitmapUtilProvider = bitmapUtilProvider;
    this.markerIconFactoryProvider = markerIconFactoryProvider;
  }

  public static MembersInjector<GoogleMapsFragment> create(Provider<BitmapUtil> bitmapUtilProvider,
      Provider<MarkerIconFactory> markerIconFactoryProvider) {
    return new GoogleMapsFragment_MembersInjector(bitmapUtilProvider, markerIconFactoryProvider);
  }

  @Override
  public void injectMembers(GoogleMapsFragment instance) {
    injectBitmapUtil(instance, bitmapUtilProvider.get());
    injectMarkerIconFactory(instance, markerIconFactoryProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.map.gms.GoogleMapsFragment.bitmapUtil")
  public static void injectBitmapUtil(GoogleMapsFragment instance, BitmapUtil bitmapUtil) {
    instance.bitmapUtil = bitmapUtil;
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.map.gms.GoogleMapsFragment.markerIconFactory")
  public static void injectMarkerIconFactory(GoogleMapsFragment instance,
      MarkerIconFactory markerIconFactory) {
    instance.markerIconFactory = markerIconFactory;
  }
}
