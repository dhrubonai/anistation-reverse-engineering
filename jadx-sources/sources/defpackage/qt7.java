package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qt7 extends st7 {
    public final transient int B;
    public final transient int C;
    public final /* synthetic */ st7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt7(st7 st7Var, int i, int i2) {
        super((byte) 1);
        this.D = st7Var;
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

    @Override // defpackage.st7, java.util.List
    /* renamed from: g */
    public final st7 subList(int i, int i2) {
        jy5.l(i, i2, this.C);
        int i3 = this.B;
        return this.D.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jy5.j(i, this.C);
        return this.D.get(i + this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.C;
    }
}
