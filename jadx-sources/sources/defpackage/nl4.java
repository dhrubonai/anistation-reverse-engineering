package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nl4 extends s1 {
    public final nj6 A;
    public final Object[] z;

    public nl4(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.z = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.A = new nj6(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            nj6 nj6Var = this.A;
            if (nj6Var.hasNext()) {
                this.x++;
                return nj6Var.next();
            }
            int i = this.x;
            this.x = i + 1;
            return this.z[i - nj6Var.y];
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.x;
            nj6 nj6Var = this.A;
            int i2 = nj6Var.y;
            if (i > i2) {
                int i3 = i - 1;
                this.x = i3;
                return this.z[i3 - i2];
            }
            this.x = i - 1;
            return nj6Var.previous();
        }
        qi2.e();
        return null;
    }
}
