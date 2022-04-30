package com.google.samples.apps.iosched.ui.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "listAdapter", "Landroid/widget/ArrayAdapter;", "Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment$ThemeHolder;", "viewModel", "Lcom/google/samples/apps/iosched/ui/settings/SettingsViewModel;", "getViewModel", "()Lcom/google/samples/apps/iosched/ui/settings/SettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getTitleForTheme", "", "theme", "Lcom/google/samples/apps/iosched/model/Theme;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "updateSelectedItem", "selected", "Companion", "ThemeHolder", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ThemeSettingDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.ArrayAdapter<com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment.ThemeHolder> listAdapter;
    public static final com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.google.samples.apps.iosched.ui.settings.SettingsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateSelectedItem(com.google.samples.apps.iosched.model.Theme selected) {
    }
    
    private final java.lang.String getTitleForTheme(com.google.samples.apps.iosched.model.Theme theme) {
        return null;
    }
    
    public ThemeSettingDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment$ThemeHolder;", "", "theme", "Lcom/google/samples/apps/iosched/model/Theme;", "title", "", "(Lcom/google/samples/apps/iosched/model/Theme;Ljava/lang/String;)V", "getTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobile_staging"})
    static final class ThemeHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.model.Theme theme = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Theme getTheme() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public ThemeHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Theme theme, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Theme component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment.ThemeHolder copy(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Theme theme, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment;", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}