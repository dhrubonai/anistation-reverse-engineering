package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ln5 {
    public final ti4 a;
    public final ti4 b;
    public final ai6 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public wr6 j;

    public ln5() {
        Boolean bool = Boolean.FALSE;
        this.a = xt5.g(bool);
        this.b = xt5.g(bool);
        this.c = new ai6();
        this.d = j04.b();
        this.e = ep0.h;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = xh6.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        ti4 ti4Var = this.a;
        boolean booleanValue = ((Boolean) ti4Var.getValue()).booleanValue();
        ti4 ti4Var2 = this.b;
        if (booleanValue && !z) {
            ti4Var2.setValue(Boolean.TRUE);
        } else if (z) {
            ti4Var2.setValue(Boolean.FALSE);
        }
        ti4Var.setValue(Boolean.valueOf(z));
    }
}
