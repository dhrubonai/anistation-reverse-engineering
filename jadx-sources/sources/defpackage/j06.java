package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j06 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ kf g;

    public j06(kf kfVar, int i) {
        this.g = kfVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        long j;
        kf kfVar = this.g;
        hf6 hf6Var = (hf6) kfVar.C;
        k46 k46Var = (k46) kfVar.D;
        vy1 vy1Var = (vy1) kfVar.y;
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
            G0.g(l, hf6Var);
            Z0 -= eq6.l0(hf6Var.e);
            j = eq6.l0(hf6Var.d);
        } else if (r0 != -1) {
            j = vy1Var.getDuration();
        } else {
            j = -9223372036854775807L;
        }
        boolean l0 = vy1Var.l0();
        if (l0 && j != -9223372036854775807L && Z0 >= j) {
            ((f46) kfVar.B).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.e;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && r0 == this.c && H == this.d) {
                if (elapsedRealtime - this.f >= i) {
                    ((py1) kfVar.A).x.z1(new yx1(2, new l06(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = r0;
            this.d = H;
            k46Var.i(3);
            k46Var.k(3, i);
            return;
        }
        k46Var.i(3);
        if (l0 && j != -9223372036854775807L) {
            k46Var.k(3, (int) Math.ceil(((float) (j - Z0)) / vy1Var.e().a));
        }
        this.e = false;
    }
}
