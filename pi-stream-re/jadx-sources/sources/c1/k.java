package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final k f1760h = new k(1, 2, 3, null, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1763c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1765e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1766f;

    /* renamed from: g, reason: collision with root package name */
    public int f1767g;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
    }

    public k(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f1761a = i10;
        this.f1762b = i11;
        this.f1763c = i12;
        this.f1764d = bArr;
        this.f1765e = i13;
        this.f1766f = i14;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean b(k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (kVar == null) {
            return true;
        }
        int i14 = kVar.f1761a;
        if ((i14 == -1 || i14 == 1 || i14 == 2) && (((i10 = kVar.f1762b) == -1 || i10 == 2) && (((i11 = kVar.f1763c) == -1 || i11 == 3) && kVar.f1764d == null && (((i12 = kVar.f1766f) == -1 || i12 == 8) && ((i13 = kVar.f1765e) == -1 || i13 == 8))))) {
            return true;
        }
        return false;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int d(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f1761a == kVar.f1761a && this.f1762b == kVar.f1762b && this.f1763c == kVar.f1763c && Arrays.equals(this.f1764d, kVar.f1764d) && this.f1765e == kVar.f1765e && this.f1766f == kVar.f1766f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1767g == 0) {
            this.f1767g = ((((Arrays.hashCode(this.f1764d) + ((((((527 + this.f1761a) * 31) + this.f1762b) * 31) + this.f1763c) * 31)) * 31) + this.f1765e) * 31) + this.f1766f;
        }
        return this.f1767g;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        boolean z9 = true;
        int i10 = this.f1761a;
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb.append(str);
        sb.append(", ");
        int i11 = this.f1762b;
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(a(this.f1763c));
        sb.append(", ");
        if (this.f1764d == null) {
            z9 = false;
        }
        sb.append(z9);
        sb.append(", ");
        String str4 = "NA";
        int i12 = this.f1765e;
        if (i12 == -1) {
            str3 = "NA";
        } else {
            str3 = i12 + "bit Luma";
        }
        sb.append(str3);
        sb.append(", ");
        int i13 = this.f1766f;
        if (i13 != -1) {
            str4 = i13 + "bit Chroma";
        }
        return a3.g.t(sb, str4, ")");
    }
}
