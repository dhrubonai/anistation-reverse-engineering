package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kg0 implements lg0 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ kg0(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.lg0
    public final void a(Throwable th) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 1:
                ((ub2) obj).invoke(th);
                return;
            default:
                ((ei1) obj).dispose();
                return;
        }
    }

    public final String toString() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ub2) obj).getClass().getSimpleName() + '@' + z51.t(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ei1) obj) + ']';
        }
    }
}
