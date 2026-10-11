package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sk0 extends wt4 {
    public static final sk0 c = new wt4(gl0.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        lk0 lk0Var = (lk0) obj;
        lk0Var.getClass();
        char j = gu0Var.j(this.b, i);
        lk0Var.b(lk0Var.d() + 1);
        char[] cArr = lk0Var.a;
        int i2 = lk0Var.b;
        lk0Var.b = i2 + 1;
        cArr[i2] = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lk0, java.lang.Object] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new char[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        hu0Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            v0 v0Var = (v0) hu0Var;
            v0Var.q(this.b, i2);
            v0Var.k(c2);
        }
    }
}
