package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zb0 extends wt4 {
    public static final zb0 c = new wt4(nd0.a);

    @Override // defpackage.n0
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.xo0, defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        sb0 sb0Var = (sb0) obj;
        sb0Var.getClass();
        byte l = gu0Var.l(this.b, i);
        sb0Var.b(sb0Var.d() + 1);
        byte[] bArr = sb0Var.a;
        int i2 = sb0Var.b;
        sb0Var.b = i2 + 1;
        bArr[i2] = l;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sb0, java.lang.Object] */
    @Override // defpackage.n0
    public final Object h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.wt4
    public final Object k() {
        return new byte[0];
    }

    @Override // defpackage.wt4
    public final void l(hu0 hu0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        hu0Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            v0 v0Var = (v0) hu0Var;
            v0Var.q(this.b, i2);
            v0Var.f(b);
        }
    }
}
