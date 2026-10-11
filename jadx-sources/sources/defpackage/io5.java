package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class io5 extends wt4 {
    public static final io5 c = new wt4(jo5.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        ho5 ho5Var = (ho5) obj;
        ho5Var.getClass();
        short o = gu0Var.o(this.b, i);
        ho5Var.b(ho5Var.d() + 1);
        short[] sArr = ho5Var.a;
        int i2 = ho5Var.b;
        ho5Var.b = i2 + 1;
        sArr[i2] = o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ho5] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new short[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        hu0Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            v0 v0Var = (v0) hu0Var;
            v0Var.q(this.b, i2);
            v0Var.e(s);
        }
    }
}
