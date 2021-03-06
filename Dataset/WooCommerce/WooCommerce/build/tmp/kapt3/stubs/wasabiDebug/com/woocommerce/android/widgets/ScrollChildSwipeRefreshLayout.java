package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Extends [SwipeRefreshLayout] to support non-direct descendant scrolling views.
 *
 * [SwipeRefreshLayout] works as expected when a scroll view is a direct child: it triggers
 * the refresh only when the view is on top. This class adds a way (@link #setScrollUpChild} to
 * define which view controls this behavior.
 *
 * see https://github.com/googlesamples/android-architecture
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/widgets/ScrollChildSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollUpChild", "Landroid/view/View;", "getScrollUpChild", "()Landroid/view/View;", "setScrollUpChild", "(Landroid/view/View;)V", "canChildScrollUp", "", "onAttachedToWindow", "", "onStartNestedScroll", "child", "target", "nestedScrollAxes", "", "WooCommerce_wasabiDebug"})
public final class ScrollChildSwipeRefreshLayout extends androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    @org.jetbrains.annotations.Nullable
    private android.view.View scrollUpChild;
    
    @kotlin.jvm.JvmOverloads
    public ScrollChildSwipeRefreshLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ScrollChildSwipeRefreshLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getScrollUpChild() {
        return null;
    }
    
    public final void setScrollUpChild(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    @java.lang.Override
    public boolean canChildScrollUp() {
        return false;
    }
    
    @java.lang.Override
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull
    android.view.View child, @org.jetbrains.annotations.NotNull
    android.view.View target, int nestedScrollAxes) {
        return false;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
}