package k9;

import java.security.MessageDigest;
import r6.h0;

/* loaded from: classes.dex */
public final class t extends j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f6555e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f6556f;

    public t(byte[][] bArr, int[] iArr) {
        super(j.f6522d.f6523a);
        this.f6555e = bArr;
        this.f6556f = iArr;
    }

    @Override // k9.j
    public final String a() {
        throw null;
    }

    @Override // k9.j
    public final j b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f6555e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f6556f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        h0.q(digest);
        return new j(digest);
    }

    @Override // k9.j
    public final int c() {
        return this.f6556f[this.f6555e.length - 1];
    }

    @Override // k9.j
    public final String d() {
        return new j(l()).d();
    }

    @Override // k9.j
    public final byte[] e() {
        return l();
    }

    @Override // k9.j
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.c() != c() || !h(jVar, c())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // k9.j
    public final byte f(int i10) {
        int i11;
        byte[][] bArr = this.f6555e;
        int length = bArr.length - 1;
        int[] iArr = this.f6556f;
        q6.g.h(iArr[length], i10, 1L);
        int Y = com.bumptech.glide.d.Y(this, i10);
        if (Y == 0) {
            i11 = 0;
        } else {
            i11 = iArr[Y - 1];
        }
        return bArr[Y][(i10 - i11) + iArr[bArr.length + Y]];
    }

    @Override // k9.j
    public final boolean g(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        h0.u(bArr, "other");
        if (i10 < 0 || i10 > c() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int Y = com.bumptech.glide.d.Y(this, i10);
        while (i10 < i14) {
            int[] iArr = this.f6556f;
            if (Y == 0) {
                i13 = 0;
            } else {
                i13 = iArr[Y - 1];
            }
            int i15 = iArr[Y] - i13;
            byte[][] bArr2 = this.f6555e;
            int i16 = iArr[bArr2.length + Y];
            int min = Math.min(i14, i15 + i13) - i10;
            if (!q6.g.b(bArr2[Y], (i10 - i13) + i16, bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            Y++;
        }
        return true;
    }

    @Override // k9.j
    public final boolean h(j jVar, int i10) {
        int i11;
        h0.u(jVar, "other");
        if (c() - i10 < 0) {
            return false;
        }
        int i12 = i10 + 0;
        int Y = com.bumptech.glide.d.Y(this, 0);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int[] iArr = this.f6556f;
            if (Y == 0) {
                i11 = 0;
            } else {
                i11 = iArr[Y - 1];
            }
            int i15 = iArr[Y] - i11;
            byte[][] bArr = this.f6555e;
            int i16 = iArr[bArr.length + Y];
            int min = Math.min(i12, i15 + i11) - i13;
            if (!jVar.g(i14, bArr[Y], (i13 - i11) + i16, min)) {
                return false;
            }
            i14 += min;
            i13 += min;
            Y++;
        }
        return true;
    }

    @Override // k9.j
    public final int hashCode() {
        int i10 = this.f6524b;
        if (i10 == 0) {
            byte[][] bArr = this.f6555e;
            int length = bArr.length;
            int i11 = 0;
            int i12 = 1;
            int i13 = 0;
            while (i11 < length) {
                int[] iArr = this.f6556f;
                int i14 = iArr[length + i11];
                int i15 = iArr[i11];
                byte[] bArr2 = bArr[i11];
                int i16 = (i15 - i13) + i14;
                while (i14 < i16) {
                    i12 = (i12 * 31) + bArr2[i14];
                    i14++;
                }
                i11++;
                i13 = i15;
            }
            this.f6524b = i12;
            return i12;
        }
        return i10;
    }

    @Override // k9.j
    public final j i() {
        return new j(l()).i();
    }

    @Override // k9.j
    public final void k(g gVar, int i10) {
        int i11;
        h0.u(gVar, "buffer");
        int i12 = 0 + i10;
        int Y = com.bumptech.glide.d.Y(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            int[] iArr = this.f6556f;
            if (Y == 0) {
                i11 = 0;
            } else {
                i11 = iArr[Y - 1];
            }
            int i14 = iArr[Y] - i11;
            byte[][] bArr = this.f6555e;
            int i15 = iArr[bArr.length + Y];
            int min = Math.min(i12, i14 + i11) - i13;
            int i16 = (i13 - i11) + i15;
            r rVar = new r(bArr[Y], i16, i16 + min, true);
            r rVar2 = gVar.f6520a;
            if (rVar2 == null) {
                rVar.f6551g = rVar;
                rVar.f6550f = rVar;
                gVar.f6520a = rVar;
            } else {
                r rVar3 = rVar2.f6551g;
                h0.q(rVar3);
                rVar3.b(rVar);
            }
            i13 += min;
            Y++;
        }
        gVar.f6521b += i10;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f6555e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f6556f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            x6.i.h1(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // k9.j
    public final String toString() {
        return new j(l()).toString();
    }
}
