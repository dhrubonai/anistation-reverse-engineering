package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hu7 extends st7 {
    public static final hu7 D = new hu7(new Object[0], 0);
    public final transient Object[] B;
    public final transient int C;

    public hu7(Object[] objArr, int i) {
        super((byte) 1);
        this.B = objArr;
        this.C = i;
    }

    @Override // defpackage.ne7
    public final Object[] b() {
        return this.B;
    }

    @Override // defpackage.ne7
    public final int c() {
        return 0;
    }

    @Override // defpackage.ne7
    public final int d() {
        return this.C;
    }

    @Override // defpackage.st7, defpackage.ne7
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.B;
        int i = this.C;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jy5.j(i, this.C);
        Object obj = this.B[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.C;
    }
}
