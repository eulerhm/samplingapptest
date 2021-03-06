package com.google.samples.apps.iosched.shared.data.feed;

import java.lang.System;

/**
 * Single point of access to feed data for the presentation layer.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/FeedRepository;", "", "getAnnouncements", "", "Lcom/google/samples/apps/iosched/model/Announcement;", "getMoments", "Lcom/google/samples/apps/iosched/model/Moment;", "shared_staging"})
public abstract interface FeedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.Announcement> getAnnouncements();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.Moment> getMoments();
}