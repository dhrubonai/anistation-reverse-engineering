package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ye4 extends fg4 {
    public static final ye4 c = new fg4(0, 2, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        int i = ((h13) fm0Var.h(0)).a;
        List list = (List) fm0Var.h(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            nrVar.i(i3, obj);
            nrVar.q(i3, obj);
        }
    }
}
