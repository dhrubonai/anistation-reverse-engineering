package v1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class d1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final h1.l f10392h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.g f10393i;

    /* renamed from: j, reason: collision with root package name */
    public final c1.v f10394j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10395k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.q0 f10396l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10397m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f10398n;
    public final c1.k0 o;

    /* renamed from: p, reason: collision with root package name */
    public h1.e0 f10399p;

    public d1(String str, c1.j0 j0Var, h1.g gVar, androidx.lifecycle.q0 q0Var, boolean z9, q0.i iVar) {
        this.f10393i = gVar;
        this.f10396l = q0Var;
        this.f10397m = z9;
        c1.y yVar = new c1.y();
        yVar.f1953b = Uri.EMPTY;
        Uri uri = j0Var.f1728a;
        String uri2 = uri.toString();
        uri2.getClass();
        yVar.f1952a = uri2;
        yVar.f1958g = r6.o0.j(r6.o0.o(j0Var));
        yVar.f1959h = iVar;
        c1.k0 a10 = yVar.a();
        this.o = a10;
        c1.u uVar = new c1.u();
        String str2 = j0Var.f1729b;
        uVar.e(str2 == null ? "text/x-unknown" : str2);
        uVar.f1900d = j0Var.f1730c;
        uVar.f1901e = j0Var.f1731d;
        uVar.f1902f = j0Var.f1732e;
        uVar.f1898b = j0Var.f1733f;
        String str3 = j0Var.f1734g;
        uVar.f1897a = str3 == null ? str : str3;
        this.f10394j = new c1.v(uVar);
        Map emptyMap = Collections.emptyMap();
        w7.b.x(uri, "The uri must be set.");
        this.f10392h = new h1.l(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f10398n = new z0(-9223372036854775807L, true, false, a10);
    }

    @Override // v1.a
    public final u b(w wVar, z1.d dVar, long j4) {
        return new c1(this.f10392h, this.f10393i, this.f10399p, this.f10394j, this.f10395k, this.f10396l, a(wVar), this.f10397m);
    }

    @Override // v1.a
    public final c1.k0 h() {
        return this.o;
    }

    @Override // v1.a
    public final void j() {
    }

    @Override // v1.a
    public final void l(h1.e0 e0Var) {
        this.f10399p = e0Var;
        m(this.f10398n);
    }

    @Override // v1.a
    public final void n(u uVar) {
        ((c1) uVar).f10383z.f(null);
    }

    @Override // v1.a
    public final void p() {
    }
}
