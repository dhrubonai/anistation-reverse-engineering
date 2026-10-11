package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sr1 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public sr1(ko koVar, long j) {
        this.a = (byte) 0;
        String str = koVar.y;
        wp wpVar = new wp((byte) 1);
        wpVar.d = str;
        wpVar.b = -1;
        wpVar.c = -1;
        this.f = wpVar;
        this.b = nd6.g(j);
        this.c = nd6.f(j);
        this.d = -1;
        this.e = -1;
        int g = nd6.g(j);
        int f = nd6.f(j);
        if (g >= 0 && g <= str.length()) {
            if (f >= 0 && f <= str.length()) {
                if (g <= f) {
                    return;
                }
                ze0.k(zo5.m("Do not set reversed range: ", " > ", g, f));
                throw null;
            }
            ze0.g(zo5.m("end (", ") offset is outside of text region ", f, str.length()));
            throw null;
        }
        ze0.g(zo5.m("start (", ") offset is outside of text region ", g, str.length()));
        throw null;
    }

    public void a(long j) {
        int i = this.d;
        long[] jArr = (long[]) this.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i2 = this.b;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, jArr2, 0, i3);
                System.arraycopy((long[]) this.f, 0, jArr2, i3, i2);
                this.b = 0;
                int i4 = this.d;
                this.c = i4 - 1;
                this.f = jArr2;
                this.e = length - 1;
                i = i4;
                jArr = jArr2;
            } else {
                p65.l();
                return;
            }
        }
        int i5 = (this.c + 1) & this.e;
        this.c = i5;
        jArr[i5] = j;
        this.d = i + 1;
    }

    public void b() {
        boolean z;
        int i;
        int i2 = this.d;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0))) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
    }

    public boolean c(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.b) {
                break;
            }
            if (s(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 < i6 || (i4 == i6 && i5 == 0)) {
            return true;
        }
        return false;
    }

    public boolean d() {
        boolean z;
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.b && !i()) {
            i3++;
        }
        if (this.d == this.b) {
            z = true;
        } else {
            z = false;
        }
        this.d = i;
        this.e = i2;
        if (z || !c((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public void e(int i, int i2) {
        long a = fy5.a(i, i2);
        ((wp) this.f).v("", i, i2);
        long X = x97.X(fy5.a(this.b, this.c), a);
        r(nd6.g(X));
        q(nd6.f(X));
        int i3 = this.d;
        if (i3 != -1) {
            long X2 = x97.X(fy5.a(i3, this.e), a);
            if (nd6.d(X2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = nd6.g(X2);
                this.e = nd6.f(X2);
            }
        }
    }

    public long f() {
        if (this.d != 0) {
            return ((long[]) this.f)[this.b];
        }
        qi2.e();
        return 0L;
    }

    public char g(int i) {
        wp wpVar = (wp) this.f;
        fd2 fd2Var = (fd2) wpVar.e;
        if (fd2Var == null) {
            return ((String) wpVar.d).charAt(i);
        }
        if (i < wpVar.b) {
            return ((String) wpVar.d).charAt(i);
        }
        int a = fd2Var.b - fd2Var.a();
        int i2 = wpVar.b;
        if (i < a + i2) {
            int i3 = i - i2;
            int i4 = fd2Var.d;
            char[] cArr = fd2Var.c;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + fd2Var.e];
        }
        return ((String) wpVar.d).charAt(i - ((a - wpVar.c) + i2));
    }

    public nd6 h() {
        int i = this.d;
        if (i != -1) {
            return new nd6(fy5.a(i, this.e));
        }
        return null;
    }

    public boolean i() {
        boolean z;
        if ((((byte[]) this.f)[this.d] & (128 >> this.e)) != 0) {
            z = true;
        } else {
            z = false;
        }
        t();
        return z;
    }

    public int j(int i) {
        int i2;
        int i3;
        this.e += i;
        int i4 = 0;
        while (true) {
            i2 = this.e;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            byte[] bArr = (byte[]) this.f;
            int i6 = this.d;
            i4 |= (bArr[i6] & 255) << i5;
            if (!s(i6 + 1)) {
                i3 = 1;
            }
            this.d = i6 + i3;
        }
        byte[] bArr2 = (byte[]) this.f;
        int i7 = this.d;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            if (!s(i7 + 1)) {
                i3 = 1;
            }
            this.d = i7 + i3;
        }
        b();
        return i8;
    }

    public int k() {
        int i = 0;
        int i2 = 0;
        while (!i()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = j(i2);
        }
        return i3 + i;
    }

    public int l() {
        int i;
        int k = k();
        if (k % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((k + 1) / 2) * i;
    }

    public long m() {
        int i = this.d;
        if (i != 0) {
            long[] jArr = (long[]) this.f;
            int i2 = this.b;
            long j = jArr[i2];
            this.b = this.e & (i2 + 1);
            this.d = i - 1;
            return j;
        }
        qi2.e();
        return 0L;
    }

    public void n(String str, int i, int i2) {
        wp wpVar = (wp) this.f;
        if (i >= 0 && i <= wpVar.g()) {
            if (i2 >= 0 && i2 <= wpVar.g()) {
                if (i <= i2) {
                    wpVar.v(str, i, i2);
                    r(str.length() + i);
                    q(str.length() + i);
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                ze0.k(zo5.m("Do not set reversed range: ", " > ", i, i2));
                return;
            }
            ze0.g(zo5.m("end (", ") offset is outside of text region ", i2, wpVar.g()));
            return;
        }
        ze0.g(zo5.m("start (", ") offset is outside of text region ", i, wpVar.g()));
    }

    public void o(int i, int i2) {
        wp wpVar = (wp) this.f;
        if (i >= 0 && i <= wpVar.g()) {
            if (i2 >= 0 && i2 <= wpVar.g()) {
                if (i < i2) {
                    this.d = i;
                    this.e = i2;
                    return;
                } else {
                    ze0.k(zo5.m("Do not set reversed or empty range: ", " > ", i, i2));
                    return;
                }
            }
            ze0.g(zo5.m("end (", ") offset is outside of text region ", i2, wpVar.g()));
            return;
        }
        ze0.g(zo5.m("start (", ") offset is outside of text region ", i, wpVar.g()));
    }

    public void p(int i, int i2) {
        wp wpVar = (wp) this.f;
        if (i >= 0 && i <= wpVar.g()) {
            if (i2 >= 0 && i2 <= wpVar.g()) {
                if (i <= i2) {
                    r(i);
                    q(i2);
                    return;
                } else {
                    ze0.k(zo5.m("Do not set reversed range: ", " > ", i, i2));
                    return;
                }
            }
            ze0.g(zo5.m("end (", ") offset is outside of text region ", i2, wpVar.g()));
            return;
        }
        ze0.g(zo5.m("start (", ") offset is outside of text region ", i, wpVar.g()));
    }

    public void q(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void r(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public boolean s(int i) {
        int i2 = i - 2;
        if (this.c <= i2 && i < this.b) {
            byte[] bArr = (byte[]) this.f;
            if (bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void t() {
        int i = 1;
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 == 8) {
            this.e = 0;
            int i3 = this.d;
            if (s(i3 + 1)) {
                i = 2;
            }
            this.d = i3 + i;
        }
        b();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((wp) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.d) {
                if (s(i2)) {
                    this.d++;
                    i2 += 2;
                }
            } else {
                b();
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sr1() {
        this(16);
        this.a = (byte) 1;
    }

    public sr1(byte[] bArr, int i, int i2) {
        this.a = (byte) 2;
        this.f = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        this.e = 0;
        b();
    }

    public sr1(int i) {
        this.a = (byte) 1;
        io3.n(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.b = 0;
        this.c = -1;
        this.d = 0;
        this.f = new long[i];
        this.e = i - 1;
    }
}
