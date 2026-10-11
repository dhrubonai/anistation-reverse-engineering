package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fm6 extends wt4 {
    public static final fm6 c = new wt4(gm6.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        return ((dm6) obj).x.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        em6 em6Var = (em6) obj;
        em6Var.getClass();
        long u = gu0Var.d(this.b, i).u();
        em6Var.b(em6Var.d() + 1);
        long[] jArr = em6Var.a;
        int i2 = em6Var.b;
        em6Var.b = i2 + 1;
        jArr[i2] = u;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, em6] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        long[] jArr = ((dm6) obj).x;
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new dm6(new long[0]);
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        long[] jArr = ((dm6) obj).x;
        hu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).s(this.b, i2).n(jArr[i2]);
        }
    }
}
