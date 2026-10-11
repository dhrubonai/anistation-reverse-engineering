package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cd1 implements gd1 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ TimeUnit C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ fd1 y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ cd1(fd1 fd1Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.x = b;
        this.y = fd1Var;
        this.z = runnable;
        this.A = j;
        this.B = j2;
        this.C = timeUnit;
    }

    @Override // defpackage.gd1
    public final ScheduledFuture a(cn7 cn7Var) {
        byte b = this.x;
        Runnable runnable = this.z;
        fd1 fd1Var = this.y;
        switch (b) {
            case 0:
                return fd1Var.y.scheduleAtFixedRate(new dd1(fd1Var, runnable, cn7Var, (byte) 0), this.A, this.B, this.C);
            default:
                return fd1Var.y.scheduleWithFixedDelay(new dd1(fd1Var, runnable, cn7Var, (byte) 2), this.A, this.B, this.C);
        }
    }
}
