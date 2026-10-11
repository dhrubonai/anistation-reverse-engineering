package j3;

import android.view.TextureView;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import c1.c1;
import c1.e1;
import c1.k1;
import c1.m1;
import c1.p1;
import c1.v0;
import c1.w0;
import c1.x0;
import c1.y0;
import c1.z0;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements x0, View.OnLayoutChangeListener, View.OnClickListener, w, m {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f6009a = new c1();

    /* renamed from: b, reason: collision with root package name */
    public Object f6010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f6011c;

    public f0(i0 i0Var) {
        this.f6011c = i0Var;
    }

    @Override // c1.x0
    public final /* synthetic */ void C(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void E(int i10, int i11) {
    }

    @Override // c1.x0
    public final /* synthetic */ void G(j1.m mVar) {
    }

    @Override // c1.x0
    public final /* synthetic */ void H(k1 k1Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void I() {
    }

    @Override // c1.x0
    public final void J(p1 p1Var) {
        i0 i0Var;
        z0 z0Var;
        if (!p1Var.equals(p1.f1878e) && (z0Var = (i0Var = this.f6011c).D) != null && ((j1.d0) z0Var).G() != 1) {
            i0Var.h();
        }
    }

    @Override // c1.x0
    public final /* synthetic */ void K(c1.k0 k0Var, int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void M(c1.n0 n0Var) {
    }

    @Override // c1.x0
    public final void N(m1 m1Var) {
        e1 e1Var;
        i0 i0Var = this.f6011c;
        z0 z0Var = i0Var.D;
        z0Var.getClass();
        c1.i iVar = (c1.i) z0Var;
        if (iVar.d(17)) {
            e1Var = ((j1.d0) iVar).A();
        } else {
            e1Var = e1.f1676a;
        }
        if (e1Var.q()) {
            this.f6010b = null;
        } else {
            boolean d10 = iVar.d(30);
            c1 c1Var = this.f6009a;
            if (d10) {
                j1.d0 d0Var = (j1.d0) iVar;
                if (!d0Var.B().f1836a.isEmpty()) {
                    this.f6010b = e1Var.g(d0Var.x(), c1Var, true).f1642b;
                }
            }
            Object obj = this.f6010b;
            if (obj != null) {
                int b10 = e1Var.b(obj);
                if (b10 != -1) {
                    if (((j1.d0) iVar).w() == e1Var.g(b10, c1Var, false).f1643c) {
                        return;
                    }
                }
                this.f6010b = null;
            }
        }
        i0Var.l(false);
    }

    @Override // c1.x0
    public final /* synthetic */ void Q(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void a(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void b(c1.n nVar) {
    }

    @Override // c1.x0
    public final /* synthetic */ void c(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void d(w0 w0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void e(j1.m mVar) {
    }

    @Override // c1.x0
    public final void f(int i10, y0 y0Var, y0 y0Var2) {
        x xVar;
        i0 i0Var = this.f6011c;
        if (i0Var.b() && i0Var.N && (xVar = i0Var.A) != null) {
            xVar.g();
        }
    }

    @Override // c1.x0
    public final /* synthetic */ void h() {
    }

    @Override // c1.x0
    public final /* synthetic */ void j(v0 v0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void k(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void m(boolean z9) {
    }

    @Override // c1.x0
    public final void n() {
        View view = this.f6011c.f6019c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // c1.x0
    public final void o(e1.c cVar) {
        SubtitleView subtitleView = this.f6011c.f6023x;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f3364a);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f6011c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        i0.a((TextureView) view, this.f6011c.P);
    }

    @Override // c1.x0
    public final /* synthetic */ void p(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void r(c1.p0 p0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void s(List list) {
    }

    @Override // c1.x0
    public final /* synthetic */ void t(int i10, boolean z9) {
    }

    @Override // c1.x0
    public final void u(int i10, boolean z9) {
        i0 i0Var = this.f6011c;
        i0Var.i();
        if (i0Var.b() && i0Var.N) {
            x xVar = i0Var.A;
            if (xVar != null) {
                xVar.g();
                return;
            }
            return;
        }
        i0Var.c(false);
    }

    @Override // c1.x0
    public final /* synthetic */ void v(float f10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void x(c1.t0 t0Var) {
    }

    @Override // c1.x0
    public final void z(int i10) {
        i0 i0Var = this.f6011c;
        i0Var.i();
        i0Var.k();
        if (i0Var.b() && i0Var.N) {
            x xVar = i0Var.A;
            if (xVar != null) {
                xVar.g();
                return;
            }
            return;
        }
        i0Var.c(false);
    }
}
