package r6;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f9494c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f9496e;

    public n0(o0 o0Var, int i10, int i11) {
        this.f9496e = o0Var;
        this.f9494c = i10;
        this.f9495d = i11;
    }

    @Override // r6.j0
    public final Object[] d() {
        return this.f9496e.d();
    }

    @Override // r6.j0
    public final int e() {
        return this.f9496e.f() + this.f9494c + this.f9495d;
    }

    @Override // r6.j0
    public final int f() {
        return this.f9496e.f() + this.f9494c;
    }

    @Override // r6.j0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        h0.n(i10, this.f9495d);
        return this.f9496e.get(i10 + this.f9494c);
    }

    @Override // r6.o0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // r6.o0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // r6.o0, java.util.List
    /* renamed from: r */
    public final o0 subList(int i10, int i11) {
        h0.w(i10, i11, this.f9495d);
        int i12 = this.f9494c;
        return this.f9496e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9495d;
    }

    @Override // r6.o0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
