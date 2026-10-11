package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class dk1 {
    public static final void a(final DownloadAnimeGroup downloadAnimeGroup, final List list, final List list2, final List list3, final bw1 bw1Var, final List list4, final ArrayList arrayList, final String str, final boolean z, final String str2, final ub2 ub2Var, final boolean z2, final Set set, af3 af3Var, final ub2 ub2Var2, final ub2 ub2Var3, final ub2 ub2Var4, final ub2 ub2Var5, final ic2 ic2Var, final sb2 sb2Var, final sb2 sb2Var2, final ub2 ub2Var6, final ub2 ub2Var7, kd2 kd2Var, int i) {
        int i2;
        kd2 kd2Var2;
        kd2Var.f0(1022641370);
        int i3 = i | (kd2Var.h(downloadAnimeGroup) ? 4 : 2) | (kd2Var.f(list) ? 32 : 16) | (kd2Var.f(list2) ? 256 : 128) | (kd2Var.f(list3) ? 2048 : 1024) | (kd2Var.d(bw1Var.ordinal()) ? 16384 : 8192) | (kd2Var.f(list4) ? 131072 : 65536) | (kd2Var.f(arrayList) ? 1048576 : 524288) | (kd2Var.f(str) ? 8388608 : 4194304) | (kd2Var.g(z) ? 67108864 : 33554432) | (kd2Var.f(str2) ? 536870912 : 268435456);
        int i4 = 805306368 | (kd2Var.h(ub2Var) ? 4 : 2) | (kd2Var.g(z2) ? 32 : 16) | (kd2Var.f(set) ? 256 : 128) | (kd2Var.f(af3Var) ? 2048 : 1024) | (kd2Var.h(ub2Var2) ? 16384 : 8192) | (kd2Var.h(ub2Var3) ? 131072 : 65536) | (kd2Var.h(ub2Var4) ? 1048576 : 524288) | (kd2Var.h(ub2Var5) ? 8388608 : 4194304) | (kd2Var.h(ic2Var) ? 67108864 : 33554432);
        int i5 = (kd2Var.h(sb2Var2) ? (char) 4 : (char) 2) | (kd2Var.h(ub2Var6) ? ' ' : (char) 16) | (kd2Var.h(ub2Var7) ? 256 : 128);
        if (kd2Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            z22 z22Var = ar5.c;
            vh4 k = n77.k(0.0f, 0.0f, 0.0f, 20.0f, 7);
            boolean h = ((i3 & 896) == 256) | kd2Var.h(downloadAnimeGroup) | ((i3 & 112) == 32) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 3670016) == 1048576) | ((i5 & 14) == 4) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((1879048192 & i3) == 536870912) | ((i4 & 14) == 4) | ((i4 & 57344) == 16384) | ((i4 & 458752) == 131072) | ((i3 & 7168) == 2048) | ((i4 & 29360128) == 8388608) | ((i4 & 234881024) == 67108864) | ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object Q = kd2Var.Q();
            if (h || Q == au0.a) {
                i2 = i4;
                ub2 ub2Var8 = new ub2() { // from class: xj1
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        pe3 pe3Var = (pe3) obj;
                        pe3Var.getClass();
                        DownloadAnimeGroup downloadAnimeGroup2 = downloadAnimeGroup;
                        List list5 = list;
                        boolean z3 = z2;
                        Set set2 = set;
                        ub2 ub2Var9 = ub2Var4;
                        pe3.A0(pe3Var, "download-hero", new os0(1992534437, true, new qj1(downloadAnimeGroup2, list5, z3, set2, ub2Var9, sb2Var, sb2Var2, (byte) 1)), 2);
                        pe3.A0(pe3Var, "download-list-chips", new os0(971126606, true, new rj1(bw1Var, list4, arrayList, str, z, str2, ub2Var, ub2Var2, ub2Var3, (byte) 1)), 2);
                        dk1.i(pe3Var, list3, list2, z3, set2, ub2Var9, ub2Var5, ic2Var, ub2Var6, ub2Var7);
                        return pn6.a;
                    }
                };
                kd2Var2 = kd2Var;
                kd2Var2.n0(ub2Var8);
                Q = ub2Var8;
            } else {
                kd2Var2 = kd2Var;
                i2 = i4;
            }
            n77.h(z22Var, af3Var, k, null, null, null, false, null, (ub2) Q, kd2Var2, ((i2 >> 6) & 112) | 390, 504);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new pj1(downloadAnimeGroup, list, list2, list3, bw1Var, list4, arrayList, str, z, str2, ub2Var, z2, set, af3Var, ub2Var2, ub2Var3, ub2Var4, ub2Var5, ic2Var, sb2Var, sb2Var2, ub2Var6, ub2Var7, i, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        if (r22 > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a8, code lost:
    
        if (r8.length() > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015d, code lost:
    
        if (r7 > 0) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.anistation.model.download.DownloadAnimeGroup r39, java.util.List r40, boolean r41, java.util.Set r42, defpackage.ub2 r43, defpackage.sb2 r44, defpackage.sb2 r45, defpackage.kd2 r46, int r47) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk1.b(com.anistation.model.download.DownloadAnimeGroup, java.util.List, boolean, java.util.Set, ub2, sb2, sb2, kd2, int):void");
    }

    public static final void c(bw1 bw1Var, List list, ArrayList arrayList, String str, boolean z, String str2, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        kd2 kd2Var2;
        yz3 yz3Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kd2Var.f0(197049331);
        if (kd2Var.d(bw1Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (kd2Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (kd2Var.f(arrayList)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i13 = i12 | i4;
        if (kd2Var.f(str)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (kd2Var.g(z)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (kd2Var.f(str2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (kd2Var.h(ub2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (kd2Var.h(ub2Var2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (kd2Var.h(ub2Var3)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10 | 805306368;
        if ((306783379 & i19) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i19 & 1, z2)) {
            vz3 vz3Var = vz3.x;
            yz3 K = n77.K(n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 0.0f, 0.0f, 6.0f, 7), n77.d0(kd2Var), 14);
            z75 a = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.I, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, K);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z7 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z7) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            yz3 T = n77.T(vz3Var, 15.0f, 0.0f, 2);
            z75 a2 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 6);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, T);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a2);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            if (bw1Var == bw1.y) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i20 = i19 & 29360128;
            if (i20 == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (z4 || Q == q18Var) {
                Q = new wi(ub2Var2, (byte) 2);
                kd2Var.n0(Q);
            }
            db.l("Oldest", z3, (ub2) Q, null, null, null, 0L, 0L, false, kd2Var, 0, 504);
            if (bw1Var == bw1.x) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i20 == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q2 = kd2Var.Q();
            if (z6 || Q2 == q18Var) {
                Q2 = new wi(ub2Var2, (byte) 3);
                kd2Var.n0(Q2);
            }
            db.l("Newest", z5, (ub2) Q2, null, null, null, 0L, 0L, false, kd2Var, 0, 504);
            kd2Var2 = kd2Var;
            if (list.size() > 1) {
                kd2Var2.e0(247217454);
                ArrayList arrayList2 = new ArrayList(zo0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dj1) it.next()).b);
                }
                t80.a(arrayList2, str2, ub2Var, null, null, false, null, 0L, null, null, kd2Var, (i19 >> 12) & 1008, 1016);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(247487495);
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            if (z) {
                kd2Var2.e0(901901171);
                int i21 = i19 >> 6;
                kd2 kd2Var3 = kd2Var2;
                t80.a(arrayList, str, ub2Var3, n77.V(vz3Var, 0.0f, 0.0f, 15.0f, 0.0f, 11), null, false, null, 0L, null, null, kd2Var3, (i21 & 112) | (i21 & 14) | 3072 | ((i19 >> 18) & 896), 1008);
                kd2Var2 = kd2Var3;
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(902170251);
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new th(bw1Var, list, arrayList, str, z, str2, ub2Var, ub2Var2, ub2Var3, yz3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final com.anistation.model.download.DownloadAnimeGroup r35, final java.util.List r36, boolean r37, final defpackage.ub2 r38, final defpackage.ub2 r39, final defpackage.ic2 r40, defpackage.ub2 r41, defpackage.sb2 r42, defpackage.kd2 r43, int r44) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk1.d(com.anistation.model.download.DownloadAnimeGroup, java.util.List, boolean, ub2, ub2, ic2, ub2, sb2, kd2, int):void");
    }

    public static final void e(w44 w44Var, w44 w44Var2, String str) {
        w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
        if (((Boolean) w44Var.getValue()).booleanValue()) {
            w44Var2.setValue(el5.W((Set) w44Var2.getValue(), str));
        }
    }

    public static final void f(w44 w44Var, String str) {
        LinkedHashSet W;
        if (((Set) w44Var.getValue()).contains(str)) {
            W = el5.V((Set) w44Var.getValue(), str);
        } else {
            W = el5.W((Set) w44Var.getValue(), str);
        }
        w44Var.setValue(W);
    }

    public static final void g(w44 w44Var, w44 w44Var2) {
        w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
        if (!((Boolean) w44Var.getValue()).booleanValue()) {
            w44Var2.setValue(tt1.x);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    public static final void h(DownloadAnimeGroup downloadAnimeGroup, List list, final List list2, final List list3, final bw1 bw1Var, final List list4, final ArrayList arrayList, final String str, final boolean z, final String str2, final ub2 ub2Var, final boolean z2, final Set set, af3 af3Var, final ub2 ub2Var2, final ub2 ub2Var3, final ub2 ub2Var4, final ub2 ub2Var5, final ic2 ic2Var, sb2 sb2Var, sb2 sb2Var2, final ub2 ub2Var6, final ub2 ub2Var7, kd2 kd2Var, int i) {
        int i2;
        int i3;
        st0 st0Var;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        kd2Var.f0(-195353714);
        int i6 = i | (kd2Var.h(downloadAnimeGroup) ? 4 : 2) | (kd2Var.f(list) ? 32 : 16) | (kd2Var.f(list2) ? 256 : 128) | (kd2Var.f(list3) ? 2048 : 1024) | (kd2Var.d(bw1Var.ordinal()) ? 16384 : 8192) | (kd2Var.f(list4) ? 131072 : 65536) | (kd2Var.f(arrayList) ? 1048576 : 524288) | (kd2Var.f(str) ? 8388608 : 4194304) | (kd2Var.g(z) ? 67108864 : 33554432) | (kd2Var.f(str2) ? 536870912 : 268435456);
        int i7 = 805306368 | (kd2Var.h(ub2Var) ? 4 : 2) | (kd2Var.g(z2) ? 32 : 16) | (kd2Var.f(set) ? 256 : 128) | (kd2Var.f(af3Var) ? 2048 : 1024) | (kd2Var.h(ub2Var2) ? 16384 : 8192) | (kd2Var.h(ub2Var3) ? 131072 : 65536) | (kd2Var.h(ub2Var4) ? 1048576 : 524288) | (kd2Var.h(ub2Var5) ? 8388608 : 4194304) | (kd2Var.h(ic2Var) ? 67108864 : 33554432);
        int i8 = (kd2Var.h(sb2Var2) ? (char) 4 : (char) 2) | (kd2Var.h(ub2Var6) ? ' ' : (char) 16) | (kd2Var.h(ub2Var7) ? 256 : 128);
        if (kd2Var.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            yz3 T = n77.T(ar5.c, 15.0f, 0.0f, 2);
            z75 a = y75.a(new vr(16.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 6);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, T);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z5 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var2 = p7.F;
            ss5.i(st0Var2, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var3 = p7.G;
            ss5.i(st0Var3, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            if (0.5f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            ob3 ob3Var = new ob3(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            z22 z22Var = ar5.b;
            yz3 w = ob3Var.w(z22Var);
            vo3 c = b90.c(pk2.z, false);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, w);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var2, kd2Var, c);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var3, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            vz3 vz3Var = vz3.x;
            yz3 w2 = ar5.c(ar5.n(vz3Var, 0.0f, 640.0f, 1), 1.0f).w(z22Var);
            vh4 k = n77.k(0.0f, 5.0f, 0.0f, 20.0f, 5);
            int i9 = i7 & 112;
            int i10 = i7 & 896;
            int i11 = i7 & 3670016;
            boolean h = kd2Var.h(downloadAnimeGroup) | ((i6 & 112) == 32) | (i9 == 32) | (i10 == 256) | (i11 == 1048576) | ((i8 & 14) == 4);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (h || Q == q18Var) {
                i2 = i6;
                i3 = i10;
                st0Var = st0Var2;
                i4 = i11;
                i5 = i7;
                z3 = true;
                nj1 nj1Var = new nj1(downloadAnimeGroup, list, z2, set, ub2Var4, sb2Var, sb2Var2);
                kd2Var.n0(nj1Var);
                Q = nj1Var;
            } else {
                i2 = i6;
                i3 = i10;
                st0Var = st0Var2;
                i4 = i11;
                i5 = i7;
                z3 = true;
            }
            boolean z6 = z3;
            n77.h(w2, null, k, null, null, null, false, null, (ub2) Q, kd2Var, 390, 506);
            kd2Var.q(z6);
            if (0.5f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            yz3 w3 = new ob3(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, z6).w(z22Var);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, w3);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, c2);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var3, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            yz3 w4 = ar5.c(ar5.n(vz3Var, 0.0f, 720.0f, z6 ? 1 : 0), 1.0f).w(z22Var);
            vh4 k2 = n77.k(0.0f, 5.0f, 0.0f, 20.0f, 5);
            int i12 = i2;
            ?? r1 = ((i12 & 896) != 256 ? false : z6 ? 1 : 0) | ((1879048192 & i12) == 536870912 ? z6 ? 1 : 0 : false) | ((i12 & 458752) != 131072 ? false : z6 ? 1 : 0) | ((i12 & 57344) == 16384 ? z6 ? 1 : 0 : false) | ((i12 & 3670016) != 1048576 ? false : z6 ? 1 : 0) | ((i12 & 29360128) == 8388608 ? z6 ? 1 : 0 : false) | ((i12 & 234881024) == 67108864 ? z6 ? 1 : 0 : false) | ((i5 & 14) == 4 ? z6 ? 1 : 0 : false) | ((i5 & 57344) == 16384 ? z6 ? 1 : 0 : false) | ((i5 & 458752) == 131072 ? z6 ? 1 : 0 : false) | ((i12 & 7168) != 2048 ? false : z6 ? 1 : 0) | (i9 == 32 ? z6 ? 1 : 0 : false) | (i3 != 256 ? false : z6 ? 1 : 0) | (i4 == 1048576 ? z6 ? 1 : 0 : false) | ((i5 & 29360128) == 8388608 ? z6 ? 1 : 0 : false) | ((i5 & 234881024) == 67108864 ? z6 ? 1 : 0 : false) | ((i8 & 112) == 32 ? z6 ? 1 : 0 : false) | ((i8 & 896) == 256 ? z6 ? 1 : 0 : false);
            Object Q2 = kd2Var.Q();
            if (r1 == true || Q2 == q18Var) {
                z4 = z6 ? 1 : 0;
                ub2 ub2Var8 = new ub2() { // from class: oj1
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        pe3 pe3Var = (pe3) obj;
                        pe3Var.getClass();
                        pe3.A0(pe3Var, "download-list-chips", new os0(1424284292, true, new rj1(bw1Var, list4, arrayList, str, z, str2, ub2Var, ub2Var2, ub2Var3, (byte) 0)), 2);
                        dk1.i(pe3Var, list3, list2, z2, set, ub2Var4, ub2Var5, ic2Var, ub2Var6, ub2Var7);
                        return pn6.a;
                    }
                };
                kd2Var.n0(ub2Var8);
                Q2 = ub2Var8;
            } else {
                z4 = z6 ? 1 : 0;
            }
            n77.h(w4, af3Var, k2, null, null, null, false, null, (ub2) Q2, kd2Var, ((i5 >> 6) & 112) | 390, 504);
            kd2Var.q(z4);
            kd2Var.q(z4);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new pj1(downloadAnimeGroup, list, list2, list3, bw1Var, list4, arrayList, str, z, str2, ub2Var, z2, set, af3Var, ub2Var2, ub2Var3, ub2Var4, ub2Var5, ic2Var, sb2Var, sb2Var2, ub2Var6, ub2Var7, i, (byte) 0);
        }
    }

    public static final void i(pe3 pe3Var, List list, List list2, boolean z, Set set, ub2 ub2Var, ub2 ub2Var2, ic2 ic2Var, ub2 ub2Var3, ub2 ub2Var4) {
        pe3Var.B0(list.size(), new od(new f01((byte) 8), list, (byte) 9), new eo(list, (byte) 5), new os0(802480018, true, new bk1(list, list2, set, ub2Var3, z, ub2Var2, ic2Var, ub2Var, ub2Var4)));
        pe3.A0(pe3Var, "download-list-spacer", h98.e, 2);
    }
}
