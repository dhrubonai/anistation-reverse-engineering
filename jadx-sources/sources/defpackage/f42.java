package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f42 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final rt3 k;
    public final fy3 l;

    public f42(int i, byte[] bArr) {
        yi0 yi0Var = new yi0(bArr.length, bArr);
        yi0Var.m(i * 8);
        this.a = yi0Var.g(16);
        this.b = yi0Var.g(16);
        this.c = yi0Var.g(24);
        this.d = yi0Var.g(24);
        int g = yi0Var.g(20);
        this.e = g;
        this.f = d(g);
        this.g = yi0Var.g(3) + 1;
        int g2 = yi0Var.g(5) + 1;
        this.h = g2;
        this.i = a(g2);
        this.j = yi0Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            if (i != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final ea2 c(byte[] bArr, fy3 fy3Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        fy3 fy3Var2 = this.l;
        if (fy3Var2 != null) {
            fy3Var = fy3Var2.b(fy3Var);
        }
        da2 da2Var = new da2();
        da2Var.o = qy3.n("audio/flac");
        da2Var.p = i;
        da2Var.I = this.g;
        da2Var.K = this.e;
        String str = eq6.a;
        da2Var.L = eq6.G(this.h, ByteOrder.LITTLE_ENDIAN);
        da2Var.r = Collections.singletonList(bArr);
        da2Var.l = fy3Var;
        return new ea2(da2Var);
    }

    public f42(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, rt3 rt3Var, fy3 fy3Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = rt3Var;
        this.l = fy3Var;
    }
}
