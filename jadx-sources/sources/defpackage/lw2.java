package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lw2 extends nw2 {
    public final transient int A;
    public final /* synthetic */ nw2 B;
    public final transient int z;

    public lw2(nw2 nw2Var, int i, int i2) {
        this.B = nw2Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.gw2
    public final Object[] d() {
        return this.B.d();
    }

    @Override // defpackage.gw2
    public final int f() {
        return this.B.g() + this.z + this.A;
    }

    @Override // defpackage.gw2
    public final int g() {
        return this.B.g() + this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        io3.r(i, this.A);
        return this.B.get(i + this.z);
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return true;
    }

    @Override // defpackage.nw2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.nw2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }

    @Override // defpackage.nw2, java.util.List
    /* renamed from: x */
    public final nw2 subList(int i, int i2) {
        io3.y(i, i2, this.A);
        int i3 = this.z;
        return this.B.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.nw2, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
