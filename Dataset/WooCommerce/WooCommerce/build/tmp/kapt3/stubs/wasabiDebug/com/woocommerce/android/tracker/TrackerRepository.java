package com.woocommerce.android.tracker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/tracker/TrackerRepository;", "", "observeLastSendingDate", "Lkotlinx/coroutines/flow/Flow;", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "updateLastSendingDate", "", "lastUpdateMillis", "(Lorg/wordpress/android/fluxc/model/SiteModel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public abstract interface TrackerRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Long> observeLastSendingDate(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.SiteModel site);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateLastSendingDate(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.SiteModel site, long lastUpdateMillis, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}