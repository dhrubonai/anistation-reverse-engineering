package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rq6 implements x73 {
    public static final rq6 a = new Object();
    public static final au4 b = new au4("kotlin.uuid.Uuid", xt4.i);

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        String concat;
        String s = l61Var.s();
        s.getClass();
        int length = s.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (s.length() <= 64) {
                    concat = s;
                } else {
                    concat = s.substring(0, 64).concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(s.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char charAt = s.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = al2.c[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                fy5.j(i, s, "a hexadecimal digit");
                throw null;
            }
            if (s.charAt(8) == '-') {
                long j4 = 0;
                for (int i2 = 9; i2 < 13; i2++) {
                    long j5 = j4 << 4;
                    char charAt2 = s.charAt(i2);
                    if ((charAt2 >>> '\b') == 0) {
                        long j6 = al2.c[charAt2];
                        if (j6 >= 0) {
                            j4 = j5 | j6;
                        }
                    }
                    fy5.j(i2, s, "a hexadecimal digit");
                    throw null;
                }
                if (s.charAt(13) == '-') {
                    long j7 = 0;
                    for (int i3 = 14; i3 < 18; i3++) {
                        long j8 = j7 << 4;
                        char charAt3 = s.charAt(i3);
                        if ((charAt3 >>> '\b') == 0) {
                            long j9 = al2.c[charAt3];
                            if (j9 >= 0) {
                                j7 = j8 | j9;
                            }
                        }
                        fy5.j(i3, s, "a hexadecimal digit");
                        throw null;
                    }
                    if (s.charAt(18) == '-') {
                        long j10 = 0;
                        for (int i4 = 19; i4 < 23; i4++) {
                            long j11 = j10 << 4;
                            char charAt4 = s.charAt(i4);
                            if ((charAt4 >>> '\b') == 0) {
                                long j12 = al2.c[charAt4];
                                if (j12 >= 0) {
                                    j10 = j11 | j12;
                                }
                            }
                            fy5.j(i4, s, "a hexadecimal digit");
                            throw null;
                        }
                        if (s.charAt(23) == '-') {
                            long j13 = 0;
                            for (int i5 = 24; i5 < 36; i5++) {
                                long j14 = j13 << 4;
                                char charAt5 = s.charAt(i5);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j15 = al2.c[charAt5];
                                    if (j15 >= 0) {
                                        j13 = j14 | j15;
                                    }
                                }
                                fy5.j(i5, s, "a hexadecimal digit");
                                throw null;
                            }
                            long j16 = (j << 32) | (j4 << 16) | j7;
                            long j17 = (j10 << 48) | j13;
                            if (j16 != 0 || j17 != 0) {
                                return new qq6(j16, j17);
                            }
                        } else {
                            fy5.j(23, s, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        fy5.j(18, s, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    fy5.j(13, s, "'-' (hyphen)");
                    throw null;
                }
            } else {
                fy5.j(8, s, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j18 = 0;
            while (i < 16) {
                long j19 = j18 << 4;
                char charAt6 = s.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j20 = al2.c[charAt6];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                        i++;
                    }
                }
                fy5.j(i, s, "a hexadecimal digit");
                throw null;
            }
            long j21 = 0;
            for (int i6 = 16; i6 < 32; i6++) {
                long j22 = j21 << 4;
                char charAt7 = s.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j23 = al2.c[charAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                fy5.j(i6, s, "a hexadecimal digit");
                throw null;
            }
            if (j18 != 0 || j21 != 0) {
                return new qq6(j18, j21);
            }
        }
        return qq6.z;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        qq6 qq6Var = (qq6) obj;
        qq6Var.getClass();
        wt1Var.o(qq6Var.toString());
    }
}
