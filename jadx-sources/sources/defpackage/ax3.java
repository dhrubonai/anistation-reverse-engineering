package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ax3 {
    public final cp4 a;
    public final z20 b;
    public final fz1 f;
    public final c71 i;
    public final k46 j;
    public boolean l;
    public lo5 k = new lo5();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public ax3(fz1 fz1Var, c71 c71Var, k46 k46Var, cp4 cp4Var, z20 z20Var) {
        this.a = cp4Var;
        this.b = z20Var;
        this.f = fz1Var;
        this.i = c71Var;
        this.j = k46Var;
    }

    public final kf6 a(int i, ArrayList arrayList, lo5 lo5Var) {
        if (!arrayList.isEmpty()) {
            this.k = lo5Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                zw3 zw3Var = (zw3) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    zw3 zw3Var2 = (zw3) arrayList2.get(i2 - 1);
                    zw3Var.d = zw3Var2.a.o.e.o() + zw3Var2.d;
                    zw3Var.e = false;
                    zw3Var.c.clear();
                } else {
                    zw3Var.d = 0;
                    zw3Var.e = false;
                    zw3Var.c.clear();
                }
                int o = zw3Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((zw3) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, zw3Var);
                this.e.put(zw3Var.b, zw3Var);
                if (this.l) {
                    e(zw3Var);
                    if (this.d.isEmpty()) {
                        this.h.add(zw3Var);
                    } else {
                        yw3 yw3Var = (yw3) this.g.get(zw3Var);
                        if (yw3Var != null) {
                            ((t30) yw3Var.a).i(yw3Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final kf6 b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return kf6.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zw3 zw3Var = (zw3) arrayList.get(i2);
            zw3Var.d = i;
            i += zw3Var.a.o.e.o();
        }
        return new hq4(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            zw3 zw3Var = (zw3) it.next();
            if (zw3Var.c.isEmpty()) {
                yw3 yw3Var = (yw3) this.g.get(zw3Var);
                if (yw3Var != null) {
                    ((t30) yw3Var.a).i(yw3Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(zw3 zw3Var) {
        if (zw3Var.e && zw3Var.c.isEmpty()) {
            yw3 yw3Var = (yw3) this.g.remove(zw3Var);
            yw3Var.getClass();
            xw3 xw3Var = yw3Var.c;
            t30 t30Var = (t30) yw3Var.a;
            t30Var.p(yw3Var.b);
            t30Var.s(xw3Var);
            t30Var.r(xw3Var);
            this.h.remove(zw3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kw3, sw3] */
    /* JADX WARN: Type inference failed for: r4v4, types: [sp1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, pw3] */
    public final void e(zw3 zw3Var) {
        zn3 zn3Var = zw3Var.a;
        ?? r1 = new kw3() { // from class: sw3
            @Override // defpackage.kw3
            public final void b(t30 t30Var, kf6 kf6Var) {
                k46 k46Var = ax3.this.f.D;
                k46Var.i(2);
                k46Var.j(22);
            }
        };
        xw3 xw3Var = new xw3(this, zw3Var);
        this.g.put(zw3Var, new yw3(zn3Var, r1, xw3Var));
        Handler q = eq6.q(null);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) zn3Var.c.A;
        ?? obj = new Object();
        obj.a = q;
        obj.b = xw3Var;
        copyOnWriteArrayList.add(obj);
        Handler q2 = eq6.q(null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = zn3Var.d.c;
        ?? obj2 = new Object();
        obj2.a = q2;
        obj2.b = xw3Var;
        copyOnWriteArrayList2.add(obj2);
        zn3Var.m(r1, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            zw3 zw3Var = (zw3) arrayList.remove(i3);
            this.e.remove(zw3Var.b);
            int i4 = -zw3Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((zw3) arrayList.get(i5)).d += i4;
            }
            zw3Var.e = true;
            if (this.l) {
                d(zw3Var);
            }
        }
    }
}
