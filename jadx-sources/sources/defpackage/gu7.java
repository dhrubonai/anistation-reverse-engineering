package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gu7 implements rv7 {
    public static volatile gu7 c0;
    public final ak7 A;
    public final bt7 B;
    public final es7 C;
    public final au7 D;
    public final r08 E;
    public final i28 F;
    public final vr7 G;
    public final pk2 H;
    public final py7 I;
    public final qx7 J;
    public final io7 K;
    public final xx7 L;
    public final String M;
    public sr7 N;
    public zz7 O;
    public zl7 P;
    public nr7 Q;
    public zx7 R;
    public Boolean T;
    public long U;
    public volatile Boolean V;
    public volatile boolean W;
    public int X;
    public int Y;
    public final long a0;
    public final long b0;
    public final Context x;
    public final boolean y;
    public final og5 z;
    public boolean S = false;
    public final AtomicInteger Z = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e2, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        if (r3.compareAndSet(null, r1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        if (r3.get() == null) goto L83;
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [qt0, ak7] */
    /* JADX WARN: Type inference failed for: r4v3, types: [pv7, xx7, qt0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gu7(defpackage.dw7 r10) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu7.<init>(dw7):void");
    }

    public static final void i(vp7 vp7Var) {
        if (vp7Var != null) {
            return;
        }
        ze0.m("Component not created");
    }

    public static final void j(qt0 qt0Var) {
        if (qt0Var != null) {
            return;
        }
        ze0.m("Component not created");
    }

    public static final void k(zq7 zq7Var) {
        if (zq7Var != null) {
            if (zq7Var.y) {
                return;
            }
            ze0.m("Component not initialized: ".concat(String.valueOf(zq7Var.getClass())));
            return;
        }
        ze0.m("Component not created");
    }

    public static final void l(pv7 pv7Var) {
        if (pv7Var != null) {
            if (pv7Var.y) {
                return;
            }
            ze0.m("Component not initialized: ".concat(String.valueOf(pv7Var.getClass())));
            return;
        }
        ze0.m("Component not created");
    }

    public static gu7 q(Context context, so7 so7Var, Long l, Long l2) {
        Bundle bundle;
        if (so7Var != null) {
            Bundle bundle2 = so7Var.A;
            so7Var = new so7(so7Var.x, so7Var.y, so7Var.z, bundle2, null);
        }
        a34.x(context);
        a34.x(context.getApplicationContext());
        if (c0 == null) {
            synchronized (gu7.class) {
                try {
                    if (c0 == null) {
                        c0 = new gu7(new dw7(context, so7Var, l, l2));
                    }
                } finally {
                }
            }
        } else if (so7Var != null && (bundle = so7Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            a34.x(c0);
            c0.V = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        a34.x(c0);
        return c0;
    }

    public final boolean a() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rv7
    public final og5 b() {
        return this.z;
    }

    @Override // defpackage.rv7
    public final es7 c() {
        es7 es7Var = this.C;
        l(es7Var);
        return es7Var;
    }

    @Override // defpackage.rv7
    public final pk2 d() {
        return this.H;
    }

    public final int e() {
        Boolean bool;
        au7 au7Var = this.D;
        l(au7Var);
        au7Var.L();
        ak7 ak7Var = this.A;
        if (ak7Var.Z()) {
            return 1;
        }
        l(au7Var);
        au7Var.L();
        if (this.W) {
            bt7 bt7Var = this.B;
            j(bt7Var);
            bt7Var.L();
            if (bt7Var.P().contains("measurement_enabled")) {
                bool = Boolean.valueOf(bt7Var.P().getBoolean("measurement_enabled", true));
            } else {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return 3;
                }
                return 0;
            }
            og5 og5Var = ((gu7) ak7Var.x).z;
            Boolean Y = ak7Var.Y("firebase_analytics_collection_enabled");
            if (Y != null) {
                if (!Y.booleanValue()) {
                    return 4;
                }
                return 0;
            }
            if (this.V != null && !this.V.booleanValue()) {
                return 7;
            }
            return 0;
        }
        return 8;
    }

    @Override // defpackage.rv7
    public final au7 f() {
        au7 au7Var = this.D;
        l(au7Var);
        return au7Var;
    }

    @Override // defpackage.rv7
    public final Context g() {
        return this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.U) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r7 = this;
            boolean r0 = r7.S
            r1 = 0
            if (r0 == 0) goto L96
            au7 r0 = r7.D
            l(r0)
            r0.L()
            java.lang.Boolean r0 = r7.T
            pk2 r2 = r7.H
            if (r0 == 0) goto L35
            long r3 = r7.U
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L35
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r2.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.U
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L35:
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.U = r2
            i28 r0 = r7.F
            j(r0)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r0.o0(r2)
            if (r2 == 0) goto L75
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r0.o0(r2)
            if (r2 == 0) goto L75
            android.content.Context r2 = r7.x
            t91 r3 = defpackage.f97.a(r2)
            boolean r3 = r3.d()
            r4 = 1
            if (r3 != 0) goto L74
            ak7 r3 = r7.A
            boolean r3 = r3.O()
            if (r3 != 0) goto L74
            boolean r3 = defpackage.i28.G0(r2)
            if (r3 == 0) goto L75
            boolean r2 = defpackage.i28.g0(r2)
            if (r2 == 0) goto L75
        L74:
            r1 = r4
        L75:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r7.T = r2
            if (r1 == 0) goto L8f
            nr7 r1 = r7.p()
            java.lang.String r1 = r1.S()
            boolean r0 = r0.R(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.T = r0
        L8f:
            java.lang.Boolean r7 = r7.T
            boolean r7 = r7.booleanValue()
            return r7
        L96:
            java.lang.String r7 = "AppMeasurement is not initialized"
            defpackage.ze0.m(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu7.h():boolean");
    }

    public final sr7 m() {
        k(this.N);
        return this.N;
    }

    public final zz7 n() {
        k(this.O);
        return this.O;
    }

    public final zl7 o() {
        l(this.P);
        return this.P;
    }

    public final nr7 p() {
        k(this.Q);
        return this.Q;
    }
}
