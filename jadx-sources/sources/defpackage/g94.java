package defpackage;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g94 implements gx0 {
    public final ConnectivityManager a;

    public g94(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.gx0
    public final boolean a(z77 z77Var) {
        if (!c(z77Var)) {
            return false;
        }
        ze0.m("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.gx0
    public final vf0 b(qx0 qx0Var) {
        qx0Var.getClass();
        return new vf0(new e0(qx0Var, this, null, (byte) 27), it1.x, -2, ta0.x);
    }

    @Override // defpackage.gx0
    public final boolean c(z77 z77Var) {
        z77Var.getClass();
        if (z77Var.j.a() == null && z77Var.j.a == k94.x) {
            return false;
        }
        return true;
    }
}
