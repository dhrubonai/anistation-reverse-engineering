package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cc7 extends in7 {
    public final gu7 a;
    public final qx7 b;

    public cc7(gu7 gu7Var) {
        a34.x(gu7Var);
        this.a = gu7Var;
        qx7 qx7Var = gu7Var.J;
        gu7.k(qx7Var);
        this.b = qx7Var;
    }

    @Override // defpackage.rx7
    public final String a() {
        py7 py7Var = ((gu7) this.b.x).I;
        gu7.k(py7Var);
        dy7 dy7Var = py7Var.z;
        if (dy7Var != null) {
            return dy7Var.a;
        }
        return null;
    }

    @Override // defpackage.rx7
    public final String b() {
        py7 py7Var = ((gu7) this.b.x).I;
        gu7.k(py7Var);
        dy7 dy7Var = py7Var.z;
        if (dy7Var != null) {
            return dy7Var.b;
        }
        return null;
    }

    @Override // defpackage.rx7
    public final void c(Bundle bundle) {
        qx7 qx7Var = this.b;
        ((gu7) qx7Var.x).H.getClass();
        qx7Var.Y(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.rx7
    public final void d(String str) {
        gu7 gu7Var = this.a;
        io7 io7Var = gu7Var.K;
        gu7.i(io7Var);
        gu7Var.H.getClass();
        io7Var.N(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.rx7
    public final void e(String str, String str2, Bundle bundle) {
        this.b.P(str, str2, bundle);
    }

    @Override // defpackage.rx7
    public final void f(String str) {
        gu7 gu7Var = this.a;
        io7 io7Var = gu7Var.K;
        gu7.i(io7Var);
        gu7Var.H.getClass();
        io7Var.M(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.rx7
    public final long g() {
        i28 i28Var = this.a.F;
        gu7.j(i28Var);
        return i28Var.J0();
    }

    @Override // defpackage.rx7
    public final void h(String str, String str2, Bundle bundle) {
        qx7 qx7Var = this.a.J;
        gu7.k(qx7Var);
        qx7Var.Z(str, str2, bundle);
    }

    @Override // defpackage.rx7
    public final List i(String str, String str2) {
        qx7 qx7Var = this.b;
        gu7 gu7Var = (gu7) qx7Var.x;
        au7 au7Var = gu7Var.D;
        es7 es7Var = gu7Var.C;
        gu7.l(au7Var);
        if (au7Var.R()) {
            gu7.l(es7Var);
            es7Var.C.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (og5.b()) {
            gu7.l(es7Var);
            es7Var.C.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.V(atomicReference, 5000L, "get conditional user properties", new w47(qx7Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            gu7.l(es7Var);
            es7Var.C.b(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return i28.F0(list);
    }

    @Override // defpackage.rx7
    public final int j(String str) {
        qx7 qx7Var = this.b;
        qx7Var.getClass();
        a34.u(str);
        ak7 ak7Var = ((gu7) qx7Var.x).A;
        return 25;
    }

    @Override // defpackage.rx7
    public final String k() {
        return (String) this.b.D.get();
    }

    @Override // defpackage.rx7
    public final String l() {
        return this.b.a0();
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, so5] */
    @Override // defpackage.rx7
    public final Map m(String str, String str2, boolean z) {
        qx7 qx7Var = this.b;
        gu7 gu7Var = (gu7) qx7Var.x;
        au7 au7Var = gu7Var.D;
        es7 es7Var = gu7Var.C;
        gu7.l(au7Var);
        if (au7Var.R()) {
            gu7.l(es7Var);
            es7Var.C.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (og5.b()) {
            gu7.l(es7Var);
            es7Var.C.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.V(atomicReference, 5000L, "get user properties", new pw7(qx7Var, atomicReference, str, str2, z));
        List<e28> list = (List) atomicReference.get();
        if (list == null) {
            gu7.l(es7Var);
            es7Var.C.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? so5Var = new so5(list.size());
        for (e28 e28Var : list) {
            Object c = e28Var.c();
            if (c != null) {
                so5Var.put(e28Var.y, c);
            }
        }
        return so5Var;
    }
}
