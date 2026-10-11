package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f87 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ String z;

    public /* synthetic */ f87(long j, String str, byte b) {
        this.x = b;
        this.y = j;
        this.z = str;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 nextScheduleTimeOverride$lambda$0;
        int markWorkSpecScheduled$lambda$0;
        pn6 lastEnqueueTime$lambda$0;
        byte b = this.x;
        String str = this.z;
        long j = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                nextScheduleTimeOverride$lambda$0 = WorkSpecDao_Impl.setNextScheduleTimeOverride$lambda$0("UPDATE workspec SET next_schedule_time_override=? WHERE id=?", j, str, g85Var);
                return nextScheduleTimeOverride$lambda$0;
            case 1:
                markWorkSpecScheduled$lambda$0 = WorkSpecDao_Impl.markWorkSpecScheduled$lambda$0("UPDATE workspec SET schedule_requested_at=? WHERE id=?", j, str, g85Var);
                return Integer.valueOf(markWorkSpecScheduled$lambda$0);
            default:
                lastEnqueueTime$lambda$0 = WorkSpecDao_Impl.setLastEnqueueTime$lambda$0("UPDATE workspec SET last_enqueue_time=? WHERE id=?", j, str, g85Var);
                return lastEnqueueTime$lambda$0;
        }
    }
}
