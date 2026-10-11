package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.os.Build;
import android.widget.EdgeEffect;
import com.anistation.android.R;
import com.anistation.model.connectivity.NetworkState;
import com.anistation.model.schedule.AnimeSchedule;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class m37 {
    public static final y23 f;
    public static final y23 g;
    public static final y23 h;
    public static final y23 i;
    public static final y23 j;
    public static volatile nw q;
    public static volatile nw r;
    public static String s;
    public static Boolean t;
    public static final float[] a = new float[91];
    public static final os0 b = new os0(954879418, false, new qs0(1));
    public static final os0 c = new os0(1918065384, false, new qs0(2));
    public static final m18 d = new m18((byte) 12);
    public static final i18 e = new i18(15);
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static final Object p = new Object();

    static {
        byte b2 = 14;
        f = new y23(new oa5((byte) 0), new la5((byte) 14), b2);
        g = new y23(new oa5((byte) 1), new la5((byte) 15), b2);
        h = new y23(new oa5((byte) 2), new la5((byte) 16), b2);
        i = new y23(new oa5((byte) 3), new la5((byte) 17), b2);
        j = new y23(new oa5((byte) 4), new la5((byte) 18), b2);
    }

    public static final float[] A(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final void B(y43 y43Var, aj5 aj5Var) {
        aj5Var.getClass();
        a34.i(aj5Var.getKind(), f06.a);
    }

    public static float C(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return cr1.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final yz3 D(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new ie4(ub2Var));
    }

    public static final og4 E(ai2 ai2Var, ai2 ai2Var2) {
        return new og4(te4.I(ai2Var, ai2Var2));
    }

    public static final List F(String str) {
        int i2;
        int i3;
        List list;
        int i4;
        List list2;
        ai4 ai4Var;
        ai4 ai4Var2;
        nt1 nt1Var = nt1.x;
        if (str == null) {
            return nt1Var;
        }
        co2 co2Var = new co2((byte) 4);
        jf3 jf3Var = jf3.z;
        rb3 B = bx7.B(jf3Var, co2Var);
        for (int i5 = 0; i5 <= str.length() - 1; i5 = i2) {
            rb3 B2 = bx7.B(jf3Var, new co2((byte) 3));
            Integer num = null;
            i2 = i5;
            while (true) {
                if (i2 <= str.length() - 1) {
                    char charAt = str.charAt(i2);
                    if (charAt != ',') {
                        if (charAt != ';') {
                            i2++;
                        } else {
                            if (num == null) {
                                num = Integer.valueOf(i2);
                            }
                            int i6 = i2 + 1;
                            int i7 = i6;
                            while (i7 <= uz5.Q(str)) {
                                char charAt2 = str.charAt(i7);
                                if (charAt2 != ',' && charAt2 != ';') {
                                    if (charAt2 != '=') {
                                        i7++;
                                    } else {
                                        int i8 = i7 + 1;
                                        if (str.length() == i8) {
                                            ai4Var2 = new ai4(Integer.valueOf(i8), "");
                                        } else {
                                            char c2 = '\"';
                                            if (str.charAt(i8) == '\"') {
                                                int i9 = i7 + 2;
                                                StringBuilder sb = new StringBuilder();
                                                while (i9 <= str.length() - 1) {
                                                    char charAt3 = str.charAt(i9);
                                                    if (charAt3 == c2) {
                                                        int i10 = i9 + 1;
                                                        int i11 = i10;
                                                        while (i11 < str.length() && str.charAt(i11) == ' ') {
                                                            i11++;
                                                        }
                                                        if (i11 == str.length() || str.charAt(i11) == ';' || str.charAt(i11) == ',') {
                                                            ai4Var = new ai4(Integer.valueOf(i10), sb.toString());
                                                            break;
                                                        }
                                                    }
                                                    if (charAt3 == '\\' && i9 < str.length() - 1) {
                                                        sb.append(str.charAt(i9 + 1));
                                                        i9 += 2;
                                                    } else {
                                                        sb.append(charAt3);
                                                        i9++;
                                                    }
                                                    c2 = '\"';
                                                }
                                                ai4Var = new ai4(Integer.valueOf(i9), str.substring(i8, i9));
                                            } else {
                                                int i12 = i8;
                                                while (i12 <= str.length() - 1) {
                                                    char charAt4 = str.charAt(i12);
                                                    if (charAt4 != ',' && charAt4 != ';') {
                                                        i12++;
                                                    } else {
                                                        ai4Var = new ai4(Integer.valueOf(i12), uz5.w0(str.substring(i8, i12)).toString());
                                                        break;
                                                    }
                                                }
                                                ai4Var = new ai4(Integer.valueOf(i12), uz5.w0(str.substring(i8, i12)).toString());
                                            }
                                            ai4Var2 = ai4Var;
                                        }
                                        int intValue = ((Number) ai4Var2.x).intValue();
                                        G(B2, str, i6, i7, (String) ai4Var2.y);
                                        i2 = intValue;
                                    }
                                } else {
                                    G(B2, str, i6, i7, "");
                                    break;
                                }
                            }
                            G(B2, str, i6, i7, "");
                            i2 = i7;
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) B.getValue();
                        if (num != null) {
                            i4 = num.intValue();
                        } else {
                            i4 = i2;
                        }
                        String obj = uz5.w0(str.substring(i5, i4)).toString();
                        if (B2.isInitialized()) {
                            list2 = (List) B2.getValue();
                        } else {
                            list2 = nt1Var;
                        }
                        arrayList.add(new dk2(obj, list2));
                        i2++;
                    }
                } else {
                    ArrayList arrayList2 = (ArrayList) B.getValue();
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = i2;
                    }
                    String obj2 = uz5.w0(str.substring(i5, i3)).toString();
                    if (B2.isInitialized()) {
                        list = (List) B2.getValue();
                    } else {
                        list = nt1Var;
                    }
                    arrayList2.add(new dk2(obj2, list));
                }
            }
        }
        if (B.isInitialized()) {
            return (List) B.getValue();
        }
        return nt1Var;
    }

    public static final void G(rb3 rb3Var, String str, int i2, int i3, String str2) {
        String obj = uz5.w0(str.substring(i2, i3)).toString();
        if (obj.length() == 0) {
            return;
        }
        ((ArrayList) rb3Var.getValue()).add(new ek2(obj, str2));
    }

    public static final void H(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(qx1.h(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static final long J(float f2, long j2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final String K(Object[] objArr, int i2, int i3, k2 k2Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == k2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(int r4, java.lang.Object r5, defpackage.e45 r6, defpackage.s92 r7, int r8) {
        /*
            boolean r0 = r5 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r5
        L5:
            r0 = r4 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            s92 r0 = r6.b
            boolean r0 = defpackage.a34.i(r0, r7)
            if (r0 != 0) goto L29
            s92 r0 = defpackage.s92.A
            int r3 = r7.compareTo(r0)
            if (r3 < 0) goto L29
            s92 r3 = r6.b
            int r3 = r3.x
            int r0 = r0.x
            int r0 = defpackage.a34.D(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r4 = r4 & 2
            if (r4 == 0) goto L36
            r6.getClass()
            if (r8 != 0) goto L34
            goto L36
        L34:
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            if (r4 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r5
        L3c:
            if (r0 == 0) goto L41
            int r7 = r7.x
            goto L45
        L41:
            s92 r7 = r6.b
            int r7 = r7.x
        L45:
            if (r4 == 0) goto L4b
            if (r8 != r2) goto L4e
            r1 = r2
            goto L4e
        L4b:
            r6.getClass()
        L4e:
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r5, r7, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m37.L(int, java.lang.Object, e45, s92, int):java.lang.Object");
    }

    public static final si5 M(ai2 ai2Var, ai2 ai2Var2) {
        return new si5(te4.I(ai2Var, ai2Var2));
    }

    public static final void N(Object obj) {
        if (!(obj instanceof y45)) {
        } else {
            throw ((y45) obj).x;
        }
    }

    public static final long O(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final void a(NetworkState networkState, boolean z, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z2;
        yz3 yz3Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        boolean z6;
        boolean z7;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2 kd2Var2 = kd2Var;
        networkState.getClass();
        kd2Var2.f0(-1488464202);
        if ((i2 & 6) == 0) {
            if (kd2Var2.d(networkState.ordinal())) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var2.g(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i3 | 384;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i8 & 1, z2)) {
            if (networkState == NetworkState.BackOnline) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (networkState == NetworkState.Offline) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(new vm1(0.0f));
                kd2Var2.n0(Q);
            }
            w44 w44Var = (w44) Q;
            px5 a2 = xj.a(((vm1) w44Var.getValue()).x, z51.V(300, 6, null), "networkBarHeightAnimation", kd2Var2);
            if (z3) {
                kd2Var2.e0(-189971077);
                kd2Var2.q(false);
                z5 = z4;
                j2 = ip0.m;
            } else {
                kd2Var2.e0(-189969891);
                z5 = z4;
                j2 = ((mp0) kd2Var2.j(op0.a)).p;
                kd2Var2.q(false);
            }
            px5 a3 = jq5.a(j2, z51.V(300, 6, null), "networkColorAnimation", kd2Var2);
            Boolean valueOf = Boolean.valueOf(z);
            if ((i8 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i8 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7 | z6;
            Object Q2 = kd2Var2.Q();
            if (z8 || Q2 == q18Var) {
                Q2 = new t84(z, networkState, w44Var, (vz0) null);
                kd2Var2.n0(Q2);
            }
            db.g(networkState, valueOf, (ic2) Q2, kd2Var2);
            vz3 vz3Var = vz3.x;
            yz3 T = n77.T(bx7.h(ar5.e(ar5.c(vz3Var, 1.0f), ((vm1) a2.getValue()).x), ((ep0) a3.getValue()).a, io3.h), 0.0f, 4.0f, 1);
            vo3 c2 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, T);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, c2);
            ss5.i(p7.E, kd2Var2, l2);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            if (z3) {
                i4 = -2089265612;
                i5 = R.string.back_online;
            } else if (z5) {
                i4 = -2089263402;
                i5 = R.string.no_connection;
            } else {
                kd2Var2.e0(-342613490);
                kd2Var2.q(false);
                str = "";
                yc6.b(str, null, ep0.e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).o, kd2Var, 384, 0, 131066);
                kd2Var2 = kd2Var;
                kd2Var2.q(true);
                yz3Var2 = vz3Var;
            }
            str = h11.i(kd2Var2, i4, i5, kd2Var2, false);
            yc6.b(str, null, ep0.e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).o, kd2Var, 384, 0, 131066);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new de2(networkState, z, yz3Var2, i2);
        }
    }

    public static final void b(String str, List list, final boolean z, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        ub2 ub2Var2;
        boolean z3;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(225185731);
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
        if (kd2Var2.g(z)) {
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
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i10 & 1, z2)) {
            tq1 tq1Var = op0.a;
            final long j2 = ((mp0) kd2Var2.j(tq1Var)).r;
            vz3 vz3Var = vz3.x;
            yz3 T = n77.T(ar5.c(vz3Var, 1.0f), 15.0f, 0.0f, 2);
            if ((i10 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean e2 = z3 | kd2Var2.e(j2);
            Object Q = kd2Var2.Q();
            if (e2 || Q == au0.a) {
                Q = new ub2() { // from class: qb5
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        bp1 bp1Var = (bp1) obj;
                        bp1Var.getClass();
                        if (!z) {
                            float g0 = bp1Var.g0(7.5f);
                            float g02 = bp1Var.g0(26.0f);
                            long floatToRawIntBits = (Float.floatToRawIntBits(g0) << 32) | (Float.floatToRawIntBits(g02) & 4294967295L);
                            float g03 = bp1Var.g0(7.5f);
                            float intBitsToFloat = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L));
                            bp1.i0(bp1Var, j2, floatToRawIntBits, (Float.floatToRawIntBits(g03) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), bp1Var.g0(2.0f), 480);
                        }
                        return pn6.a;
                    }
                };
                kd2Var2.n0(Q);
            }
            yz3 w = nx7.w(T, (ub2) Q);
            z75 a2 = y75.a(x97.y, pk2.H, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, w);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z4 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z4) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            w50 w50Var = pk2.L;
            tr trVar = x97.z;
            xp0 a3 = vp0.a(trVar, w50Var, kd2Var2, 48);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, vz3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a3);
            ss5.i(ys0Var, kd2Var2, l3);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            ov5.a(kd2Var2, ar5.e(vz3Var, 6.0f));
            b90.a(bx7.h(n03.k(ar5.i(vz3Var, 13.0f), tm5.b), ((mp0) kd2Var2.j(tq1Var)).o, io3.h), kd2Var2, 0);
            kd2Var2.q(true);
            yz3 V = n77.V(new ob3(1.0f, true), 0.0f, 0.0f, 0.0f, 18.0f, 7);
            w50 w50Var2 = pk2.K;
            xp0 a4 = vp0.a(trVar, w50Var2, kd2Var2, 0);
            int hashCode3 = Long.hashCode(kd2Var2.T);
            al4 l4 = kd2Var2.l();
            yz3 E3 = o80.E(kd2Var2, V);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var, kd2Var2, l4);
            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E3);
            x50 x50Var = pk2.I;
            vr vrVar = new vr(4.0f, true, new ze0((byte) 6));
            yz3 V2 = n77.V(ar5.c(vz3Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            z75 a5 = y75.a(vrVar, x50Var, kd2Var2, 54);
            int hashCode4 = Long.hashCode(kd2Var2.T);
            al4 l5 = kd2Var2.l();
            yz3 E4 = o80.E(kd2Var2, V2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a5);
            ss5.i(ys0Var, kd2Var2, l5);
            h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E4);
            yt2.a(w65.H(R.drawable.arrow_right, kd2Var2, 0), null, ar5.i(vz3Var, 20.0f), ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 440, 0);
            yc6.b(str, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).e, kd2Var, i10 & 14, 0, 131066);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            ov5.a(kd2Var2, ar5.e(vz3Var, 12.0f));
            yz3 V3 = n77.V(vz3Var, 10.0f, 0.0f, 0.0f, 0.0f, 14);
            xp0 a6 = vp0.a(new vr(15.0f, true, new ze0((byte) 6)), w50Var2, kd2Var2, 6);
            int hashCode5 = Long.hashCode(kd2Var2.T);
            al4 l6 = kd2Var2.l();
            yz3 E5 = o80.E(kd2Var2, V3);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a6);
            ss5.i(ys0Var, kd2Var2, l6);
            h11.q(hashCode5, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E5);
            kd2Var2.e0(1104140001);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wk6.e((AnimeSchedule) it.next(), ub2Var, kd2Var2, (i10 >> 6) & 112);
            }
            ub2Var2 = ub2Var;
            kd2Var2.q(false);
            kd2Var2.q(true);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            ub2Var2 = ub2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new n10(str, list, z, ub2Var2, i2);
        }
    }

    public static pp0 c(pp0 pp0Var) {
        o47 o47Var = te4.d;
        i75 i75Var = i75.B;
        if (wk6.n(pp0Var.b, 12884901888L)) {
            b65 b65Var = (b65) pp0Var;
            o47 o47Var2 = b65Var.d;
            if (!i(o47Var2, o47Var)) {
                return new b65(b65Var.a, b65Var.h, o47Var, z(h((float[]) i75Var.y, o47Var2.a(), o47Var.a()), b65Var.i), b65Var.k, b65Var.n, b65Var.e, b65Var.f, b65Var.g, -1);
            }
        }
        return pp0Var;
    }

    public static IOException d(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException e(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return d(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return d(file, iOException);
                    }
                    return d(file, iOException);
                }
                if (parentFile.canWrite()) {
                    return d(file, iOException);
                }
                return d(file, iOException);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return d(file, iOException);
                }
                return d(file, iOException);
            }
            if (parentFile.canWrite()) {
                return d(file, iOException);
            }
            return d(file, iOException);
        }
        return d(file, iOException);
    }

    public static final yz3 f(yz3 yz3Var, float f2, long j2, om5 om5Var) {
        return yz3Var.w(new r70(f2, new su5(j2), om5Var));
    }

    public static int g(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 31) + Character.toLowerCase(str.charAt(i3));
        }
        return i2;
    }

    public static final float[] h(float[] fArr, float[] fArr2, float[] fArr3) {
        A(fArr, fArr2);
        A(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] u = u(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return z(u, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean i(o47 o47Var, o47 o47Var2) {
        if (o47Var == o47Var2) {
            return true;
        }
        if (Math.abs(o47Var.a - o47Var2.a) < 0.001f && Math.abs(o47Var.b - o47Var2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c92 j(android.content.Context r12) {
        /*
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.bb4.r(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r5 = r4
            goto L6f
        L3a:
            java.lang.String r6 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r7 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r3 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
        L4c:
            if (r2 >= r3) goto L5a
            r5 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r5 = r5.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.add(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r9 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            z82 r5 = new z82     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "emojicompat-emoji-font"
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L6f
        L68:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6f:
            if (r5 != 0) goto L72
            goto L7c
        L72:
            c92 r4 = new c92
            b92 r0 = new b92
            r0.<init>(r12, r5)
            r4.<init>(r0)
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m37.j(android.content.Context):c92");
    }

    public static final vw0 k(pp0 pp0Var, pp0 pp0Var2) {
        if (pp0Var == pp0Var2) {
            return new vw0(pp0Var, pp0Var, 1);
        }
        if (wk6.n(pp0Var.b, 12884901888L) && wk6.n(pp0Var2.b, 12884901888L)) {
            return new uw0((b65) pp0Var, (b65) pp0Var2);
        }
        return new vw0(pp0Var, pp0Var2, 0);
    }

    public static final y45 l(Throwable th) {
        th.getClass();
        return new y45(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r1 != 22) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaFormat m(defpackage.ea2 r8) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m37.m(ea2):android.media.MediaFormat");
    }

    public static final void n(o24 o24Var, vg0 vg0Var, ka0 ka0Var, float f2, km5 km5Var, g96 g96Var, bb4 bb4Var) {
        ArrayList arrayList = o24Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            di4 di4Var = (di4) arrayList.get(i2);
            di4Var.a.f(vg0Var, ka0Var, f2, km5Var, g96Var, bb4Var);
            vg0Var.o(0.0f, di4Var.a.f);
        }
    }

    public static final long o(long j2, boolean z, int i2, float f2) {
        int h2;
        if ((z || i2 == 2 || i2 == 4 || i2 == 5) && rx0.d(j2)) {
            h2 = rx0.h(j2);
        } else {
            h2 = Integer.MAX_VALUE;
        }
        if (rx0.j(j2) != h2) {
            h2 = db.C(rz5.a(f2), rx0.j(j2), h2);
        }
        return n03.p(0, h2, 0, rx0.g(j2));
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return cr1.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int q(aj5 aj5Var, y43 y43Var, String str) {
        Object obj;
        aj5Var.getClass();
        str.getClass();
        B(y43Var, aj5Var);
        int d2 = aj5Var.d(str);
        if (d2 != -3 || !y43Var.a.j) {
            return d2;
        }
        cn7 cn7Var = y43Var.c;
        va1 va1Var = new va1(aj5Var, y43Var, (byte) 13);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cn7Var.x;
        Map map = (Map) concurrentHashMap.get(aj5Var);
        i18 i18Var = e;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(i18Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = va1Var.invoke();
            Object obj3 = concurrentHashMap.get(aj5Var);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(aj5Var, obj3);
            }
            ((Map) obj3).put(i18Var, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int r(aj5 aj5Var, y43 y43Var, String str, String str2) {
        aj5Var.getClass();
        str.getClass();
        int q2 = q(aj5Var, y43Var, str);
        if (q2 != -3) {
            return q2;
        }
        throw new IllegalArgumentException(aj5Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean s(y43 y43Var, aj5 aj5Var) {
        aj5Var.getClass();
        if (!y43Var.a.b) {
            List annotations = aj5Var.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof w53) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final int t(ls lsVar, Object obj, int i2) {
        int i3 = lsVar.z;
        if (i3 == 0) {
            return -1;
        }
        try {
            int p2 = w65.p(i3, i2, lsVar.x);
            if (p2 < 0 || a34.i(obj, lsVar.y[p2])) {
                return p2;
            }
            int i4 = p2 + 1;
            while (i4 < i3 && lsVar.x[i4] == i2) {
                if (a34.i(obj, lsVar.y[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = p2 - 1; i5 >= 0 && lsVar.x[i5] == i2; i5--) {
                if (a34.i(obj, lsVar.y[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            ze0.j();
            return 0;
        }
    }

    public static final float[] u(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean v(float f2, float f3, id idVar) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        id a2 = kd.a();
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            kd.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = a2.b;
        if (rectF == null) {
            rectF = new RectF();
            a2.b = rectF;
        }
        rectF.set(f4, f5, f6, f7);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        id a3 = kd.a();
        a3.d(idVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.e();
        a2.e();
        return !isEmpty;
    }

    public static final boolean w(float f2, float f3, float f4, float f5, long j2) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (((f7 * f7) / (intBitsToFloat2 * intBitsToFloat2)) + ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static void x(MediaFormat mediaFormat, hp0 hp0Var) {
        if (hp0Var != null) {
            y(mediaFormat, "color-transfer", hp0Var.c);
            y(mediaFormat, "color-standard", hp0Var.a);
            y(mediaFormat, "color-range", hp0Var.b);
            byte[] bArr = hp0Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void y(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static final float[] z(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }
}
