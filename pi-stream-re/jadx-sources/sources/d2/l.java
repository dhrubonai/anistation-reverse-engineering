package d2;

import c1.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements q {

    /* renamed from: b, reason: collision with root package name */
    public final c1.l f3178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3179c;

    /* renamed from: d, reason: collision with root package name */
    public long f3180d;

    /* renamed from: f, reason: collision with root package name */
    public int f3182f;

    /* renamed from: g, reason: collision with root package name */
    public int f3183g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3181e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3177a = new byte[4096];

    static {
        l0.a("media3.extractor");
    }

    public l(c1.l lVar, long j4, long j10) {
        this.f3178b = lVar;
        this.f3180d = j4;
        this.f3179c = j10;
    }

    @Override // d2.q
    public final int a(int i10) {
        int min = Math.min(this.f3183g, i10);
        t(min);
        if (min == 0) {
            byte[] bArr = this.f3177a;
            min = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f3180d += min;
        }
        return min;
    }

    @Override // d2.q
    public final boolean b(byte[] bArr, int i10, int i11, boolean z9) {
        int min;
        int i12 = this.f3183g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f3181e, 0, bArr, i10, min);
            t(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = s(bArr, i10, i11, i13, z9);
        }
        if (i13 != -1) {
            this.f3180d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    @Override // d2.q
    public final long c() {
        return this.f3179c;
    }

    @Override // d2.q
    public final int d(byte[] bArr, int i10, int i11) {
        int min;
        r(i11);
        int i12 = this.f3183g;
        int i13 = this.f3182f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = s(this.f3181e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f3183g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f3181e, this.f3182f, bArr, i10, min);
        this.f3182f += min;
        return min;
    }

    @Override // d2.q
    public final void g() {
        this.f3182f = 0;
    }

    @Override // d2.q
    public final void h(int i10) {
        int min = Math.min(this.f3183g, i10);
        t(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = s(this.f3177a, -i11, Math.min(i10, this.f3177a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f3180d += i11;
        }
    }

    @Override // d2.q
    public final boolean i(int i10, boolean z9) {
        r(i10);
        int i11 = this.f3183g - this.f3182f;
        while (i11 < i10) {
            i11 = s(this.f3181e, this.f3182f, i10, i11, z9);
            if (i11 == -1) {
                return false;
            }
            this.f3183g = this.f3182f + i11;
        }
        this.f3182f += i10;
        return true;
    }

    @Override // d2.q
    public final boolean k(byte[] bArr, int i10, int i11, boolean z9) {
        if (!i(i11, z9)) {
            return false;
        }
        System.arraycopy(this.f3181e, this.f3182f - i11, bArr, i10, i11);
        return true;
    }

    @Override // d2.q
    public final long l() {
        return this.f3180d + this.f3182f;
    }

    @Override // d2.q
    public final void n(byte[] bArr, int i10, int i11) {
        k(bArr, i10, i11, false);
    }

    @Override // d2.q
    public final void o(int i10) {
        i(i10, false);
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        int i12 = this.f3183g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f3181e, 0, bArr, i10, min);
            t(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = s(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f3180d += i13;
        }
        return i13;
    }

    @Override // d2.q
    public final long q() {
        return this.f3180d;
    }

    public final void r(int i10) {
        int i11 = this.f3182f + i10;
        byte[] bArr = this.f3181e;
        if (i11 > bArr.length) {
            this.f3181e = Arrays.copyOf(this.f3181e, f1.b0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override // d2.q
    public final void readFully(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    public final int s(byte[] bArr, int i10, int i11, int i12, boolean z9) {
        if (!Thread.interrupted()) {
            int p3 = this.f3178b.p(bArr, i10 + i12, i11 - i12);
            if (p3 == -1) {
                if (i12 == 0 && z9) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + p3;
        }
        throw new InterruptedIOException();
    }

    public final void t(int i10) {
        byte[] bArr;
        int i11 = this.f3183g - i10;
        this.f3183g = i11;
        this.f3182f = 0;
        byte[] bArr2 = this.f3181e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f3181e = bArr;
    }
}
