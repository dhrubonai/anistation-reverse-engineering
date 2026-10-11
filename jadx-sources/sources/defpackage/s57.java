package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class s57 {
    public static final v57 b;
    public final v57 a;

    static {
        j57 d57Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            d57Var = new i57();
        } else if (i >= 35) {
            d57Var = new h57();
        } else if (i >= 34) {
            d57Var = new g57();
        } else if (i >= 31) {
            d57Var = new f57();
        } else if (i >= 30) {
            d57Var = new e57();
        } else {
            d57Var = new d57();
        }
        b = d57Var.b().a.a().a.b().a.c();
    }

    public s57(v57 v57Var) {
        this.a = v57Var;
    }

    public v57 a() {
        return this.a;
    }

    public v57 b() {
        return this.a;
    }

    public v57 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s57)) {
            return false;
        }
        s57 s57Var = (s57) obj;
        if (t() == s57Var.t() && s() == s57Var.s() && Objects.equals(n(), s57Var.n()) && Objects.equals(l(), s57Var.l()) && Objects.equals(h(), s57Var.h())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public th1 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public yz2 i(int i) {
        return yz2.e;
    }

    public yz2 j(int i) {
        if ((i & 8) == 0) {
            return yz2.e;
        }
        ze0.k("Unable to query the maximum insets for IME");
        return null;
    }

    public yz2 k() {
        return n();
    }

    public yz2 l() {
        return yz2.e;
    }

    public yz2 m() {
        return n();
    }

    public yz2 n() {
        return yz2.e;
    }

    public yz2 o() {
        return n();
    }

    public v57 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(v57 v57Var) {
    }

    public void p(View view) {
    }

    public void v(wh1 wh1Var) {
    }

    public void w(yz2[] yz2VarArr) {
    }

    public void x(yz2 yz2Var) {
    }

    public void y(v57 v57Var) {
    }

    public void z(int i) {
    }
}
