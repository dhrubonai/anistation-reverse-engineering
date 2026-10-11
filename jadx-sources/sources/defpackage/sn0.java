package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sn0 extends g97 {
    public final boolean l;
    public final ArrayList m;
    public final jf6 n;
    public pq3 o;
    public qn0 p;
    public rn0 q;
    public long r;
    public long s;

    public sn0(pn0 pn0Var) {
        super((lw3) pn0Var.A);
        this.o = new pq3((oq3) pn0Var.B);
        this.l = pn0Var.y;
        this.m = new ArrayList();
        this.n = new jf6();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059 A[LOOP:1: B:33:0x0057->B:34:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.kf6 r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            jf6 r0 = r1.n
            r4 = r18
            r4.n(r2, r0)
            long r5 = r0.p
            java.util.ArrayList r10 = r1.m
            boolean r3 = r10.isEmpty()
            r7 = -9223372036854775808
            if (r3 != 0) goto L2e
            qn0 r3 = r1.p
            if (r3 == 0) goto L2e
            pq3 r3 = r1.o
            boolean r3 = r3.e
            if (r3 != 0) goto L2e
            long r11 = r1.r
            long r11 = r11 - r5
            long r13 = r1.s
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L2c
        L2a:
            long r7 = r13 - r5
        L2c:
            r5 = r11
            goto L6b
        L2e:
            pq3 r3 = r1.o
            long r11 = r3.b
            long r13 = r3.d
            boolean r3 = r3.f
            if (r3 == 0) goto L42
            long r2 = r0.l
            long r11 = r11 + r2
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 == 0) goto L42
            long r2 = r2 + r13
            r15 = r7
            goto L44
        L42:
            r15 = r7
            r2 = r13
        L44:
            long r7 = r5 + r11
            r1.r = r7
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L4e
            r7 = r15
            goto L50
        L4e:
            long r7 = r5 + r2
        L50:
            r1.s = r7
            int r0 = r10.size()
            r5 = 0
        L57:
            if (r5 >= r0) goto L69
            java.lang.Object r6 = r10.get(r5)
            on0 r6 = (defpackage.on0) r6
            long r7 = r1.r
            long r13 = r1.s
            r6.r(r7, r13)
            int r5 = r5 + 1
            goto L57
        L69:
            r7 = r2
            goto L2c
        L6b:
            qn0 r3 = new qn0     // Catch: defpackage.rn0 -> L7a
            pq3 r0 = r1.o     // Catch: defpackage.rn0 -> L7a
            boolean r9 = r0.h     // Catch: defpackage.rn0 -> L7a
            r3.<init>(r4, r5, r7, r9)     // Catch: defpackage.rn0 -> L7a
            r1.p = r3     // Catch: defpackage.rn0 -> L7a
            r1.o(r3)
            return
        L7a:
            r0 = move-exception
            r1.q = r0
            r2 = 0
        L7e:
            int r0 = r10.size()
            if (r2 >= r0) goto L91
            java.lang.Object r0 = r10.get(r2)
            on0 r0 = (defpackage.on0) r0
            rn0 r3 = r1.q
            r0.H = r3
            int r2 = r2 + 1
            goto L7e
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn0.B(kf6):void");
    }

    @Override // defpackage.lw3
    public final boolean a(ar3 ar3Var) {
        lw3 lw3Var = this.k;
        if (lw3Var.a(ar3Var)) {
            if (!this.l && !lw3Var.c().e.equals(ar3Var.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lw3
    public final or3 b(jw3 jw3Var, l7 l7Var, long j) {
        on0 on0Var = new on0(this.k.b(jw3Var, l7Var, j), !this.o.g, this.r, this.s, this.l);
        this.m.add(on0Var);
        return on0Var;
    }

    @Override // defpackage.lu0, defpackage.lw3
    public final void d() {
        rn0 rn0Var = this.q;
        if (rn0Var == null) {
            super.d();
            return;
        }
        throw rn0Var;
    }

    @Override // defpackage.g97, defpackage.lw3
    public final void g(ar3 ar3Var) {
        qn0 qn0Var;
        qn0 qn0Var2;
        long j;
        boolean z = this.l;
        if (z) {
            pq3 pq3Var = this.o;
            this.o = ar3Var.e;
            if (this.p != null) {
                ArrayList arrayList = this.m;
                if (!arrayList.isEmpty() && (qn0Var2 = this.p) != null && !this.o.e) {
                    long j2 = 0;
                    long j3 = qn0Var2.e.m(0, this.n, 0L).l;
                    if (pq3Var.f) {
                        j = -j3;
                    } else {
                        j = 0;
                    }
                    pq3 pq3Var2 = this.o;
                    if (pq3Var2.f) {
                        j2 = j3;
                    }
                    long j4 = this.r;
                    long j5 = pq3Var2.b;
                    long j6 = (((j + j2) + j5) - pq3Var.b) + j4;
                    this.r = j6;
                    long j7 = pq3Var2.d;
                    long j8 = Long.MIN_VALUE;
                    if (j7 != Long.MIN_VALUE) {
                        j8 = (j6 + j7) - j5;
                    }
                    this.s = j8;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((on0) arrayList.get(i)).r(this.r, this.s);
                    }
                }
            }
        }
        qn0 qn0Var3 = this.p;
        super.g(ar3Var);
        if (z && (qn0Var = this.p) != null && qn0Var == qn0Var3) {
            B(qn0Var.e);
        }
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        ArrayList arrayList = this.m;
        io3.B(arrayList.remove(or3Var));
        this.k.h(((on0) or3Var).x);
        if (arrayList.isEmpty() && !this.o.e) {
            qn0 qn0Var = this.p;
            qn0Var.getClass();
            B(qn0Var.e);
        }
    }

    @Override // defpackage.lu0, defpackage.t30
    public final void q() {
        super.q();
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.g97
    public final void z(kf6 kf6Var) {
        if (this.q != null) {
            return;
        }
        B(kf6Var);
    }
}
