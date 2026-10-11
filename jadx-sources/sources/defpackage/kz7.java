package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kz7 {
    public static final kz7 b;
    public final cx2 a;

    static {
        int i = cx2.C;
        b = new kz7(w15.E);
    }

    public kz7(cx2 cx2Var) {
        this.a = cx2Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ew2, bx2] */
    public static kz7 a(ze7 ze7Var) {
        String str;
        long j;
        iz7 iz7Var;
        int G = ze7Var.G();
        if (G >= 0) {
            int i = cx2.C;
            ?? ew2Var = new ew2(4);
            long j2 = 0;
            for (int i2 = 0; i2 < G; i2++) {
                long H = ze7Var.H();
                int i3 = (int) H;
                long j3 = H >>> 3;
                if (j3 == 0) {
                    j = 0;
                    str = ze7Var.w();
                } else {
                    long j4 = j3 + j2;
                    if (j4 <= 2305843009213693951L) {
                        str = null;
                        j = j4;
                    } else {
                        jz7.e("Flag name larger than max size");
                        return null;
                    }
                }
                int i4 = i3 & 7;
                if (i4 != 0 && i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    iz7Var = new iz7(j, str, i4, 0L, ze7Var.z());
                                } else {
                                    jz7.e(h11.g(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                                    return null;
                                }
                            } else {
                                iz7Var = new iz7(j, str, i4, 0L, ze7Var.w());
                            }
                        } else {
                            iz7Var = new iz7(j, str, i4, Double.doubleToRawLongBits(ze7Var.o()), null);
                        }
                    } else {
                        iz7Var = new iz7(j, str, i4, ze7Var.H(), null);
                    }
                } else {
                    iz7Var = new iz7(j, str, i4, 0L, null);
                }
                long j5 = iz7Var.x;
                if (j5 != 0) {
                    j2 = j5;
                }
                ew2Var.c(iz7Var);
            }
            return new kz7(ew2Var.i());
        }
        jz7.e("Negative number of flags");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kz7) {
            return this.a.equals(((kz7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        cx2 cx2Var = this.a;
        cx2Var.getClass();
        return bb4.G(cx2Var);
    }
}
