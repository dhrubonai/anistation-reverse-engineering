package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vl6 extends wt4 {
    public static final vl6 c = new wt4(wl6.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        return ((tl6) obj).x.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        ul6 ul6Var = (ul6) obj;
        ul6Var.getClass();
        byte x = gu0Var.d(this.b, i).x();
        ul6Var.b(ul6Var.d() + 1);
        byte[] bArr = ul6Var.a;
        int i2 = ul6Var.b;
        ul6Var.b = i2 + 1;
        bArr[i2] = x;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ul6] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        byte[] bArr = ((tl6) obj).x;
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new tl6(new byte[0]);
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        byte[] bArr = ((tl6) obj).x;
        hu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((v0) hu0Var).s(this.b, i2).f(bArr[i2]);
        }
    }
}
