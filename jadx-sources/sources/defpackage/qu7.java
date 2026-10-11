package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qu7 extends st7 {
    public final transient Object[] B;
    public final transient boolean C;
    public final transient int D;

    /* JADX WARN: Multi-variable type inference failed */
    public qu7(Object[] objArr, int i, int i2) {
        super((byte) 1);
        this.B = objArr;
        this.C = i;
        this.D = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jy5.j(i, this.D);
        Object obj = this.B[i + i + (this.C ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D;
    }
}
