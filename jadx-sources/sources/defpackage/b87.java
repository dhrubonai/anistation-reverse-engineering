package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b87 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ b87(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0;
        boolean hasUnfinishedWorkFlow$lambda$0;
        int resetScheduledState$lambda$0;
        List allUnblockedWork$lambda$0;
        List scheduledWork$lambda$0;
        List allWorkSpecIds$lambda$0;
        List allWorkSpecIdsLiveData$lambda$0;
        List runningWork$lambda$0;
        List eligibleWorkForSchedulingWithContentUris$lambda$0;
        switch (this.x) {
            case 0:
                pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0 = WorkSpecDao_Impl.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", (g85) obj);
                return pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0;
            case 1:
                hasUnfinishedWorkFlow$lambda$0 = WorkSpecDao_Impl.hasUnfinishedWorkFlow$lambda$0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", (g85) obj);
                return Boolean.valueOf(hasUnfinishedWorkFlow$lambda$0);
            case 2:
                resetScheduledState$lambda$0 = WorkSpecDao_Impl.resetScheduledState$lambda$0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)", (g85) obj);
                return Integer.valueOf(resetScheduledState$lambda$0);
            case 3:
                allUnblockedWork$lambda$0 = WorkSpecDao_Impl.getAllUnblockedWork$lambda$0("SELECT * FROM workspec WHERE state=0 AND LENGTH(content_uri_triggers)=0 ORDER BY last_enqueue_time", (g85) obj);
                return allUnblockedWork$lambda$0;
            case 4:
                scheduledWork$lambda$0 = WorkSpecDao_Impl.getScheduledWork$lambda$0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0", (g85) obj);
                return scheduledWork$lambda$0;
            case 5:
                allWorkSpecIds$lambda$0 = WorkSpecDao_Impl.getAllWorkSpecIds$lambda$0("SELECT id FROM workspec", (g85) obj);
                return allWorkSpecIds$lambda$0;
            case 6:
                allWorkSpecIdsLiveData$lambda$0 = WorkSpecDao_Impl.getAllWorkSpecIdsLiveData$lambda$0("SELECT id FROM workspec", (g85) obj);
                return allWorkSpecIdsLiveData$lambda$0;
            case 7:
                runningWork$lambda$0 = WorkSpecDao_Impl.getRunningWork$lambda$0("SELECT * FROM workspec WHERE state=1", (g85) obj);
                return runningWork$lambda$0;
            case 8:
                eligibleWorkForSchedulingWithContentUris$lambda$0 = WorkSpecDao_Impl.getEligibleWorkForSchedulingWithContentUris$lambda$0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", (g85) obj);
                return eligibleWorkForSchedulingWithContentUris$lambda$0;
            default:
                ((t97) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
