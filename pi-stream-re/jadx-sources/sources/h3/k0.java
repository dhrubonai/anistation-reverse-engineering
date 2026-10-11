package h3;

import java.util.List;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4818a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.g0[] f4819b;

    public k0(List list) {
        this.f4818a = list;
        this.f4819b = new d2.g0[list.size()];
    }

    public final void a(long j4, f1.t tVar) {
        if (tVar.f3860c - tVar.f3859b < 9) {
            return;
        }
        int f10 = tVar.f();
        int f11 = tVar.f();
        int v9 = tVar.v();
        if (f10 == 434 && f11 == 1195456820 && v9 == 3) {
            j5.a.j(j4, tVar, this.f4819b);
        }
    }

    public final void b(d2.r rVar, i0 i0Var) {
        boolean z9;
        int i10 = 0;
        while (true) {
            d2.g0[] g0VarArr = this.f4819b;
            if (i10 < g0VarArr.length) {
                i0Var.a();
                i0Var.b();
                d2.g0 i11 = rVar.i(i0Var.f4809d, 3);
                c1.v vVar = (c1.v) this.f4818a.get(i10);
                String str = vVar.f1935m;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                w7.b.f("Invalid closed caption MIME type provided: " + str, z9);
                c1.u uVar = new c1.u();
                i0Var.b();
                uVar.f1897a = i0Var.f4810e;
                uVar.e(str);
                uVar.f1901e = vVar.f1927e;
                uVar.f1900d = vVar.f1926d;
                uVar.D = vVar.E;
                uVar.f1910n = vVar.o;
                i11.b(new c1.v(uVar));
                g0VarArr[i10] = i11;
                i10++;
            } else {
                return;
            }
        }
    }
}
