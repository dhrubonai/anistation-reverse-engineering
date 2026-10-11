package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw6 extends vv6 {
    public final p44 b;

    public jw6() {
        long[] jArr = cb5.a;
        this.b = new p44();
    }

    @Override // defpackage.vv6
    public final void d() {
        p44 p44Var;
        p44 p44Var2 = this.b;
        if (p44Var2.i()) {
            p44Var = cb5.b;
            p44Var.getClass();
        } else {
            p44 p44Var3 = new p44(p44Var2.e);
            p44Var3.k(p44Var2);
            p44Var = p44Var3;
        }
        Object[] objArr = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            iw6 iw6Var = (iw6) objArr[(i << 3) + i3];
                            iw6Var.d = true;
                            if (iw6Var.c <= 0) {
                                e(iw6Var.a);
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

    public final void e(Object obj) {
        iw6 iw6Var = (iw6) this.b.l(obj);
        if (iw6Var != null) {
            iw6Var.b.a();
        }
    }
}
