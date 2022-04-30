package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * ConferenceDataSource data source that never touches the network.
 *
 * This class is only available with the staging variant. It's used for UI tests and
 * faster development.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/FakeConferenceDataSource;", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;", "()V", "ALARM_SESSION_ID", "", "FAKE_SESSION_ID", "FAKE_SESSION_NAME", "FAKE_SESSION_SPEAKER_NAME", "FAKE_SESSION_TAG_NAME", "addSessionForAlarmsTesting", "", "sessions", "", "Lcom/google/samples/apps/iosched/model/Session;", "exampleSession", "getOfflineConferenceData", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "getRemoteConferenceData", "transformDataForStaging", "data", "shared_staging"})
public final class FakeConferenceDataSource implements com.google.samples.apps.iosched.shared.data.ConferenceDataSource {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAKE_SESSION_NAME = "Fake session on day 1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAKE_SESSION_ID = "FAKE_SESSION_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAKE_SESSION_TAG_NAME = "Staging tag";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAKE_SESSION_SPEAKER_NAME = "Dr. Staging";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALARM_SESSION_ID = "abcdefg";
    public static final com.google.samples.apps.iosched.shared.data.FakeConferenceDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getRemoteConferenceData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getOfflineConferenceData() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.model.ConferenceData transformDataForStaging(com.google.samples.apps.iosched.model.ConferenceData data) {
        return null;
    }
    
    private final void addSessionForAlarmsTesting(java.util.List<com.google.samples.apps.iosched.model.Session> sessions, com.google.samples.apps.iosched.model.Session exampleSession) {
    }
    
    private FakeConferenceDataSource() {
        super();
    }
}