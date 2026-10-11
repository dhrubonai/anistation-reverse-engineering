package defpackage;

import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c75 implements c36, b36 {
    public static final TreeMap E = new TreeMap();
    public final String[] A;
    public final byte[][] B;
    public final int[] C;
    public int D;
    public volatile String x;
    public final long[] y;
    public final double[] z;

    public c75(int i) {
        int i2 = i + 1;
        this.C = new int[i2];
        this.y = new long[i2];
        this.z = new double[i2];
        this.A = new String[i2];
        this.B = new byte[i2];
    }

    @Override // defpackage.c36
    public final String G() {
        String str = this.x;
        if (str != null) {
            return str;
        }
        ze0.m("Required value was null.");
        return null;
    }

    @Override // defpackage.c36
    public final void I(b36 b36Var) {
        int i = this.D;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.C[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    byte[] bArr = this.B[i2];
                                    if (bArr != null) {
                                        b36Var.f(i2, bArr);
                                    } else {
                                        ze0.k("Required value was null.");
                                        return;
                                    }
                                }
                            } else {
                                String str = this.A[i2];
                                if (str != null) {
                                    b36Var.w(i2, str);
                                } else {
                                    ze0.k("Required value was null.");
                                    return;
                                }
                            }
                        } else {
                            b36Var.b(i2, this.z[i2]);
                        }
                    } else {
                        b36Var.e(i2, this.y[i2]);
                    }
                } else {
                    b36Var.h(i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.b36
    public final void b(int i, double d) {
        this.C[i] = 3;
        this.z[i] = d;
    }

    @Override // defpackage.b36
    public final void e(int i, long j) {
        this.C[i] = 2;
        this.y[i] = j;
    }

    @Override // defpackage.b36
    public final void f(int i, byte[] bArr) {
        this.C[i] = 5;
        this.B[i] = bArr;
    }

    @Override // defpackage.b36
    public final void h(int i) {
        this.C[i] = 1;
    }

    @Override // defpackage.c36
    public final int p() {
        return this.D;
    }

    @Override // defpackage.b36
    public final void w(int i, String str) {
        this.C[i] = 4;
        this.A[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
