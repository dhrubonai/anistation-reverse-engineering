package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p42 extends wt4 {
    public static final p42 c = new wt4(r42.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        o42 o42Var = (o42) obj;
        o42Var.getClass();
        float h = gu0Var.h(this.b, i);
        o42Var.b(o42Var.d() + 1);
        float[] fArr = o42Var.a;
        int i2 = o42Var.b;
        o42Var.b = i2 + 1;
        fArr[i2] = h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o42] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new float[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        hu0Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).r(this.b, i2, fArr[i2]);
        }
    }
}
