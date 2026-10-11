package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kk0 implements CharSequence {
    public CharSequence A;
    public Object B;
    public final /* synthetic */ byte x = 1;
    public int y;
    public int z;

    public kk0(mk0 mk0Var, int i, int i2) {
        this.B = mk0Var;
        this.y = i;
        this.z = i2;
    }

    public void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            hz2.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            hz2.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            hz2.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            hz2.a("textStart must be non-negative, but was " + i3);
        }
        fd2 fd2Var = (fd2) this.B;
        int i5 = i4 - i3;
        if (fd2Var == null) {
            int max = Math.max(255, i5 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.A.length() - i2, 64);
            int i6 = i - min;
            ss5.k(this.A, cArr, 0, i6, i);
            int i7 = max - min2;
            int i8 = min2 + i2;
            ss5.k(this.A, cArr, i7, i2, i8);
            ss5.k(charSequence, cArr, min, i3, i4);
            fd2 fd2Var2 = new fd2((byte) 1);
            fd2Var2.b = max;
            fd2Var2.c = cArr;
            fd2Var2.d = min + i5;
            fd2Var2.e = i7;
            this.B = fd2Var2;
            this.y = i6;
            this.z = i8;
            return;
        }
        int i9 = this.y;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 >= 0 && i11 <= fd2Var.b - fd2Var.a()) {
            int i12 = i5 - (i11 - i10);
            if (i12 > fd2Var.a()) {
                int a = i12 - fd2Var.a();
                int i13 = fd2Var.b;
                do {
                    i13 *= 2;
                } while (i13 - fd2Var.b < a);
                char[] cArr2 = new char[i13];
                ms.y0(fd2Var.c, cArr2, 0, 0, fd2Var.d);
                int i14 = fd2Var.b;
                int i15 = fd2Var.e;
                int i16 = i14 - i15;
                int i17 = i13 - i16;
                ms.y0(fd2Var.c, cArr2, i17, i15, i16 + i15);
                fd2Var.c = cArr2;
                fd2Var.b = i13;
                fd2Var.e = i17;
            }
            int i18 = fd2Var.d;
            if (i10 < i18 && i11 <= i18) {
                int i19 = i18 - i11;
                char[] cArr3 = fd2Var.c;
                ms.y0(cArr3, cArr3, fd2Var.e - i19, i11, i18);
                fd2Var.d = i10;
                fd2Var.e -= i19;
            } else if (i10 < i18 && i11 >= i18) {
                fd2Var.e = fd2Var.a() + i11;
                fd2Var.d = i10;
            } else {
                int a2 = fd2Var.a() + i10;
                int a3 = fd2Var.a() + i11;
                int i20 = fd2Var.e;
                char[] cArr4 = fd2Var.c;
                ms.y0(cArr4, cArr4, fd2Var.d, i20, a2);
                i10 = fd2Var.d + (a2 - i20);
                fd2Var.d = i10;
                fd2Var.e = a3;
            }
            ss5.k(charSequence, fd2Var.c, i10, i3, i4);
            fd2Var.d += i5;
            return;
        }
        this.A = toString();
        this.B = null;
        this.y = -1;
        this.z = -1;
        a(i, i2, charSequence, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.x) {
            case 0:
                int i2 = this.y + i;
                if (i >= 0) {
                    if (i2 < this.z) {
                        return ((mk0) this.B).c(i2);
                    }
                    StringBuilder s = qx1.s(i, "index (", ") should be less than length (");
                    s.append(length());
                    s.append(')');
                    throw new IllegalArgumentException(s.toString().toString());
                }
                ze0.e(qx1.h(i, "index is negative: "));
                return (char) 0;
            default:
                fd2 fd2Var = (fd2) this.B;
                if (fd2Var == null) {
                    return this.A.charAt(i);
                }
                if (i < this.y) {
                    return this.A.charAt(i);
                }
                int a = fd2Var.b - fd2Var.a();
                int i3 = this.y;
                if (i < a + i3) {
                    int i4 = i - i3;
                    int i5 = fd2Var.d;
                    char[] cArr = fd2Var.c;
                    if (i4 < i5) {
                        return cArr[i4];
                    }
                    return cArr[(i4 - i5) + fd2Var.e];
                }
                return this.A.charAt(i - ((a - this.z) + i3));
        }
    }

    public boolean equals(Object obj) {
        switch (this.x) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                mk0 mk0Var = (mk0) this.B;
                int i = this.y;
                int length = length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (mk0Var.c(i + i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.x) {
            case 0:
                String str = (String) this.A;
                if (str != null) {
                    return str.hashCode();
                }
                mk0 mk0Var = (mk0) this.B;
                int i = this.z;
                int i2 = 0;
                for (int i3 = this.y; i3 < i; i3++) {
                    i2 = (i2 * 31) + mk0Var.c(i3);
                }
                return i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.x) {
            case 0:
                return this.z - this.y;
            default:
                fd2 fd2Var = (fd2) this.B;
                CharSequence charSequence = this.A;
                if (fd2Var == null) {
                    return charSequence.length();
                }
                return (fd2Var.b - fd2Var.a()) + (charSequence.length() - (this.z - this.y));
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.x) {
            case 0:
                if (i >= 0) {
                    if (i <= i2) {
                        int i3 = this.z;
                        int i4 = this.y;
                        if (i2 <= i3 - i4) {
                            if (i == i2) {
                                return "";
                            }
                            return new kk0((mk0) this.B, i + i4, i4 + i2);
                        }
                        v71.j("end should be less than length (", length(), 41);
                        return null;
                    }
                    throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
                }
                ze0.e(qx1.h(i, "start is negative: "));
                return null;
            default:
                return toString().subSequence(i, i2);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.x) {
            case 0:
                String str = (String) this.A;
                if (str == null) {
                    String obj = ((mk0) this.B).b(this.y, this.z).toString();
                    this.A = obj;
                    return obj;
                }
                return str;
            default:
                fd2 fd2Var = (fd2) this.B;
                if (fd2Var == null) {
                    return this.A.toString();
                }
                StringBuilder sb = new StringBuilder((this.A.length() + ((fd2Var.b - fd2Var.a()) + this.y)) - this.z);
                sb.append(this.A, 0, this.y);
                sb.append(fd2Var.c, 0, fd2Var.d);
                char[] cArr = fd2Var.c;
                int i = fd2Var.e;
                sb.append(cArr, i, fd2Var.b - i);
                CharSequence charSequence = this.A;
                sb.append(charSequence, this.z, charSequence.length());
                return sb.toString();
        }
    }

    public /* synthetic */ kk0() {
    }
}
