package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u03 extends wt4 {
    public static final u03 c = new wt4(i13.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        t03 t03Var = (t03) obj;
        t03Var.getClass();
        int r = gu0Var.r(this.b, i);
        t03Var.b(t03Var.d() + 1);
        int[] iArr = t03Var.a;
        int i2 = t03Var.b;
        t03Var.b = i2 + 1;
        iArr[i2] = r;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t03, java.lang.Object] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new int[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        hu0Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).t(i2, iArr[i2], this.b);
        }
    }
}
