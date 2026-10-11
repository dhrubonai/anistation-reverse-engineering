package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oy5 implements fa0 {
    public final sb2 b;
    public final ia3 c;
    public final boolean d;
    public final fa0 e;

    public oy5(sb2 sb2Var, ia3 ia3Var, boolean z, fa0 fa0Var) {
        this.b = sb2Var;
        this.c = ia3Var;
        this.d = z;
        this.e = fa0Var;
    }

    @Override // defpackage.fa0
    public final float a(float f, float f2, float f3) {
        boolean z;
        float intValue = ((Number) this.b.invoke()).intValue();
        if (this.c == ia3.y) {
            z = true;
        } else {
            z = false;
        }
        if (this.d || !z) {
            f -= intValue;
        }
        return this.e.a(f, f2, f3 - intValue);
    }
}
