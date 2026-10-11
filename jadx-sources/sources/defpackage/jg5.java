package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jg5 extends zd0 {
    public final transient byte[][] B;
    public final transient int[] C;

    public jg5(byte[][] bArr, int[] iArr) {
        super(zd0.A.x);
        this.B = bArr;
        this.C = iArr;
    }

    @Override // defpackage.zd0
    public final String a() {
        return t().a();
    }

    @Override // defpackage.zd0
    public final zd0 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.C;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new zd0(digest);
    }

    @Override // defpackage.zd0
    public final int d() {
        return this.C[this.B.length - 1];
    }

    @Override // defpackage.zd0
    public final String e() {
        return t().e();
    }

    @Override // defpackage.zd0
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zd0) {
                zd0 zd0Var = (zd0) obj;
                if (zd0Var.d() == d() && m(0, zd0Var, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.zd0
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return t().f(i, bArr);
    }

    @Override // defpackage.zd0
    public final byte[] h() {
        return s();
    }

    @Override // defpackage.zd0
    public final int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.C;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.y = i3;
        return i3;
    }

    @Override // defpackage.zd0
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.B;
        int length = bArr.length - 1;
        int[] iArr = this.C;
        tl7.m(iArr[length], i, 1L);
        int J = jf7.J(this, i);
        if (J == 0) {
            i2 = 0;
        } else {
            i2 = iArr[J - 1];
        }
        return bArr[J][(i - i2) + iArr[bArr.length + J]];
    }

    @Override // defpackage.zd0
    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return t().j(i, bArr);
    }

    @Override // defpackage.zd0
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        int i4;
        bArr.getClass();
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i5 = i3 + i;
            int J = jf7.J(this, i);
            while (i < i5) {
                int[] iArr = this.C;
                if (J == 0) {
                    i4 = 0;
                } else {
                    i4 = iArr[J - 1];
                }
                int i6 = iArr[J] - i4;
                byte[][] bArr2 = this.B;
                int i7 = iArr[bArr2.length + J];
                int min = Math.min(i5, i6 + i4) - i;
                if (tl7.g((i - i4) + i7, i2, min, bArr2[J], bArr)) {
                    i2 += min;
                    i += min;
                    J++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.zd0
    public final boolean m(int i, zd0 zd0Var, int i2) {
        int i3;
        zd0Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int J = jf7.J(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.C;
                if (J == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[J - 1];
                }
                int i6 = iArr[J] - i3;
                byte[][] bArr = this.B;
                int i7 = iArr[bArr.length + J];
                int min = Math.min(i4, i6 + i3) - i;
                if (zd0Var.l(i5, (i - i3) + i7, min, bArr[J])) {
                    i5 += min;
                    i += min;
                    J++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.zd0
    public final zd0 n(int i, int i2) {
        if (i >= 0) {
            if (i2 <= d()) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == d()) {
                        return this;
                    }
                    if (i == i2) {
                        return zd0.A;
                    }
                    int J = jf7.J(this, i);
                    int J2 = jf7.J(this, i2 - 1);
                    byte[][] bArr = this.B;
                    byte[][] bArr2 = (byte[][]) ms.D0(bArr, J, J2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.C;
                    if (J <= J2) {
                        int i5 = J;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == J2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (J != 0) {
                        i4 = iArr2[J - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new jg5(bArr2, iArr);
                }
                ze0.e(zo5.m("endIndex=", " < beginIndex=", i2, i));
                return null;
            }
            StringBuilder s = qx1.s(i2, "endIndex=", " > length(");
            s.append(d());
            s.append(')');
            throw new IllegalArgumentException(s.toString().toString());
        }
        ze0.e(qx1.i(i, "beginIndex=", " < 0"));
        return null;
    }

    @Override // defpackage.zd0
    public final zd0 p() {
        return t().p();
    }

    @Override // defpackage.zd0
    public final void r(pa0 pa0Var, int i) {
        int i2;
        int J = jf7.J(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.C;
            if (J == 0) {
                i2 = 0;
            } else {
                i2 = iArr[J - 1];
            }
            int i4 = iArr[J] - i2;
            byte[][] bArr = this.B;
            int i5 = iArr[bArr.length + J];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = (i3 - i2) + i5;
            zf5 zf5Var = new zf5(bArr[J], i6, i6 + min, true);
            zf5 zf5Var2 = pa0Var.x;
            if (zf5Var2 == null) {
                zf5Var.g = zf5Var;
                zf5Var.f = zf5Var;
                pa0Var.x = zf5Var;
            } else {
                zf5 zf5Var3 = zf5Var2.g;
                zf5Var3.getClass();
                zf5Var3.b(zf5Var);
            }
            i3 += min;
            J++;
        }
        pa0Var.y += i;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.B;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.C;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ms.v0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final zd0 t() {
        return new zd0(s());
    }

    @Override // defpackage.zd0
    public final String toString() {
        return t().toString();
    }
}
