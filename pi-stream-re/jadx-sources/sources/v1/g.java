package v1;

import android.os.Handler;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class g extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f10426h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f10427i;

    /* renamed from: j, reason: collision with root package name */
    public h1.e0 f10428j;

    @Override // v1.a
    public final void d() {
        for (f fVar : this.f10426h.values()) {
            fVar.f10413a.c(fVar.f10414b);
        }
    }

    @Override // v1.a
    public final void f() {
        for (f fVar : this.f10426h.values()) {
            fVar.f10413a.e(fVar.f10414b);
        }
    }

    @Override // v1.a
    public void p() {
        HashMap hashMap = this.f10426h;
        for (f fVar : hashMap.values()) {
            fVar.f10413a.o(fVar.f10414b);
            a aVar = fVar.f10413a;
            i.g gVar = fVar.f10415c;
            aVar.r(gVar);
            aVar.q(gVar);
        }
        hashMap.clear();
    }

    public abstract w t(Object obj, w wVar);

    public long u(Object obj, long j4) {
        return j4;
    }

    public int v(int i10, Object obj) {
        return i10;
    }

    public abstract void w(Object obj, a aVar, c1.e1 e1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [v1.x, v1.e] */
    public final void x(final Integer num, a aVar) {
        HashMap hashMap = this.f10426h;
        w7.b.g(!hashMap.containsKey(num));
        ?? r12 = new x() { // from class: v1.e
            @Override // v1.x
            public final void a(a aVar2, c1.e1 e1Var) {
                g.this.w(num, aVar2, e1Var);
            }
        };
        i.g gVar = new i.g(this, num);
        hashMap.put(num, new f(aVar, r12, gVar));
        Handler handler = this.f10427i;
        handler.getClass();
        b0 b0Var = aVar.f10355c;
        b0Var.getClass();
        b0Var.f10367c.add(new a0(handler, gVar));
        Handler handler2 = this.f10427i;
        handler2.getClass();
        o1.n nVar = aVar.f10356d;
        nVar.getClass();
        nVar.f8164c.add(new o1.m(handler2, gVar));
        h1.e0 e0Var = this.f10428j;
        k1.i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        aVar.k(r12, e0Var, i0Var);
        if (!(!this.f10354b.isEmpty())) {
            aVar.c(r12);
        }
    }
}
