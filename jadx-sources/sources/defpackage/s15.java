package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s15 extends nw2 {
    public final transient boolean A;
    public final transient int B;
    public final transient Object[] z;

    /* JADX WARN: Multi-variable type inference failed */
    public s15(Object[] objArr, int i, int i2) {
        this.z = objArr;
        this.A = i;
        this.B = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        io3.r(i, this.B);
        Object obj = this.z[(i * 2) + (this.A ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B;
    }
}
