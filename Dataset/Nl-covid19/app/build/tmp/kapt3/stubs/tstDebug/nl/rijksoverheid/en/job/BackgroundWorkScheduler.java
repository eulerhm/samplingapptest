package nl.rijksoverheid.en.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/job/BackgroundWorkScheduler;", "", "cancel", "", "schedule", "intervalMinutes", "", "app_tstDebug"})
public abstract interface BackgroundWorkScheduler {
    
    /**
     * Schedule background work. Invoked when the app is activated the first time.
     * @param intervalMinutes interval for checking the manifest as part of background work
     */
    public abstract void schedule(int intervalMinutes);
    
    /**
     * Cancel all scheduled background work
     */
    public abstract void cancel();
}