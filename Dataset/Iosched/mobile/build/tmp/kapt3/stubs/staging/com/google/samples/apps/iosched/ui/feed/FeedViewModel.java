package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

/**
 * Loads data and exposes it to the view.
 * By annotating the constructor with [@Inject], Dagger will use that constructor when needing to
 * create the object, so defining a [@Provides] method for this class won't be needed.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001tBO\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J$\u0010Y\u001a\u00020Z2\u0012\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0#0(2\u0006\u0010V\u001a\u00020WH\u0002J\u0011\u0010\\\u001a\u00020 H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u0011\u0010^\u001a\u00020 H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u000b\u0010_\u001a\u0004\u0018\u00010\u001dH\u0096\u0001J\t\u0010`\u001a\u00020\u001bH\u0096\u0001J\t\u0010a\u001a\u00020\u001bH\u0096\u0001J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001b0\"H\u0096\u0001J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0\"H\u0096\u0001J\u0010\u0010d\u001a\u00020 2\u0006\u0010e\u001a\u00020>H\u0016J\u0014\u0010f\u001a\u00020 2\n\u0010g\u001a\u00060\u001dj\u0002`hH\u0016J\u0010\u0010i\u001a\u00020 2\u0006\u0010j\u001a\u00020\u001dH\u0016J\u0010\u0010k\u001a\u00020 2\u0006\u0010l\u001a\u00020)H\u0016J\u0010\u0010m\u001a\u00020 2\u0006\u0010n\u001a\u00020oH\u0016J\b\u0010p\u001a\u00020 H\u0016J\u0010\u0010q\u001a\u00020 2\u0006\u0010r\u001a\u00020\u001bH\u0016J\b\u0010s\u001a\u00020 H\u0016R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0(0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00020+X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b4\u00101R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\"\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0012\u00109\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010:\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R \u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0#0(0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0#0(0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\"8F\u00a2\u0006\u0006\u001a\u0004\b@\u00101R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\"8F\u00a2\u0006\u0006\u001a\u0004\bB\u00101R\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\"8F\u00a2\u0006\u0006\u001a\u0004\bD\u00101R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\"8F\u00a2\u0006\u0006\u001a\u0004\bF\u00101R\u001d\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\"8F\u00a2\u0006\u0006\u001a\u0004\bH\u00101R\u001e\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00180\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bK\u0010LR\u001e\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bN\u00101R\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bP\u00101R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00180\"\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020+0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bU\u00101R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00101\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006u"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "loadCurrentMomentUseCase", "Lcom/google/samples/apps/iosched/shared/domain/feed/LoadCurrentMomentUseCase;", "loadAnnouncementsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/feed/LoadAnnouncementsUseCase;", "loadStarredAndReservedSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadStarredAndReservedSessionsUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "getConferenceStateUseCase", "Lcom/google/samples/apps/iosched/shared/domain/feed/GetConferenceStateUseCase;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "signInViewModelDelegate", "themedActivityDelegate", "(Lcom/google/samples/apps/iosched/shared/domain/feed/LoadCurrentMomentUseCase;Lcom/google/samples/apps/iosched/shared/domain/feed/LoadAnnouncementsUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadStarredAndReservedSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/feed/GetConferenceStateUseCase;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;)V", "_navigateAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Landroidx/navigation/NavDirections;", "_navigateToScheduleAction", "", "_navigateToSessionAction", "", "_openLiveStreamAction", "_openSignInDialogAction", "", "announcementsPreviewLiveData", "Landroidx/lifecycle/LiveData;", "", "", "conferenceStateLiveData", "Lcom/google/samples/apps/iosched/shared/domain/feed/ConferenceState;", "currentMomentResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/model/Moment;", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "currentUserImageUri", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "errorMessage", "getErrorMessage", "feed", "getFeed", "isMapEnabledByRemoteConfig", "isReservationEnabledByRemoteConfig", "loadAnnouncementsResult", "Lcom/google/samples/apps/iosched/model/Announcement;", "loadSessionsResult", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "navigateAction", "getNavigateAction", "navigateToScheduleAction", "getNavigateToScheduleAction", "navigateToSessionAction", "getNavigateToSessionAction", "openLiveStreamAction", "getOpenLiveStreamAction", "openSignInDialogAction", "getOpenSignInDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "getSnackBarMessage", "theme", "getTheme", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "createFeedSessionsContainer", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessions;", "sessionsResult", "emitSignInRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onStarClicked", "userSession", "openEventDetail", "id", "Lcom/google/samples/apps/iosched/model/SessionId;", "openLiveStream", "liveStreamUrl", "openMap", "moment", "openMapForSession", "session", "Lcom/google/samples/apps/iosched/model/Session;", "openPastAnnouncements", "openSchedule", "showOnlyPinnedSessions", "signIn", "Companion", "mobile_staging"})
public final class FeedViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.feed.FeedEventListener, com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    @com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag()
    @javax.inject.Inject()
    public boolean isReservationEnabledByRemoteConfig = false;
    @com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag()
    @javax.inject.Inject()
    public boolean isMapEnabledByRemoteConfig = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> feed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>>> loadSessionsResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.domain.feed.ConferenceState> conferenceStateLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<androidx.navigation.NavDirections>> _navigateAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _openSignInDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _openLiveStreamAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> _navigateToScheduleAction = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.model.Moment>> currentMomentResult = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.Announcement>>> loadAnnouncementsResult = null;
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> announcementsPreviewLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> snackBarMessage = null;
    private final com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase loadCurrentMomentUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase loadStarredAndReservedSessionsUseCase = null;
    private final com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private static final int MAX_SESSIONS = 10;
    public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getFeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<androidx.navigation.NavDirections>> getNavigateAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getOpenSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getOpenLiveStreamAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getNavigateToScheduleAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.feed.FeedSessions createFeedSessionsContainer(com.google.samples.apps.iosched.shared.result.Result<? extends java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> sessionsResult, org.threeten.bp.ZoneId timeZoneId) {
        return null;
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void openSchedule(boolean showOnlyPinnedSessions) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @java.lang.Override()
    public void signIn() {
    }
    
    @java.lang.Override()
    public void openMap(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment moment) {
    }
    
    @java.lang.Override()
    public void openLiveStream(@org.jetbrains.annotations.NotNull()
    java.lang.String liveStreamUrl) {
    }
    
    @java.lang.Override()
    public void openMapForSession(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session session) {
    }
    
    @java.lang.Override()
    public void openPastAnnouncements() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase loadCurrentMomentUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase loadAnnouncementsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase loadStarredAndReservedSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.feed.GetConferenceStateUseCase getConferenceStateUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate themedActivityDelegate) {
        super();
    }
    
    /**
     * Allows querying of the current theme synchronously
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.Theme getCurrentTheme() {
        return null;
    }
    
    /**
     * Allows observing of the current theme
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    /**
     * Emits whether or not to show reservations for the current user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getShowReservations() {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignInRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignOutRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion;", "", "()V", "MAX_SESSIONS", "", "NoHeader", "NoSessionsContainer", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion$NoHeader;", "", "()V", "mobile_staging"})
        static final class NoHeader {
            public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion.NoHeader INSTANCE = null;
            
            private NoHeader() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion$NoSessionsContainer;", "", "()V", "mobile_staging"})
        static final class NoSessionsContainer {
            public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion.NoSessionsContainer INSTANCE = null;
            
            private NoSessionsContainer() {
                super();
            }
        }
    }
}