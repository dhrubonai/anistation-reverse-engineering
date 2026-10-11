package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yp5 extends kf6 {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o;
    public final ar3 p;
    public final uq3 q;

    static {
        nq3 nq3Var = new nq3();
        nq3Var.b = "SinglePeriodTimeline";
        nq3Var.e = Uri.EMPTY;
        nq3Var.a();
    }

    public yp5(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, i18 i18Var, ar3 ar3Var, uq3 uq3Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = i18Var;
        ar3Var.getClass();
        this.p = ar3Var;
        this.q = uq3Var;
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        if (r != obj) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        Object obj;
        io3.r(i, 1);
        if (z) {
            obj = r;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        hf6Var.h(null, obj2, 0, this.h, -this.j, y5.c, false);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return 1;
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        io3.r(i, 1);
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // defpackage.kf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jf6 m(int r25, defpackage.jf6 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.io3.r(r2, r1)
            long r1 = r0.k
            boolean r14 = r0.m
            if (r14 == 0) goto L2d
            boolean r3 = r0.n
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = defpackage.jf6.q
            r21 = 0
            long r1 = r0.j
            ar3 r5 = r0.p
            java.lang.Object r6 = r0.o
            long r7 = r0.e
            long r9 = r0.f
            long r11 = r0.g
            boolean r13 = r0.l
            uq3 r15 = r0.q
            r22 = r1
            long r0 = r0.i
            r20 = 0
            r3 = r26
            r18 = r0
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp5.m(int, jf6, long):jf6");
    }

    @Override // defpackage.kf6
    public final int o() {
        return 1;
    }
}
