package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et4 implements ae3 {
    public final int a;
    public final dn0 b;
    public final ub2 c;
    public rx0 d;
    public v06 e;
    public u06 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public dt4 l;
    public boolean m;
    public long n;
    public long o;
    public long p = j04.b();
    public boolean q;
    public final /* synthetic */ tu r;

    public et4(tu tuVar, int i, dn0 dn0Var, ub2 ub2Var) {
        this.r = tuVar;
        this.a = i;
        this.b = dn0Var;
        this.c = ub2Var;
    }

    @Override // defpackage.ae3
    public final void a() {
        this.m = true;
    }

    public final void b() {
        u06 u06Var = this.f;
        if (u06Var != null) {
            u06Var.cancel();
        }
        this.f = null;
        v06 v06Var = this.e;
        if (v06Var != null) {
            v06Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(x16 x16Var) {
        boolean d;
        if (!this.r.x) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(x16Var);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(x16Var);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return d;
    }

    @Override // defpackage.ae3
    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8 A[Catch: all -> 0x0204, LOOP:2: B:93:0x01bc->B:103:0x01e8, LOOP_END, TRY_ENTER, TryCatch #1 {all -> 0x0204, blocks: (B:84:0x0176, B:86:0x017e, B:88:0x0184, B:91:0x0192, B:92:0x01b5, B:93:0x01bc, B:95:0x01c4, B:100:0x01d5, B:101:0x01da, B:103:0x01e8, B:110:0x01ee), top: B:83:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a0 A[LOOP:4: B:160:0x029e->B:161:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c8 A[LOOP:5: B:169:0x02c6->B:170:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b9  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v3, types: [xy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.x16 r20) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et4.d(x16):boolean");
    }

    public final boolean e() {
        u06 u06Var;
        if (this.i || ((u06Var = this.f) != null && u06Var.N())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, xy xyVar) {
        u06 l33Var;
        u06 u06Var = this.f;
        if (u06Var == null) {
            tu tuVar = this.r;
            ic2 a = ((qd3) tuVar.y).a(this.a, obj, obj2);
            mb3 a2 = ((w06) tuVar.z).a();
            byte b = 1;
            if (!a2.x.I()) {
                l33Var = new y23(a2, obj, b);
            } else {
                a2.k(obj, a, true);
                l33Var = new l33(a2, obj, b);
            }
            u06Var = l33Var;
            this.f = u06Var;
            this.j = obj;
        }
        this.q = false;
        while (!u06Var.N() && !this.q) {
            u06Var.e(new fs0((Object) this, (Object) xyVar, (byte) 12));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            xyVar.b = xy.a(j, xyVar.b);
        } else {
            xyVar.a = xy.a(j, xyVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void h() {
        long b = j04.b();
        long c = bf6.c(b, this.p);
        long j = c >> 1;
        m18 m18Var = fq1.y;
        if ((((int) c) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else if (j < -9223372036854L) {
                j = Long.MIN_VALUE;
            } else {
                j *= 1000000;
            }
        }
        this.o = j;
        long j2 = this.n - j;
        this.n = j2;
        this.p = b;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j2);
    }

    public final String toString() {
        rx0 rx0Var = this.d;
        boolean e = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(rx0Var);
        sb.append(", isComposed = ");
        sb.append(e);
        sb.append(", isMeasured = ");
        sb.append(z);
        sb.append(", isCanceled = ");
        return qx1.r(sb, z2, " }");
    }
}
