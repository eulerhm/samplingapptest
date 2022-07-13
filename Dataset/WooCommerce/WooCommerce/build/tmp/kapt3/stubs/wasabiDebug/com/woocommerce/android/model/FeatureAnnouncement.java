package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\fH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/model/FeatureAnnouncement;", "Landroid/os/Parcelable;", "appVersionName", "", "announcementVersion", "", "minimumAppVersion", "maximumAppVersion", "appVersionTargets", "", "detailsUrl", "isLocalized", "", "features", "Lcom/woocommerce/android/model/FeatureAnnouncementItem;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)V", "getAnnouncementVersion", "()I", "getAppVersionName", "()Ljava/lang/String;", "getAppVersionTargets", "()Ljava/util/List;", "getDetailsUrl", "getFeatures", "()Z", "getMaximumAppVersion", "getMinimumAppVersion", "canBeDisplayedOnAppUpgrade", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_wasabiDebug"})
public final class FeatureAnnouncement implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appVersionName = null;
    private final int announcementVersion = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String minimumAppVersion = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String maximumAppVersion = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> appVersionTargets = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String detailsUrl = null;
    private final boolean isLocalized = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.FeatureAnnouncementItem> features = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.FeatureAnnouncement.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String openEndedVersionBracketIndicator = "-1.0";
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.FeatureAnnouncement> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.FeatureAnnouncement copy(@org.jetbrains.annotations.NotNull
    java.lang.String appVersionName, int announcementVersion, @org.jetbrains.annotations.NotNull
    java.lang.String minimumAppVersion, @org.jetbrains.annotations.NotNull
    java.lang.String maximumAppVersion, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> appVersionTargets, @org.jetbrains.annotations.Nullable
    java.lang.String detailsUrl, boolean isLocalized, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.FeatureAnnouncementItem> features) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FeatureAnnouncement(@org.jetbrains.annotations.NotNull
    java.lang.String appVersionName, int announcementVersion, @org.jetbrains.annotations.NotNull
    java.lang.String minimumAppVersion, @org.jetbrains.annotations.NotNull
    java.lang.String maximumAppVersion, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> appVersionTargets, @org.jetbrains.annotations.Nullable
    java.lang.String detailsUrl, boolean isLocalized, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.FeatureAnnouncementItem> features) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppVersionName() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAnnouncementVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMinimumAppVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMaximumAppVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAppVersionTargets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDetailsUrl() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean isLocalized() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.FeatureAnnouncementItem> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.FeatureAnnouncementItem> getFeatures() {
        return null;
    }
    
    public final boolean canBeDisplayedOnAppUpgrade(@org.jetbrains.annotations.NotNull
    java.lang.String appVersionName) {
        return false;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.FeatureAnnouncement> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.FeatureAnnouncement createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.FeatureAnnouncement[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/model/FeatureAnnouncement$Companion;", "", "()V", "openEndedVersionBracketIndicator", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}