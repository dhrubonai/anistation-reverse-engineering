package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lg4 extends r1 implements RandomAccess {
    public final zd0[] x;
    public final int[] y;

    public lg4(zd0[] zd0VarArr, int[] iArr) {
        this.x = zd0VarArr;
        this.y = iArr;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.x.length;
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof zd0)) {
            return false;
        }
        return super.contains((zd0) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.x[i];
    }

    @Override // defpackage.r1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof zd0)) {
            return -1;
        }
        return super.indexOf((zd0) obj);
    }

    @Override // defpackage.r1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof zd0)) {
            return -1;
        }
        return super.lastIndexOf((zd0) obj);
    }
}
