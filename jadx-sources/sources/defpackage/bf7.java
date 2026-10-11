package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bf7 extends ef7 {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public bf7(OutputStream outputStream, int i) {
        if (outputStream != null) {
            this.f = outputStream;
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.c = bArr;
                this.d = bArr.length;
                return;
            }
            ze0.k("bufferSize must be >= 0");
            throw null;
        }
        qi2.m("out");
        throw null;
    }

    public final void A(int i) {
        if (this.d - this.e < i) {
            B();
        }
    }

    public final void B() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void C(int i) {
        boolean z = ef7.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    ih7.j(bArr, i3, (byte) i);
                    return;
                } else {
                    this.e = i3 + 1;
                    ih7.j(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // defpackage.ef7
    public final void c(byte[] bArr, int i, int i2) {
        z(bArr, i, i2);
    }

    @Override // defpackage.ef7
    public final void d(int i, int i2) {
        r((i << 3) | i2);
    }

    @Override // defpackage.ef7
    public final void e(int i, int i2) {
        A(20);
        C(i << 3);
        if (i2 >= 0) {
            C(i2);
        } else {
            w(i2);
        }
    }

    @Override // defpackage.ef7
    public final void f(int i, int i2) {
        A(20);
        C(i << 3);
        C(i2);
    }

    @Override // defpackage.ef7
    public final void g(int i, int i2) {
        A(14);
        C((i << 3) | 5);
        x(i2);
    }

    @Override // defpackage.ef7
    public final void h(int i, long j) {
        A(20);
        C(i << 3);
        w(j);
    }

    @Override // defpackage.ef7
    public final void i(int i, long j) {
        A(18);
        C((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.ef7
    public final void j(int i, boolean z) {
        A(11);
        C(i << 3);
        int i2 = this.e;
        this.c[i2] = z ? (byte) 1 : (byte) 0;
        this.e = i2 + 1;
    }

    @Override // defpackage.ef7
    public final void k(int i, String str) {
        r((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.ef7
    public final void l(int i, we7 we7Var) {
        r((i << 3) | 2);
        m(we7Var);
    }

    @Override // defpackage.ef7
    public final void m(we7 we7Var) {
        r(we7Var.c());
        we7Var.g(this);
    }

    @Override // defpackage.ef7
    public final void n(int i, byte[] bArr) {
        r(i);
        z(bArr, 0, i);
    }

    @Override // defpackage.ef7
    public final void o(qe7 qe7Var) {
        mf7 mf7Var = (mf7) qe7Var;
        r(mf7Var.k());
        mf7Var.d(this);
    }

    @Override // defpackage.ef7
    public final void p(byte b) {
        if (this.e == this.d) {
            B();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // defpackage.ef7
    public final void q(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // defpackage.ef7
    public final void r(int i) {
        A(5);
        C(i);
    }

    @Override // defpackage.ef7
    public final void s(int i) {
        A(4);
        x(i);
    }

    @Override // defpackage.ef7
    public final void t(long j) {
        A(10);
        w(j);
    }

    @Override // defpackage.ef7
    public final void u(long j) {
        A(8);
        y(j);
    }

    @Override // defpackage.ef7
    public final void v(String str) {
        int length = str.length() * 3;
        int a = ef7.a(length);
        int i = a + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int c = kh7.c(str, bArr, 0, length);
            r(c);
            z(bArr, 0, c);
            return;
        }
        if (i > i2 - this.e) {
            B();
        }
        int a2 = ef7.a(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (a2 == a) {
                int i4 = i3 + a2;
                this.e = i4;
                int c2 = kh7.c(str, bArr2, i4, i2 - i4);
                this.e = i3;
                C((c2 - i3) - a2);
                this.e = c2;
            } else {
                int b = kh7.b(str);
                C(b);
                this.e = kh7.c(str, bArr2, this.e, b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new co0((IndexOutOfBoundsException) e);
        }
    }

    public final void w(long j) {
        boolean z = ef7.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.e;
                if (j2 == 0) {
                    this.e = i2 + 1;
                    ih7.j(bArr, i2, (byte) i);
                    return;
                } else {
                    this.e = i2 + 1;
                    ih7.j(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.e;
                if (j3 == 0) {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void x(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void y(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void z(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.e = i4;
        B();
        int i7 = i2 - i5;
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        } else {
            this.f.write(bArr, i6, i7);
        }
    }
}
