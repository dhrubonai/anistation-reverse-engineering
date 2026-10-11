package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w33 extends ho6 {
    public final Object y;
    public boolean z;

    public w33(Object obj) {
        super((byte) 0);
        this.y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.z) {
            this.z = true;
            return this.y;
        }
        qi2.e();
        return null;
    }
}
