package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h06 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ kf i;

    public h06(kf kfVar, int i) {
        this.i = kfVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        Object obj;
        kf kfVar = this.i;
        k46 k46Var = (k46) kfVar.D;
        vy1 vy1Var = (vy1) kfVar.y;
        if (vy1Var.h0() == 2 && vy1Var.n() && vy1Var.D0() == 0) {
            kf6 G0 = vy1Var.G0();
            if (G0.p()) {
                l = null;
            } else {
                l = G0.l(vy1Var.x());
            }
            int r0 = vy1Var.r0();
            int H = vy1Var.H();
            long e0 = vy1Var.e0();
            long max = Math.max(0L, vy1Var.j() - Math.max(0L, e0 - vy1Var.Z0()));
            if (l != null && r0 == -1) {
                e0 -= eq6.l0(G0.g(l, (hf6) kfVar.C).e);
            }
            ((f46) kfVar.B).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.g;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && r0 == this.c && H == this.d) {
                obj = l;
                if (e0 == this.e && max == this.f) {
                    if (elapsedRealtime - this.h >= i) {
                        ((py1) kfVar.A).x.z1(new yx1(2, new l06(1, i), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l;
            }
            this.g = true;
            this.h = elapsedRealtime;
            this.b = obj;
            this.c = r0;
            this.d = H;
            this.e = e0;
            this.f = max;
            k46Var.i(1);
            k46Var.k(1, i);
            return;
        }
        if (this.g) {
            k46Var.i(1);
        }
        this.g = false;
    }
}
