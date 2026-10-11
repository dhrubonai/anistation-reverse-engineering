package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class l90 {
    public static final byte[] a;

    static {
        String str = eq6.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(zi4 zi4Var) {
        int i = zi4Var.b;
        zi4Var.O(4);
        if (zi4Var.m() != 1751411826) {
            i += 4;
        }
        zi4Var.N(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0573, code lost:
    
        if (r12 == 2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x097b, code lost:
    
        r1.O(r1.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x09b2, code lost:
    
        if (r9 == 0) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09bb, code lost:
    
        if ((r1.A() & 128) == 0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09be, code lost:
    
        r7 = r1.y(4, java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09cb, code lost:
    
        if (r7.equals("mp4a") == false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09d2, code lost:
    
        if ((r1.A() & 128) == 0) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x09d5, code lost:
    
        r1.O(2);
        r11 = new defpackage.yi0();
        r11.l(r1);
        r9 = r11.g(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09e8, code lost:
    
        if (r9 != 31) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x09ea, code lost:
    
        r9 = r11.g(6) + 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09f7, code lost:
    
        r7 = r7 + ".40." + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0179, code lost:
    
        if (r13 == (-1)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x064b  */
    /* JADX WARN: Type inference failed for: r8v38, types: [m3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.zi4 r46, int r47, int r48, int r49, int r50, java.lang.String r51, boolean r52, defpackage.op1 r53, defpackage.i90 r54, int r55) {
        /*
            Method dump skipped, instructions count: 3158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l90.b(zi4, int, int, int, int, java.lang.String, boolean, op1, i90, int):void");
    }

    public static g90 c(int i, zi4 zi4Var) {
        long j;
        zi4Var.N(i + 12);
        zi4Var.O(1);
        d(zi4Var);
        zi4Var.O(2);
        int A = zi4Var.A();
        if ((A & 128) != 0) {
            zi4Var.O(2);
        }
        if ((A & 64) != 0) {
            zi4Var.O(zi4Var.A());
        }
        if ((A & 32) != 0) {
            zi4Var.O(2);
        }
        zi4Var.O(1);
        d(zi4Var);
        String e = qy3.e(zi4Var.A());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            zi4Var.O(4);
            long C = zi4Var.C();
            long C2 = zi4Var.C();
            zi4Var.O(1);
            int d = d(zi4Var);
            long j2 = C2;
            byte[] bArr = new byte[d];
            zi4Var.k(bArr, 0, d);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (C > 0) {
                j = C;
            } else {
                j = -1;
            }
            return new g90(e, bArr, j2, j);
        }
        return new g90(e, null, -1L, -1L);
    }

    public static int d(zi4 zi4Var) {
        int A = zi4Var.A();
        int i = A & 127;
        while ((A & 128) == 128) {
            A = zi4Var.A();
            i = (i << 7) | (A & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(r12, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new defpackage.qo3(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        defpackage.h11.w("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fy3 f(defpackage.p14 r14) {
        /*
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            q14 r0 = r14.i(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            q14 r1 = r14.i(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            q14 r14 = r14.i(r2)
            r2 = 0
            if (r0 == 0) goto Lcb
            if (r1 == 0) goto Lcb
            if (r14 == 0) goto Lcb
            zi4 r0 = r0.z
            r3 = 16
            r0.N(r3)
            int r0 = r0.m()
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L2e
            goto Lcb
        L2e:
            zi4 r0 = r1.z
            r1 = 12
            r0.N(r1)
            int r1 = r0.m()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r5 = r4
        L3d:
            r6 = 8
            if (r5 >= r1) goto L55
            int r7 = r0.m()
            r8 = 4
            r0.O(r8)
            int r7 = r7 - r6
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r0.y(r7, r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L55:
            zi4 r14 = r14.z
            r14.N(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5f:
            int r5 = r14.a()
            if (r5 <= r6) goto Lbf
            int r5 = r14.b
            int r7 = r14.m()
            int r8 = r14.m()
            int r8 = r8 + (-1)
            if (r8 < 0) goto Lb3
            if (r8 >= r1) goto Lb3
            r8 = r3[r8]
            int r9 = r5 + r7
        L79:
            int r10 = r14.b
            if (r10 >= r9) goto Lac
            int r11 = r14.m()
            int r12 = r14.m()
            r13 = 1684108385(0x64617461, float:1.6635614E22)
            if (r12 != r13) goto La7
            int r9 = r14.m()
            int r10 = r14.m()
            int r11 = r11 + (-16)
            byte[] r12 = new byte[r11]
            r14.k(r12, r4, r11)
            qo3 r11 = new qo3     // Catch: java.lang.Exception -> L9f
            r11.<init>(r8, r12, r10, r9)     // Catch: java.lang.Exception -> L9f
            goto Lad
        L9f:
            java.lang.String r9 = "MetadataUtil"
            java.lang.String r10 = "Failed to parse metadata entry with key: "
            defpackage.h11.w(r10, r8, r9)
            goto Lac
        La7:
            int r10 = r10 + r11
            r14.N(r10)
            goto L79
        Lac:
            r11 = r2
        Lad:
            if (r11 == 0) goto Lba
            r0.add(r11)
            goto Lba
        Lb3:
            java.lang.String r9 = "BoxParsers"
            java.lang.String r10 = "Skipped metadata with unknown key index: "
            defpackage.h11.r(r8, r10, r9)
        Lba:
            int r5 = r5 + r7
            r14.N(r5)
            goto L5f
        Lbf:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto Lc6
            goto Lcb
        Lc6:
            fy3 r2 = new fy3
            r2.<init>(r0)
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l90.f(p14):fy3");
    }

    public static z14 g(zi4 zi4Var) {
        long u;
        long u2;
        zi4Var.N(8);
        if (e(zi4Var.m()) == 0) {
            u = zi4Var.C();
            u2 = zi4Var.C();
        } else {
            u = zi4Var.u();
            u2 = zi4Var.u();
        }
        return new z14(u, u2, zi4Var.C());
    }

    public static Pair h(zi4 zi4Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        wg6 wg6Var;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int i5 = zi4Var.b;
        while (i5 - i < i2) {
            zi4Var.N(i5);
            int m = zi4Var.m();
            boolean z5 = false;
            if (m > 0) {
                z = true;
            } else {
                z = false;
            }
            w65.r("childAtomSize must be positive", z);
            if (zi4Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    zi4Var.N(i6);
                    int m2 = zi4Var.m();
                    int m3 = zi4Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(zi4Var.m());
                    } else if (m3 == 1935894637) {
                        zi4Var.O(4);
                        str = zi4Var.y(4, StandardCharsets.UTF_8);
                    } else if (m3 == 1935894633) {
                        i8 = i6;
                        i7 = m2;
                    }
                    i6 += m2;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    w65.r("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    w65.r("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            zi4Var.N(i9);
                            int m4 = zi4Var.m();
                            if (zi4Var.m() == 1952804451) {
                                int e = e(zi4Var.m());
                                zi4Var.O(1);
                                if (e == 0) {
                                    zi4Var.O(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int A = zi4Var.A();
                                    i3 = A & 15;
                                    i4 = (A & 240) >> 4;
                                }
                                if (zi4Var.A() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int A2 = zi4Var.A();
                                byte[] bArr2 = new byte[16];
                                zi4Var.k(bArr2, 0, 16);
                                if (z4 && A2 == 0) {
                                    int A3 = zi4Var.A();
                                    byte[] bArr3 = new byte[A3];
                                    zi4Var.k(bArr3, 0, A3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                wg6Var = new wg6(z4, str, A2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m4;
                            }
                        } else {
                            num = num3;
                            wg6Var = null;
                            break;
                        }
                    }
                    if (wg6Var != null) {
                        z5 = true;
                    }
                    w65.r("tenc atom is mandatory", z5);
                    String str2 = eq6.a;
                    create = Pair.create(num, wg6Var);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0317  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, jv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i90 i(defpackage.zi4 r66, defpackage.k90 r67, java.lang.String r68, defpackage.op1 r69, boolean r70) {
        /*
            Method dump skipped, instructions count: 3364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l90.i(zi4, k90, java.lang.String, op1, boolean):i90");
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x00ee, code lost:
    
        if (r29 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x00f0, code lost:
    
        r29 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x062b  */
    /* JADX WARN: Type inference failed for: r7v56, types: [ed4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [sg6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList j(defpackage.p14 r56, defpackage.pd2 r57, long r58, defpackage.op1 r60, boolean r61, boolean r62, defpackage.qc2 r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 3100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l90.j(p14, pd2, long, op1, boolean, boolean, qc2, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a4, code lost:
    
        if (r12 != 1851878757) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
    
        r3 = r1.w(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ad, code lost:
    
        if (r12 != 1684108385) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01af, code lost:
    
        r8 = r10;
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b1, code lost:
    
        r1.O(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b9, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01bb, code lost:
    
        if (r3 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01be, code lost:
    
        if (r8 != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d7, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d8, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c1, code lost:
    
        r1.N(r8);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d4, code lost:
    
        r8 = new defpackage.z13(r0, r3, r1.w(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a3, code lost:
    
        defpackage.kb0.q("MetadataUtil", "Skipped unknown metadata entry: ".concat(defpackage.qa0.c(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ae, code lost:
    
        r1.N(r13);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e0, code lost:
    
        r3 = 16777215 & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
    
        if (r3 != 6516084) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e9, code lost:
    
        r0 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f1, code lost:
    
        if (r1.m() != 1684108385) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f3, code lost:
    
        r1.O(8);
        r0 = r1.w(r0 - 16);
        r8 = new defpackage.lq0("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0208, code lost:
    
        defpackage.kb0.O("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.qa0.c(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0219, code lost:
    
        if (r3 == 7233901) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021e, code lost:
    
        if (r3 != 7631467) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0225, code lost:
    
        if (r3 == 6516589) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x022a, code lost:
    
        if (r3 != 7828084) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.N(r7);
        r7 = r7 + r13;
        r1.O(r0);
        r6 = new java.util.ArrayList();
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0231, code lost:
    
        if (r3 != 6578553) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0233, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x023d, code lost:
    
        if (r3 != 4280916) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x023f, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0249, code lost:
    
        if (r3 != 7630703) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x024b, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0255, code lost:
    
        if (r3 != 6384738) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0257, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0262, code lost:
    
        if (r3 != 7108978) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0264, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x026f, code lost:
    
        if (r3 != 6776174) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0271, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027a, code lost:
    
        if (r3 != 6779504) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027c, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0287, code lost:
    
        if (r3 != 7173742) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0289, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0294, code lost:
    
        if (r3 != 7173737) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0296, code lost:
    
        r0 = defpackage.tl7.H(r10, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x029e, code lost:
    
        r1.N(r13);
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b3, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02bb, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r10 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02cf, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02d2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02d7, code lost:
    
        if (r6.isEmpty() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r10 >= r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02db, code lost:
    
        r12 = new defpackage.fy3(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        defpackage.kb0.O("MetadataUtil", "Skipped empty metadata entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02c3, code lost:
    
        if (r8 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x02c5, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02c8, code lost:
    
        r0 = 8;
        r11 = 1;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r13 = r13 + r10;
        r10 = r1.m();
        r8 = (r10 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if ((r13 - r1.b) >= r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        defpackage.kb0.O("MetadataUtil", "Skipped empty metadata entry: ".concat(defpackage.qa0.c(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r8 == 169) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r8 != 253) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r10 != 1735291493) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r3 = defpackage.hu2.a(defpackage.tl7.G(r1) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r8 = new defpackage.rc6(defpackage.nw2.s(r3), "TCON", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        defpackage.kb0.O("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r10 != 1684632427) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        r8 = defpackage.tl7.F(r10, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r10 != 1953655662) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        r8 = defpackage.tl7.F(r10, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        if (r10 != 1953329263) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        r8 = defpackage.tl7.H(r10, "TBPM", r1, r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r10 != 1668311404) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r8 = defpackage.tl7.H(r10, "TCMP", r1, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        if (r10 != 1668249202) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r25 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        r8 = defpackage.tl7.E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        if (r10 != 1631670868) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        if (r10 != 1936682605) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        if (r10 != 1936679276) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011a, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        if (r10 != 1936679282) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0126, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:
    
        if (r10 != 1936679265) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013c, code lost:
    
        if (r10 != 1936679791) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013e, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        if (r10 != 1920233063) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014b, code lost:
    
        r8 = defpackage.tl7.H(r10, "ITUNESADVISORY", r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
    
        if (r10 != 1885823344) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0159, code lost:
    
        r8 = defpackage.tl7.H(r10, "ITUNESGAPLESS", r1, false, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0165, code lost:
    
        if (r10 != 1936683886) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0172, code lost:
    
        if (r10 != 1953919848) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0174, code lost:
    
        r8 = defpackage.tl7.K(r10, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017f, code lost:
    
        if (r10 != 757935405) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0181, code lost:
    
        r0 = r12;
        r3 = r0;
        r8 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0185, code lost:
    
        r10 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0187, code lost:
    
        if (r10 >= r13) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        r14 = r1.m();
        r12 = r1.m();
        r1.O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0198, code lost:
    
        if (r12 != 1835360622) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019a, code lost:
    
        r0 = r1.w(r14 - 12);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x037e  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fy3 k(defpackage.q14 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l90.k(q14, boolean):fy3");
    }
}
