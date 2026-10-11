package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o15 extends nw2 {
    public static final o15 B = new o15(new Object[0], 0);
    public final transient int A;
    public final transient Object[] z;

    public o15(Object[] objArr, int i) {
        this.z = objArr;
        this.A = i;
    }

    @Override // defpackage.nw2, defpackage.gw2
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.z;
        int i2 = this.A;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.gw2
    public final Object[] d() {
        return this.z;
    }

    @Override // defpackage.gw2
    public final int f() {
        return this.A;
    }

    @Override // defpackage.gw2
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        io3.r(i, this.A);
        Object obj = this.z[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
