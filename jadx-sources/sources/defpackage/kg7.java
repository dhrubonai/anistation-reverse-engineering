package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kg7 extends wh7 {
    public final transient wh7 B;

    public kg7(wh7 wh7Var) {
        super((byte) 0);
        this.B = wh7Var;
    }

    @Override // defpackage.wh7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.B.contains(obj);
    }

    @Override // defpackage.wh7
    public final wh7 g() {
        return this.B;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wh7 wh7Var = this.B;
        it5.i(i, wh7Var.size());
        return wh7Var.get((wh7Var.size() - 1) - i);
    }

    @Override // defpackage.wh7, java.util.List
    /* renamed from: h */
    public final wh7 subList(int i, int i2) {
        wh7 wh7Var = this.B;
        it5.j(i, i2, wh7Var.size());
        return wh7Var.subList(wh7Var.size() - i2, wh7Var.size() - i).g();
    }

    @Override // defpackage.wh7, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.B.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - lastIndexOf;
    }

    @Override // defpackage.wh7, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.B.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - indexOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }
}
