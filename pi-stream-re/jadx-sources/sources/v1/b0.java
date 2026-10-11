package v1;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10365a;

    /* renamed from: b, reason: collision with root package name */
    public final w f10366b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f10367c;

    public b0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, w wVar) {
        this.f10367c = copyOnWriteArrayList;
        this.f10365a = i10;
        this.f10366b = wVar;
    }

    public final void a(int i10, c1.v vVar, int i11, Object obj, long j4) {
        b(new s(1, i10, vVar, i11, obj, f1.b0.c0(j4), -9223372036854775807L));
    }

    public final void b(s sVar) {
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new q0.o(this, a0Var.f10361b, sVar, 5));
        }
    }

    public final void c(n nVar, int i10) {
        d(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void d(n nVar, int i10, int i11, c1.v vVar, int i12, Object obj, long j4, long j10) {
        e(nVar, new s(i10, i11, vVar, i12, obj, f1.b0.c0(j4), f1.b0.c0(j10)));
    }

    public final void e(n nVar, s sVar) {
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new y(this, a0Var.f10361b, nVar, sVar, 1));
        }
    }

    public final void f(n nVar, int i10) {
        g(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void g(n nVar, int i10, int i11, c1.v vVar, int i12, Object obj, long j4, long j10) {
        h(nVar, new s(i10, i11, vVar, i12, obj, f1.b0.c0(j4), f1.b0.c0(j10)));
    }

    public final void h(n nVar, s sVar) {
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new y(this, a0Var.f10361b, nVar, sVar, 2));
        }
    }

    public final void i(n nVar, int i10, int i11, c1.v vVar, int i12, Object obj, long j4, long j10, IOException iOException, boolean z9) {
        k(nVar, new s(i10, i11, vVar, i12, obj, f1.b0.c0(j4), f1.b0.c0(j10)), iOException, z9);
    }

    public final void j(n nVar, int i10, IOException iOException, boolean z9) {
        i(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z9);
    }

    public final void k(n nVar, s sVar, IOException iOException, boolean z9) {
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new j1.x0(this, a0Var.f10361b, nVar, sVar, iOException, z9, 1));
        }
    }

    public final void l(n nVar, int i10) {
        m(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void m(n nVar, int i10, int i11, c1.v vVar, int i12, Object obj, long j4, long j10) {
        n(nVar, new s(i10, i11, vVar, i12, obj, f1.b0.c0(j4), f1.b0.c0(j10)));
    }

    public final void n(n nVar, s sVar) {
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new y(this, a0Var.f10361b, nVar, sVar, 0));
        }
    }

    public final void o(s sVar) {
        w wVar = this.f10366b;
        wVar.getClass();
        Iterator it = this.f10367c.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            f1.b0.S(a0Var.f10360a, new z(this, a0Var.f10361b, wVar, sVar, 0));
        }
    }
}
