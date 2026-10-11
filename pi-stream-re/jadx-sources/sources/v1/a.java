package v1;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10353a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f10354b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final b0 f10355c = new b0(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final o1.n f10356d = new o1.n(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f10357e;

    /* renamed from: f, reason: collision with root package name */
    public c1.e1 f10358f;

    /* renamed from: g, reason: collision with root package name */
    public k1.i0 f10359g;

    public final b0 a(w wVar) {
        return new b0(this.f10355c.f10367c, 0, wVar);
    }

    public abstract u b(w wVar, z1.d dVar, long j4);

    public final void c(x xVar) {
        HashSet hashSet = this.f10354b;
        boolean z9 = !hashSet.isEmpty();
        hashSet.remove(xVar);
        if (z9 && hashSet.isEmpty()) {
            d();
        }
    }

    public void d() {
    }

    public final void e(x xVar) {
        this.f10357e.getClass();
        HashSet hashSet = this.f10354b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(xVar);
        if (isEmpty) {
            f();
        }
    }

    public void f() {
    }

    public c1.e1 g() {
        return null;
    }

    public abstract c1.k0 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(x xVar, h1.e0 e0Var, k1.i0 i0Var) {
        boolean z9;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f10357e;
        if (looper != null && looper != myLooper) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.g(z9);
        this.f10359g = i0Var;
        c1.e1 e1Var = this.f10358f;
        this.f10353a.add(xVar);
        if (this.f10357e == null) {
            this.f10357e = myLooper;
            this.f10354b.add(xVar);
            l(e0Var);
        } else if (e1Var != null) {
            e(xVar);
            xVar.a(this, e1Var);
        }
    }

    public abstract void l(h1.e0 e0Var);

    public final void m(c1.e1 e1Var) {
        this.f10358f = e1Var;
        Iterator it = this.f10353a.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(this, e1Var);
        }
    }

    public abstract void n(u uVar);

    public final void o(x xVar) {
        ArrayList arrayList = this.f10353a;
        arrayList.remove(xVar);
        if (arrayList.isEmpty()) {
            this.f10357e = null;
            this.f10358f = null;
            this.f10359g = null;
            this.f10354b.clear();
            p();
            return;
        }
        c(xVar);
    }

    public abstract void p();

    public final void q(o1.o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10356d.f8164c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            o1.m mVar = (o1.m) it.next();
            if (mVar.f8161b == oVar) {
                copyOnWriteArrayList.remove(mVar);
            }
        }
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10355c.f10367c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (a0Var.f10361b == c0Var) {
                copyOnWriteArrayList.remove(a0Var);
            }
        }
    }

    public void s(c1.k0 k0Var) {
    }
}
