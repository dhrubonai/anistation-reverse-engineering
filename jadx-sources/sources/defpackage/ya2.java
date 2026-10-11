package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ya2 implements b12 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ea2 P;
    public long A;
    public xa2 B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public d12 H;
    public bh6[] I;
    public bh6[] J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public final w16 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final zi4 i;
    public final tf6 j;
    public final sp o;
    public final rl0 p;
    public o15 q;
    public byte r;
    public int s;
    public long t;
    public int u;
    public zi4 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final rt3 k = new rt3((byte) 21);
    public final zi4 l = new zi4(16);
    public final zi4 e = new zi4(io3.d);
    public final zi4 f = new zi4(6);
    public final zi4 g = new zi4();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        da2 da2Var = new da2();
        da2Var.o = qy3.n("application/x-emsg");
        P = new ea2(da2Var);
    }

    public ya2(w16 w16Var, int i, tf6 tf6Var, List list) {
        this.a = w16Var;
        this.b = i;
        this.j = tf6Var;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new zi4(bArr);
        z62 z62Var = nw2.y;
        this.q = o15.B;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = d12.g;
        this.I = new bh6[0];
        this.J = new bh6[0];
        this.o = new sp(new h5(this, (byte) 24));
        this.p = new rl0((byte) 0);
        this.M = -1L;
        this.N = -1L;
    }

    public static op1 g(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            q14 q14Var = (q14) arrayList.get(i);
            if (q14Var.y == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = q14Var.z.a;
                uw4 I = tl7.I(bArr);
                if (I == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) I.y;
                }
                if (uuid == null) {
                    kb0.O("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new np1(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new op1(null, false, (np1[]) arrayList2.toArray(new np1[0]));
    }

    public static void i(zi4 zi4Var, int i, xg6 xg6Var) {
        boolean z;
        zi4Var.N(i + 8);
        int m = zi4Var.m();
        byte[] bArr = l90.a;
        if ((m & 1) == 0) {
            if ((m & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int E = zi4Var.E();
            if (E == 0) {
                Arrays.fill(xg6Var.l, 0, xg6Var.e, false);
                return;
            }
            int i2 = xg6Var.e;
            zi4 zi4Var2 = xg6Var.n;
            if (E == i2) {
                Arrays.fill(xg6Var.l, 0, E, z);
                zi4Var2.K(zi4Var.a());
                xg6Var.k = true;
                xg6Var.o = true;
                zi4Var.k(zi4Var2.a, 0, zi4Var2.c);
                zi4Var2.N(0);
                xg6Var.o = false;
                return;
            }
            StringBuilder s = qx1.s(E, "Senc sample count ", " is different from fragment sample count");
            s.append(xg6Var.e);
            throw bj4.a(s.toString(), null);
        }
        throw bj4.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair j(long j, zi4 zi4Var) {
        long G;
        long G2;
        zi4 zi4Var2 = zi4Var;
        zi4Var2.N(8);
        int e = l90.e(zi4Var2.m());
        zi4Var2.O(4);
        long C = zi4Var2.C();
        if (e == 0) {
            G = zi4Var2.C();
            G2 = zi4Var2.C();
        } else {
            G = zi4Var2.G();
            G2 = zi4Var2.G();
        }
        long j2 = G2 + j;
        String str = eq6.a;
        long e0 = eq6.e0(G, 1000000L, C, RoundingMode.DOWN);
        zi4Var2.O(2);
        int H = zi4Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = e0;
        int i = 0;
        while (i < H) {
            int m = zi4Var2.m();
            if ((Integer.MIN_VALUE & m) == 0) {
                long C2 = zi4Var2.C();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long e02 = eq6.e0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i] = e02 - jArr5[i];
                zi4Var2.O(4);
                j3 += iArr[i];
                i++;
                H = H;
                zi4Var2 = zi4Var;
                j4 = e02;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw bj4.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(e0), new ql0(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0930, code lost:
    
        throw defpackage.bj4.d("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00ea, code lost:
    
        r2 = r3.a;
        r4 = r3.b;
        r6 = r50.r;
        r7 = com.unity3d.services.core.device.MimeTypes.VIDEO_H265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x00f5, code lost:
    
        if (r6 != 3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x00f9, code lost:
    
        if (r3.n != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x00fb, code lost:
    
        r6 = r3.d.d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x010a, code lost:
    
        r50.C = r6;
        r6 = r3.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0118, code lost:
    
        if (java.util.Objects.equals(r6.p, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x011c, code lost:
    
        if ((r9 & 64) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x011e, code lost:
    
        r6 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0131, code lost:
    
        r50.F = !r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0139, code lost:
    
        if (r3.f >= r3.i) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x013b, code lost:
    
        r1.v(r50.C);
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0144, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0147, code lost:
    
        r2 = r4.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x014b, code lost:
    
        if (r1 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x014d, code lost:
    
        r2.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0150, code lost:
    
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0154, code lost:
    
        if (r4.k == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x015a, code lost:
    
        if (r4.l[r1] == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x015c, code lost:
    
        r2.O(r2.H() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0169, code lost:
    
        if (r3.c() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x016b, code lost:
    
        r50.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x016e, code lost:
    
        r50.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0171, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x017a, code lost:
    
        if (r3.d.a.h != r38) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x017c, code lost:
    
        r50.C -= 8;
        r1.v(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0187, code lost:
    
        r6 = "audio/ac4".equals(r3.d.a.g.p);
        r9 = r50.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0197, code lost:
    
        if (r6 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0199, code lost:
    
        r50.D = r3.d(r9, 7);
        defpackage.sw0.u(r50.C, r13);
        r2.e(7, r13);
        r9 = r50.D + 7;
        r50.D = r9;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x01b8, code lost:
    
        r50.C += r9;
        r50.r = 4;
        r50.E = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x01b0, code lost:
    
        r6 = 0;
        r9 = r3.d(r9, 0);
        r50.D = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0121, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x012a, code lost:
    
        if (java.util.Objects.equals(r6.p, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x012e, code lost:
    
        if ((r9 & 128) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0104, code lost:
    
        r6 = r4.h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x01c2, code lost:
    
        r6 = r3.d;
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x01c8, code lost:
    
        if (r3.n != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x01ca, code lost:
    
        r11 = r6.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x01d7, code lost:
    
        if (r10 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x01d9, code lost:
    
        r11 = r10.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x01dd, code lost:
    
        r4 = r9.k;
        r6 = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x01e1, code lost:
    
        if (r4 == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x01e3, code lost:
    
        r9 = r50.f;
        r13 = r9.a;
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x01f5, code lost:
    
        r40 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x01fb, code lost:
    
        if (r50.D >= r50.C) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x01fd, code lost:
    
        r4 = r50.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x01ff, code lost:
    
        if (r4 != 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0204, code lost:
    
        if (r50.J.length > 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0208, code lost:
    
        if (r50.F != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x021f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0220, code lost:
    
        r1.readFully(r13, r14, r4 + r4);
        r9.N(0);
        r17 = r9.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x022d, code lost:
    
        if (r17 < 0) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x022f, code lost:
    
        r50.E = r17 - r4;
        r5 = r50.e;
        r52 = r14;
        r5.N(0);
        r2.e(4, r5);
        r50.D += 4;
        r50.C += r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x024d, code lost:
    
        if (r50.J.length <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x024f, code lost:
    
        if (r4 <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0251, code lost:
    
        r5 = defpackage.io3.N(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0255, code lost:
    
        if (r5 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x025c, code lost:
    
        switch(r5.hashCode()) {
            case -1662541442: goto L132;
            case 1331836730: goto L128;
            case 1331856911: goto L124;
            default: goto L123;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x025f, code lost:
    
        r5 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x027e, code lost:
    
        switch(r5) {
            case 0: goto L144;
            case 1: goto L141;
            case 2: goto L138;
            default: goto L147;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x028c, code lost:
    
        if (((r13[r35] & 248) >> 3) != 23) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02a8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02ab, code lost:
    
        r50.G = r5;
        r2.e(r4, r9);
        r50.D += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02b5, code lost:
    
        if (r4 <= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x02b9, code lost:
    
        if (r50.F != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x02bf, code lost:
    
        if (defpackage.io3.T(r13, r4, r6) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x02c1, code lost:
    
        r50.F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x02c4, code lost:
    
        r14 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x02c6, code lost:
    
        r5 = r40;
        r36 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0297, code lost:
    
        if ((r13[4] & 31) != r36) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x02a6, code lost:
    
        if (((r13[4] & 126) >> 1) != 39) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0267, code lost:
    
        if (r5.equals("video/vvc") != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x026a, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0271, code lost:
    
        if (r5.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_H264) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0274, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x027a, code lost:
    
        if (r5.equals(r7) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x027d, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x02aa, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x02d3, code lost:
    
        throw defpackage.bj4.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x020a, code lost:
    
        r4 = defpackage.io3.W(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x021a, code lost:
    
        if ((r4 + r4) > (r50.C - r50.D)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x021c, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x02d4, code lost:
    
        r52 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02d8, code lost:
    
        if (r50.G == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x02da, code lost:
    
        r5 = r50.g;
        r5.K(r4);
        r17 = r7;
        r1.readFully(r5.a, 0, r50.E);
        r2.e(r50.E, r5);
        r4 = r50.E;
        r4 = defpackage.io3.n0(r5.c, r5.a);
        r5.N(0);
        r5.M(r4);
        r4 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0303, code lost:
    
        if (r4 != (-1)) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0307, code lost:
    
        if (r15.a == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0309, code lost:
    
        r15.j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0314, code lost:
    
        r15.a(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0320, code lost:
    
        if ((r3.a() & 4) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0322, code lost:
    
        r15.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0325, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x032f, code lost:
    
        r50.D += r4;
        r50.E -= r4;
        r14 = r52;
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x030f, code lost:
    
        if (r15.a == r4) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0311, code lost:
    
        r15.j(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0328, code lost:
    
        r17 = r7;
        r4 = r2.f(r1, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0376, code lost:
    
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x037c, code lost:
    
        if (r50.F != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x037e, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0381, code lost:
    
        r19 = r1;
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0387, code lost:
    
        if (r1 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0389, code lost:
    
        r22 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0390, code lost:
    
        r17 = r11;
        r2.a(r17, r19, r50.C, 0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x03a1, code lost:
    
        if (r40.isEmpty() != false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x03a3, code lost:
    
        r1 = (defpackage.va2) r40.removeFirst();
        r50.x -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x03b4, code lost:
    
        if (r1.b == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x03b6, code lost:
    
        r4 = r4 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x03b8, code lost:
    
        if (r10 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x03ba, code lost:
    
        r4 = r10.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x03be, code lost:
    
        r20 = r4;
        r2 = r50.I;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x03c4, code lost:
    
        if (r5 >= r4) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x03c6, code lost:
    
        r2[r5].a(r20, 1, r1.c, r50.x, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x03de, code lost:
    
        if (r3.c() != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x03e0, code lost:
    
        r50.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x03e3, code lost:
    
        r50.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x03e7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x038e, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x033e, code lost:
    
        r40 = r5;
        r4 = r3.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0342, code lost:
    
        if (r4 == null) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x034a, code lost:
    
        if (defpackage.h98.C(r6.p) == false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x034c, code lost:
    
        r5 = defpackage.h98.Y(r1, r50.C, r3.m);
        r3.m = r5;
        r5 = r5.a();
        r5.s = r4.t;
        defpackage.zo5.q(r5, r2);
        r3.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0364, code lost:
    
        r4 = r50.D;
        r5 = r50.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0368, code lost:
    
        if (r4 >= r5) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x036a, code lost:
    
        r50.D += r2.f(r1, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x01d1, code lost:
    
        r11 = r4.i[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x069f, code lost:
    
        r3 = (int) (r50.t - r50.u);
        r4 = r50.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x06aa, code lost:
    
        if (r4 == null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x06ac, code lost:
    
        r1.readFully(r4.a, 8, r3);
        r5 = r50.s;
        r3 = new defpackage.q14(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x06be, code lost:
    
        if (r6.isEmpty() != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x06c0, code lost:
    
        ((defpackage.p14) r6.peek()).A.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x086c, code lost:
    
        r1 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x06d0, code lost:
    
        if (r5 != 1936286840) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x06d2, code lost:
    
        r3 = j(r1.getPosition(), r4);
        r7.a((defpackage.ql0) r3.second);
        r4 = r7.a;
        r50.A = ((java.lang.Long) r3.first).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x06ef, code lost:
    
        if (r50.L != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x06f1, code lost:
    
        r5 = r50.H;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x06f8, code lost:
    
        if (r4.size() != 1) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x06fa, code lost:
    
        r3 = (defpackage.hf5) r3.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0703, code lost:
    
        r5.I(r3);
        r50.K = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x070c, code lost:
    
        if ((r9 & 256) == 0) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0710, code lost:
    
        if (r50.L != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0716, code lost:
    
        if (r4.size() <= r10) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0718, code lost:
    
        r50.M = r1.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x06ff, code lost:
    
        r3 = r7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0709, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0723, code lost:
    
        if (r5 != 1701671783) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0728, code lost:
    
        if (r50.I.length != 0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x072c, code lost:
    
        r4.N(8);
        r3 = defpackage.l90.e(r4.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0739, code lost:
    
        if (r3 == 0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x073c, code lost:
    
        if (r3 == 1) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x073e, code lost:
    
        defpackage.h11.r(r3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0745, code lost:
    
        r17 = r4.C();
        r13 = r4.G();
        r19 = java.math.RoundingMode.DOWN;
        r5 = defpackage.eq6.e0(r13, 1000000, r17, r19);
        r7 = defpackage.eq6.e0(r4.C(), 1000, r17, r19);
        r11 = r4.C();
        r3 = r4.v();
        r3.getClass();
        r9 = r4.v();
        r9.getClass();
        r13 = r11;
        r11 = r7;
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07b3, code lost:
    
        r15 = new byte[r4.a()];
        r4.k(r15, 0, r4.a());
        r2 = r50.k;
        r4 = (java.io.DataOutputStream) r2.z;
        r2 = (java.io.ByteArrayOutputStream) r2.y;
        r2.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x07d2, code lost:
    
        r4.writeBytes(r3);
        r4.writeByte(0);
        r4.writeBytes(r9);
        r4.writeByte(0);
        r4.writeLong(r11);
        r4.writeLong(r13);
        r4.write(r15);
        r4.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x07ef, code lost:
    
        r1 = new defpackage.zi4(r2.toByteArray());
        r15 = r1.a();
        r2 = r50.I;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x07fa, code lost:
    
        if (r4 >= r3) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x07fc, code lost:
    
        r9 = r2[r4];
        r1.N(0);
        r9.e(r15, r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x080a, code lost:
    
        if (r5 != (-9223372036854775807L)) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x080c, code lost:
    
        r5.addLast(new defpackage.va2(r15, r7, true));
        r50.x += r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0823, code lost:
    
        if (r5.isEmpty() != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0825, code lost:
    
        r5.addLast(new defpackage.va2(r15, r5, false));
        r50.x += r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0835, code lost:
    
        if (r10 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x083b, code lost:
    
        if (r10.e() != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x083d, code lost:
    
        r5.addLast(new defpackage.va2(r15, r5, false));
        r50.x += r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x084b, code lost:
    
        if (r10 == null) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x084d, code lost:
    
        r5 = r10.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0851, code lost:
    
        r12 = r5;
        r1 = r50.I;
        r2 = r1.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0856, code lost:
    
        if (r5 >= r2) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0858, code lost:
    
        r1[r5].a(r12, 1, r15, 0, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0865, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x086b, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0777, code lost:
    
        r3 = r4.v();
        r3.getClass();
        r9 = r4.v();
        r9.getClass();
        r15 = r4.C();
        r11 = r4.C();
        r17 = java.math.RoundingMode.DOWN;
        r5 = defpackage.eq6.e0(r11, 1000000, r15, r17);
        r7 = r50.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x079a, code lost:
    
        if (r7 == (-9223372036854775807L)) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x079c, code lost:
    
        r7 = r7 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x07a0, code lost:
    
        r11 = defpackage.eq6.e0(r4.C(), 1000, r15, r17);
        r13 = r4.C();
        r48 = r7;
        r7 = r5;
        r5 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x079e, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x086f, code lost:
    
        r1.v(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0976  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r51, defpackage.d42 r52) {
        /*
            Method dump skipped, instructions count: 2918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya2.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        o15 o15Var;
        fu5 k0 = io3.k0(c12Var, true);
        if (k0 != null) {
            o15Var = nw2.s(k0);
        } else {
            z62 z62Var = nw2.y;
            o15Var = o15.B;
        }
        this.q = o15Var;
        if (k0 == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((xa2) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.e).clear();
        this.y = j2;
        this.m.clear();
        this.N = -1L;
        f();
    }

    @Override // defpackage.b12
    public final List d() {
        return this.q;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            d12Var = new tu(d12Var, this.a);
        }
        this.H = d12Var;
        f();
        bh6[] bh6VarArr = new bh6[2];
        this.I = bh6VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            bh6VarArr[0] = this.H.G(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        bh6[] bh6VarArr2 = (bh6[]) eq6.W(this.I, i);
        this.I = bh6VarArr2;
        for (bh6 bh6Var : bh6VarArr2) {
            bh6Var.g(P);
        }
        List list = this.c;
        this.J = new bh6[list.size()];
        while (i4 < this.J.length) {
            bh6 G = this.H.G(i3, 3);
            G.g((ea2) list.get(i4));
            this.J[i4] = G;
            i4++;
            i3++;
        }
    }

    public final void f() {
        this.r = (byte) 0;
        this.u = 0;
    }

    public final void h(hf5 hf5Var, d42 d42Var) {
        this.H.I(hf5Var);
        this.K = true;
        d42Var.a = this.N;
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:446:0x084c, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x084f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x075a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r56) {
        /*
            Method dump skipped, instructions count: 2128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya2.k(long):void");
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
