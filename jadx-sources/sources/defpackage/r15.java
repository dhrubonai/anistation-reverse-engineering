package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r15 extends zw2 {
    public final transient rw2 A;
    public final transient s15 B;

    public r15(rw2 rw2Var, s15 s15Var) {
        this.A = rw2Var;
        this.B = s15Var;
    }

    @Override // defpackage.zw2, defpackage.gw2
    public final nw2 b() {
        return this.B;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        return this.B.c(objArr, i);
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.A.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final ho6 iterator() {
        return this.B.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A.size();
    }
}
