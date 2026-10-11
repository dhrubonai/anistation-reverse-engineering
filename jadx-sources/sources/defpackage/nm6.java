package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class nm6 extends wt4 {
    public static final nm6 c = new wt4(om6.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        return ((lm6) obj).x.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        mm6 mm6Var = (mm6) obj;
        mm6Var.getClass();
        short z = gu0Var.d(this.b, i).z();
        mm6Var.b(mm6Var.d() + 1);
        short[] sArr = mm6Var.a;
        int i2 = mm6Var.b;
        mm6Var.b = i2 + 1;
        sArr[i2] = z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [mm6, java.lang.Object] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        short[] sArr = ((lm6) obj).x;
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new lm6(new short[0]);
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        short[] sArr = ((lm6) obj).x;
        hu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).s(this.b, i2).e(sArr[i2]);
        }
    }
}
