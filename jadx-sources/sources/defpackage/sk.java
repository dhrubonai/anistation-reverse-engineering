package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sk implements j61 {
    public final boolean a;

    public sk() {
        boolean z;
        if (Build.VERSION.SDK_INT < 34) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.j61
    public final k61 a(ev5 ev5Var, mg4 mg4Var) {
        db0 o0 = ev5Var.a.o0();
        if (!o0.r(0L, i61.b) && !o0.r(0L, i61.a) && (!o0.r(0L, i61.c) || !o0.r(8L, i61.d) || !o0.r(12L, i61.e) || !o0.g(21L) || ((byte) (o0.c().p(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT >= 30 && o0.r(4L, i61.f)) {
                if (!o0.r(8L, i61.g) && !o0.r(8L, i61.h) && !o0.r(8L, i61.i)) {
                    return null;
                }
            } else {
                return null;
            }
        }
        return new wk(ev5Var.a, mg4Var, this.a);
    }
}
