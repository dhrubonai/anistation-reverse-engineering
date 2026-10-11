package defpackage;

import com.anistation.model.Recent;
import com.anistation.model.watch.WatchSession;
import com.anistation.navigation.Route;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kn2 {
    public static final void a(int i, yc5 yc5Var, boolean z, List list, ic2 ic2Var, sb2 sb2Var, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        yz3 yz3Var2;
        vz3 vz3Var;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-1648672415);
        if (kd2Var2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (kd2Var2.f(yc5Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (kd2Var2.g(z)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (kd2Var2.f(list)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (kd2Var2.h(ic2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (kd2Var2.h(sb2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i14 = i13 | i8 | 1572864;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i14 & 1, z2)) {
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            vz3 vz3Var2 = vz3.x;
            yz3 E = o80.E(kd2Var2, vz3Var2);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z5 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            vz3 vz3Var3 = vz3Var2;
            aj.a(Route.Home.INSTANCE, null, null, null, false, false, sb2Var, null, null, kd2Var2, ((i14 << 3) & 3670016) | 6, 446);
            kd2 kd2Var3 = kd2Var2;
            yz3 K = n77.K(n77.V(ar5.c(vz3Var3, 1.0f), 0.0f, 6.0f, 0.0f, 15.0f, 5), yc5Var, 14);
            z75 a2 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.I, kd2Var3, 54);
            int hashCode2 = Long.hashCode(kd2Var3.T);
            al4 l2 = kd2Var3.l();
            yz3 E2 = o80.E(kd2Var3, K);
            kd2Var3.h0();
            if (kd2Var3.S) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            ss5.i(st0Var, kd2Var3, a2);
            ss5.i(ys0Var, kd2Var3, l2);
            h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
            ss5.i(ys0Var2, kd2Var3, E2);
            if (!list.isEmpty() && !z) {
                kd2Var3.e0(-881031136);
                int i15 = 0;
                for (Object obj : list) {
                    int i16 = i15 + 1;
                    if (i15 >= 0) {
                        String str = (String) obj;
                        if (i == i15) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i14 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean f5 = z4 | kd2Var3.f(str) | kd2Var3.d(i15);
                        Object Q = kd2Var3.Q();
                        if (f5 || Q == au0.a) {
                            Q = new vm(ic2Var, str, i15);
                            kd2Var3.n0(Q);
                        }
                        ub2 ub2Var = (ub2) Q;
                        if (i15 == 0) {
                            f3 = 15.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (i15 == list.size() - 1) {
                            f4 = 15.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        vz3 vz3Var4 = vz3Var3;
                        kd2 kd2Var4 = kd2Var3;
                        db.l(str, z3, ub2Var, n77.V(vz3Var4, f3, 0.0f, f4, 0.0f, 10), null, null, 0L, 0L, false, kd2Var4, 0, 496);
                        i15 = i16;
                        kd2Var3 = kd2Var4;
                        vz3Var3 = vz3Var4;
                    } else {
                        te4.R();
                        throw null;
                    }
                }
                vz3Var = vz3Var3;
                kd2Var3.q(false);
                kd2Var2 = kd2Var3;
            } else {
                vz3Var = vz3Var3;
                kd2Var3.e0(-880463030);
                int i17 = 0;
                while (i17 < 12) {
                    long j = ((mp0) kd2Var3.j(op0.a)).p;
                    o75 o75Var = tm5.b;
                    if (i17 == 0) {
                        f = 15.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (i17 == 11) {
                        f2 = 15.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    kd2 kd2Var5 = kd2Var3;
                    l36.a(n77.V(vz3Var, f, 0.0f, f2, 0.0f, 10), o75Var, j, 0L, 0.0f, 0.0f, null, o80.e, kd2Var5, 12582912, 120);
                    i17++;
                    kd2Var3 = kd2Var5;
                }
                kd2Var2 = kd2Var3;
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new tl(i, yc5Var, z, list, ic2Var, sb2Var, yz3Var2, i2);
        }
    }

    public static final void b(final tm6 tm6Var, final int i, final ic2 ic2Var, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, final ub2 ub2Var3, final sb2 sb2Var2, final sb2 sb2Var3, final sb2 sb2Var4, wc3 wc3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        wc3 wc3Var2;
        wc3 a;
        tm6Var.getClass();
        ic2Var.getClass();
        ub2Var3.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var.f0(1797871636);
        if (kd2Var.f(tm6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (kd2Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (kd2Var.h(ic2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        if (kd2Var.h(ub2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (kd2Var.h(ub2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (kd2Var.h(sb2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i18 = i17 | i8;
        if (kd2Var.h(ub2Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (kd2Var.h(sb2Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (kd2Var.h(sb2Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (kd2Var.h(sb2Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if ((306783379 & i22) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (kd2Var.V(i22 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                a = wc3Var;
            } else {
                a = yc3.a(kd2Var);
            }
            kd2Var.r();
            final sj2 sj2Var = (sj2) kd2Var.j(bv0.l);
            final boolean booleanValue = ((Boolean) kd2Var.j(ie6.c)).booleanValue();
            final boolean booleanValue2 = ((Boolean) kd2Var.j(ie6.d)).booleanValue();
            final yc5 d0 = n77.d0(kd2Var);
            final mx4 S = nx7.S(kd2Var);
            Route.Home home = Route.Home.INSTANCE;
            boolean f = kd2Var.f(a);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                Q = new im1(a, null, (byte) 1);
                kd2Var.n0(Q);
            }
            k66.a(home, (ub2) Q, kd2Var, 6);
            final wc3 wc3Var3 = a;
            x97.b(bx7.h(ar5.c, ((mp0) kd2Var.j(op0.a)).n, io3.h), pk2.C, nx7.R(-122277142, new jc2() { // from class: bn2
                /* JADX WARN: Code restructure failed: missing block: B:100:0x01a0, code lost:
                
                    if (r16.getAdult() != false) goto L174;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x01a2, code lost:
                
                    r7 = r16.getGenres();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
                
                    if (r7 == null) goto L175;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x01ac, code lost:
                
                    if (r7.contains("Ecchi") != false) goto L176;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
                
                    r11.add(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x01b2, code lost:
                
                    r10 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x01b5, code lost:
                
                    if (r10 != null) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:117:0x01b4, code lost:
                
                    r10 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x0130, code lost:
                
                    r9 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x0135, code lost:
                
                    if (r1 == null) goto L88;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x0137, code lost:
                
                    r9 = r1.getTrending();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x013b, code lost:
                
                    if (r9 == null) goto L88;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x013d, code lost:
                
                    r10 = new java.util.ArrayList();
                    r9 = r9.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x014a, code lost:
                
                    if (r9.hasNext() == false) goto L179;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:125:0x014c, code lost:
                
                    r11 = r9.next();
                    r12 = (com.anistation.model.Anime) r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x0157, code lost:
                
                    if (r12.getAdult() != false) goto L183;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0159, code lost:
                
                    r12 = r12.getGenres();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x015d, code lost:
                
                    if (r12 == null) goto L184;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x0163, code lost:
                
                    if (r12.contains("Ecchi") != false) goto L185;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x0165, code lost:
                
                    r10.add(r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x0169, code lost:
                
                    r9 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:142:0x016c, code lost:
                
                    if (r9 != null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x016b, code lost:
                
                    r9 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:168:0x0124, code lost:
                
                    if (r8 == null) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
                
                    if (r8 == null) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
                
                    r8 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
                
                    if (r3 == false) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
                
                    if (r1 == null) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
                
                    r9 = r1.getTrending();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
                
                    if (r9 != null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
                
                    r9 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x016f, code lost:
                
                    if (r3 == false) goto L97;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
                
                    if (r1 == null) goto L94;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
                
                    r10 = r1.getPopular();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0179, code lost:
                
                    if (r10 != null) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x017b, code lost:
                
                    r10 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x01b8, code lost:
                
                    if (r3 == false) goto L121;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x01ba, code lost:
                
                    if (r1 == null) goto L117;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x01bc, code lost:
                
                    r7 = r1.getTop10();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
                
                    if (r7 != 0) goto L120;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x01c5, code lost:
                
                    r4 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x01fe, code lost:
                
                    r1 = new defpackage.b32(r8, r9, r10, r4);
                    r13.n0(r1);
                    r4 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x01c1, code lost:
                
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x01c7, code lost:
                
                    if (r1 == null) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
                
                    r1 = r1.getTop10();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x01cd, code lost:
                
                    if (r1 == null) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x01cf, code lost:
                
                    r7 = new java.util.ArrayList();
                    r1 = r1.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x01dc, code lost:
                
                    if (r1.hasNext() == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x01de, code lost:
                
                    r3 = r1.next();
                    r11 = (com.anistation.model.Anime) r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x01e9, code lost:
                
                    if (r11.getAdult() != false) goto L165;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x01eb, code lost:
                
                    r11 = r11.getGenres();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x01ef, code lost:
                
                    if (r11 == null) goto L166;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x01f5, code lost:
                
                    if (r11.contains("Ecchi") != false) goto L167;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x01f7, code lost:
                
                    r7.add(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x01fc, code lost:
                
                    if (r7 != 0) goto L120;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x01fb, code lost:
                
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x0178, code lost:
                
                    r10 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:
                
                    if (r1 == null) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
                
                    r10 = r1.getPopular();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x0183, code lost:
                
                    if (r10 == null) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
                
                    r11 = new java.util.ArrayList();
                    r10 = r10.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0192, code lost:
                
                    if (r10.hasNext() == false) goto L170;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0194, code lost:
                
                    r12 = r10.next();
                    r16 = (com.anistation.model.Anime) r12;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0359  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x035d  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v16 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v7 */
                /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r7v9 */
                @Override // defpackage.jc2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
                    /*
                        Method dump skipped, instructions count: 923
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bn2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, kd2Var), kd2Var, 3120, 4);
            wc3Var2 = wc3Var3;
        } else {
            kd2Var.Y();
            wc3Var2 = wc3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cn2(tm6Var, i, ic2Var, ub2Var, ub2Var2, sb2Var, ub2Var3, sb2Var2, sb2Var3, sb2Var4, wc3Var2, i2);
        }
    }

    public static final void c(ub2 ub2Var, List list, int i, int i2) {
        ub2Var.invoke(new WatchSession(((Recent) list.get(i2)).getId(), ((Recent) list.get(i2)).getAnilistId(), ((Recent) list.get(i2)).getMalId(), e02.c((Recent) list.get(i2)), nt1.x, i, null, null, 192, null));
    }
}
