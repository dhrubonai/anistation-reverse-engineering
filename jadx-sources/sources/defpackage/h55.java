package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h55 implements pz1 {
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
    public final String p;
    public final qz1 q;
    public final eo3 r;
    public byte s;
    public fl5 t;
    public dj6 u;
    public fl5 v;
    public ni6 w;
    public t54 x;

    public h55(Context context, ou0 ou0Var, bi6 bi6Var, ys ysVar, i18 i18Var, fc1 fc1Var, j81 j81Var, nw2 nw2Var, eo3 eo3Var, kz kzVar, k46 k46Var, LogSessionId logSessionId, boolean z, cn7 cn7Var, String str, String str2) {
        this.a = context;
        io3.m("Resume is supported only for single sequence composition", ou0Var.b.size() == 1);
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
        this.m = z;
        this.n = cn7Var;
        this.o = str;
        this.p = str2;
        this.q = new qz1();
        this.r = new eo3((Object) this, (byte) 12);
        this.s = (byte) 0;
    }

    @Override // defpackage.pz1
    public final int a(mm5 mm5Var) {
        byte b = this.s;
        if (b == 0) {
            return c(0.0f, 1.0f, mm5Var);
        }
        if (b == 1) {
            return c(0.0f, 0.15f, mm5Var);
        }
        if (b == 2) {
            return c(15.000001f, 0.4f, mm5Var);
        }
        if (b == 3) {
            return c(55.0f, 0.3f, mm5Var);
        }
        mm5Var.x = Math.round(85.0f);
        return 2;
    }

    @Override // defpackage.pz1
    public final void b(oz1 oz1Var) {
        ni6 ni6Var = this.w;
        ni6Var.getClass();
        ni6Var.d(oz1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(float r4, float r5, defpackage.mm5 r6) {
        /*
            r3 = this;
            ni6 r3 = r3.w
            r0 = 0
            r1 = 1
            r2 = 2
            if (r3 != 0) goto L12
            int r3 = java.lang.Math.round(r4)
            r6.x = r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L3c
            goto L3b
        L12:
            int r3 = r3.e(r6)
            if (r3 == 0) goto L31
            if (r3 == r1) goto L31
            if (r3 == r2) goto L25
            r4 = 3
            if (r3 != r4) goto L20
            return r4
        L20:
            defpackage.p65.l()
            r3 = 0
            return r3
        L25:
            int r3 = r6.x
            float r3 = (float) r3
            float r3 = r3 * r5
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            r6.x = r3
            return r2
        L31:
            int r3 = java.lang.Math.round(r4)
            r6.x = r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L3c
        L3b:
            return r1
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h55.c(float, float, mm5):int");
    }

    @Override // defpackage.pz1
    public final void cancel() {
        ni6 ni6Var = this.w;
        if (ni6Var != null) {
            ni6Var.a();
        }
        fl5 fl5Var = this.t;
        if (fl5Var != null && !fl5Var.isDone()) {
            this.t.cancel(false);
        }
        fl5 fl5Var2 = this.v;
        if (fl5Var2 != null && !fl5Var2.isDone()) {
            this.v.cancel(false);
        }
    }

    public final void d() {
        this.s = (byte) 0;
        ou0 ou0Var = this.b;
        ou0Var.getClass();
        String str = this.o;
        str.getClass();
        e(ou0Var, new t54(str, this.n, this.r, 0, null), 0L, false);
    }

    public final void e(ou0 ou0Var, t54 t54Var, long j, boolean z) {
        j81 j81Var;
        a61.b();
        Context context = this.a;
        if (z) {
            j81Var = new j81(new j81(context));
        } else {
            j81Var = this.g;
        }
        j81 j81Var2 = j81Var;
        ni6 ni6Var = new ni6(context, ou0Var, this.c, this.d, this.e, this.f, j81Var2, this.h, t54Var, this.r, this.j, this.k, j, this.l, this.m, z);
        this.w = ni6Var;
        ni6Var.f();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [j1, java.lang.Object, fl5] */
    @Override // defpackage.pz1
    public final void start() {
        this.s = (byte) 1;
        String str = this.p;
        str.getClass();
        ou0 ou0Var = this.b;
        ou0Var.getClass();
        ?? obj = new Object();
        new bj6(obj, this.a, str, ou0Var).start();
        this.t = obj;
        sn3 sn3Var = new sn3((Object) this, (byte) 11);
        obj.a(new yc2((Object) obj, (Object) sn3Var, (byte) 0), new uy1(this.k, (byte) 0));
    }
}
