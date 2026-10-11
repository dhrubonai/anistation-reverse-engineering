package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y44 extends qt0 {
    public final ti4 y;
    public final ti4 z;

    public y44(Object obj) {
        super((byte) 6);
        this.y = xt5.g(obj);
        this.z = xt5.g(obj);
    }

    @Override // defpackage.qt0
    public final void B(Object obj) {
        this.y.setValue(obj);
    }

    public final boolean M() {
        if (a34.i(this.y.getValue(), this.z.getValue()) && !((Boolean) ((ti4) this.x).getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qt0
    public final Object v() {
        return this.y.getValue();
    }

    @Override // defpackage.qt0
    public final Object x() {
        return this.z.getValue();
    }
}
