package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oj0 implements wc2 {
    public final l11 x;
    public final int y;
    public final ta0 z;

    public oj0(l11 l11Var, int i, ta0 ta0Var) {
        this.x = l11Var;
        this.y = i;
        this.z = ta0Var;
    }

    @Override // defpackage.wc2
    public final w42 a(l11 l11Var, int i, ta0 ta0Var) {
        l11 l11Var2 = this.x;
        l11 plus = l11Var.plus(l11Var2);
        ta0 ta0Var2 = ta0.x;
        ta0 ta0Var3 = this.z;
        int i2 = this.y;
        if (ta0Var == ta0Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            ta0Var = ta0Var3;
        }
        if (a34.i(plus, l11Var2) && i == i2 && ta0Var == ta0Var3) {
            return this;
        }
        return g(plus, i, ta0Var);
    }

    @Override // defpackage.w42
    public Object collect(x42 x42Var, vz0 vz0Var) {
        Object K = db.K(new e0(x42Var, this, null, (byte) 10), vz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(tu4 tu4Var, vz0 vz0Var);

    public abstract oj0 g(l11 l11Var, int i, ta0 ta0Var);

    public w42 h() {
        return null;
    }

    public vz4 i(v11 v11Var) {
        int i = this.y;
        if (i == -3) {
            i = -2;
        }
        ic2 c0Var = new c0((Object) this, (vz0) null, (byte) 16);
        nj0 nj0Var = new nj0(bx7.E(v11Var, this.x), iv.d(i, 4, this.z), true, true);
        nj0Var.i0(y11.z, nj0Var, c0Var);
        return nj0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        it1 it1Var = it1.x;
        l11 l11Var = this.x;
        if (l11Var != it1Var) {
            arrayList.add("context=" + l11Var);
        }
        int i = this.y;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ta0 ta0Var = ta0.x;
        ta0 ta0Var2 = this.z;
        if (ta0Var2 != ta0Var) {
            arrayList.add("onBufferOverflow=" + ta0Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return qx1.p(sb, yo0.q0(arrayList, ", ", null, null, null, 62), ']');
    }
}
