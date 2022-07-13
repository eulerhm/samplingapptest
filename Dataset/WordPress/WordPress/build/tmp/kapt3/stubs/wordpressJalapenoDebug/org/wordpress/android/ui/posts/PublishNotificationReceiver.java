package org.wordpress.android.ui.posts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lorg/wordpress/android/ui/posts/PublishNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "publishNotificationReceiverViewModel", "Lorg/wordpress/android/ui/posts/PublishNotificationReceiverViewModel;", "getPublishNotificationReceiverViewModel", "()Lorg/wordpress/android/ui/posts/PublishNotificationReceiverViewModel;", "setPublishNotificationReceiverViewModel", "(Lorg/wordpress/android/ui/posts/PublishNotificationReceiverViewModel;)V", "systemNotificationsTracker", "Lorg/wordpress/android/ui/notifications/SystemNotificationsTracker;", "getSystemNotificationsTracker", "()Lorg/wordpress/android/ui/notifications/SystemNotificationsTracker;", "setSystemNotificationsTracker", "(Lorg/wordpress/android/ui/notifications/SystemNotificationsTracker;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "org.wordpress.android_wordpressJalapenoDebug"})
public final class PublishNotificationReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public org.wordpress.android.ui.posts.PublishNotificationReceiverViewModel publishNotificationReceiverViewModel;
    @javax.inject.Inject()
    public org.wordpress.android.ui.notifications.SystemNotificationsTracker systemNotificationsTracker;
    @org.jetbrains.annotations.NotNull()
    public static final org.wordpress.android.ui.posts.PublishNotificationReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_ID = "notification_id";
    
    public PublishNotificationReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.ui.posts.PublishNotificationReceiverViewModel getPublishNotificationReceiverViewModel() {
        return null;
    }
    
    public final void setPublishNotificationReceiverViewModel(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.ui.posts.PublishNotificationReceiverViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.ui.notifications.SystemNotificationsTracker getSystemNotificationsTracker() {
        return null;
    }
    
    public final void setSystemNotificationsTracker(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.ui.notifications.SystemNotificationsTracker p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wordpress/android/ui/posts/PublishNotificationReceiver$Companion;", "", "()V", "NOTIFICATION_ID", "", "org.wordpress.android_wordpressJalapenoDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}