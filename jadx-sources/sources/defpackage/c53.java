package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c53 implements x73 {
    public static final c53 a = new Object();
    public static final b53 b = b53.b;

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        db.p(l61Var);
        return new a53((List) new ds(u53.a, (byte) 0).merge(l61Var, null));
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        a53 a53Var = (a53) obj;
        a53Var.getClass();
        db.q(wt1Var);
        u53 u53Var = u53.a;
        zr zrVar = new zr(u53Var.getDescriptor());
        int size = a53Var.size();
        hu0 c = wt1Var.c(zrVar);
        Iterator<q53> it = a53Var.iterator();
        for (int i = 0; i < size; i++) {
            ((v0) c).v(zrVar, i, u53Var, it.next());
        }
        c.a(zrVar);
    }
}
