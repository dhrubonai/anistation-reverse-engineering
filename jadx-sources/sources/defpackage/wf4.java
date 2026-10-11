package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wf4 extends fg4 {
    public static final wf4 c = new fg4(0, 1, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        ok4 ok4Var;
        zz4 zz4Var = (zz4) fm0Var.h(0);
        p44 p44Var = (p44) b25Var.j;
        if (p44Var != null) {
            ok4Var = (ok4) p44Var.g(zz4Var);
        } else {
            ok4Var = null;
        }
        if (ok4Var != null) {
            ArrayList arrayList = (ArrayList) b25Var.k;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b25Var.k = arrayList;
            }
            arrayList.add((z44) b25Var.d);
            b25Var.d = ok4Var.y;
        }
    }
}
