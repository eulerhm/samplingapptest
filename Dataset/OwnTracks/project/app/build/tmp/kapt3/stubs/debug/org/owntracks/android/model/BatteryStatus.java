package org.owntracks.android.model;

import com.fasterxml.jackson.annotation.JsonValue;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lorg/owntracks/android/model/BatteryStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "getVal", "UNKNOWN", "UNPLUGGED", "CHARGING", "FULL", "app_debug"})
public enum BatteryStatus {
    /*public static final*/ UNKNOWN /* = new UNKNOWN(0) */,
    /*public static final*/ UNPLUGGED /* = new UNPLUGGED(0) */,
    /*public static final*/ CHARGING /* = new CHARGING(0) */,
    /*public static final*/ FULL /* = new FULL(0) */;
    private final int value = 0;
    
    @com.fasterxml.jackson.annotation.JsonValue()
    public final int getVal() {
        return 0;
    }
    
    public final int getValue() {
        return 0;
    }
    
    BatteryStatus(int value) {
    }
}