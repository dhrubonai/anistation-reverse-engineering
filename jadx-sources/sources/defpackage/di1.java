package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class di1 implements ei1 {
    public final ScheduledFuture x;

    public di1(ScheduledFuture scheduledFuture) {
        this.x = scheduledFuture;
    }

    @Override // defpackage.ei1
    public final void dispose() {
        this.x.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.x + ']';
    }
}
