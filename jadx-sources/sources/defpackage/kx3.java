package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kx3 {
    public final lr0 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public kx3(lr0 lr0Var) {
        this.a = lr0Var;
    }

    public final void a(qx3 qx3Var) {
        this.b.remove(qx3Var);
        jx3 jx3Var = (jx3) this.c.remove(qx3Var);
        if (jx3Var != null) {
            jx3Var.a.b(jx3Var.b);
            jx3Var.b = null;
        }
        this.a.run();
    }
}
