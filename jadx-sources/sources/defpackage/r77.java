package defpackage;

import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class r77 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;

    public /* synthetic */ r77(String str, byte b) {
        this.x = b;
        this.y = str;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 delete$lambda$0;
        List workSpecIdAndStatesForName$lambda$0;
        List unfinishedWorkWithName$lambda$0;
        int resetWorkSpecRunAttemptCount$lambda$0;
        pn6 incrementPeriodCount$lambda$0;
        z77 workSpec$lambda$0;
        List inputsFromPrerequisites$lambda$0;
        pn6 incrementGeneration$lambda$0;
        int cancelledState$lambda$0;
        boolean isWorkSpecScheduled$lambda$0;
        List unfinishedWorkWithTag$lambda$0;
        int incrementWorkSpecRunAttemptCount$lambda$0;
        j77 state$lambda$0;
        Long scheduleRequestedAtLiveData$lambda$0;
        byte b = this.x;
        String str = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                return WorkNameDao_Impl.c(str, g85Var);
            case 1:
                return WorkNameDao_Impl.a(str, g85Var);
            case 2:
                return WorkProgressDao_Impl.a(str, g85Var);
            case 3:
                return WorkProgressDao_Impl.d(str, g85Var);
            case 4:
                delete$lambda$0 = WorkSpecDao_Impl.delete$lambda$0("DELETE FROM workspec WHERE id=?", str, g85Var);
                return delete$lambda$0;
            case 5:
                workSpecIdAndStatesForName$lambda$0 = WorkSpecDao_Impl.getWorkSpecIdAndStatesForName$lambda$0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, g85Var);
                return workSpecIdAndStatesForName$lambda$0;
            case 6:
                unfinishedWorkWithName$lambda$0 = WorkSpecDao_Impl.getUnfinishedWorkWithName$lambda$0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, g85Var);
                return unfinishedWorkWithName$lambda$0;
            case 7:
                resetWorkSpecRunAttemptCount$lambda$0 = WorkSpecDao_Impl.resetWorkSpecRunAttemptCount$lambda$0("UPDATE workspec SET run_attempt_count=0 WHERE id=?", str, g85Var);
                return Integer.valueOf(resetWorkSpecRunAttemptCount$lambda$0);
            case 8:
                incrementPeriodCount$lambda$0 = WorkSpecDao_Impl.incrementPeriodCount$lambda$0("UPDATE workspec SET period_count=period_count+1 WHERE id=?", str, g85Var);
                return incrementPeriodCount$lambda$0;
            case 9:
                workSpec$lambda$0 = WorkSpecDao_Impl.getWorkSpec$lambda$0("SELECT * FROM workspec WHERE id=?", str, g85Var);
                return workSpec$lambda$0;
            case 10:
                inputsFromPrerequisites$lambda$0 = WorkSpecDao_Impl.getInputsFromPrerequisites$lambda$0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", str, g85Var);
                return inputsFromPrerequisites$lambda$0;
            case 11:
                incrementGeneration$lambda$0 = WorkSpecDao_Impl.incrementGeneration$lambda$0("UPDATE workspec SET generation=generation+1 WHERE id=?", str, g85Var);
                return incrementGeneration$lambda$0;
            case 12:
                cancelledState$lambda$0 = WorkSpecDao_Impl.setCancelledState$lambda$0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?", str, g85Var);
                return Integer.valueOf(cancelledState$lambda$0);
            case 13:
                isWorkSpecScheduled$lambda$0 = WorkSpecDao_Impl.isWorkSpecScheduled$lambda$0("SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1", str, g85Var);
                return Boolean.valueOf(isWorkSpecScheduled$lambda$0);
            case 14:
                unfinishedWorkWithTag$lambda$0 = WorkSpecDao_Impl.getUnfinishedWorkWithTag$lambda$0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", str, g85Var);
                return unfinishedWorkWithTag$lambda$0;
            case 15:
                incrementWorkSpecRunAttemptCount$lambda$0 = WorkSpecDao_Impl.incrementWorkSpecRunAttemptCount$lambda$0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?", str, g85Var);
                return Integer.valueOf(incrementWorkSpecRunAttemptCount$lambda$0);
            case 16:
                state$lambda$0 = WorkSpecDao_Impl.getState$lambda$0("SELECT state FROM workspec WHERE id=?", str, g85Var);
                return state$lambda$0;
            case 17:
                scheduleRequestedAtLiveData$lambda$0 = WorkSpecDao_Impl.getScheduleRequestedAtLiveData$lambda$0("SELECT schedule_requested_at FROM workspec WHERE id=?", str, g85Var);
                return scheduleRequestedAtLiveData$lambda$0;
            case 18:
                return WorkTagDao_Impl.c(str, g85Var);
            case 19:
                return WorkTagDao_Impl.d(str, g85Var);
            default:
                return WorkTagDao_Impl.b(str, g85Var);
        }
    }
}
