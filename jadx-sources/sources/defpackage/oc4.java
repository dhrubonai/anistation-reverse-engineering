package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc4 {
    public final g33 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public oc4(g33 g33Var, int[] iArr, String[] strArr) {
        boolean z;
        Set set;
        g33Var.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = g33Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                set = te4.O(strArr[0]);
            } else {
                set = tt1.x;
            }
            this.d = set;
            return;
        }
        ze0.m("Check failed.");
        throw null;
    }
}
