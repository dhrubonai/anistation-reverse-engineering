package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hp0 {
    public static final hp0 h = new hp0(1, 2, 3, null, -1, -1);
    public static final hp0 i = new hp0(1, 1, 2, null, -1, -1);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = eq6.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
    }

    public hp0(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return qx1.h(i2, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String c(int i2) {
        if (i2 != -1) {
            if (i2 != 6) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return qx1.h(i2, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static int d(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        if (i2 != 10) {
                            return 1;
                        }
                        return 4;
                    }
                    return 18;
                }
                return 16;
            }
            return 13;
        }
        return 8;
    }

    public static String e(int i2) {
        if (i2 != -1) {
            if (i2 != 10) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    return qx1.h(i2, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean g(hp0 hp0Var) {
        if (hp0Var == null) {
            return true;
        }
        int i2 = hp0Var.a;
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            int i3 = hp0Var.b;
            if (i3 == -1 || i3 == 2) {
                int i4 = hp0Var.c;
                if ((i4 == -1 || i4 == 3) && hp0Var.d == null) {
                    int i5 = hp0Var.f;
                    if (i5 == -1 || i5 == 8) {
                        int i6 = hp0Var.e;
                        if (i6 == -1 || i6 == 8) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(hp0 hp0Var) {
        if (hp0Var != null) {
            int i2 = hp0Var.c;
            if (i2 == 7 || i2 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 9) {
            return 6;
        }
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            return -1;
        }
        return 2;
    }

    public static int j(int i2) {
        if (i2 != 1) {
            if (i2 != 4) {
                if (i2 != 13) {
                    if (i2 == 16) {
                        return 6;
                    }
                    if (i2 == 18) {
                        return 7;
                    }
                    if (i2 != 6 && i2 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gp0, java.lang.Object] */
    public final gp0 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.e = this.d;
        obj.d = this.e;
        obj.f = this.f;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hp0.class == obj.getClass()) {
            hp0 hp0Var = (hp0) obj;
            if (this.a == hp0Var.a && this.b == hp0Var.b && this.c == hp0Var.c && Arrays.equals(this.d, hp0Var.d) && this.e == hp0Var.e && this.f == hp0Var.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.a != -1 && this.b != -1 && this.c != -1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 == 0) {
            int hashCode = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
            this.g = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 == -1) {
            str = "NA";
        } else {
            str = i2 + "bit Luma";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return h11.k(sb, str2, ")");
    }
}
