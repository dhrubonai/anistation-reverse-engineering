package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class am6 extends wt4 {
    public static final am6 c = new wt4(bm6.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        return ((yl6) obj).x.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        zl6 zl6Var = (zl6) obj;
        zl6Var.getClass();
        int n = gu0Var.d(this.b, i).n();
        zl6Var.b(zl6Var.d() + 1);
        int[] iArr = zl6Var.a;
        int i2 = zl6Var.b;
        zl6Var.b = i2 + 1;
        iArr[i2] = n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [zl6, java.lang.Object] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        int[] iArr = ((yl6) obj).x;
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new yl6(new int[0]);
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        int[] iArr = ((yl6) obj).x;
        hu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).s(this.b, i2).m(iArr[i2]);
        }
    }
}
