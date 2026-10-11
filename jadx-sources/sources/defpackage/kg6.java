package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kg6 implements xr4 {
    public final int x;

    public kg6(int i) {
        this.x = i;
    }

    @Override // defpackage.xr4
    public final long b(g13 g13Var, long j, ia3 ia3Var, long j2) {
        int i = (int) (j2 >> 32);
        int d = ((g13Var.d() - i) / 2) + g13Var.a;
        if (d < 0) {
            d = g13Var.a;
        } else if (d + i > ((int) (j >> 32))) {
            d = g13Var.c - i;
        }
        int i2 = g13Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.x;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = g13Var.d + i3;
        }
        return (d << 32) | (i4 & 4294967295L);
    }
}
