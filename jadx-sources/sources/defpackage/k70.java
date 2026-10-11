package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class k70 extends wt4 {
    public static final k70 c = new wt4(l70.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        j70 j70Var = (j70) obj;
        j70Var.getClass();
        boolean w = gu0Var.w(this.b, i);
        j70Var.b(j70Var.d() + 1);
        boolean[] zArr = j70Var.a;
        int i2 = j70Var.b;
        j70Var.b = i2 + 1;
        zArr[i2] = w;
    }
}
