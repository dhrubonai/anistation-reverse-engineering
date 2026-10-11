package defpackage;

import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import com.anistation.android.R;
import com.anistation.model.animelist.WatchStatus;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wt5 {
    public static final void a(final String str, final int i, boolean z, final sb2 sb2Var, kd2 kd2Var, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        final boolean z4;
        boolean z5;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(1506289514);
        if (kd2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if (kd2Var2.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        int i11 = i3 & 4;
        if (i11 != 0) {
            i7 = i10 | 384;
            z2 = z;
        } else {
            z2 = z;
            if (kd2Var2.g(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i10 | i6;
        }
        if (kd2Var2.h(sb2Var)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i12 = i7 | i8;
        if ((i12 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var2.V(i12 & 1, z3)) {
            if (i11 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            vz3 vz3Var = vz3.x;
            yz3 T = n77.T(kb0.A(ar5.c(vz3Var, 1.0f), false, null, null, false, sb2Var, kd2Var2, ((i12 << 9) & 3670016) | 6, 31), 0.0f, 12.0f, 1);
            x50 x50Var = pk2.I;
            z75 a = y75.a(x97.B, x50Var, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, T);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z6 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z6) {
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
            z75 a2 = y75.a(x97.y, x50Var, kd2Var2, 48);
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
            yt2.a(w65.H(i, kd2Var2, (i12 >> 3) & 14), str, ar5.i(vz3Var, 24.0f), 0L, kd2Var2, 392 | ((i12 << 3) & 112), 8);
            ov5.a(kd2Var2, ar5.l(vz3Var, 16.0f));
            xd6 a3 = xd6.a(((nl6) kd2Var2.j(pl6.a)).j, 0L, s92.B, null, 0L, null, 0L, null, 16777211);
            tq1 tq1Var = op0.a;
            yc6.b(str, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, a3, kd2Var, i12 & 14, 0, 131066);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            if (z5) {
                kd2Var2.e0(546219817);
                yt2.a(w65.H(R.drawable.tick, kd2Var2, 0), lz5.f(R.string.selected_text, kd2Var2), ar5.i(vz3Var, 18.0f), ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 392, 0);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(546486324);
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            z4 = z5;
        } else {
            kd2Var2.Y();
            z4 = z2;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2(str, i, z4, sb2Var, i2, i3) { // from class: o17
                public final /* synthetic */ sb2 A;
                public final /* synthetic */ byte B;
                public final /* synthetic */ String x;
                public final /* synthetic */ int y;
                public final /* synthetic */ boolean z;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.B = i3;
                }

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    wt5.a(this.x, this.y, this.z, this.A, (kd2) obj, N, this.B);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(String str, List list, final int i, final ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final List list2;
        Object obj;
        kd2 kd2Var2 = kd2Var;
        str.getClass();
        list.getClass();
        ub2Var.getClass();
        kd2Var2.f0(-481308342);
        if (kd2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (kd2Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (kd2Var2.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (kd2Var2.h(ub2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i10 & 1, z)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (w65.U(((l16) obj).b) == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            l16 l16Var = (l16) obj;
            xp0 a = vp0.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            vz3 vz3Var = vz3.x;
            yz3 E = o80.E(kd2Var2, vz3Var);
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
            yz3 c = ar5.c(vz3Var, 1.0f);
            z75 a2 = y75.a(x97.B, pk2.I, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, c);
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
            xd6 xd6Var = ((nl6) kd2Var2.j(pl6.a)).j;
            s92 s92Var = s92.C;
            tq1 tq1Var = op0.a;
            yc6.b(str, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, (i10 & 14) | 1572864, 0, 131002);
            kd2Var2 = kd2Var;
            if (l16Var == null) {
                kd2Var2.e0(-316236380);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-316236379);
                n03.b(null, new vh4(10.0f, 4.0f, 10.0f, 4.0f), ((mp0) kd2Var2.j(tq1Var)).r, 0L, null, nx7.R(1429335875, new cu5(l16Var, (byte) 3), kd2Var2), kd2Var2, 1572912, 57);
                kd2Var2 = kd2Var2;
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            byte b = 6;
            list2 = list;
            q23.b(ar5.c(vz3Var, 1.0f), new vr(14.0f, true, new ze0(b)), new vr(14.0f, true, new ze0(b)), null, 0, 0, nx7.R(-995837809, new jc2() { // from class: m16
                @Override // defpackage.jc2
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean z3;
                    boolean z4;
                    long b2;
                    float f;
                    kd2 kd2Var3 = (kd2) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((t62) obj2).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kd2Var3.V(intValue & 1, z3)) {
                        for (l16 l16Var2 : list2) {
                            long j = l16Var2.b;
                            if (w65.U(j) == i) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                kd2Var3.e0(-372865402);
                                b2 = ((mp0) kd2Var3.j(op0.a)).o;
                                kd2Var3.q(false);
                            } else {
                                kd2Var3.e0(-372773518);
                                b2 = ep0.b(0.15f, ((mp0) kd2Var3.j(op0.a)).o);
                                kd2Var3.q(false);
                            }
                            px5 a3 = jq5.a(b2, z51.V(200, 6, null), "colorSwatchBorder", kd2Var3);
                            float f2 = 1.0f;
                            if (z4) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            px5 b3 = xj.b(f, z51.V(200, 6, null), "colorSwatchCheckScale", kd2Var3, 3120, 20);
                            long j2 = ep0.e;
                            if (cm6.a(j, j2) || cm6.a(j, w65.f(4294961979L))) {
                                j2 = ep0.b;
                            }
                            long j3 = j2;
                            vz3 vz3Var2 = vz3.x;
                            yz3 i11 = ar5.i(vz3Var2, 42.0f);
                            o75 o75Var = tm5.b;
                            yz3 h = bx7.h(i11, j, o75Var);
                            if (z4) {
                                f2 = 2.5f;
                            }
                            yz3 f3 = m37.f(h, f2, ((ep0) a3.getValue()).a, o75Var);
                            ub2 ub2Var2 = ub2Var;
                            boolean f4 = kd2Var3.f(ub2Var2) | kd2Var3.f(l16Var2);
                            Object Q = kd2Var3.Q();
                            if (f4 || Q == au0.a) {
                                Q = new lb5((Object) ub2Var2, (Object) l16Var2, (byte) 8);
                                kd2Var3.n0(Q);
                            }
                            kd2 kd2Var4 = kd2Var3;
                            yz3 A = kb0.A(f3, false, null, null, false, (sb2) Q, kd2Var4, 0, 31);
                            vo3 c2 = b90.c(pk2.C, false);
                            int hashCode3 = Long.hashCode(kd2Var4.T);
                            al4 l3 = kd2Var4.l();
                            yz3 E3 = o80.E(kd2Var4, A);
                            tt0.d.getClass();
                            kd2Var4.h0();
                            if (kd2Var4.S) {
                                kd2Var4.k(za3.p0);
                            } else {
                                kd2Var4.q0();
                            }
                            ss5.i(p7.F, kd2Var4, c2);
                            ss5.i(p7.E, kd2Var4, l3);
                            ss5.i(p7.G, kd2Var4, Integer.valueOf(hashCode3));
                            ss5.h(kd2Var4);
                            ss5.i(p7.D, kd2Var4, E3);
                            xh4 H = w65.H(R.drawable.check, kd2Var4, 0);
                            String str2 = l16Var2.a;
                            yz3 i12 = ar5.i(vz3Var2, 20.0f);
                            float floatValue = ((Number) b3.getValue()).floatValue();
                            yt2.a(H, str2, oi4.E(i12, floatValue, floatValue), j3, kd2Var4, 8, 0);
                            kd2Var3 = kd2Var4;
                            kd2Var3.q(true);
                        }
                    } else {
                        kd2Var3.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var2), kd2Var2, 1573302, 56);
            kd2Var2.q(true);
        } else {
            list2 = list;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new je(str, list2, i, ub2Var, i2, (byte) 14);
        }
    }

    public static final long c(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = xh6.c;
        return floatToRawIntBits;
    }

    public static final void d(boolean z, WatchStatus watchStatus, ub2 ub2Var, sb2 sb2Var, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int ordinal;
        int i3;
        int i4;
        boolean z2;
        yz3 yz3Var2;
        float f;
        ee1 ee1Var;
        ub2Var.getClass();
        sb2Var.getClass();
        kd2Var.f0(990117805);
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (watchStatus == null) {
            ordinal = -1;
        } else {
            ordinal = watchStatus.ordinal();
        }
        if (kd2Var.d(ordinal)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.h(ub2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4 | 24576;
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i7 & 1, z2)) {
            if (!z) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    u.d = new n10(z, watchStatus, ub2Var, sb2Var, i);
                    return;
                }
                return;
            }
            List I = te4.I(new q17(WatchStatus.WATCHING, R.drawable.play_outlined), new q17(WatchStatus.PLAN_TO_WATCH, R.drawable.bookmark), new q17(WatchStatus.COMPLETED, R.drawable.check_circle), new q17(WatchStatus.ON_HOLD, R.drawable.pause_outlined), new q17(WatchStatus.DROPPED, R.drawable.close_circle));
            do5 f2 = rz3.f(true, kd2Var, 6, 2);
            boolean z3 = false;
            yc5 d0 = n77.d0(kd2Var);
            lf3 lf3Var = (lf3) ((r47) kd2Var.j(bv0.u));
            ti4 ti4Var = lf3Var.b;
            if (ti4Var == null) {
                sb2 sb2Var2 = lf3Var.a;
                if (sb2Var2 == null || (ee1Var = (ee1) sb2Var2.invoke()) == null) {
                    ee1Var = ee1.c;
                }
                ti4Var = xt5.g(ee1Var);
                lf3Var.b = ti4Var;
                lf3Var.a = null;
            }
            long j = ((ee1) ti4Var.getValue()).a;
            ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
            Configuration configuration = (Configuration) kd2Var.j(eb.a);
            float T = ud1Var.T((int) (j >> 32));
            if (configuration.orientation == 2) {
                z3 = true;
            }
            long j2 = ep0.h;
            long b = ep0.b(0.5f, ep0.b);
            ao2 ao2Var = io3.h;
            sz3 sz3Var = new sz3();
            if (z3) {
                f = T * 0.48f;
            } else {
                f = Float.NaN;
            }
            ao5 ao5Var = new ao5((byte) 13);
            os0 R = nx7.R(1161488267, new w54(d0, I, ub2Var, sb2Var, watchStatus), kd2Var);
            vz3 vz3Var = vz3.x;
            rz3.a(sb2Var, vz3Var, f2, f, false, ao2Var, j2, 0L, b, null, ao5Var, sz3Var, R, kd2Var, 807075894, CommonGatewayClient.CODE_400);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new s16(z, watchStatus, ub2Var, sb2Var, yz3Var2, i);
        }
    }

    public static final long e(gi6 gi6Var, cc6 cc6Var, dd6 dd6Var, long j) {
        int i;
        long j2;
        long n = cc6Var.n();
        if ((9223372034707292159L & n) != 9205357640488583168L && gi6Var.d().A.length() != 0) {
            long j3 = gi6Var.d().B;
            cj2 l = cc6Var.l();
            if (l == null) {
                i = -1;
            } else {
                i = ta6.a[l.ordinal()];
            }
            if (i != -1) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        int i2 = nd6.c;
                        j2 = j3 & 4294967295L;
                    } else {
                        ze0.l();
                        return 0L;
                    }
                } else {
                    int i3 = nd6.c;
                    j2 = j3 >> 32;
                }
                int i4 = (int) j2;
                bd6 c = dd6Var.c();
                if (c != null) {
                    o24 o24Var = c.b;
                    float intBitsToFloat = Float.intBitsToFloat((int) (n >> 32));
                    int d = o24Var.d(i4);
                    float f = c.f(d);
                    float g = c.g(d);
                    float B = db.B(intBitsToFloat, Math.min(f, g), Math.max(f, g));
                    if (k13.a(j, 0L) || Math.abs(intBitsToFloat - B) <= ((int) (j >> 32)) / 2) {
                        float f2 = o24Var.f(d);
                        float b = ((o24Var.b(d) - f2) / 2.0f) + f2;
                        long floatToRawIntBits = (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(B) << 32);
                        ha3 e = dd6Var.e();
                        xc4 xc4Var = null;
                        if (e != null) {
                            if (!e.m()) {
                                e = null;
                            }
                            if (e != null) {
                                floatToRawIntBits = rv5.b(floatToRawIntBits, sw0.O(e));
                            }
                        }
                        ha3 e2 = dd6Var.e();
                        if (e2 != null) {
                            if (!e2.m()) {
                                e2 = null;
                            }
                            if (e2 != null) {
                                ha3 ha3Var = (ha3) dd6Var.d.getValue();
                                if (ha3Var != null) {
                                    if (!ha3Var.m()) {
                                        ha3Var = null;
                                    }
                                    if (ha3Var != null) {
                                        xc4Var = new xc4(ha3Var.B(e2, floatToRawIntBits));
                                    }
                                }
                                if (xc4Var != null) {
                                    return xc4Var.a;
                                }
                                return floatToRawIntBits;
                            }
                            return floatToRawIntBits;
                        }
                        return floatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static void f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!i(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !i(b3) && !i(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void g(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!i(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !i(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void h(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !i(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static boolean i(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }

    public static final mx0 j(sb2 sb2Var) {
        return new mx0(new cl1(sb2Var, null), (byte) 5);
    }

    public static final File k(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new IOException("Did not expect uri to have authority");
            }
            throw new IOException("Did not expect uri to have query");
        }
        throw new IOException("Scheme must be 'file'");
    }

    public static String l(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b != 34) {
                if (b != 39) {
                    if (b != 92) {
                        switch (b) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b >= 32 && b <= 126) {
                                    sb.append((char) b);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b >>> 6) & 3) + 48));
                                    sb.append((char) (((b >>> 3) & 7) + 48));
                                    sb.append((char) ((b & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
