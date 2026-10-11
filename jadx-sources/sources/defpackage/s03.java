package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s03 implements x73 {
    public static final s03 a = new Object();
    public static final au4 b = new au4("kotlin.time.Instant", xt4.i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v13, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v17, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v21, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v24, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v27, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v29, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v32, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v33, types: [q03, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v39, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v42, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v45, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v48, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v50, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v53, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v55, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v59, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v61, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v63, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v66, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v69, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v7, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v72, types: [rt3] */
    /* JADX WARN: Type inference failed for: r1v73, types: [r03] */
    /* JADX WARN: Type inference failed for: r1v74, types: [rt3] */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? L;
        int i7;
        boolean z;
        int i8;
        long j;
        char charAt;
        char charAt2;
        m03 m03Var = m03.z;
        String s = l61Var.s();
        s.getClass();
        byte b2 = 29;
        if (s.length() == 0) {
            L = new rt3("An empty string is not a valid Instant", s, b2);
        } else {
            byte b3 = 0;
            char charAt3 = s.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i9 = 0;
            int i10 = i;
            while (i10 < s.length() && '0' <= (charAt2 = s.charAt(i10)) && charAt2 < ':') {
                i9 = (i9 * 10) + (s.charAt(i10) - '0');
                i10++;
            }
            int i11 = i10 - i;
            if (i11 > 10) {
                L = w65.L(s, "Expected at most 10 digits for the year number, got " + i11 + " digits");
            } else if (i11 == 10 && s.charAt(i) >= '2') {
                L = w65.L(s, "Expected at most 9 digits for the year number or year 1000000000, got " + i11 + " digits");
            } else if (i11 < 4) {
                L = w65.L(s, "The year number must be padded to 4 digits, got " + i11 + " digits");
            } else if (charAt3 == '+' && i11 == 4) {
                L = w65.L(s, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i11 != 4) {
                L = w65.L(s, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i9 = -i9;
                }
                int i12 = i10 + 16;
                if (s.length() < i12) {
                    L = w65.L(s, "The input string is too short");
                } else {
                    rt3 K = w65.K(s, "'-'", i10, new t72((byte) 25));
                    if (K != null || (K = w65.K(s, "'-'", i10 + 3, new t72((byte) 26))) != null || (K = w65.K(s, "'T' or 't'", i10 + 6, new t72((byte) 27))) != null || (K = w65.K(s, "':'", i10 + 9, new t72((byte) 28))) != null || (K = w65.K(s, "':'", i10 + 12, new t72(b2))) != null) {
                        L = K;
                    } else {
                        int[] iArr = w65.g;
                        int i13 = 0;
                        while (true) {
                            if (i13 < 10) {
                                L = w65.K(s, "an ASCII digit", iArr[i13] + i10, new p03(b3));
                                if (L != 0) {
                                    break;
                                }
                                i13++;
                                b3 = 0;
                            } else {
                                int M = w65.M(i10 + 1, s);
                                int M2 = w65.M(i10 + 4, s);
                                int M3 = w65.M(i10 + 7, s);
                                int M4 = w65.M(i10 + 10, s);
                                int M5 = w65.M(i10 + 13, s);
                                int i14 = i10 + 15;
                                if (s.charAt(i14) == '.') {
                                    i14 = i12;
                                    int i15 = 0;
                                    while (i14 < s.length() && '0' <= (charAt = s.charAt(i14)) && charAt < ':') {
                                        i15 = (i15 * 10) + (s.charAt(i14) - '0');
                                        i14++;
                                    }
                                    int i16 = i14 - i12;
                                    if (1 <= i16 && i16 < 10) {
                                        i2 = i15 * w65.f[9 - i16];
                                    } else {
                                        L = w65.L(s, "1..9 digits are supported for the fraction of the second, got " + i16 + " digits");
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i14 >= s.length()) {
                                    L = w65.L(s, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = s.charAt(i14);
                                    if (charAt4 != '+' && charAt4 != '-') {
                                        if (charAt4 != 'Z' && charAt4 != 'z') {
                                            L = w65.L(s, "Expected the UTC offset at position " + i14 + ", got '" + charAt4 + '\'');
                                        } else {
                                            int i17 = i14 + 1;
                                            if (s.length() == i17) {
                                                i6 = 0;
                                                if (1 > M) {
                                                }
                                                L = w65.L(s, "Expected a month number in 1..12, got " + M);
                                            } else {
                                                L = w65.L(s, "Extra text after the instant at position " + i17);
                                            }
                                        }
                                    } else {
                                        int length = s.length() - i14;
                                        if (length > 9) {
                                            L = w65.L(s, "The UTC offset string \"" + w65.X(16, s.subSequence(i14, s.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            L = w65.L(s, "Invalid UTC offset string \"" + s.subSequence(i14, s.length()).toString() + '\"');
                                        } else {
                                            int[] iArr2 = w65.h;
                                            int i18 = 0;
                                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                                int i20 = i14 + iArr2[i18];
                                                if (i20 >= s.length()) {
                                                    break;
                                                }
                                                if (s.charAt(i20) != ':') {
                                                    StringBuilder s2 = qx1.s(i20, "Expected ':' at index ", ", got '");
                                                    s2.append(s.charAt(i20));
                                                    s2.append('\'');
                                                    L = w65.L(s, s2.toString());
                                                    break;
                                                }
                                                i18++;
                                            }
                                            int[] iArr3 = w65.i;
                                            int i21 = 0;
                                            while (i21 < 6 && (i7 = iArr3[i21] + i14) < s.length()) {
                                                char charAt5 = s.charAt(i7);
                                                int[] iArr4 = iArr3;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i21++;
                                                    iArr3 = iArr4;
                                                } else {
                                                    StringBuilder s3 = qx1.s(i7, "Expected an ASCII digit at index ", ", got '");
                                                    s3.append(s.charAt(i7));
                                                    s3.append('\'');
                                                    L = w65.L(s, s3.toString());
                                                    break;
                                                }
                                            }
                                            int M6 = w65.M(i14 + 1, s);
                                            if (length > 3) {
                                                i3 = w65.M(i14 + 4, s);
                                            } else {
                                                i3 = 0;
                                            }
                                            if (length > 6) {
                                                i4 = w65.M(i14 + 7, s);
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i3 > 59) {
                                                L = w65.L(s, "Expected offset-minute-of-hour in 0..59, got " + i3);
                                            } else if (i4 > 59) {
                                                L = w65.L(s, "Expected offset-second-of-minute in 0..59, got " + i4);
                                            } else if (M6 > 17 && (M6 != 18 || i3 != 0 || i4 != 0)) {
                                                L = w65.L(s, "Expected an offset in -18:00..+18:00, got " + s.subSequence(i14, s.length()).toString());
                                            } else {
                                                int i22 = (i3 * 60) + (M6 * 3600) + i4;
                                                if (charAt4 == '-') {
                                                    i5 = -1;
                                                } else {
                                                    i5 = 1;
                                                }
                                                i6 = i22 * i5;
                                                if (1 > M && M < 13) {
                                                    if (1 <= M2) {
                                                        int i23 = i9 & 3;
                                                        if (i23 == 0 && (i9 % 100 != 0 || i9 % CommonGatewayClient.CODE_400 == 0)) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (M != 2) {
                                                            if (M != 4 && M != 6 && M != 9 && M != 11) {
                                                                i8 = 31;
                                                            } else {
                                                                i8 = 30;
                                                            }
                                                        } else if (z) {
                                                            i8 = 29;
                                                        } else {
                                                            i8 = 28;
                                                        }
                                                        if (M2 <= i8) {
                                                            if (M3 > 23) {
                                                                L = w65.L(s, "Expected hour in 0..23, got " + M3);
                                                            } else if (M4 > 59) {
                                                                L = w65.L(s, "Expected minute-of-hour in 0..59, got " + M4);
                                                            } else if (M5 > 59) {
                                                                L = w65.L(s, "Expected second-of-minute in 0..59, got " + M5);
                                                            } else {
                                                                long j2 = i9;
                                                                long j3 = 365 * j2;
                                                                if (j2 >= 0) {
                                                                    j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                                } else {
                                                                    j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                }
                                                                long j4 = j + (((M * 367) - 362) / 12) + (M2 - 1);
                                                                if (M > 2) {
                                                                    j4 = (i23 == 0 && (i9 % 100 != 0 || i9 % CommonGatewayClient.CODE_400 == 0)) ? (-1) + j4 : j4 - 2;
                                                                }
                                                                L = new Object();
                                                                L.y = (((j4 - 719528) * 86400) + (((M4 * 60) + (M3 * 3600)) + M5)) - i6;
                                                                L.x = i2;
                                                            }
                                                        }
                                                    }
                                                    StringBuilder u = qx1.u("Expected a valid day-of-month for month ", M, " of year ", i9, ", got ");
                                                    u.append(M2);
                                                    L = w65.L(s, u.toString());
                                                } else {
                                                    L = w65.L(s, "Expected a month number in 1..12, got " + M);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return L.toInstant();
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        m03 m03Var = (m03) obj;
        m03Var.getClass();
        wt1Var.o(m03Var.toString());
    }
}
