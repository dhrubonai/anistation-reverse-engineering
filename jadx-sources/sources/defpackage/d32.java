package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class d32 implements ni5 {
    public final ni5 a;
    public final boolean b;
    public final ub2 c;

    public d32(ni5 ni5Var, boolean z, ub2 ub2Var) {
        ub2Var.getClass();
        this.a = ni5Var;
        this.b = z;
        this.c = ub2Var;
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        return new c32(this);
    }
}
