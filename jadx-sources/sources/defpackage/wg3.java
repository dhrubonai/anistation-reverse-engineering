package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wg3 extends vv6 {
    public final s34 b;

    public wg3() {
        s34 s34Var = b13.a;
        this.b = new s34();
    }

    @Override // defpackage.vv6
    public final void d() {
        s34 s34Var = this.b;
        int[] iArr = s34Var.b;
        Object[] objArr = s34Var.c;
        long[] jArr = s34Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            f44 f44Var = (f44) objArr[i4];
                            Object[] objArr2 = f44Var.a;
                            int i6 = f44Var.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                vg3 vg3Var = (vg3) objArr2[i7];
                                sg0 sg0Var = vg3Var.d;
                                if (sg0Var != null) {
                                    sg0Var.cancel();
                                }
                                vg3Var.d = null;
                                tm3 tm3Var = vg3Var.a.a;
                                tm3Var.b = true;
                                tm3Var.a = false;
                                tm3Var.d();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
