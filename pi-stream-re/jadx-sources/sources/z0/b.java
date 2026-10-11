package z0;

import a5.e;
import android.os.Bundle;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.u;
import i4.v;

/* loaded from: classes.dex */
public final class b extends c0 implements a1.c {

    /* renamed from: n, reason: collision with root package name */
    public final a1.b f11880n;
    public u o;

    /* renamed from: p, reason: collision with root package name */
    public v f11881p;

    /* renamed from: l, reason: collision with root package name */
    public final int f11878l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f11879m = null;

    /* renamed from: q, reason: collision with root package name */
    public a1.b f11882q = null;

    public b(e eVar) {
        this.f11880n = eVar;
        if (eVar.f18b == null) {
            eVar.f18b = this;
            eVar.f17a = 0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // androidx.lifecycle.c0
    public final void f() {
        a1.b bVar = this.f11880n;
        bVar.f19c = true;
        bVar.f21e = false;
        bVar.f20d = false;
        e eVar = (e) bVar;
        eVar.f101j.drainPermits();
        eVar.a();
        eVar.f24h = new a1.a(eVar);
        eVar.b();
    }

    @Override // androidx.lifecycle.c0
    public final void g() {
        this.f11880n.f19c = false;
    }

    @Override // androidx.lifecycle.c0
    public final void i(d0 d0Var) {
        super.i(d0Var);
        this.o = null;
        this.f11881p = null;
    }

    @Override // androidx.lifecycle.c0
    public final void j(Object obj) {
        super.j(obj);
        a1.b bVar = this.f11882q;
        if (bVar != null) {
            bVar.f21e = true;
            bVar.f19c = false;
            bVar.f20d = false;
            bVar.f22f = false;
            this.f11882q = null;
        }
    }

    public final void k() {
        u uVar = this.o;
        v vVar = this.f11881p;
        if (uVar != null && vVar != null) {
            super.i(vVar);
            e(uVar, vVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f11878l);
        sb.append(" : ");
        w7.b.e(this.f11880n, sb);
        sb.append("}}");
        return sb.toString();
    }
}
