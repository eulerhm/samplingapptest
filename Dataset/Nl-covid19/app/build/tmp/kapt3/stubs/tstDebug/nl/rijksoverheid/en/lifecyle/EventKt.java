package nl.rijksoverheid.en.lifecyle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b\u00a8\u0006\t"}, d2 = {"observeEvent", "", "T", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/lifecyle/Event;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onEventUnhandledContent", "Lkotlin/Function1;", "app_tstDebug"})
public final class EventKt {
    
    /**
     * Extension method for using [EventObserver] as an Observer.
     *
     * @param owner LifecycleOwner which controls the observer
     * @param onEventUnhandledContent is *only* called if the [Event]'s contents has not been handled.
     */
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<T>> $this$observeEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onEventUnhandledContent) {
    }
}