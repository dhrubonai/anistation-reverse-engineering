package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yr5 implements su0, Iterable, j73 {
    public int A;
    public int B;
    public boolean D;
    public int E;
    public HashMap G;
    public s34 H;
    public int y;
    public int[] x = new int[0];
    public Object[] z = new Object[0];
    public final Object C = new Object();
    public ArrayList F = new ArrayList();

    public static final void f(bs5 bs5Var, int i) {
        while (bs5Var.v >= 0 && bs5Var.u <= i) {
            bs5Var.N();
            bs5Var.i();
        }
    }

    public final int b(ed2 ed2Var) {
        if (this.D) {
            eu0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!ed2Var.a()) {
            ds4.a("Anchor refers to a group that was removed");
        }
        return ed2Var.a;
    }

    public final void c() {
        this.G = new HashMap();
    }

    public final p44 d(nr nrVar, f44 f44Var) {
        int i;
        Object[] objArr = f44Var.a;
        int i2 = f44Var.b;
        byte b = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (!i(tl7.h(((k14) objArr[i3]).e))) {
                f44 f44Var2 = new f44();
                Object[] objArr2 = f44Var.a;
                int i4 = f44Var.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (i(tl7.h(((k14) obj).e))) {
                        f44Var2.a(obj);
                    }
                }
                f44Var = f44Var2;
            } else {
                i3++;
            }
        }
        pp5 pp5Var = new pp5((Object) this, (byte) 2);
        if (f44Var.b > 1) {
            Comparable comparable = (Comparable) pp5Var.invoke(f44Var.g(0));
            int i6 = f44Var.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) pp5Var.invoke(f44Var.g(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    f44 f44Var3 = new f44(f44Var.b);
                    Object[] objArr3 = f44Var.a;
                    int i8 = f44Var.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        f44Var3.a(objArr3[i9]);
                    }
                    d44 d44Var = f44Var3.c;
                    if (d44Var == null) {
                        d44Var = new d44(f44Var3, b);
                        f44Var3.c = d44Var;
                    }
                    if (((f44) d44Var.y).b > 1) {
                        cp0.X(d44Var, new n00(pp5Var, (byte) 5));
                    }
                    f44Var = f44Var3;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (f44Var.i()) {
            p44 p44Var = cb5.b;
            p44Var.getClass();
            return p44Var;
        }
        long[] jArr = cb5.a;
        p44 p44Var2 = new p44();
        bs5 h = h();
        try {
            Object[] objArr4 = f44Var.a;
            int i10 = f44Var.b;
            for (int i11 = 0; i11 < i10; i11++) {
                k14 k14Var = (k14) objArr4[i11];
                int c = h.c(tl7.h(k14Var.e));
                int F = h.F(h.b, c);
                f(h, F);
                f(h, F);
                while (true) {
                    i = h.t;
                    if (i == F || i == h.u) {
                        break;
                    }
                    if (F < h.t(i) + i) {
                        h.Q();
                    } else {
                        h.M();
                    }
                }
                if (i != F) {
                    eu0.a("Unexpected slot table structure");
                }
                h.Q();
                h.a(c - h.t);
                p44Var2.n(k14Var, eu0.c(k14Var.c, k14Var, h, nrVar));
            }
            f(h, Integer.MAX_VALUE);
            h.e(true);
            return p44Var2;
        } catch (Throwable th) {
            h.e(false);
            throw th;
        }
    }

    public final xr5 g() {
        if (!this.D) {
            this.B++;
            return new xr5(this);
        }
        ze0.m("Cannot read while a writer is pending");
        return null;
    }

    public final bs5 h() {
        if (this.D) {
            eu0.a("Cannot start a writer when another writer is pending");
        }
        if (this.B > 0) {
            eu0.a("Cannot start a writer when a reader is pending");
        }
        this.D = true;
        this.E++;
        return new bs5(this);
    }

    public final boolean i(ed2 ed2Var) {
        int c;
        if (ed2Var.a() && (c = as5.c(this.F, ed2Var.a, this.y)) >= 0 && a34.i(this.F.get(c), ed2Var)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pi2(this, 0, this.y);
    }

    public final md2 j(int i) {
        ed2 ed2Var;
        int i2;
        ArrayList arrayList;
        int c;
        HashMap hashMap = this.G;
        if (hashMap != null) {
            if (this.D) {
                eu0.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.y) && (c = as5.c((arrayList = this.F), i, i2)) >= 0) {
                ed2Var = (ed2) arrayList.get(c);
            } else {
                ed2Var = null;
            }
            if (ed2Var != null) {
                return (md2) hashMap.get(ed2Var);
            }
        }
        return null;
    }
}
