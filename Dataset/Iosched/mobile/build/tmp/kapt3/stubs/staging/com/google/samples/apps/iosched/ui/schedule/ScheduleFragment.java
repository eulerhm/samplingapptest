package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * The Schedule page of the top-level Activity.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020CH\u0016J\u001a\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020;2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010G\u001a\u00020CH\u0002J\b\u0010H\u001a\u00020CH\u0002J\b\u0010I\u001a\u00020CH\u0002J\u0014\u0010J\u001a\u00020C2\n\u0010K\u001a\u00060Lj\u0002`MH\u0002J\b\u0010N\u001a\u00020CH\u0002J\b\u0010O\u001a\u00020CH\u0002J\b\u0010P\u001a\u00020CH\u0002J\u0010\u0010Q\u001a\u00020C2\u0006\u0010R\u001a\u00020SH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010!R\u0012\u0010#\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b1\u00102R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006U"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleFragment;", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "()V", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentScheduleBinding;", "cachedBubbleRange", "Lkotlin/ranges/IntRange;", "dayIndexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "dayIndicatorAdapter", "Lcom/google/samples/apps/iosched/ui/schedule/DayIndicatorAdapter;", "dayIndicatorItemDecoration", "Lcom/google/samples/apps/iosched/widget/BubbleDecoration;", "dayIndicatorRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mainActivityViewModel", "Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "scheduleRecyclerView", "scheduleScroller", "Lcom/google/samples/apps/iosched/widget/JumpSmoothScroller;", "scheduleViewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "getScheduleViewModel", "()Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "scheduleViewModel$delegate", "searchScheduleFeatureEnabled", "", "sessionsAdapter", "Lcom/google/samples/apps/iosched/ui/sessioncommon/SessionsAdapter;", "snackbar", "Lcom/google/samples/apps/iosched/widget/FadingSnackbar;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getSnackbarMessageManager", "()Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "setSnackbarMessageManager", "(Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;)V", "snackbarPrefsViewModel", "Lcom/google/samples/apps/iosched/ui/prefs/SnackbarPreferenceViewModel;", "getSnackbarPrefsViewModel", "()Lcom/google/samples/apps/iosched/ui/prefs/SnackbarPreferenceViewModel;", "snackbarPrefsViewModel$delegate", "tagViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getTagViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setTagViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onScheduleScrolled", "", "onUserInteraction", "onViewCreated", "view", "openNotificationsPreferenceDialog", "openScheduleUiHintsDialog", "openSearch", "openSessionDetail", "id", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "openSignInDialog", "openSignOutDialog", "rebuildDayIndicators", "updateScheduleUi", "scheduleUiData", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleUiData;", "Companion", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ScheduleFragment extends com.google.samples.apps.iosched.ui.MainNavigationFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "tagViewPool")
    @javax.inject.Inject()
    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagViewPool;
    @com.google.samples.apps.iosched.shared.di.SearchScheduleEnabledFlag()
    @javax.inject.Inject()
    public boolean searchScheduleFeatureEnabled = false;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager;
    private final kotlin.Lazy scheduleViewModel$delegate = null;
    private final kotlin.Lazy snackbarPrefsViewModel$delegate = null;
    private final kotlin.Lazy mainActivityViewModel$delegate = null;
    private com.google.samples.apps.iosched.widget.FadingSnackbar snackbar;
    private androidx.recyclerview.widget.RecyclerView scheduleRecyclerView;
    private com.google.samples.apps.iosched.ui.sessioncommon.SessionsAdapter sessionsAdapter;
    private com.google.samples.apps.iosched.widget.JumpSmoothScroller scheduleScroller;
    private androidx.recyclerview.widget.RecyclerView dayIndicatorRecyclerView;
    private com.google.samples.apps.iosched.ui.schedule.DayIndicatorAdapter dayIndicatorAdapter;
    private com.google.samples.apps.iosched.widget.BubbleDecoration dayIndicatorItemDecoration;
    private com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer;
    private kotlin.ranges.IntRange cachedBubbleRange;
    private com.google.samples.apps.iosched.databinding.FragmentScheduleBinding binding;
    private static final java.lang.String DIALOG_NEED_TO_SIGN_IN = "dialog_need_to_sign_in";
    private static final java.lang.String DIALOG_CONFIRM_SIGN_OUT = "dialog_confirm_sign_out";
    private static final java.lang.String DIALOG_SCHEDULE_HINTS = "dialog_schedule_hints";
    public static final com.google.samples.apps.iosched.ui.schedule.ScheduleFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper getAnalyticsHelper() {
        return null;
    }
    
    public final void setAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool getTagViewPool() {
        return null;
    }
    
    public final void setTagViewPool(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager getSnackbarMessageManager() {
        return null;
    }
    
    public final void setSnackbarMessageManager(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager p0) {
    }
    
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel getScheduleViewModel() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel getSnackbarPrefsViewModel() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.MainActivityViewModel getMainActivityViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateScheduleUi(com.google.samples.apps.iosched.ui.schedule.ScheduleUiData scheduleUiData) {
    }
    
    private final void rebuildDayIndicators() {
    }
    
    private final void onScheduleScrolled() {
    }
    
    @java.lang.Override()
    public void onUserInteraction() {
    }
    
    private final void openSessionDetail(java.lang.String id) {
    }
    
    private final void openSearch() {
    }
    
    private final void openSignInDialog() {
    }
    
    private final void openSignOutDialog() {
    }
    
    private final void openScheduleUiHintsDialog() {
    }
    
    private final void openNotificationsPreferenceDialog() {
    }
    
    public ScheduleFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleFragment$Companion;", "", "()V", "DIALOG_CONFIRM_SIGN_OUT", "", "DIALOG_NEED_TO_SIGN_IN", "DIALOG_SCHEDULE_HINTS", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}