package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oq5 extends zw2 {
    public final transient Object A;

    public oq5(Object obj) {
        obj.getClass();
        this.A = obj;
    }

    @Override // defpackage.zw2, defpackage.gw2
    public final nw2 b() {
        return nw2.s(this.A);
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.A;
        return i + 1;
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A.equals(obj);
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return false;
    }

    @Override // defpackage.zw2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ho6 iterator() {
        return new w33(this.A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.A.toString() + ']';
    }
}
