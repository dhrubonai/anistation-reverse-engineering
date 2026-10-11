package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import com.anistation.android.R;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.DownloadStorageUsage;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class sl1 {
    public static final void a(final DownloadStorageUsage downloadStorageUsage, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        DownloadStorageUsage downloadStorageUsage2;
        kd2Var.f0(1550792663);
        if (kd2Var.h(downloadStorageUsage)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            Context context = (Context) kd2Var.j(eb.b);
            final String formatFileSize = Formatter.formatFileSize(context, downloadStorageUsage.getInternalBytes());
            final String formatFileSize2 = Formatter.formatFileSize(context, downloadStorageUsage.getExternalBytes());
            final String formatFileSize3 = Formatter.formatFileSize(context, downloadStorageUsage.getUsedBytes());
            final String formatFileSize4 = Formatter.formatFileSize(context, downloadStorageUsage.getFreeBytes());
            long freeBytes = downloadStorageUsage.getFreeBytes() + downloadStorageUsage.getUsedBytes();
            if (freeBytes < 1) {
                freeBytes = 1;
            }
            float f = (float) freeBytes;
            final px5 b = xj.b(((float) downloadStorageUsage.getInternalBytes()) / f, null, "internalStorageFraction", kd2Var, 3072, 22);
            final px5 b2 = xj.b(((float) downloadStorageUsage.getExternalBytes()) / f, null, "externalStorageFraction", kd2Var, 3072, 22);
            final long j = ip0.o;
            final long j2 = ip0.n;
            tq1 tq1Var = op0.a;
            final long j3 = ((mp0) kd2Var.j(tq1Var)).r;
            formatFileSize.getClass();
            formatFileSize2.getClass();
            formatFileSize4.getClass();
            final String g = lz5.g(R.string.storage_accessibility_summary, new Object[]{formatFileSize, formatFileSize2, formatFileSize4}, kd2Var);
            yz3 c = ar5.c(vz3.x, 1.0f);
            long j4 = ((mp0) kd2Var.j(tq1Var)).p;
            o75 o75Var = ((cn5) kd2Var.j(dn5.a)).d;
            ic2 ic2Var = new ic2() { // from class: pl1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    Object obj3;
                    final long j5;
                    final long j6;
                    kd2 kd2Var2 = (kd2) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z2)) {
                        vz3 vz3Var = vz3.x;
                        yz3 R = n77.R(vz3Var, 16.0f);
                        tr trVar = x97.z;
                        w50 w50Var = pk2.K;
                        xp0 a = vp0.a(trVar, w50Var, kd2Var2, 0);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        yz3 E = o80.E(kd2Var2, R);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z3 = kd2Var2.S;
                        t53 t53Var = za3.p0;
                        if (z3) {
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
                        z75 a2 = y75.a(x97.y, pk2.I, kd2Var2, 48);
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, vz3Var);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a2);
                        ss5.i(ys0Var, kd2Var2, l2);
                        h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E2);
                        sl1.d(R.drawable.sd_card, kd2Var2, 0);
                        ov5.a(kd2Var2, ar5.l(vz3Var, 14.0f));
                        xp0 a3 = vp0.a(trVar, w50Var, kd2Var2, 0);
                        int hashCode3 = Long.hashCode(kd2Var2.T);
                        al4 l3 = kd2Var2.l();
                        yz3 E3 = o80.E(kd2Var2, vz3Var);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a3);
                        ss5.i(ys0Var, kd2Var2, l3);
                        h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E3);
                        String f2 = lz5.f(R.string.available_storage, kd2Var2);
                        tq1 tq1Var2 = pl6.a;
                        xd6 xd6Var = ((nl6) kd2Var2.j(tq1Var2)).j;
                        s92 s92Var = s92.C;
                        tq1 tq1Var3 = op0.a;
                        yc6.b(f2, null, ((mp0) kd2Var2.j(tq1Var3)).q, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var2, 1572864, 0, 131002);
                        ov5.a(kd2Var2, ar5.e(vz3Var, 4.0f));
                        String str = formatFileSize3;
                        str.getClass();
                        String str2 = formatFileSize4;
                        yc6.b(lz5.g(R.string.storage_used_and_free, new Object[]{str, str2}, kd2Var2), null, ep0.b(0.68f, ((mp0) kd2Var2.j(tq1Var3)).q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(tq1Var2)).l, kd2Var2, 0, 0, 131066);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        ov5.a(kd2Var2, ar5.e(vz3Var, 20.0f));
                        yz3 k = n03.k(ar5.e(ar5.c(vz3Var, 1.0f), 10.0f), p75.a);
                        String str3 = g;
                        boolean f3 = kd2Var2.f(str3);
                        Object Q = kd2Var2.Q();
                        q18 q18Var = au0.a;
                        if (f3 || Q == q18Var) {
                            Q = new zg(str3, (byte) 13);
                            kd2Var2.n0(Q);
                        }
                        yz3 a4 = rh5.a(k, false, (ub2) Q);
                        final long j7 = j3;
                        boolean e = kd2Var2.e(j7);
                        final px5 px5Var = b;
                        boolean f4 = e | kd2Var2.f(px5Var);
                        final DownloadStorageUsage downloadStorageUsage3 = downloadStorageUsage;
                        boolean h = f4 | kd2Var2.h(downloadStorageUsage3);
                        long j8 = j;
                        boolean e2 = h | kd2Var2.e(j8);
                        final px5 px5Var2 = b2;
                        boolean f5 = e2 | kd2Var2.f(px5Var2);
                        long j9 = j2;
                        boolean e3 = f5 | kd2Var2.e(j9);
                        Object Q2 = kd2Var2.Q();
                        if (!e3 && Q2 != q18Var) {
                            j5 = j9;
                            obj3 = Q2;
                            j6 = j8;
                        } else {
                            j5 = j9;
                            j6 = j8;
                            obj3 = new ub2() { // from class: nl1
                                @Override // defpackage.ub2
                                public final Object invoke(Object obj4) {
                                    float f6;
                                    bp1 bp1Var = (bp1) obj4;
                                    bp1Var.getClass();
                                    bp1.k0(bp1Var, j7, 0L, bp1Var.g(), 0.0f, 122);
                                    float g0 = bp1Var.g0(3.0f);
                                    float B = db.B(((Number) px5Var.getValue()).floatValue(), 0.0f, 1.0f) * Float.intBitsToFloat((int) (bp1Var.g() >> 32));
                                    DownloadStorageUsage downloadStorageUsage4 = downloadStorageUsage3;
                                    if (downloadStorageUsage4.getInternalBytes() > 0) {
                                        if (B < g0) {
                                            B = g0;
                                        }
                                        float intBitsToFloat = Float.intBitsToFloat((int) (bp1Var.g() >> 32));
                                        if (B > intBitsToFloat) {
                                            B = intBitsToFloat;
                                        }
                                        f6 = B;
                                    } else {
                                        f6 = 0.0f;
                                    }
                                    if (f6 > 0.0f) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L));
                                        bp1.k0(bp1Var, j6, 0L, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 0.0f, 122);
                                    }
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (bp1Var.g() >> 32)) - f6;
                                    if (intBitsToFloat3 < 0.0f) {
                                        intBitsToFloat3 = 0.0f;
                                    }
                                    float B2 = db.B(((Number) px5Var2.getValue()).floatValue(), 0.0f, 1.0f) * Float.intBitsToFloat((int) (bp1Var.g() >> 32));
                                    if (downloadStorageUsage4.getExternalBytes() > 0) {
                                        if (B2 >= g0) {
                                            g0 = B2;
                                        }
                                        if (g0 <= intBitsToFloat3) {
                                            intBitsToFloat3 = g0;
                                        }
                                    } else {
                                        intBitsToFloat3 = 0.0f;
                                    }
                                    if (intBitsToFloat3 > 0.0f) {
                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L));
                                        bp1.k0(bp1Var, j5, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), 0.0f, 120);
                                    }
                                    return pn6.a;
                                }
                            };
                            kd2Var2.n0(obj3);
                        }
                        w65.c(a4, (ub2) obj3, kd2Var2, 0);
                        ov5.a(kd2Var2, ar5.e(vz3Var, 16.0f));
                        yz3 c2 = ar5.c(vz3Var, 1.0f);
                        z75 a5 = y75.a(x97.B, pk2.H, kd2Var2, 6);
                        int hashCode4 = Long.hashCode(kd2Var2.T);
                        al4 l4 = kd2Var2.l();
                        yz3 E4 = o80.E(kd2Var2, c2);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a5);
                        ss5.i(ys0Var, kd2Var2, l4);
                        h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E4);
                        String f6 = lz5.f(R.string.internal, kd2Var2);
                        b85 b85Var = b85.a;
                        sl1.e(f6, formatFileSize, j6, b85Var.a(1.0f, true), kd2Var2, 0);
                        sl1.e(lz5.f(R.string.external, kd2Var2), formatFileSize2, j5, b85Var.a(1.0f, true), kd2Var2, 0);
                        sl1.e(lz5.f(R.string.free, kd2Var2), str2, j7, b85Var.a(1.0f, true), kd2Var2, 0);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            };
            downloadStorageUsage2 = downloadStorageUsage;
            l36.a(c, o75Var, j4, 0L, 0.0f, 0.0f, null, nx7.R(1875496818, ic2Var, kd2Var), kd2Var, 12582918, 120);
        } else {
            downloadStorageUsage2 = downloadStorageUsage;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(downloadStorageUsage2, i, (byte) 12);
        }
    }

    public static final void b(DownloadSettings downloadSettings, DownloadStorageUsage downloadStorageUsage, sb2 sb2Var, sb2 sb2Var2, ub2 ub2Var, sb2 sb2Var3, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kd2 kd2Var2 = kd2Var;
        downloadSettings.getClass();
        downloadStorageUsage.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        ub2Var.getClass();
        kd2Var2.f0(1408429166);
        if (kd2Var2.h(downloadSettings)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (kd2Var2.h(downloadStorageUsage)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (kd2Var2.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (kd2Var2.h(sb2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (kd2Var2.h(ub2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (kd2Var2.h(sb2Var3)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i13 & 1, z)) {
            z22 z22Var = ar5.c;
            yz3 h = bx7.h(z22Var, ((mp0) kd2Var2.j(op0.a)).n, io3.h);
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, h);
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
            Route.DownloadSettings downloadSettings2 = Route.DownloadSettings.INSTANCE;
            String f = lz5.f(R.string.download_settings, kd2Var2);
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new vj1((byte) 4);
                kd2Var2.n0(Q);
            }
            aj.a(downloadSettings2, null, null, f, true, false, (sb2) Q, null, sb2Var3, kd2Var, ((i13 << 9) & 234881024) | 1794054, 134);
            kd2Var2 = kd2Var;
            vo3 c = b90.c(pk2.y, false);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, z22Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, c);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            yz3 n = ar5.n(ar5.c(n90.a.a(vz3.x, pk2.z), 1.0f), 0.0f, 720.0f, 1);
            vh4 vh4Var = new vh4(15.0f, 8.0f, 15.0f, 28.0f);
            vr vrVar = new vr(14.0f, true, new ze0((byte) 6));
            boolean h2 = kd2Var2.h(downloadSettings);
            if ((i13 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h2 | z2;
            if ((i13 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            if ((i13 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h3 = z7 | z4 | kd2Var2.h(downloadStorageUsage);
            Object Q2 = kd2Var2.Q();
            if (h3 || Q2 == q18Var) {
                g5 g5Var = new g5(downloadSettings, sb2Var, sb2Var2, ub2Var, downloadStorageUsage, (byte) 4);
                kd2Var2.n0(g5Var);
                Q2 = g5Var;
            }
            n77.h(n, null, vh4Var, vrVar, null, null, false, null, (ub2) Q2, kd2Var2, 24576, 490);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new is6(downloadSettings, downloadStorageUsage, sb2Var, sb2Var2, ub2Var, sb2Var3, i);
        }
    }

    public static final void c(DownloadSettings downloadSettings, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(-278217922);
        if (kd2Var.h(downloadSettings)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.h(sb2Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            l36.a(ar5.c(vz3.x, 1.0f), ((cn5) kd2Var.j(dn5.a)).d, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(395361497, new ql1(sb2Var, downloadSettings, sb2Var2), kd2Var), kd2Var, 12582918, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ql1(downloadSettings, sb2Var, sb2Var2, i);
        }
    }

    public static final void d(int i, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        kd2Var.f0(425612019);
        if (kd2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 i5 = ar5.i(vz3Var, 40.0f);
            tq1 tq1Var = op0.a;
            yz3 h = bx7.h(i5, ep0.b(0.12f, ((mp0) kd2Var.j(tq1Var)).o), p75.a);
            vo3 c = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            yt2.a(w65.H(i, kd2Var, i4 & 14), null, ar5.i(vz3Var, 21.0f), ((mp0) kd2Var.j(tq1Var)).o, kd2Var, 440, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new r(i, i2);
        }
    }

    public static final void e(String str, String str2, long j, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(592786719);
        if (kd2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var2.e(j)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var2.f(yz3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i9 & 1, z)) {
            z75 a = y75.a(x97.A, pk2.H, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, yz3Var);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z2 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z2) {
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
            vz3 vz3Var = vz3.x;
            b90.a(bx7.h(ar5.i(n77.V(vz3Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 8.0f), j, p75.a), kd2Var2, 0);
            ov5.a(kd2Var2, ar5.l(vz3Var, 7.0f));
            xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, vz3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            tq1 tq1Var = pl6.a;
            xd6 xd6Var = ((nl6) kd2Var2.j(tq1Var)).n;
            tq1 tq1Var2 = op0.a;
            yc6.b(str, null, ep0.b(0.65f, ((mp0) kd2Var2.j(tq1Var2)).q), 0L, null, null, 0L, null, 0L, 0, false, 1, 0, xd6Var, kd2Var2, i9 & 14, 24576, 114682);
            yc6.b(str2, null, ((mp0) kd2Var2.j(tq1Var2)).q, 0L, s92.C, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var2.j(tq1Var)).l, kd2Var2, ((i9 >> 3) & 14) | 1572864, 24960, 110522);
            kd2Var2 = kd2Var2;
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ol1(str, str2, j, yz3Var, i, (byte) 0);
        }
    }

    public static final void f(boolean z, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z2;
        kd2Var.f0(433917117);
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        byte b = 0;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i5 & 1, z2)) {
            l36.a(ar5.c(vz3.x, 1.0f), ((cn5) kd2Var.j(dn5.a)).d, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(181741570, new rl1(b, ub2Var, z), kd2Var), kd2Var, 12582918, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new rl1(z, ub2Var, i);
        }
    }
}
