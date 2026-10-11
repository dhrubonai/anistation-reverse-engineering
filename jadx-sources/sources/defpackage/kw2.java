package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kw2 extends nw2 {
    public final transient nw2 z;

    public kw2(nw2 nw2Var) {
        this.z = nw2Var;
    }

    @Override // defpackage.nw2, defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.z.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        nw2 nw2Var = this.z;
        io3.r(i, nw2Var.size());
        return nw2Var.get((nw2Var.size() - 1) - i);
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return this.z.h();
    }

    @Override // defpackage.nw2, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.z.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.nw2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.nw2, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.z.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.nw2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.size();
    }

    @Override // defpackage.nw2
    public final nw2 v() {
        return this.z;
    }

    @Override // defpackage.nw2, java.util.List
    /* renamed from: x */
    public final nw2 subList(int i, int i2) {
        nw2 nw2Var = this.z;
        io3.y(i, i2, nw2Var.size());
        return nw2Var.subList(nw2Var.size() - i2, nw2Var.size() - i).v();
    }

    @Override // defpackage.nw2, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
