package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ol4 extends s1 {
    public int A;
    public nj6 B;
    public int C;
    public final ml4 z;

    public ol4(ml4 ml4Var, int i) {
        super(i, ml4Var.E);
        this.z = ml4Var;
        this.A = ml4Var.g();
        this.C = -1;
        b();
    }

    public final void a() {
        if (this.A == this.z.g()) {
            return;
        }
        ze0.j();
    }

    @Override // defpackage.s1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.x;
        ml4 ml4Var = this.z;
        ml4Var.add(i, obj);
        this.x++;
        this.y = ml4Var.b();
        this.A = ml4Var.g();
        this.C = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        ml4 ml4Var = this.z;
        Object[] objArr = ml4Var.C;
        if (objArr == null) {
            this.B = null;
            return;
        }
        int i = (ml4Var.E - 1) & (-32);
        int i2 = this.x;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ml4Var.A / 5) + 1;
        nj6 nj6Var = this.B;
        if (nj6Var == null) {
            this.B = new nj6(objArr, i2, i, i3);
            return;
        }
        nj6Var.x = i2;
        nj6Var.y = i;
        nj6Var.z = i3;
        Object[] objArr2 = nj6Var.A;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            nj6Var.A = objArr2;
        }
        ?? r0 = 0;
        objArr2[0] = objArr;
        if (i2 == i) {
            r0 = 1;
        }
        nj6Var.B = r0;
        nj6Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.x;
            this.C = i;
            nj6 nj6Var = this.B;
            ml4 ml4Var = this.z;
            if (nj6Var == null) {
                Object[] objArr = ml4Var.D;
                this.x = i + 1;
                return objArr[i];
            }
            if (nj6Var.hasNext()) {
                this.x++;
                return nj6Var.next();
            }
            Object[] objArr2 = ml4Var.D;
            int i2 = this.x;
            this.x = i2 + 1;
            return objArr2[i2 - nj6Var.y];
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.x;
            this.C = i - 1;
            nj6 nj6Var = this.B;
            ml4 ml4Var = this.z;
            if (nj6Var == null) {
                Object[] objArr = ml4Var.D;
                int i2 = i - 1;
                this.x = i2;
                return objArr[i2];
            }
            int i3 = nj6Var.y;
            if (i > i3) {
                Object[] objArr2 = ml4Var.D;
                int i4 = i - 1;
                this.x = i4;
                return objArr2[i4 - i3];
            }
            this.x = i - 1;
            return nj6Var.previous();
        }
        qi2.e();
        return null;
    }

    @Override // defpackage.s1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.C;
        if (i != -1) {
            ml4 ml4Var = this.z;
            ml4Var.c(i);
            int i2 = this.C;
            if (i2 < this.x) {
                this.x = i2;
            }
            this.y = ml4Var.b();
            this.A = ml4Var.g();
            this.C = -1;
            b();
            return;
        }
        p65.l();
    }

    @Override // defpackage.s1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.C;
        if (i != -1) {
            ml4 ml4Var = this.z;
            ml4Var.set(i, obj);
            this.A = ml4Var.g();
            b();
            return;
        }
        p65.l();
    }
}
