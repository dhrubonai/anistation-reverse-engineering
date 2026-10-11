package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dy1 implements at {
    public int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public dy1(Context context, qr1 qr1Var, iw3 iw3Var, c41 c41Var, int i, Looper looper, zs zsVar, ab1 ab1Var, LogSessionId logSessionId, r91 r91Var) {
        this.c = context;
        this.d = qr1Var;
        st3 st3Var = new st3(c41Var);
        this.e = st3Var;
        this.g = iw3Var;
        hb1 hb1Var = ab1Var.x;
        mb1 mb1Var = new mb1(context);
        mb1Var.o(hb1Var);
        byte b = 2;
        zx1 zx1Var = new zx1(context, new w91(new cy1(qr1Var, st3Var, i, zsVar, logSessionId), (byte) 4), new av(context, b));
        io3.B(!zx1Var.A);
        iw3Var.getClass();
        zx1Var.d = new w91(iw3Var, (byte) 3);
        io3.B(!zx1Var.A);
        zx1Var.e = new w91(mb1Var, b);
        io3.B(!zx1Var.A);
        r91Var.getClass();
        zx1Var.f = new w91(r91Var, (byte) 1);
        io3.B(!zx1Var.A);
        looper.getClass();
        zx1Var.i = looper;
        io3.B(!zx1Var.A);
        zx1Var.v = Integer.MAX_VALUE;
        io3.B(!zx1Var.A);
        zx1Var.w = Integer.MAX_VALUE;
        io3.B(!zx1Var.A);
        zx1Var.x = Integer.MAX_VALUE;
        io3.B(!zx1Var.A);
        zx1Var.z = false;
        io3.B(!zx1Var.A);
        zx1Var.C = false;
        io3.B(!zx1Var.A);
        zx1Var.A = true;
        vy1 vy1Var = new vy1(zx1Var);
        this.f = vy1Var;
        vy1Var.m.a(new by1(this, zsVar));
        this.a = 0;
        this.b = -9223372036854775807L;
    }

    public static g90 d(g90 g90Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= g90Var.y) {
            g90Var = (g90) g90Var.A;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (g90Var.y - j));
            k7 k7Var = (k7) g90Var.z;
            byteBuffer.put(k7Var.a, ((int) (j - g90Var.x)) + k7Var.b, min);
            i -= min;
            j += min;
            if (j == g90Var.y) {
                g90Var = (g90) g90Var.A;
            }
        }
        return g90Var;
    }

    public static g90 f(g90 g90Var, long j, byte[] bArr, int i) {
        while (j >= g90Var.y) {
            g90Var = (g90) g90Var.A;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (g90Var.y - j));
            k7 k7Var = (k7) g90Var.z;
            System.arraycopy(k7Var.a, ((int) (j - g90Var.x)) + k7Var.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == g90Var.y) {
                g90Var = (g90) g90Var.A;
            }
        }
        return g90Var;
    }

    public static g90 g(g90 g90Var, q61 q61Var, ri0 ri0Var, zi4 zi4Var) {
        boolean z;
        if (q61Var.d(1073741824)) {
            long j = ri0Var.b;
            int i = 1;
            zi4Var.K(1);
            g90 f = f(g90Var, j, zi4Var.a, 1);
            long j2 = j + 1;
            byte b = zi4Var.a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            x21 x21Var = q61Var.A;
            byte[] bArr = x21Var.a;
            if (bArr == null) {
                x21Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            g90Var = f(f, j2, x21Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                zi4Var.K(2);
                g90Var = f(g90Var, j3, zi4Var.a, 2);
                j3 += 2;
                i = zi4Var.H();
            }
            int[] iArr = x21Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = x21Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                zi4Var.K(i3);
                g90Var = f(g90Var, j3, zi4Var.a, i3);
                j3 += i3;
                zi4Var.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = zi4Var.H();
                    iArr2[i4] = zi4Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = ri0Var.a - ((int) (j3 - ri0Var.b));
            }
            ah6 ah6Var = (ah6) ri0Var.c;
            String str = eq6.a;
            byte[] bArr2 = ah6Var.b;
            byte[] bArr3 = x21Var.a;
            int i5 = ah6Var.a;
            int i6 = ah6Var.c;
            int i7 = ah6Var.d;
            x21Var.f = i;
            x21Var.d = iArr;
            x21Var.e = iArr2;
            x21Var.b = bArr2;
            x21Var.a = bArr3;
            x21Var.c = i5;
            x21Var.g = i6;
            x21Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = x21Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            pz2 pz2Var = x21Var.j;
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) pz2Var.z;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) pz2Var.y).setPattern(pattern);
            long j4 = ri0Var.b;
            int i8 = (int) (j3 - j4);
            ri0Var.b = j4 + i8;
            ri0Var.a -= i8;
        }
        if (q61Var.d(268435456)) {
            zi4Var.K(4);
            g90 f2 = f(g90Var, ri0Var.b, zi4Var.a, 4);
            int E = zi4Var.E();
            ri0Var.b += 4;
            ri0Var.a -= 4;
            q61Var.j(E);
            g90 d = d(f2, ri0Var.b, q61Var.B, E);
            ri0Var.b += E;
            int i9 = ri0Var.a - E;
            ri0Var.a = i9;
            ByteBuffer byteBuffer = q61Var.E;
            if (byteBuffer != null && byteBuffer.capacity() >= i9) {
                q61Var.E.clear();
            } else {
                q61Var.E = ByteBuffer.allocate(i9);
            }
            return d(d, ri0Var.b, q61Var.E, ri0Var.a);
        }
        q61Var.j(ri0Var.a);
        return d(g90Var, ri0Var.b, q61Var.B, ri0Var.a);
    }

    @Override // defpackage.at
    public int a(mm5 mm5Var) {
        if (this.a == 2) {
            long j = this.b / 1000;
            mm5Var.x = eq6.Z(Math.min(((vy1) this.f).Z0(), j), j);
        }
        return this.a;
    }

    public void b(long j) {
        g90 g90Var;
        if (j != -1) {
            while (true) {
                g90Var = (g90) this.e;
                if (j < g90Var.y) {
                    break;
                }
                ((l7) this.c).d((k7) g90Var.z);
                g90 g90Var2 = (g90) this.e;
                g90Var2.z = null;
                g90 g90Var3 = (g90) g90Var2.A;
                g90Var2.A = null;
                this.e = g90Var3;
            }
            if (((g90) this.f).x < g90Var.x) {
                this.f = g90Var;
            }
        }
    }

    public int c(int i) {
        g90 g90Var = (g90) this.g;
        if (((k7) g90Var.z) == null) {
            k7 g = ((l7) this.c).g();
            g90 g90Var2 = new g90(((g90) this.g).y, this.a);
            g90Var.z = g;
            g90Var.A = g90Var2;
        }
        return Math.min(i, (int) (((g90) this.g).y - this.b));
    }

    @Override // defpackage.at
    public rw2 e() {
        eb2 eb2Var = new eb2(4);
        st3 st3Var = (st3) this.e;
        String str = (String) st3Var.y;
        if (str != null) {
            eb2Var.y(1, str);
        }
        String str2 = (String) st3Var.z;
        if (str2 != null) {
            eb2Var.y(2, str2);
        }
        return eb2Var.e(true);
    }

    @Override // defpackage.at
    public void release() {
        ((vy1) this.f).release();
        this.a = 0;
    }

    @Override // defpackage.at
    public void start() {
        vy1 vy1Var = (vy1) this.f;
        lw3 e = ((iw3) this.g).e(((qr1) this.d).a);
        vy1Var.E1();
        List singletonList = Collections.singletonList(e);
        vy1Var.E1();
        vy1Var.E1();
        vy1Var.x1(singletonList, -1, -9223372036854775807L, true);
        vy1Var.a();
        this.a = 1;
    }

    public dy1(l7 l7Var) {
        this.c = l7Var;
        int o = l7Var.o();
        this.a = o;
        this.d = new zi4(32);
        g90 g90Var = new g90(0L, o);
        this.e = g90Var;
        this.f = g90Var;
        this.g = g90Var;
    }
}
