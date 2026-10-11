package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface a87 {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(String str);

    List getAllEligibleWorkSpecsForScheduling(int i);

    List getEligibleWorkForScheduling(int i);

    List getEligibleWorkForSchedulingWithContentUris();

    List getInputsFromPrerequisites(String str);

    List getRecentlyCompletedWork(long j);

    List getRunningWork();

    List getScheduledWorkWithContentUris();

    j77 getState(String str);

    List getUnfinishedWorkWithName(String str);

    z77 getWorkSpec(String str);

    List getWorkSpecIdAndStatesForName(String str);

    w42 hasUnfinishedWorkFlow();

    void incrementPeriodCount(String str);

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(z77 z77Var);

    boolean isWorkSpecScheduled(String str);

    int markWorkSpecScheduled(String str, long j);

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(String str, int i);

    int resetWorkSpecRunAttemptCount(String str);

    int setCancelledState(String str);

    void setLastEnqueueTime(String str, long j);

    void setOutput(String str, e41 e41Var);

    int setState(j77 j77Var, String str);

    void setStopReason(String str, int i);

    void updateWorkSpec(z77 z77Var);
}
