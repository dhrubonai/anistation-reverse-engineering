package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm2 implements g95 {
    public final int x;
    public final tm2 y;
    public int z = -1;

    public pm2(tm2 tm2Var, int i) {
        this.y = tm2Var;
        this.x = i;
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        ea2 ea2Var;
        if (this.z == -3) {
            q61Var.b(4);
            return -4;
        }
        if (b()) {
            int i2 = this.z;
            tm2 tm2Var = this.y;
            ArrayList arrayList = tm2Var.K;
            if (!tm2Var.F()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((rl2) arrayList.get(i4)).k;
                        int length = tm2Var.S.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (tm2Var.k0[i6] && tm2Var.S[i6].v() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    eq6.b0(arrayList, 0, i4);
                    rl2 rl2Var = (rl2) arrayList.get(0);
                    ea2 ea2Var2 = rl2Var.d;
                    if (!ea2Var2.equals(tm2Var.d0)) {
                        eb2 eb2Var = tm2Var.H;
                        eb2Var.h(new fs0(eb2Var, new fr3(1, tm2Var.y, ea2Var2, rl2Var.e, rl2Var.f, eq6.l0(rl2Var.g), -9223372036854775807L), (byte) 11));
                    }
                    tm2Var.d0 = ea2Var2;
                }
                if (arrayList.isEmpty() || ((rl2) arrayList.get(0)).f()) {
                    int w = tm2Var.S[i2].w(pz2Var, q61Var, i, tm2Var.q0);
                    if (w == -5) {
                        ea2 ea2Var3 = (ea2) pz2Var.z;
                        ea2Var3.getClass();
                        if (i2 == tm2Var.Y) {
                            int q = jf7.q(tm2Var.S[i2].v());
                            while (i3 < arrayList.size() && ((rl2) arrayList.get(i3)).k != q) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                ea2Var = ((rl2) arrayList.get(i3)).d;
                            } else {
                                ea2Var = tm2Var.c0;
                                ea2Var.getClass();
                            }
                            ea2Var3 = ea2Var3.e(ea2Var);
                        }
                        pz2Var.z = ea2Var3;
                    }
                    return w;
                }
            }
        }
        return -3;
    }

    public final void a() {
        boolean z;
        if (this.z == -1) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        tm2 tm2Var = this.y;
        tm2Var.w();
        tm2Var.h0.getClass();
        int[] iArr = tm2Var.h0;
        int i = this.x;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (tm2Var.g0.contains(tm2Var.f0.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = tm2Var.k0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.z = i2;
    }

    public final boolean b() {
        int i = this.z;
        if (i != -1 && i != -3 && i != -2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        if (this.z != -3) {
            if (b()) {
                int i = this.z;
                tm2 tm2Var = this.y;
                if (tm2Var.F() || !tm2Var.S[i].s(tm2Var.q0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.g95
    public final void s() {
        int i = this.z;
        tm2 tm2Var = this.y;
        if (i != -2) {
            if (i == -1) {
                tm2Var.J();
                return;
            }
            if (i != -3) {
                tm2Var.J();
                sm2 sm2Var = tm2Var.S[i];
                qp1 qp1Var = sm2Var.h;
                if (qp1Var != null && qp1Var.e() == 1) {
                    pp1 error = sm2Var.h.getError();
                    error.getClass();
                    throw error;
                }
                return;
            }
            return;
        }
        tm2Var.w();
        throw new IOException(qx1.m("Unable to bind a sample queue to TrackGroup with MIME type ", tm2Var.f0.a(this.x).d[0].p, "."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r3.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3.hasNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r3 = r5;
     */
    @Override // defpackage.g95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(long r4) {
        /*
            r3 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L63
            int r0 = r3.z
            tm2 r3 = r3.y
            boolean r1 = r3.F()
            if (r1 == 0) goto L11
            goto L63
        L11:
            sm2[] r1 = r3.S
            r1 = r1[r0]
            boolean r2 = r3.q0
            int r4 = r1.q(r4, r2)
            java.util.ArrayList r3 = r3.K
            if (r3 == 0) goto L31
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L26
            goto L47
        L26:
            int r5 = r3.size()
            int r5 = r5 + (-1)
            java.lang.Object r3 = r3.get(r5)
            goto L48
        L31:
            java.util.Iterator r3 = r3.iterator()
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L47
        L3b:
            java.lang.Object r5 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L3b
            r3 = r5
            goto L48
        L47:
            r3 = 0
        L48:
            rl2 r3 = (defpackage.rl2) r3
            if (r3 == 0) goto L5f
            boolean r5 = r3.f()
            if (r5 != 0) goto L5f
            int r5 = r1.o()
            int r3 = r3.e(r0)
            int r3 = r3 - r5
            int r4 = java.lang.Math.min(r4, r3)
        L5f:
            r1.B(r4)
            return r4
        L63:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm2.t(long):int");
    }
}
