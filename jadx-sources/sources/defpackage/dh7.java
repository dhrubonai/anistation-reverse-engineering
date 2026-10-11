package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dh7 extends wh7 {
    public final transient int B;
    public final transient int C;
    public final /* synthetic */ wh7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh7(wh7 wh7Var, int i, int i2) {
        super((byte) 0);
        this.D = wh7Var;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.ne7
    public final Object[] b() {
        return this.D.b();
    }

    @Override // defpackage.ne7
    public final int c() {
        return this.D.c() + this.B;
    }

    @Override // defpackage.ne7
    public final int d() {
        return this.D.c() + this.B + this.C;
    }

    @Override // java.util.List
    public final Object get(int i) {
        it5.i(i, this.C);
        return this.D.get(i + this.B);
    }

    @Override // defpackage.wh7, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final wh7 subList(int i, int i2) {
        it5.j(i, i2, this.C);
        int i3 = this.B;
        return this.D.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.C;
    }
}
