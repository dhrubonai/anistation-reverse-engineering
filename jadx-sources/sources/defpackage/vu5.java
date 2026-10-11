package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vu5 implements uu5 {
    public final short[] a;
    public short[] b;
    public short[] c;
    public short[] d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ wu5 h;

    public vu5(wu5 wu5Var) {
        this.h = wu5Var;
        int i = wu5Var.h;
        this.a = new short[i];
        int i2 = i * wu5Var.b;
        this.b = new short[i2];
        this.c = new short[i2];
        this.d = new short[i2];
    }

    @Override // defpackage.uu5
    public final void a(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.b;
        wu5 wu5Var = this.h;
        asShortBuffer.get(sArr, wu5Var.j * wu5Var.b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.uu5
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.uu5
    public final void c(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.c;
        int i2 = this.h.b;
        asShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // defpackage.uu5
    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < this.h.b * i2; i3++) {
            this.b[i + i3] = 0;
        }
    }

    @Override // defpackage.uu5
    public final void e(int i, int i2) {
        short[] sArr = this.b;
        wu5 wu5Var = this.h;
        int i3 = wu5Var.h / i2;
        int i4 = wu5Var.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.a[i7] = (short) (i8 / i5);
        }
    }

    @Override // defpackage.uu5
    public final int f(int i, int i2, int i3) {
        return s(this.b, i, i2, i3);
    }

    @Override // defpackage.uu5
    public final void flush() {
        this.g = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.uu5
    public final void g() {
        this.g = this.e;
    }

    @Override // defpackage.uu5
    public final Object h() {
        return this.c;
    }

    @Override // defpackage.uu5
    public final void i(int i) {
        this.c = r(this.c, this.h.k, i);
    }

    @Override // defpackage.uu5
    public final boolean j() {
        int i = this.e;
        if (i != 0 && this.h.p != 0 && this.f <= i * 3 && i * 2 > this.g * 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.uu5
    public final void k(long j, int i, long j2) {
        int i2 = 0;
        while (true) {
            wu5 wu5Var = this.h;
            int i3 = wu5Var.b;
            if (i2 < i3) {
                short[] sArr = this.c;
                int i4 = (wu5Var.k * i3) + i2;
                short[] sArr2 = this.d;
                int i5 = (i * i3) + i2;
                short s = sArr2[i5];
                short s2 = sArr2[i5 + i3];
                long j3 = wu5Var.n * j;
                long j4 = (r1 + 1) * j2;
                long j5 = j4 - j3;
                long j6 = j4 - (wu5Var.m * j2);
                sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.uu5
    public final Object l() {
        return this.d;
    }

    @Override // defpackage.uu5
    public final void m(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.c;
        short[] sArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.uu5
    public final void n(int i) {
        this.d = r(this.d, this.h.l, i);
    }

    @Override // defpackage.uu5
    public final int o() {
        return 2;
    }

    @Override // defpackage.uu5
    public final void p(int i) {
        this.b = r(this.b, this.h.j, i);
    }

    @Override // defpackage.uu5
    public final int q(int i, int i2) {
        return s(this.a, 0, i, i2);
    }

    public final short[] r(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.h.b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int s(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.h.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.e = i6 / i7;
        this.f = i8 / i5;
        return i7;
    }
}
