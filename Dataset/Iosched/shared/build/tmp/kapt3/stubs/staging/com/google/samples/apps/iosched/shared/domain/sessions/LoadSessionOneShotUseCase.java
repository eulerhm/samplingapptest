package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionOneShotUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "Lcom/google/samples/apps/iosched/model/Session;", "repository", "Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public class LoadSessionOneShotUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<java.lang.String, com.google.samples.apps.iosched.model.Session> {
    private final com.google.samples.apps.iosched.shared.data.session.SessionRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.model.Session> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadSessionOneShotUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.session.SessionRepository repository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}