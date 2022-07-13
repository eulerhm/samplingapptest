package org.wordpress.android.ui.accounts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\u0014\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017*\u00020\u0019H\u0002J\u0014\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017*\u00020\u0019H\u0002J\u0014\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017*\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lorg/wordpress/android/ui/accounts/PostSignupInterstitialActivity;", "Lorg/wordpress/android/ui/LocaleAwareActivity;", "()V", "viewModel", "Lorg/wordpress/android/viewmodel/accounts/PostSignupInterstitialViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "dismiss", "", "executeAction", "navigationAction", "Lorg/wordpress/android/viewmodel/accounts/PostSignupInterstitialViewModel$NavigationAction;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startSiteConnectionFlow", "startSiteCreationFlow", "addSelfHostedSiteButton", "Lcom/google/android/material/button/MaterialButton;", "kotlin.jvm.PlatformType", "Lorg/wordpress/android/databinding/PostSignupInterstitialActivityBinding;", "createNewSiteButton", "dismissButton", "org.wordpress.android_wordpressJalapenoDebug"})
public final class PostSignupInterstitialActivity extends org.wordpress.android.ui.LocaleAwareActivity {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private org.wordpress.android.viewmodel.accounts.PostSignupInterstitialViewModel viewModel;
    
    public PostSignupInterstitialActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.google.android.material.button.MaterialButton createNewSiteButton(org.wordpress.android.databinding.PostSignupInterstitialActivityBinding $this$createNewSiteButton) {
        return null;
    }
    
    private final com.google.android.material.button.MaterialButton addSelfHostedSiteButton(org.wordpress.android.databinding.PostSignupInterstitialActivityBinding $this$addSelfHostedSiteButton) {
        return null;
    }
    
    private final com.google.android.material.button.MaterialButton dismissButton(org.wordpress.android.databinding.PostSignupInterstitialActivityBinding $this$dismissButton) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void executeAction(org.wordpress.android.viewmodel.accounts.PostSignupInterstitialViewModel.NavigationAction navigationAction) {
    }
    
    private final void startSiteCreationFlow() {
    }
    
    private final void startSiteConnectionFlow() {
    }
    
    private final void dismiss() {
    }
}