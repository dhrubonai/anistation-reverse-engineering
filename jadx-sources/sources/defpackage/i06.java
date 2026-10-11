package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i06 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ kf h;

    public i06(kf kfVar, int i) {
        this.h = kfVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        kf kfVar = this.h;
        k46 k46Var = (k46) kfVar.D;
        vy1 vy1Var = (vy1) kfVar.y;
        if (!vy1Var.l0()) {
            if (this.f) {
                k46Var.i(2);
            }
            this.f = false;
            return;
        }
        kf6 G0 = vy1Var.G0();
        if (G0.p()) {
            l = null;
        } else {
            l = G0.l(vy1Var.x());
        }
        int r0 = vy1Var.r0();
        int H = vy1Var.H();
        long Z0 = vy1Var.Z0();
        if (l != null && r0 == -1) {
            Z0 -= eq6.l0(G0.g(l, (hf6) kfVar.C).e);
        }
        ((f46) kfVar.B).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && r0 == this.c && H == this.d && Z0 == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((py1) kfVar.A).x.z1(new yx1(2, new l06(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = r0;
        this.d = H;
        this.e = Z0;
        k46Var.i(2);
        k46Var.k(2, i);
    }
}
