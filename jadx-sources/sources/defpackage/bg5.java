package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bg5 extends e85 {
    public final /* synthetic */ ue0 E;
    public final /* synthetic */ fj4 F;
    public final /* synthetic */ v41 G;

    public bg5(ue0 ue0Var, fj4 fj4Var, v41 v41Var) {
        this.E = ue0Var;
        this.F = fj4Var;
        this.G = v41Var;
    }

    @Override // defpackage.e85
    public final Object d() {
        fj4 fj4Var = this.F;
        ue0 ue0Var = this.E;
        iy5 iy5Var = new iy5(ue0Var);
        ij3.h.getAndIncrement();
        iy5Var.y = 0L;
        t41 t41Var = new t41(iy5Var, this.G);
        try {
            t41Var.a();
            Uri uri = ue0Var.F;
            uri.getClass();
            Object d = fj4Var.d(uri, t41Var);
            eq6.h(t41Var);
            d.getClass();
            return (gm2) d;
        } catch (Throwable th) {
            eq6.h(t41Var);
            throw th;
        }
    }
}
