package k1;

import c1.c1;
import c1.e1;
import c1.z0;
import r6.m0;
import r6.n1;
import r6.o0;
import r6.q0;
import r6.r0;
import r6.s1;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f6407a;

    /* renamed from: b, reason: collision with root package name */
    public o0 f6408b;

    /* renamed from: c, reason: collision with root package name */
    public s1 f6409c;

    /* renamed from: d, reason: collision with root package name */
    public v1.w f6410d;

    /* renamed from: e, reason: collision with root package name */
    public v1.w f6411e;

    /* renamed from: f, reason: collision with root package name */
    public v1.w f6412f;

    public z(c1 c1Var) {
        this.f6407a = c1Var;
        m0 m0Var = o0.f9505b;
        this.f6408b = n1.f9497e;
        this.f6409c = s1.f9531x;
    }

    public static v1.w b(z0 z0Var, o0 o0Var, v1.w wVar, c1 c1Var) {
        Object m5;
        int i10;
        j1.d0 d0Var = (j1.d0) z0Var;
        e1 A = d0Var.A();
        int x9 = d0Var.x();
        if (A.q()) {
            m5 = null;
        } else {
            m5 = A.m(x9);
        }
        if (!d0Var.L() && !A.q()) {
            i10 = A.f(x9, c1Var).b(f1.b0.O(d0Var.y()) - c1Var.g());
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < o0Var.size(); i11++) {
            v1.w wVar2 = (v1.w) o0Var.get(i11);
            if (c(wVar2, m5, d0Var.L(), d0Var.u(), d0Var.v(), i10)) {
                return wVar2;
            }
        }
        if (o0Var.isEmpty() && wVar != null) {
            if (c(wVar, m5, d0Var.L(), d0Var.u(), d0Var.v(), i10)) {
                return wVar;
            }
        }
        return null;
    }

    public static boolean c(v1.w wVar, Object obj, boolean z9, int i10, int i11, int i12) {
        if (!wVar.f10559a.equals(obj)) {
            return false;
        }
        int i13 = wVar.f10560b;
        if ((!z9 || i13 != i10 || wVar.f10561c != i11) && (z9 || i13 != -1 || wVar.f10563e != i12)) {
            return false;
        }
        return true;
    }

    public final void a(q0 q0Var, v1.w wVar, e1 e1Var) {
        if (wVar == null) {
            return;
        }
        if (e1Var.b(wVar.f10559a) != -1) {
            q0Var.c(wVar, e1Var);
            return;
        }
        e1 e1Var2 = (e1) this.f6409c.get(wVar);
        if (e1Var2 != null) {
            q0Var.c(wVar, e1Var2);
        }
    }

    public final void d(e1 e1Var) {
        q0 a10 = r0.a();
        if (this.f6408b.isEmpty()) {
            a(a10, this.f6411e, e1Var);
            if (!q6.g.x(this.f6412f, this.f6411e)) {
                a(a10, this.f6412f, e1Var);
            }
            if (!q6.g.x(this.f6410d, this.f6411e) && !q6.g.x(this.f6410d, this.f6412f)) {
                a(a10, this.f6410d, e1Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f6408b.size(); i10++) {
                a(a10, (v1.w) this.f6408b.get(i10), e1Var);
            }
            if (!this.f6408b.contains(this.f6410d)) {
                a(a10, this.f6410d, e1Var);
            }
        }
        this.f6409c = a10.a();
    }
}
