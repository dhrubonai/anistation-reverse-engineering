package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c03 extends po0 implements Runnable, nd4, View.OnAttachStateChangeListener {
    public boolean A;
    public boolean B;
    public v57 C;
    public final z57 z;

    public c03(z57 z57Var) {
        super(!z57Var.t ? 1 : 0);
        this.z = z57Var;
    }

    @Override // defpackage.po0
    public final void d(c57 c57Var) {
        this.A = false;
        this.B = false;
        v57 v57Var = this.C;
        if (c57Var.a.b() > 0 && v57Var != null) {
            s57 s57Var = v57Var.a;
            z57 z57Var = this.z;
            z57Var.s.f(ov5.h(s57Var.i(8)));
            z57Var.r.f(ov5.h(s57Var.i(8)));
            z57.b(z57Var, v57Var);
        }
        this.C = null;
    }

    @Override // defpackage.po0
    public final void e(c57 c57Var) {
        this.A = true;
        this.B = true;
    }

    @Override // defpackage.po0
    public final v57 f(v57 v57Var, List list) {
        z57 z57Var = this.z;
        z57.b(z57Var, v57Var);
        if (z57Var.t) {
            return v57.b;
        }
        return v57Var;
    }

    @Override // defpackage.po0
    public final l33 g(c57 c57Var, l33 l33Var) {
        this.A = false;
        return l33Var;
    }

    @Override // defpackage.nd4
    public final v57 i(View view, v57 v57Var) {
        this.C = v57Var;
        z57 z57Var = this.z;
        xq6 xq6Var = z57Var.r;
        s57 s57Var = v57Var.a;
        xq6Var.f(ov5.h(s57Var.i(8)));
        if (this.A) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.B) {
            z57Var.s.f(ov5.h(s57Var.i(8)));
            z57.b(z57Var, v57Var);
        }
        if (z57Var.t) {
            return v57.b;
        }
        return v57Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A) {
            this.A = false;
            this.B = false;
            v57 v57Var = this.C;
            if (v57Var != null) {
                z57 z57Var = this.z;
                z57Var.s.f(ov5.h(v57Var.a.i(8)));
                z57.b(z57Var, v57Var);
                this.C = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
