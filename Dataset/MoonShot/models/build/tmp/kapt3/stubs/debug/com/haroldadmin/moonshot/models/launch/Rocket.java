package com.haroldadmin.moonshot.models.launch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/haroldadmin/moonshot/models/launch/Rocket;", "", "rocketId", "", "rocketName", "rocketType", "fairings", "Lcom/haroldadmin/moonshot/models/launch/Fairings;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/haroldadmin/moonshot/models/launch/Fairings;)V", "getFairings", "()Lcom/haroldadmin/moonshot/models/launch/Fairings;", "getRocketId", "()Ljava/lang/String;", "getRocketName", "getRocketType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "models_debug"})
public final class Rocket {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_id")
    private final java.lang.String rocketId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_name")
    private final java.lang.String rocketName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_type")
    private final java.lang.String rocketType = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.Fairings fairings = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Fairings getFairings() {
        return null;
    }
    
    public Rocket(@org.jetbrains.annotations.NotNull()
    java.lang.String rocketId, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketName, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketType, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Fairings fairings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Fairings component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Rocket copy(@org.jetbrains.annotations.NotNull()
    java.lang.String rocketId, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketName, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketType, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Fairings fairings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
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