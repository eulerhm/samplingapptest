package com.woocommerce.android.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u000fH\u0017J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0006\u0010\u001b\u001a\u00020\u000fJ\f\u0010\u001c\u001a\u00020\u000f*\u00020\u001dH\u0004R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/woocommerce/android/ui/base/BaseFragmentView;", "()V", "layoutId", "", "(I)V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "getFragmentSubtitle", "", "getFragmentTitle", "onHiddenChanged", "", "hidden", "", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "updateActivitySubtitle", "updateActivityTitle", "showDialog", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowDialog;", "Companion", "WooCommerce_wasabiDebug"})
public class BaseFragment extends androidx.fragment.app.Fragment implements com.woocommerce.android.ui.base.BaseFragmentView {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.base.BaseFragment.Companion Companion = null;
    private static final java.lang.String KEY_TITLE = "title";
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.main.AppBarStatus activityAppBarStatus = null;
    
    public BaseFragment() {
        super();
    }
    
    public BaseFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onHiddenChanged(boolean hidden) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onResume() {
    }
    
    public final void updateActivityTitle() {
    }
    
    private final void updateActivitySubtitle() {
    }
    
    /**
     * Returns the title which should be displayed in the Activity's Toolbar.
     * This is not used if [activityAppBarStatus] returns [AppBarStatus.Hidden].
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    /**
     * Returns the title which should be displayed as a subtitle in the Activity's Toolbar.
     * This is not used if [activityAppBarStatus] returns [AppBarStatus.Hidden].
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentSubtitle() {
        return null;
    }
    
    protected final void showDialog(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowDialog $this$showDialog) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/base/BaseFragment$Companion;", "", "()V", "KEY_TITLE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}