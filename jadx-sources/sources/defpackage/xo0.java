package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class xo0 extends n0 {
    public final x73 a;

    public xo0(x73 x73Var) {
        this.a = x73Var;
    }

    @Override // defpackage.n0
    public void g(int i, gu0 gu0Var, Object obj) {
        j(i, obj, gu0Var.p(getDescriptor(), i, this.a, null));
    }

    public void j(int i, Object obj, Object obj2) {
        ((ut4) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // defpackage.mj5
    public void serialize(wt1 wt1Var, Object obj) {
        int e = e(obj);
        aj5 descriptor = getDescriptor();
        descriptor.getClass();
        hu0 c = wt1Var.c(descriptor);
        Iterator d = d(obj);
        for (int i = 0; i < e; i++) {
            ((v0) c).v(getDescriptor(), i, this.a, d.next());
        }
        c.a(descriptor);
    }
}
