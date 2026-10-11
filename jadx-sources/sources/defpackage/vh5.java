package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vh5 {
    public final ph5 a;
    public final t34 b;

    public vh5(uh5 uh5Var, a13 a13Var) {
        this.a = uh5Var.d;
        List j = uh5.j(4, uh5Var);
        this.b = new t34(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            uh5 uh5Var2 = (uh5) j.get(i);
            if (a13Var.a(uh5Var2.f)) {
                this.b.a(uh5Var2.f);
            }
        }
    }
}
