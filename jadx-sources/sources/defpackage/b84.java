package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b84 extends u44 {
    public final u44 o;
    public boolean p;

    public b84(long j, kt5 kt5Var, ub2 ub2Var, ub2 ub2Var2, u44 u44Var) {
        super(j, kt5Var, ub2Var, ub2Var2);
        this.o = u44Var;
        u44Var.k();
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override // defpackage.u44
    public final it5 w() {
        HashMap hashMap;
        b84 b84Var;
        u44 u44Var = this.o;
        if (!u44Var.m && !u44Var.c) {
            q44 q44Var = this.h;
            long j = this.b;
            if (q44Var != null) {
                hashMap = mt5.m(u44Var.g(), this, this.o.d());
            } else {
                hashMap = null;
            }
            Object obj = mt5.c;
            synchronized (obj) {
                try {
                    mt5.v(this);
                    if (q44Var == null || q44Var.d == 0) {
                        b84Var = this;
                        b84Var.a();
                    } else {
                        b84Var = this;
                        it5 z = b84Var.z(this.o.g(), q44Var, hashMap, this.o.d());
                        if (!z.equals(ht5.a)) {
                            return z;
                        }
                        q44 x = b84Var.o.x();
                        if (x != null) {
                            x.j(q44Var);
                        } else {
                            b84Var.o.B(q44Var);
                            b84Var.h = null;
                        }
                    }
                    if (a34.E(b84Var.o.g(), j) < 0) {
                        b84Var.o.v();
                    }
                    u44 u44Var2 = b84Var.o;
                    u44Var2.r(u44Var2.d().c(j).b(b84Var.j));
                    b84Var.o.A(j);
                    u44 u44Var3 = b84Var.o;
                    int i = b84Var.d;
                    b84Var.d = -1;
                    if (i >= 0) {
                        int[] iArr = u44Var3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        u44Var3.k = copyOf;
                    } else {
                        u44Var3.getClass();
                    }
                    u44 u44Var4 = b84Var.o;
                    kt5 kt5Var = b84Var.j;
                    u44Var4.getClass();
                    synchronized (obj) {
                        u44Var4.j = u44Var4.j.f(kt5Var);
                        u44 u44Var5 = b84Var.o;
                        int[] iArr2 = b84Var.k;
                        u44Var5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = u44Var5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            u44Var5.k = iArr2;
                        }
                    }
                    b84Var.m = true;
                    if (!b84Var.p) {
                        b84Var.p = true;
                        b84Var.o.l();
                    }
                    return ht5.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new gt5(this);
    }
}
