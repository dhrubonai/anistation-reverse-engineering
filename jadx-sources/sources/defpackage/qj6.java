package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qj6 extends pj6 {
    public final /* synthetic */ byte A;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i = this.z;
                this.z = i + 2;
                Object[] objArr = this.x;
                return new dn3(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.z;
                this.z = i2 + 2;
                return this.x[i2];
            default:
                int i3 = this.z;
                this.z = i3 + 2;
                return this.x[i3 + 1];
        }
    }
}
