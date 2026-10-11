package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lu0 extends t30 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // defpackage.lw3
    public void d() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((ku0) it.next()).a.d();
        }
    }

    @Override // defpackage.t30
    public final void j() {
        for (ku0 ku0Var : this.i.values()) {
            ((t30) ku0Var.a).i(ku0Var.b);
        }
    }

    @Override // defpackage.t30
    public final void l() {
        for (ku0 ku0Var : this.i.values()) {
            ((t30) ku0Var.a).k(ku0Var.b);
        }
    }

    @Override // defpackage.t30
    public void q() {
        HashMap hashMap = this.i;
        for (ku0 ku0Var : hashMap.values()) {
            lw3 lw3Var = ku0Var.a;
            ju0 ju0Var = ku0Var.c;
            ((t30) lw3Var).p(ku0Var.b);
            t30 t30Var = (t30) lw3Var;
            t30Var.s(ju0Var);
            t30Var.r(ju0Var);
        }
        hashMap.clear();
    }

    public abstract jw3 t(Object obj, jw3 jw3Var);

    public abstract void w(Object obj, t30 t30Var, kf6 kf6Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [iu0, kw3] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pw3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [sp1, java.lang.Object] */
    public final void x(final Integer num, lw3 lw3Var) {
        HashMap hashMap = this.i;
        io3.n(!hashMap.containsKey(num));
        ?? r1 = new kw3() { // from class: iu0
            @Override // defpackage.kw3
            public final void b(t30 t30Var, kf6 kf6Var) {
                lu0.this.w(num, t30Var, kf6Var);
            }
        };
        ju0 ju0Var = new ju0(this, num);
        hashMap.put(num, new ku0(lw3Var, r1, ju0Var));
        Handler handler = this.j;
        handler.getClass();
        t30 t30Var = (t30) lw3Var;
        t30Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) t30Var.c.A;
        ?? obj = new Object();
        obj.a = handler;
        obj.b = ju0Var;
        copyOnWriteArrayList.add(obj);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = t30Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = ju0Var;
        copyOnWriteArrayList2.add(obj2);
        cp4 cp4Var = this.g;
        cp4Var.getClass();
        z20 z20Var = this.h;
        z20Var.getClass();
        t30Var.m(r1, cp4Var, z20Var);
        if (this.b.isEmpty()) {
            t30Var.i(r1);
        }
    }

    public long u(long j, Object obj) {
        return j;
    }

    public int v(int i, Object obj) {
        return i;
    }
}
