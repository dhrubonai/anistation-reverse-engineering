package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yu7 extends bu7 {
    public final transient Object C;

    public yu7(Object obj) {
        super((byte) 1);
        this.C = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.C.equals(obj);
    }

    @Override // defpackage.ne7
    public final int f(Object[] objArr) {
        objArr[0] = this.C;
        return 1;
    }

    @Override // defpackage.bu7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.C.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new du7(this.C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.C.toString();
        return qx1.q(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
    }
}
