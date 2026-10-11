package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hn6 {
    public final int a;
    public final zt5 b;
    public final zt5 c;

    public hn6(int i, List list, List list2) {
        boolean z;
        this.a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hz2.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            hz2.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        zt5 zt5Var = new zt5();
        zt5Var.addAll(list);
        this.b = zt5Var;
        zt5 zt5Var2 = new zt5();
        zt5Var2.addAll(list2);
        this.c = zt5Var2;
    }
}
