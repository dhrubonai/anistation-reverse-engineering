package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o46 extends f03 {
    public ub2 O;
    public z57 P;

    @Override // defpackage.a03, defpackage.xz3
    public final void S0() {
        View E = jf7.E(this);
        WeakHashMap weakHashMap = z57.w;
        z57 d = mv5.d(E);
        d.a(E);
        t47 t47Var = (t47) this.O.invoke(d);
        if (!a34.i(t47Var, this.N)) {
            this.N = t47Var;
            b1();
        }
        this.P = d;
        super.S0();
    }

    @Override // defpackage.a03, defpackage.xz3
    public final void T0() {
        View E = jf7.E(this);
        z57 z57Var = this.P;
        if (z57Var != null) {
            int i = z57Var.u - 1;
            z57Var.u = i;
            if (i == 0) {
                int i2 = pv6.a;
                kv6.b(E, null);
                c57.a(E, null);
                E.removeOnAttachStateChangeListener(z57Var.v);
            }
        }
        super.T0();
    }
}
