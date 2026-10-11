package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class si1 extends wt4 {
    public static final si1 c = new wt4(aj1.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        ri1 ri1Var = (ri1) obj;
        ri1Var.getClass();
        double y = gu0Var.y(this.b, i);
        ri1Var.b(ri1Var.d() + 1);
        double[] dArr = ri1Var.a;
        int i2 = ri1Var.b;
        ri1Var.b = i2 + 1;
        dArr[i2] = y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ri1] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new double[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        hu0Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            v0 v0Var = (v0) hu0Var;
            v0Var.q(this.b, i2);
            v0Var.d(d);
        }
    }
}
