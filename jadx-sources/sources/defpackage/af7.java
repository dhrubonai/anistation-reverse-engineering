package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class af7 extends ef7 {
    public final byte[] c;
    public final int d;
    public int e;

    public af7(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.c = bArr;
            this.e = 0;
            this.d = i;
        } else {
            Locale locale = Locale.US;
            ze0.k(zo5.m("Array range is invalid. Buffer.length=", ", offset=0, length=", length, i));
            throw null;
        }
    }

    @Override // defpackage.ef7
    public final void c(byte[] bArr, int i, int i2) {
        w(bArr, i, i2);
    }

    @Override // defpackage.ef7
    public final void d(int i, int i2) {
        r((i << 3) | i2);
    }

    @Override // defpackage.ef7
    public final void e(int i, int i2) {
        r(i << 3);
        q(i2);
    }

    @Override // defpackage.ef7
    public final void f(int i, int i2) {
        r(i << 3);
        r(i2);
    }

    @Override // defpackage.ef7
    public final void g(int i, int i2) {
        r((i << 3) | 5);
        s(i2);
    }

    @Override // defpackage.ef7
    public final void h(int i, long j) {
        r(i << 3);
        t(j);
    }

    @Override // defpackage.ef7
    public final void i(int i, long j) {
        r((i << 3) | 1);
        u(j);
    }

    @Override // defpackage.ef7
    public final void j(int i, boolean z) {
        r(i << 3);
        p(z ? (byte) 1 : (byte) 0);
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
        w(bArr, 0, i);
    }

    @Override // defpackage.ef7
    public final void o(qe7 qe7Var) {
        mf7 mf7Var = (mf7) qe7Var;
        r(mf7Var.k());
        mf7Var.d(this);
    }

    @Override // defpackage.ef7
    public final void p(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new co0(i, this.d, 1, e, (byte) 10);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
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
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new co0(i2, this.d, 1, e, (byte) 10);
                }
            }
            throw new co0(i2, this.d, 1, e, (byte) 10);
        }
    }

    @Override // defpackage.ef7
    public final void s(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new co0(i2, this.d, 4, e, (byte) 10);
        }
    }

    @Override // defpackage.ef7
    public final void t(long j) {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (ef7.b && i3 - i2 >= 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                ih7.j(bArr, i2, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            ih7.j(bArr, i2, (byte) j2);
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new co0(i, i3, 1, e, (byte) 10);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j3;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new co0(i, i3, 1, e, (byte) 10);
            }
        }
        this.e = i;
    }

    @Override // defpackage.ef7
    public final void u(long j) {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new co0(i, this.d, 8, e, (byte) 10);
        }
    }

    @Override // defpackage.ef7
    public final void v(String str) {
        int i = this.e;
        try {
            int a = ef7.a(str.length() * 3);
            int a2 = ef7.a(str.length());
            byte[] bArr = this.c;
            if (a2 == a) {
                int i2 = i + a2;
                this.e = i2;
                int c = kh7.c(str, bArr, i2, bArr.length - i2);
                this.e = i;
                r((c - i) - a2);
                this.e = c;
                return;
            }
            r(kh7.b(str));
            int i3 = this.e;
            this.e = kh7.c(str, bArr, i3, bArr.length - i3);
        } catch (IndexOutOfBoundsException e) {
            throw new co0(e);
        }
    }

    public final void w(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new co0(this.e, this.d, i2, e, (byte) 10);
        }
    }

    public final int x() {
        return this.d - this.e;
    }
}
