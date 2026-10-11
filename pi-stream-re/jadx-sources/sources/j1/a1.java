package j1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final k1.i0 f5619a;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f5623e;

    /* renamed from: h, reason: collision with root package name */
    public final k1.a f5626h;

    /* renamed from: i, reason: collision with root package name */
    public final f1.i f5627i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5629k;

    /* renamed from: l, reason: collision with root package name */
    public h1.e0 f5630l;

    /* renamed from: j, reason: collision with root package name */
    public v1.y0 f5628j = new v1.y0();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f5621c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5622d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5620b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5624f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f5625g = new HashSet();

    public a1(j0 j0Var, k1.a aVar, f1.x xVar, k1.i0 i0Var) {
        this.f5619a = i0Var;
        this.f5623e = j0Var;
        this.f5626h = aVar;
        this.f5627i = xVar;
    }

    public final c1.e1 a(int i10, List list, v1.y0 y0Var) {
        if (!list.isEmpty()) {
            this.f5628j = y0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                z0 z0Var = (z0) list.get(i11 - i10);
                ArrayList arrayList = this.f5620b;
                if (i11 > 0) {
                    z0 z0Var2 = (z0) arrayList.get(i11 - 1);
                    z0Var.f5936d = z0Var2.f5933a.o.p() + z0Var2.f5936d;
                    z0Var.f5937e = false;
                    z0Var.f5935c.clear();
                } else {
                    z0Var.f5936d = 0;
                    z0Var.f5937e = false;
                    z0Var.f5935c.clear();
                }
                int p3 = z0Var.f5933a.o.p();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((z0) arrayList.get(i12)).f5936d += p3;
                }
                arrayList.add(i11, z0Var);
                this.f5622d.put(z0Var.f5934b, z0Var);
                if (this.f5629k) {
                    e(z0Var);
                    if (this.f5621c.isEmpty()) {
                        this.f5625g.add(z0Var);
                    } else {
                        y0 y0Var2 = (y0) this.f5624f.get(z0Var);
                        if (y0Var2 != null) {
                            y0Var2.f5929a.c(y0Var2.f5930b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final c1.e1 b() {
        ArrayList arrayList = this.f5620b;
        if (arrayList.isEmpty()) {
            return c1.e1.f1676a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            z0 z0Var = (z0) arrayList.get(i11);
            z0Var.f5936d = i10;
            i10 += z0Var.f5933a.o.p();
        }
        return new f1(arrayList, this.f5628j);
    }

    public final void c() {
        Iterator it = this.f5625g.iterator();
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            if (z0Var.f5935c.isEmpty()) {
                y0 y0Var = (y0) this.f5624f.get(z0Var);
                if (y0Var != null) {
                    y0Var.f5929a.c(y0Var.f5930b);
                }
                it.remove();
            }
        }
    }

    public final void d(z0 z0Var) {
        if (z0Var.f5937e && z0Var.f5935c.isEmpty()) {
            y0 y0Var = (y0) this.f5624f.remove(z0Var);
            y0Var.getClass();
            v1.x xVar = y0Var.f5930b;
            v1.a aVar = y0Var.f5929a;
            aVar.o(xVar);
            androidx.appcompat.widget.a0 a0Var = y0Var.f5931c;
            aVar.r(a0Var);
            aVar.q(a0Var);
            this.f5625g.remove(z0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [v1.x, j1.t0] */
    public final void e(z0 z0Var) {
        v1.r rVar = z0Var.f5933a;
        ?? r12 = new v1.x() { // from class: j1.t0
            @Override // v1.x
            public final void a(v1.a aVar, c1.e1 e1Var) {
                a1.this.f5623e.f5806y.d(22);
            }
        };
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(this, z0Var, 8);
        this.f5624f.put(z0Var, new y0(rVar, r12, a0Var));
        int i10 = f1.b0.f3799a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        v1.b0 b0Var = rVar.f10355c;
        b0Var.getClass();
        b0Var.f10367c.add(new v1.a0(handler, a0Var));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        o1.n nVar = rVar.f10356d;
        nVar.getClass();
        nVar.f8164c.add(new o1.m(handler2, a0Var));
        rVar.k(r12, this.f5630l, this.f5619a);
    }

    public final void f(v1.u uVar) {
        IdentityHashMap identityHashMap = this.f5621c;
        z0 z0Var = (z0) identityHashMap.remove(uVar);
        z0Var.getClass();
        z0Var.f5933a.n(uVar);
        z0Var.f5935c.remove(((v1.o) uVar).f10482a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(z0Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f5620b;
            z0 z0Var = (z0) arrayList.remove(i12);
            this.f5622d.remove(z0Var.f5934b);
            int i13 = -z0Var.f5933a.o.p();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((z0) arrayList.get(i14)).f5936d += i13;
            }
            z0Var.f5937e = true;
            if (this.f5629k) {
                d(z0Var);
            }
        }
    }
}
