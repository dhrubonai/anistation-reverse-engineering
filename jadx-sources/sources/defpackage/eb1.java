package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eb1 extends kb1 implements Comparable {
    public final int B;
    public final int C;

    public eb1(int i, yg6 yg6Var, int i2, hb1 hb1Var, int i3) {
        super(i, yg6Var, i2);
        this.B = w30.l(i3, hb1Var.B0) ? 1 : 0;
        this.C = this.A.b();
    }

    @Override // defpackage.kb1
    public final int a() {
        return this.B;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.C, ((eb1) obj).C);
    }
}
