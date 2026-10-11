package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k06 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ kf e;

    public k06(kf kfVar, int i) {
        this.e = kfVar;
        this.a = i;
    }

    public final void a() {
        kf kfVar = this.e;
        k46 k46Var = (k46) kfVar.D;
        vy1 vy1Var = (vy1) kfVar.y;
        int D0 = vy1Var.D0();
        if (vy1Var.n() && vy1Var.h0() != 1 && vy1Var.h0() != 4 && D0 != 0 && D0 != 1) {
            ((f46) kfVar.B).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == D0) {
                if (elapsedRealtime - this.d >= i) {
                    ((py1) kfVar.A).x.z1(new yx1(2, new l06(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = elapsedRealtime;
            this.b = D0;
            k46Var.i(4);
            k46Var.k(4, i);
            return;
        }
        if (this.c) {
            k46Var.i(4);
        }
        this.c = false;
    }
}
