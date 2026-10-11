package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aj3 extends AbstractSequentialList implements Serializable {
    public final List x;
    public final qc2 y;

    public aj3(List list, qc2 qc2Var) {
        list.getClass();
        this.x = list;
        this.y = qc2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.x.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new yi3(this, this.x.listIterator(i), (byte) 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.x.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x.size();
    }
}
