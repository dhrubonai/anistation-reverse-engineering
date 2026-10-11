package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o81 implements pz1 {
    public final Context a;
    public final ou0 b;
    public final bi6 c;
    public final ys d;
    public final i18 e;
    public final fc1 f;
    public final j81 g;
    public final nw2 h;
    public final eo3 i;
    public final kz j;
    public final k46 k;
    public final LogSessionId l;
    public final boolean m;
    public final cn7 n;
    public final String o;
    public final qz1 p = new qz1();
    public final cn7 q = new cn7(this);
    public ni6 r;

    public o81(Context context, ou0 ou0Var, bi6 bi6Var, ys ysVar, i18 i18Var, fc1 fc1Var, j81 j81Var, nw2 nw2Var, eo3 eo3Var, kz kzVar, k46 k46Var, LogSessionId logSessionId, boolean z, cn7 cn7Var, String str) {
        this.a = context;
        this.b = ou0Var;
        this.c = bi6Var;
        this.d = ysVar;
        this.e = i18Var;
        this.f = fc1Var;
        this.g = j81Var;
        this.h = nw2Var;
        this.i = eo3Var;
        this.j = kzVar;
        this.k = k46Var;
        this.l = logSessionId;
        this.n = cn7Var;
        this.o = str;
        this.m = z;
    }

    @Override // defpackage.pz1
    public final int a(mm5 mm5Var) {
        ni6 ni6Var = this.r;
        if (ni6Var == null) {
            return 0;
        }
        return ni6Var.e(mm5Var);
    }

    @Override // defpackage.pz1
    public final void b(oz1 oz1Var) {
        ni6 ni6Var = this.r;
        ni6Var.getClass();
        ni6Var.d(oz1Var);
    }

    @Override // defpackage.pz1
    public final void cancel() {
        ni6 ni6Var = this.r;
        if (ni6Var != null) {
            ni6Var.a();
        }
    }

    @Override // defpackage.pz1
    public final void start() {
        String str = this.o;
        cn7 cn7Var = this.n;
        cn7 cn7Var2 = this.q;
        ni6 ni6Var = new ni6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, new t54(str, cn7Var, cn7Var2, 0, null), cn7Var2, this.j, this.k, 0L, this.l, this.m, false);
        this.r = ni6Var;
        ni6Var.f();
    }
}
