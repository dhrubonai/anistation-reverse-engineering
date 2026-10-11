package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class um0 extends k0 {
    public uq4 h0;
    public dy2 i0;

    @Override // defpackage.xq4
    public final void J() {
        fo2 fo2Var;
        u34 u34Var = this.N;
        if (u34Var != null && (fo2Var = this.a0) != null) {
            u34Var.b(new go2(fo2Var));
        }
        this.a0 = null;
        r1(false);
    }

    @Override // defpackage.ly2
    public final void Z(eb2 eb2Var, oq4 oq4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) eb2Var.z;
        l1();
        if (this.S && this.W == null) {
            ee2 ee2Var = new ee2(this);
            a1(ee2Var);
            this.W = ee2Var;
        }
        int i = 0;
        if (oq4Var == oq4.y) {
            if (this.i0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (q23.h((dy2) arrayList.get(i2))) {
                        dy2 dy2Var = (dy2) arrayList.get(0);
                        dy2Var.i = true;
                        this.i0 = dy2Var;
                        if (this.S) {
                            this.X = "waiting";
                            j1(dy2Var);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dy2 dy2Var2 = (dy2) arrayList.get(i3);
                if (dy2Var2.i || !dy2Var2.h || dy2Var2.d) {
                    float f = ((rv6) t80.C(this, bv0.t)).f();
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        dy2 dy2Var3 = (dy2) arrayList.get(i4);
                        long j = dy2Var3.c;
                        dy2 dy2Var4 = this.i0;
                        dy2Var4.getClass();
                        if (Math.abs(xc4.c(xc4.e(j, dy2Var4.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dy2Var3.i || z) {
                            r1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((dy2) arrayList.get(0)).i = true;
            if (this.S) {
                this.X = "recognized";
                dy2 dy2Var5 = this.i0;
                dy2Var5.getClass();
                i1(dy2Var5.c, true);
                p1();
            }
            this.i0 = null;
            return;
        }
        if (oq4Var == oq4.z) {
            if (this.i0 != null) {
                int size4 = arrayList.size();
                while (true) {
                    if (i >= size4) {
                        break;
                    }
                    dy2 dy2Var6 = (dy2) arrayList.get(i);
                    if (dy2Var6.i && dy2Var6 != this.i0) {
                        r1(true);
                        break;
                    }
                    i++;
                }
            }
            if (a34.i(this.X, "recognized")) {
                this.X = "idle";
            }
        }
    }

    @Override // defpackage.ly2
    public final void l0() {
        r1(true);
    }

    public final void r1(boolean z) {
        if (z) {
            this.i0 = null;
        } else {
            this.h0 = null;
        }
        h1(z);
        this.X = "idle";
    }

    @Override // defpackage.k0, defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        super.x(nq4Var, oq4Var, j);
        if (oq4Var == oq4.y) {
            if (this.h0 == null) {
                if (j76.e(nq4Var, true)) {
                    uq4 uq4Var = (uq4) nq4Var.a.get(0);
                    uq4Var.a();
                    this.h0 = uq4Var;
                    if (this.S) {
                        this.X = "waiting";
                        k1(uq4Var);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = nq4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!t80.x((uq4) list.get(i))) {
                    long g1 = g1(j);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        uq4 uq4Var2 = (uq4) list.get(i2);
                        if (uq4Var2.c() || t80.a0(uq4Var2, j, g1)) {
                            r1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((uq4) list.get(0)).a();
            if (this.S) {
                this.X = "recognized";
                uq4 uq4Var3 = this.h0;
                uq4Var3.getClass();
                i1(uq4Var3.c, false);
                p1();
            }
            this.h0 = null;
            return;
        }
        if (oq4Var == oq4.z) {
            if (this.h0 != null) {
                List list2 = nq4Var.a;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    uq4 uq4Var4 = (uq4) list2.get(i3);
                    if (uq4Var4.c() && uq4Var4 != this.h0) {
                        r1(false);
                        break;
                    }
                    i3++;
                }
            }
            if (a34.i(this.X, "recognized")) {
                this.X = "idle";
            }
        }
    }
}
