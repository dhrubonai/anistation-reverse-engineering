package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nu7 extends bu7 {
    public final transient su7 C;
    public final transient qu7 D;

    public nu7(su7 su7Var, qu7 qu7Var) {
        super((byte) 1);
        this.C = su7Var;
        this.D = qu7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.C.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ne7
    public final int f(Object[] objArr) {
        return this.D.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.D.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C.C;
    }
}
