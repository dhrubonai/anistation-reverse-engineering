package o1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f8162a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.w f8163b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8164c;

    public n(CopyOnWriteArrayList copyOnWriteArrayList, int i10, v1.w wVar) {
        this.f8164c = copyOnWriteArrayList;
        this.f8162a = i10;
        this.f8163b = wVar;
    }

    public final void a() {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new l(this, mVar.f8161b, 3));
        }
    }

    public final void b() {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new l(this, mVar.f8161b, 2));
        }
    }

    public final void c() {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new l(this, mVar.f8161b, 1));
        }
    }

    public final void d(int i10) {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new f1.k(this, mVar.f8161b, i10, 2));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new q0.o(this, mVar.f8161b, exc, 4));
        }
    }

    public final void f() {
        Iterator it = this.f8164c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            f1.b0.S(mVar.f8160a, new l(this, mVar.f8161b, 0));
        }
    }
}
