package g0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class i2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f4219b;

    /* renamed from: a, reason: collision with root package name */
    public final k2 f4220a;

    static {
        c2 z1Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            z1Var = new b2();
        } else if (i10 >= 29) {
            z1Var = new a2();
        } else {
            z1Var = new z1();
        }
        f4219b = z1Var.b().f4227a.a().f4227a.b().f4227a.c();
    }

    public i2(k2 k2Var) {
        this.f4220a = k2Var;
    }

    public k2 a() {
        return this.f4220a;
    }

    public k2 b() {
        return this.f4220a;
    }

    public k2 c() {
        return this.f4220a;
    }

    public void d(View view) {
    }

    public j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        if (n() == i2Var.n() && m() == i2Var.m() && f0.b.a(j(), i2Var.j()) && f0.b.a(h(), i2Var.h()) && f0.b.a(e(), i2Var.e())) {
            return true;
        }
        return false;
    }

    public z.d f(int i10) {
        return z.d.f11855e;
    }

    public z.d g() {
        return j();
    }

    public z.d h() {
        return z.d.f11855e;
    }

    public int hashCode() {
        return f0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public z.d i() {
        return j();
    }

    public z.d j() {
        return z.d.f11855e;
    }

    public z.d k() {
        return j();
    }

    public k2 l(int i10, int i11, int i12, int i13) {
        return f4219b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(z.d[] dVarArr) {
    }

    public void p(k2 k2Var) {
    }

    public void q(z.d dVar) {
    }
}
