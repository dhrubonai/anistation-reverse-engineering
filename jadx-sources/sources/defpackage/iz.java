package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iz extends d04 {
    public hz x;
    public zq0 y;

    @Override // defpackage.d04
    public final xz3 a() {
        return new hz(this);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final Object f(xz0 xz0Var) {
        zq0 zq0Var = this.y;
        if (zq0Var == null) {
            zq0Var = tl7.c();
            this.y = zq0Var;
            hz hzVar = this.x;
            if (hzVar != null && hzVar.K) {
                b0 b0Var = new b0(hzVar, hzVar.M, (byte) 13);
                za3 O = wc7.O(hzVar);
                int i = O.y;
                p05 rectManager = ((oa) cb3.a(O)).getRectManager();
                hj3 hj3Var = rectManager.d;
                hj3Var.getClass();
                s34 s34Var = (s34) hj3Var.e;
                te6 te6Var = new te6(hj3Var, i, hzVar, b0Var);
                Object b = s34Var.b(i);
                if (b == null) {
                    s34Var.h(i, te6Var);
                    b = te6Var;
                }
                te6 te6Var2 = (te6) b;
                if (te6Var2 != te6Var) {
                    while (true) {
                        te6 te6Var3 = te6Var2.d;
                        if (te6Var3 == null) {
                            break;
                        }
                        te6Var2 = te6Var3;
                    }
                    te6Var2.d = te6Var;
                }
                za3 O2 = wc7.O(hzVar.x);
                if (O2.D != -4) {
                    eb2 eb2Var = rectManager.c;
                    int d = rectManager.d(O2);
                    long[] jArr = (long[]) eb2Var.z;
                    int i2 = d + 2;
                    jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
                }
                rectManager.f = true;
                rectManager.j();
                hzVar.L = te6Var;
            }
        }
        Object o = zq0Var.o(xz0Var);
        if (o == w11.x) {
            return o;
        }
        return pn6.a;
    }

    public final int hashCode() {
        return 234;
    }
}
