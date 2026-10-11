package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class eo2 extends xz3 implements jj6, xq4, wu0 {
    public zm1 L;
    public qd M;
    public boolean N;

    public eo2(qd qdVar, zm1 zm1Var) {
        this.L = zm1Var;
        this.M = qdVar;
    }

    @Override // defpackage.xq4
    public final void J() {
        e1();
    }

    @Override // defpackage.xz3
    public final void T0() {
        e1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    public final void a1() {
        qd qdVar;
        ?? obj = new Object();
        iv5.j(this, new t72(obj, (byte) 11));
        eo2 eo2Var = (eo2) obj.x;
        if (eo2Var == null || (qdVar = eo2Var.M) == null) {
            qdVar = this.M;
        }
        b1(qdVar);
    }

    public void b1(sq4 sq4Var) {
        tq4 tq4Var = (tq4) t80.C(this, bv0.w);
        if (tq4Var != null) {
            ((ka) tq4Var).a = sq4Var;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r05, java.lang.Object] */
    public final void c1() {
        ?? obj = new Object();
        obj.x = true;
        iv5.l(this, new lz0(obj, (byte) 12));
        if (obj.x) {
            a1();
        }
    }

    public boolean d1(int i) {
        if (i == 3 || i == 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, w05] */
    public final void e1() {
        if (this.N) {
            this.N = false;
            if (this.K) {
                ?? obj = new Object();
                iv5.j(this, new aa(obj, (byte) 2));
                eo2 eo2Var = (eo2) obj.x;
                if (eo2Var != null) {
                    eo2Var.a1();
                } else {
                    b1(null);
                }
            }
        }
    }

    @Override // defpackage.xq4
    public final long q() {
        if (this.L != null) {
            ud1 ud1Var = wc7.O(this).V;
            int i = og6.b;
            return et5.g(ud1Var.x0(10.0f), ud1Var.x0(40.0f), ud1Var.x0(10.0f), ud1Var.x0(40.0f));
        }
        return og6.a;
    }

    @Override // defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        if (oq4Var == oq4.y) {
            List list = nq4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (d1(((uq4) list.get(i)).i)) {
                    int i2 = nq4Var.f;
                    if (i2 == 4) {
                        this.N = true;
                        c1();
                        return;
                    } else {
                        if (i2 == 5) {
                            e1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
