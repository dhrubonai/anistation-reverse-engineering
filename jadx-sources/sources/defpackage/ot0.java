package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ot0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bx5) obj).l(null);
                return;
            case 1:
                jb6 jb6Var = (jb6) obj;
                if (jb6Var != null) {
                    uf3 uf3Var = jb6Var.d;
                    if (uf3Var != null) {
                        uf3Var.e(nd6.b);
                    }
                    uf3 uf3Var2 = jb6Var.d;
                    if (uf3Var2 != null) {
                        uf3Var2.f(nd6.b);
                        return;
                    }
                    return;
                }
                return;
            default:
                gi6 gi6Var = (gi6) obj;
                ic6 ic6Var = gi6Var.a;
                ic6Var.b.a().n();
                o96 o96Var = ic6Var.b;
                o96Var.F = null;
                gi6Var.l(o96Var);
                ic6Var.b(true, ia6.x);
                ic6Var.f(true);
                ic6Var.e(ic6Var.b.A);
                return;
        }
    }
}
