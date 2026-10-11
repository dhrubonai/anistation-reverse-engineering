package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h67 implements g67 {
    public final vd1 b;

    public h67() {
        vd1 vd1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            vd1Var = wd1.x;
        } else {
            vd1Var = h95.C;
        }
        this.b = vd1Var;
        te4.n(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
