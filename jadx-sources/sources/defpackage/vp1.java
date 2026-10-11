package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vp1 implements xp1 {
    @Override // defpackage.xp1
    public final qp1 b(tp1 tp1Var, ea2 ea2Var) {
        if (ea2Var.t == null) {
            return null;
        }
        return new kw1(new pp1(new Exception(), 6001));
    }

    @Override // defpackage.xp1
    public final int e(ea2 ea2Var) {
        if (ea2Var.t != null) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.xp1
    public final void d(Looper looper, cp4 cp4Var) {
    }
}
