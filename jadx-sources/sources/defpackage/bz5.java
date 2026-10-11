package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class bz5 {
    public static final Set a;

    static {
        bm6 bm6Var = bm6.a;
        gm6 gm6Var = gm6.a;
        wl6 wl6Var = wl6.a;
        om6 om6Var = om6.a;
        a = ms.U0(new aj5[]{bm6.b, gm6.b, wl6.b, om6.b});
    }

    public static final boolean a(aj5 aj5Var) {
        aj5Var.getClass();
        if (aj5Var.isInline() && a.contains(aj5Var)) {
            return true;
        }
        return false;
    }
}
