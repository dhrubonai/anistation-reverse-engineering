package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w21 implements vi6 {
    public final aj6 a;
    public final kv2 b;
    public final int c;

    public w21(aj6 aj6Var, kv2 kv2Var, int i) {
        this.a = aj6Var;
        this.b = kv2Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        ze0.k("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.vi6
    public final void a() {
        Drawable drawable;
        boolean z;
        aj6 aj6Var = this.a;
        Drawable drawable2 = aj6Var.getDrawable();
        kv2 kv2Var = this.b;
        mu2 a = kv2Var.a();
        if (a != null) {
            drawable = sw0.f(a, aj6Var.getView().getResources());
        } else {
            drawable = null;
        }
        xa5 xa5Var = kv2Var.b().p;
        boolean z2 = kv2Var instanceof o26;
        if (z2 && ((o26) kv2Var).g) {
            z = false;
        } else {
            z = true;
        }
        q21 q21Var = new q21(drawable2, drawable, xa5Var, this.c, z);
        if (z2) {
            aj6Var.onSuccess(sw0.g(q21Var));
        } else if (kv2Var instanceof jw1) {
            aj6Var.onError(sw0.g(q21Var));
        } else {
            ze0.l();
        }
    }
}
