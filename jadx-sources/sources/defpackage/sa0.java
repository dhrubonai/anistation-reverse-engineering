package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sa0 extends s1 {
    public final Object A;
    public final /* synthetic */ byte z = 1;

    public sa0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.A = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.z;
        Object obj = this.A;
        switch (b) {
            case 0:
                if (hasNext()) {
                    int i = this.x;
                    this.x = i + 1;
                    return ((Object[]) obj)[i];
                }
                qi2.e();
                return null;
            default:
                if (hasNext()) {
                    this.x++;
                    return obj;
                }
                qi2.e();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.z;
        Object obj = this.A;
        switch (b) {
            case 0:
                if (hasPrevious()) {
                    int i = this.x - 1;
                    this.x = i;
                    return ((Object[]) obj)[i];
                }
                qi2.e();
                return null;
            default:
                if (hasPrevious()) {
                    this.x--;
                    return obj;
                }
                qi2.e();
                return null;
        }
    }

    public sa0(Object obj, int i) {
        super(i, 1);
        this.A = obj;
    }
}
