package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uw0 extends vw0 {
    public final b65 e;
    public final b65 f;
    public final float[] g;

    public uw0(b65 b65Var, b65 b65Var2) {
        super(b65Var2, b65Var, b65Var2, null);
        float[] z;
        this.e = b65Var;
        this.f = b65Var2;
        float[] fArr = (float[]) i75.B.y;
        o47 o47Var = b65Var.d;
        float[] fArr2 = b65Var.i;
        o47 o47Var2 = b65Var2.d;
        float[] fArr3 = b65Var2.j;
        if (m37.i(o47Var, o47Var2)) {
            z = m37.z(fArr3, fArr2);
        } else {
            float[] a = o47Var.a();
            float[] a2 = o47Var2.a();
            o47 o47Var3 = te4.d;
            z = m37.z(m37.i(o47Var2, o47Var3) ? fArr3 : m37.u(m37.z(m37.h(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), b65Var2.i)), m37.i(o47Var, o47Var3) ? fArr2 : m37.z(m37.h(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = z;
    }

    @Override // defpackage.vw0
    public final long a(long j) {
        float g = ep0.g(j);
        float f = ep0.f(j);
        float d = ep0.d(j);
        float c = ep0.c(j);
        x55 x55Var = this.e.p;
        float b = (float) x55Var.b(g);
        float b2 = (float) x55Var.b(f);
        float b3 = (float) x55Var.b(d);
        float[] fArr = this.g;
        float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f4 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        b65 b65Var = this.f;
        x55 x55Var2 = b65Var.m;
        return w65.d((float) x55Var2.b(f2), (float) x55Var2.b(f3), (float) x55Var2.b(f4), c, b65Var);
    }
}
