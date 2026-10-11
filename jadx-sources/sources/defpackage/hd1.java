package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hd1 extends x2 implements ScheduledFuture {
    public final ScheduledFuture E;

    public hd1(gd1 gd1Var) {
        this.E = gd1Var.a(new cn7(this));
    }

    @Override // defpackage.x2
    public final void c() {
        boolean z;
        ScheduledFuture scheduledFuture = this.E;
        Object obj = this.x;
        if ((obj instanceof q2) && ((q2) obj).a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.E.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.E.getDelay(timeUnit);
    }
}
