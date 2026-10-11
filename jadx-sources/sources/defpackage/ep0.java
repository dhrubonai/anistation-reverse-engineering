package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ep0 {
    public static final long b = w65.f(4278190080L);
    public static final long c = w65.f(4282664004L);
    public static final long d = w65.f(4287137928L);
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    static {
        w65.f(4291611852L);
        e = w65.f(4294967295L);
        f = w65.f(4294901760L);
        w65.f(4278255360L);
        g = w65.f(4278190335L);
        w65.f(4294967040L);
        w65.f(4278255615L);
        w65.f(4294902015L);
        h = w65.e(0);
        float[] fArr = rp0.a;
        i = w65.d(0.0f, 0.0f, 0.0f, 0.0f, rp0.u);
    }

    public /* synthetic */ ep0(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, pp0 pp0Var) {
        vw0 vw0Var;
        pp0 e2 = e(j2);
        int i2 = e2.c;
        int i3 = pp0Var.c;
        if ((i2 | i3) < 0) {
            vw0Var = m37.k(e2, pp0Var);
        } else {
            s34 s34Var = ww0.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = s34Var.b(i4);
            if (b2 == null) {
                b2 = m37.k(e2, pp0Var);
                s34Var.h(i4, b2);
            }
            vw0Var = (vw0) b2;
        }
        return vw0Var.a(j2);
    }

    public static long b(float f2, long j2) {
        return w65.d(g(j2), f(j2), d(j2), f2, e(j2));
    }

    public static final float c(long j2) {
        float h2;
        float f2;
        if ((63 & j2) == 0) {
            h2 = (float) qs5.h((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            h2 = (float) qs5.h((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return h2 / f2;
    }

    public static final float d(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) qs5.h((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - m42.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final pp0 e(long j2) {
        float[] fArr = rp0.a;
        return rp0.y[(int) (j2 & 63)];
    }

    public static final float f(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) qs5.h((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - m42.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) qs5.h((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - m42.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j2) {
        float g2 = g(j2);
        float f2 = f(j2);
        float d2 = d(j2);
        float c2 = c(j2);
        String str = e(j2).a;
        StringBuilder t = qx1.t("Color(", g2, ", ", f2, ", ");
        h11.x(t, d2, ", ", c2, ", ");
        return h11.k(t, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ep0) {
            if (this.a != ((ep0) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
