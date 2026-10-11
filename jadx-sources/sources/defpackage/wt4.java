package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class wt4 extends xo0 {
    public final vt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt4(x73 x73Var) {
        super(x73Var);
        x73Var.getClass();
        this.b = new vt4(x73Var.getDescriptor());
    }

    @Override // defpackage.n0
    public final Object a() {
        return (ut4) h(k());
    }

    @Override // defpackage.n0
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.n0, defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        return merge(l61Var, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.b;
    }

    public Object k() {
        return new boolean[0];
    }

    public void l(hu0 hu0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        hu0Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).p(this.b, i2, zArr[i2]);
        }
    }

    @Override // defpackage.xo0, defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        int e = e(obj);
        vt4 vt4Var = this.b;
        hu0 c = wt1Var.c(vt4Var);
        l(c, obj, e);
        c.a(vt4Var);
    }
}
