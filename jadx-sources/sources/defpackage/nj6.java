package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nj6 extends s1 {
    public Object[] A;
    public boolean B;
    public int z;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public nj6(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        this.z = i3;
        Object[] objArr2 = new Object[i3];
        this.A = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.B = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.x & 31;
        Object obj = this.A[this.z - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.z - i2) * 5;
        while (i2 < this.z) {
            Object[] objArr = this.A;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[vv5.k(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (vv5.k(this.x, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.x, ((this.z - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.x + 1;
            this.x = i;
            if (i == this.y) {
                this.B = true;
                return a;
            }
            c(0);
            return a;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.x--;
            if (this.B) {
                this.B = false;
                return a();
            }
            c(31);
            return a();
        }
        qi2.e();
        return null;
    }
}
