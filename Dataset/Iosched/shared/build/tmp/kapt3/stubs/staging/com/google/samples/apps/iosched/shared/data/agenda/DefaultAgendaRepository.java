package com.google.samples.apps.iosched.shared.data.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/agenda/DefaultAgendaRepository;", "Lcom/google/samples/apps/iosched/shared/data/agenda/AgendaRepository;", "appConfigDataSource", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "(Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;)V", "getAgenda", "", "Lcom/google/samples/apps/iosched/model/Block;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class DefaultAgendaRepository implements com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository {
    private final com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAgenda(boolean forceRefresh, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.samples.apps.iosched.model.Block>> p1) {
        return null;
    }
    
    public DefaultAgendaRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource) {
        super();
    }
}