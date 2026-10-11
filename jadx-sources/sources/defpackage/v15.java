package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v15 extends zw2 {
    public static final Object[] F;
    public static final v15 G;
    public final transient Object[] A;
    public final transient int B;
    public final transient Object[] C;
    public final transient int D;
    public final transient int E;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new v15(0, 0, 0, objArr, objArr);
    }

    public v15(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.A = objArr;
        this.B = i;
        this.C = objArr2;
        this.D = i2;
        this.E = i3;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.A;
        int i2 = this.E;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.C;
            if (objArr.length != 0) {
                int c0 = h41.c0(obj);
                while (true) {
                    int i = c0 & this.D;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    c0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.gw2
    public final Object[] d() {
        return this.A;
    }

    @Override // defpackage.gw2
    public final int f() {
        return this.E;
    }

    @Override // defpackage.gw2
    public final int g() {
        return 0;
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return false;
    }

    @Override // defpackage.zw2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final ho6 iterator() {
        return b().listIterator(0);
    }

    @Override // defpackage.zw2
    public final nw2 n() {
        return nw2.j(this.A, this.E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
