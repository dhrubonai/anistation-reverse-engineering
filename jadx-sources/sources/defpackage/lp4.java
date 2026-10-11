package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lp4 {
    public final kp4 a;
    public final fz1 b;
    public short c;
    public Object d;
    public final Looper e;
    public boolean f;

    public lp4(fz1 fz1Var, kp4 kp4Var, kf6 kf6Var, int i, Looper looper) {
        this.b = fz1Var;
        this.a = kp4Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        io3.B(!this.f);
        this.f = true;
        fz1 fz1Var = this.b;
        if (!fz1Var.g0 && fz1Var.F.getThread().isAlive()) {
            fz1Var.D.c(14, this).b();
        } else {
            kb0.O("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
