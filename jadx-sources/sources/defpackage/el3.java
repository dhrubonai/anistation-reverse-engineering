package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class el3 extends wt4 {
    public static final el3 c = new wt4(ql3.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        dl3 dl3Var = (dl3) obj;
        dl3Var.getClass();
        long B = gu0Var.B(this.b, i);
        dl3Var.b(dl3Var.d() + 1);
        long[] jArr = dl3Var.a;
        int i2 = dl3Var.b;
        dl3Var.b = i2 + 1;
        jArr[i2] = B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dl3] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new long[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        hu0Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).u(this.b, i2, jArr[i2]);
        }
    }
}
