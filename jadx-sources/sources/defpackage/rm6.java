package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rm6 implements nr {
    public final Object x;
    public final ArrayList y = new ArrayList();
    public Object z;

    public rm6(za3 za3Var) {
        this.x = za3Var;
        this.z = za3Var;
    }

    public final void a() {
        this.y.clear();
        this.z = this.x;
        ((za3) this.x).Q();
    }

    @Override // defpackage.nr
    public final Object h() {
        return this.z;
    }

    @Override // defpackage.nr
    public final void i(int i, Object obj) {
        ((za3) this.z).C(i, (za3) obj);
    }

    @Override // defpackage.nr
    public final void j(Object obj) {
        this.y.add(this.z);
        this.z = obj;
    }

    @Override // defpackage.nr
    public final void k() {
        p05 rectManager;
        r9 m158getAutofillManager;
        p05 rectManager2;
        za3 za3Var = (za3) this.z;
        kf kfVar = za3Var.c0;
        if (!za3Var.I()) {
            ez2.a("onReuse is only expected on attached node");
        }
        sv6 sv6Var = za3Var.L;
        if (sv6Var != null) {
            View view = sv6Var.y;
            if (view.getParent() != sv6Var) {
                sv6Var.addView(view);
            } else {
                sv6Var.C.invoke();
            }
        }
        mb3 mb3Var = za3Var.e0;
        if (mb3Var != null) {
            mb3Var.i(false);
        }
        za3Var.Q = false;
        if (za3Var.n0) {
            za3Var.n0 = false;
        } else {
            xz3 xz3Var = (z66) za3Var.c0.C;
            for (xz3 xz3Var2 = xz3Var; xz3Var2 != null; xz3Var2 = xz3Var2.B) {
                if (xz3Var2.K) {
                    xz3Var2.V0();
                }
            }
            for (xz3 xz3Var3 = xz3Var; xz3Var3 != null; xz3Var3 = xz3Var3.B) {
                if (xz3Var3.K) {
                    xz3Var3.X0();
                }
            }
            while (xz3Var != null) {
                if (xz3Var.K) {
                    xz3Var.R0();
                }
                xz3Var = xz3Var.B;
            }
        }
        int i = za3Var.y;
        kh4 kh4Var = za3Var.K;
        if (kh4Var != null && (rectManager2 = ((oa) kh4Var).getRectManager()) != null) {
            rectManager2.h(za3Var);
        }
        za3Var.y = rh5.a.addAndGet(1);
        kh4 kh4Var2 = za3Var.K;
        if (kh4Var2 != null) {
            oa oaVar = (oa) kh4Var2;
            oaVar.getLayoutNodes().g(i);
            oaVar.getLayoutNodes().h(za3Var.y, za3Var);
        }
        for (xz3 xz3Var4 = (xz3) kfVar.D; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
            xz3Var4.Q0();
        }
        kfVar.i();
        if (kfVar.g(8)) {
            za3Var.G();
        }
        za3.X(za3Var);
        kh4 kh4Var3 = za3Var.K;
        if (kh4Var3 != null && (m158getAutofillManager = ((oa) kh4Var3).m158getAutofillManager()) != null) {
            oa oaVar2 = m158getAutofillManager.z;
            y23 y23Var = m158getAutofillManager.x;
            t34 t34Var = m158getAutofillManager.E;
            if (t34Var.e(i)) {
                y23Var.Z(oaVar2, i, false);
            }
            ph5 x = za3Var.x();
            if (x != null && x.x.b(yh5.r)) {
                t34Var.a(za3Var.y);
                y23Var.Z(oaVar2, za3Var.y, true);
            }
        }
        kh4 kh4Var4 = za3Var.K;
        if (kh4Var4 != null && (rectManager = ((oa) kh4Var4).getRectManager()) != null) {
            rectManager.g(za3Var);
        }
    }

    @Override // defpackage.nr
    public final void l(int i, int i2, int i3) {
        ((za3) this.z).M(i, i2, i3);
    }

    @Override // defpackage.nr
    public final void n(int i, int i2) {
        ((za3) this.z).R(i, i2);
    }

    @Override // defpackage.nr
    public final void p() {
        this.z = this.y.remove(r0.size() - 1);
    }

    @Override // defpackage.nr
    public final void q(int i, Object obj) {
    }

    @Override // defpackage.nr
    public final void r() {
        kh4 kh4Var = ((za3) this.x).K;
        if (kh4Var != null) {
            ((oa) kh4Var).t();
        }
    }
}
