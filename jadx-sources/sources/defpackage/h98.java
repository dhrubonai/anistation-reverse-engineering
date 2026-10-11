package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import com.anistation.android.R;
import com.anistation.model.watch.Provider;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.Track;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import java.io.Serializable;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h98 {
    public static final yn2 a = new yn2(null, (byte) 0);
    public static final yn2 b = new yn2(null, (byte) 1);
    public static final os0 c = new os0(1621798968, false, new qs0(11));
    public static final os0 d = new os0(330055859, false, new qs0(12));
    public static final os0 e = new os0(-36071820, false, new ps0(10));
    public static final int[] f = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] g = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] h = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, CodedOutputStream.DEFAULT_BUFFER_SIZE, 6144, 7680};
    public static final int[] i = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] j = {5, 8, 10, 12};
    public static final int[] k = {6, 9, 12, 15};
    public static final int[] l = {2, 4, 6, 8};
    public static final int[] m = {9, 11, 13, 16};
    public static final int[] n = {5, 8, 10, 12};
    public static final StackTraceElement[] o = new StackTraceElement[0];
    public static final ai5 p = new ai5("TestTagsAsResourceId", false, new oa5(23));
    public static final ai5 q = new ai5("AccessibilityClassName", true, new oa5(15));
    public static final ai5 r = new ai5("CredentialRequest", false, new oa5(24));
    public static final h12 s = new h12(0, 0, (byte) 6);
    public static Boolean t;
    public static Boolean u;
    public static Boolean v;
    public static Boolean w;

    public static final ei1 A(h43 h43Var, boolean z, k43 k43Var) {
        if (h43Var instanceof t43) {
            return ((t43) h43Var).O(z, k43Var);
        }
        return h43Var.t(k43Var.j(), z, new d0(1, k43Var, k43.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 15));
    }

    public static final boolean B(l11 l11Var) {
        h43 h43Var = (h43) l11Var.get(h95.F);
        if (h43Var != null) {
            return h43Var.isActive();
        }
        return true;
    }

    public static boolean C(String str) {
        if (!Objects.equals(str, "audio/vnd.dts") && !Objects.equals(str, "audio/vnd.dts.hd")) {
            return false;
        }
        return true;
    }

    public static final boolean D(String str) {
        str.getClass();
        if (!uz5.p0(str, '-').equalsIgnoreCase("en") && !str.equalsIgnoreCase("English")) {
            return false;
        }
        return true;
    }

    public static boolean E(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (t == null) {
            t = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean bool = u;
        if (bool == null) {
            bool = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            u = bool;
        }
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static final yz3 F(yz3 yz3Var, od3 od3Var) {
        return yz3Var.w(new xh1(od3Var));
    }

    public static final wo3 G(w75 w75Var, int i2, int i3, int i4, int i5, int i6, xo3 xo3Var, List list, em4[] em4VarArr, int i7, int i8, int[] iArr, int i9) {
        int i10;
        int i11;
        float f2;
        boolean z;
        int i12;
        long j2;
        int i13;
        int i14;
        int i15;
        List list2 = list;
        long j3 = i6;
        int i16 = i8 - i7;
        int[] iArr2 = new int[i16];
        int i17 = i7;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f3 = 0.0f;
        while (i17 < i8) {
            ro3 ro3Var = (ro3) list2.get(i17);
            float I = nx7.I(nx7.H(ro3Var));
            if (I > 0.0f) {
                f3 += I;
                i19++;
                j2 = j3;
                i13 = i17;
            } else {
                int i22 = i4 - i20;
                em4 em4Var = em4VarArr[i17];
                j2 = j3;
                if (em4Var == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        i13 = i17;
                        i14 = i19;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i13 = i17;
                        i14 = i19;
                        if (i22 < 0) {
                            i15 = 0;
                        } else {
                            i15 = i22;
                        }
                    }
                    em4Var = ro3Var.p(w75Var.g(0, i15, i5, false));
                } else {
                    i13 = i17;
                    i14 = i19;
                }
                em4 em4Var2 = em4Var;
                int j4 = w75Var.j(em4Var2);
                int i23 = w75Var.i(em4Var2);
                iArr2[i13 - i7] = j4;
                int i24 = i22 - j4;
                if (i24 < 0) {
                    i24 = 0;
                }
                i21 = Math.min(i6, i24);
                i20 += j4 + i21;
                i18 = Math.max(i18, i23);
                em4VarArr[i13] = em4Var2;
                i19 = i14;
            }
            i17 = i13 + 1;
            j3 = j2;
        }
        long j5 = j3;
        if (i19 == 0) {
            i20 -= i21;
            i11 = 0;
        } else {
            if (i4 != Integer.MAX_VALUE) {
                i10 = i4;
            } else {
                i10 = i2;
            }
            long j6 = (r22 - 1) * j5;
            long j7 = (i10 - i20) - j6;
            if (j7 < 0) {
                j7 = 0;
            }
            float f4 = ((float) j7) / f3;
            for (int i25 = i7; i25 < i8; i25++) {
                j7 -= Math.round(nx7.I(nx7.H((ro3) list2.get(i25))) * f4);
            }
            int i26 = i7;
            int i27 = i18;
            int i28 = 0;
            while (i26 < i8) {
                if (em4VarArr[i26] == null) {
                    ro3 ro3Var2 = (ro3) list2.get(i26);
                    f2 = f4;
                    x75 H = nx7.H(ro3Var2);
                    float I2 = nx7.I(H);
                    if (I2 <= 0.0f) {
                        cz2.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j7);
                    long j8 = j7 - signum;
                    int max = Math.max(0, Math.round(I2 * f2) + signum);
                    if (H != null) {
                        z = H.b;
                    } else {
                        z = true;
                    }
                    if (z && max != Integer.MAX_VALUE) {
                        i12 = max;
                    } else {
                        i12 = 0;
                    }
                    em4 p2 = ro3Var2.p(w75Var.g(i12, max, i5, true));
                    int j9 = w75Var.j(p2);
                    int i29 = w75Var.i(p2);
                    iArr2[i26 - i7] = j9;
                    i28 += j9;
                    int max2 = Math.max(i27, i29);
                    em4VarArr[i26] = p2;
                    i27 = max2;
                    j7 = j8;
                } else {
                    f2 = f4;
                }
                i26++;
                list2 = list;
                f4 = f2;
            }
            i11 = (int) (i28 + j6);
            int i30 = i4 - i20;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i30) {
                i11 = i30;
            }
            i18 = i27;
        }
        int i31 = i11 + i20;
        if (i31 < 0) {
            i31 = 0;
        }
        int max3 = Math.max(i31, i2);
        int max4 = Math.max(i18, Math.max(i3, 0));
        int[] iArr3 = new int[i16];
        w75Var.f(max3, iArr2, iArr3, xo3Var);
        return w75Var.h(em4VarArr, xo3Var, iArr3, max3, max4, iArr, i9, i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(bs5 bs5Var, int i2, bs5 bs5Var2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        nt1 nt1Var;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int t2 = bs5Var.t(i2);
        int i6 = i2 + t2;
        int f2 = bs5Var.f(bs5Var.b, bs5Var.q(i2));
        int f3 = bs5Var.f(bs5Var.b, bs5Var.q(i6));
        int i7 = f3 - f2;
        if (i2 >= 0 && (bs5Var.b[(bs5Var.q(i2) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        bs5Var2.v(t2);
        bs5Var2.w(i7, bs5Var2.t);
        if (bs5Var.g < i6) {
            bs5Var.A(i6);
        }
        if (bs5Var.k < f3) {
            bs5Var.B(f3, i6);
        }
        int[] iArr = bs5Var2.b;
        int i8 = bs5Var2.t;
        int i9 = i8 * 5;
        ms.w0(i9, i2 * 5, i6 * 5, bs5Var.b, iArr);
        Object[] objArr = bs5Var2.c;
        int i10 = bs5Var2.i;
        System.arraycopy(bs5Var.c, f2, objArr, i10, i7);
        int i11 = bs5Var2.v;
        iArr[i9 + 2] = i11;
        int i12 = i8 - i2;
        int i13 = i8 + t2;
        int f4 = i10 - bs5Var2.f(iArr, i8);
        int i14 = bs5Var2.m;
        int i15 = bs5Var2.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i16 = i14;
        int i17 = i8;
        while (i17 < i13) {
            if (i17 != i8) {
                int i18 = (i17 * 5) + 2;
                iArr[i18] = iArr[i18] + i12;
            }
            int[] iArr2 = iArr;
            int f5 = bs5Var2.f(iArr, i17) + f4;
            if (i16 < i17) {
                i4 = i8;
                i5 = 0;
            } else {
                i4 = i8;
                i5 = bs5Var2.k;
            }
            iArr2[(i17 * 5) + 4] = bs5.h(f5, i5, i15, length);
            if (i17 == i16) {
                i16++;
            }
            i17++;
            i8 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        bs5Var2.m = i16;
        int b2 = as5.b(bs5Var.d, i2, bs5Var.o());
        int b3 = as5.b(bs5Var.d, i6, bs5Var.o());
        if (b2 < b3) {
            ArrayList arrayList = bs5Var.d;
            ArrayList arrayList2 = new ArrayList(b3 - b2);
            for (int i19 = b2; i19 < b3; i19++) {
                ed2 ed2Var = (ed2) arrayList.get(i19);
                ed2Var.a += i12;
                arrayList2.add(ed2Var);
            }
            bs5Var2.d.addAll(as5.b(bs5Var2.d, bs5Var2.t, bs5Var2.o()), arrayList2);
            arrayList.subList(b2, b3).clear();
            nt1Var = arrayList2;
        } else {
            nt1Var = nt1.x;
        }
        if (!nt1Var.isEmpty()) {
            HashMap hashMap = bs5Var.e;
            HashMap hashMap2 = bs5Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = nt1Var.size();
                for (int i20 = 0; i20 < size; i20++) {
                }
            }
        }
        int i21 = bs5Var2.v;
        bs5Var2.P(i11);
        int F = bs5Var.F(bs5Var.b, i2);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (F >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                bs5Var.Q();
                bs5Var.a(F - bs5Var.t);
                bs5Var.Q();
            }
            bs5Var.a(i2 - bs5Var.t);
            boolean I = bs5Var.I();
            if (z6) {
                bs5Var.N();
                bs5Var.i();
                bs5Var.N();
                bs5Var.i();
            }
            z5 = I;
        } else {
            boolean J = bs5Var.J(i2, t2);
            bs5Var.K(f2, i7, i2 - 1);
            z5 = J;
        }
        if (z5) {
            eu0.a("Unexpectedly removed anchors");
        }
        int i22 = bs5Var2.o;
        int i23 = iArr3[i9 + 1];
        if ((1073741824 & i23) != 0) {
            i3 = 1;
        } else {
            i3 = i23 & 67108863;
        }
        bs5Var2.o = i22 + i3;
        if (z2) {
            bs5Var2.t = i13;
            bs5Var2.i = i10 + i7;
        }
        if (z7) {
            bs5Var2.V(i11);
        }
        return nt1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(xz3 xz3Var, sb2 sb2Var) {
        nc4 nc4Var = xz3Var.D;
        if (nc4Var == null) {
            nc4Var = new nc4((mc4) xz3Var);
            xz3Var.D = nc4Var;
        }
        mh4 snapshotObserver = ((oa) wc7.P(xz3Var)).getSnapshotObserver();
        snapshotObserver.a.d(nc4Var, nc4.y, sb2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0241, code lost:
    
        if ((r0.g(12) & 256) != 0) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dq1 J(byte[] r27) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h98.J(byte[]):dq1");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [ki4, sz5] */
    public static ki4 K(String str) {
        int i2;
        str.getClass();
        byte b2 = 1;
        if (str.length() - 1 < 0) {
            ki4.b.getClass();
            return ji4.b;
        }
        ji4 ji4Var = ki4.b;
        kk2 kk2Var = new kk2(b2);
        int length = str.length() - 1;
        int i3 = 0;
        int i4 = -1;
        if (length >= 0) {
            int i5 = 0;
            i2 = 0;
            int i6 = -1;
            while (i3 != 1000) {
                char charAt = str.charAt(i5);
                if (charAt != '&') {
                    if (charAt == '=' && i6 == -1) {
                        i6 = i5;
                    }
                } else {
                    f(kk2Var, str, i2, i6, i5);
                    i2 = i5 + 1;
                    i3++;
                    i6 = -1;
                }
                if (i5 != length) {
                    i5++;
                } else {
                    i4 = i6;
                }
            }
            return new sz5((Map) kk2Var.x, true);
        }
        i2 = 0;
        if (i3 != 1000) {
            f(kk2Var, str, i2, i4, str.length());
        }
        return new sz5((Map) kk2Var.x, true);
    }

    public static int L(yi0 yi0Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && yi0Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return yi0Var.g(iArr[i2]) + i4;
    }

    public static String M(X509Certificate x509Certificate) {
        zd0 zd0Var = zd0.A;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        tl7.m(encoded.length, 0L, length);
        return "sha256/".concat(new zd0(ms.C0(encoded, 0, length)).c("SHA-256").a());
    }

    public static Object N(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final id2 O(kd2 kd2Var) {
        od2 od2Var;
        kd2 kd2Var2;
        kd2Var.b0(206, eu0.e);
        if (kd2Var.S) {
            bs5.y(kd2Var.I);
        }
        Object I = kd2Var.I();
        if (I instanceof od2) {
            od2Var = (od2) I;
        } else {
            od2Var = null;
        }
        if (od2Var == null) {
            kd2Var2 = kd2Var;
            od2Var = new od2(new hd2(new id2(kd2Var2, kd2Var.T, kd2Var.q, kd2Var.C, kd2Var.h.Q)), -1);
            kd2Var2.o0(od2Var);
        } else {
            kd2Var2 = kd2Var;
        }
        id2 id2Var = ((hd2) od2Var.a).x;
        id2Var.f.setValue(kd2Var2.l());
        kd2Var2.q(false);
        return id2Var;
    }

    public static final oy5 P(boolean z, sb2 sb2Var, kd2 kd2Var, int i2) {
        boolean z2;
        boolean z3;
        fa0 fa0Var = (fa0) kd2Var.j(ha0.a);
        ia3 ia3Var = (ia3) kd2Var.j(bv0.n);
        boolean z4 = false;
        if ((((i2 & 896) ^ 384) > 256 && kd2Var.f(sb2Var)) || (i2 & 384) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 14) ^ 6) > 4 && kd2Var.g(false)) || (i2 & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean d2 = z2 | z3 | kd2Var.d(ia3Var.ordinal()) | kd2Var.f(fa0Var);
        if ((((i2 & 112) ^ 48) > 32 && kd2Var.g(z)) || (i2 & 48) == 32) {
            z4 = true;
        }
        boolean z5 = d2 | z4;
        Object Q = kd2Var.Q();
        if (z5 || Q == au0.a) {
            Q = new oy5(sb2Var, ia3Var, z, fa0Var);
            kd2Var.n0(Q);
        }
        return (oy5) Q;
    }

    public static final zw Q(String str, List list) {
        Object obj;
        list.getClass();
        zw q2 = q(str, list);
        if (q2 == null) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str3 = ((zw) next).c;
                if (str3 != null) {
                    str2 = uz5.p0(str3, '-');
                }
                if (b06.C(str2, "ja", true)) {
                    obj = next;
                    break;
                }
            }
            zw zwVar = (zw) obj;
            if (zwVar == null) {
                return (zw) yo0.m0(list);
            }
            return zwVar;
        }
        return q2;
    }

    public static final Track R(String str, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2;
        Object obj5 = null;
        if (list.isEmpty()) {
            return null;
        }
        if (str != null && !uz5.V(str)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (b06.C(((Track) obj).getLabel(), str, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Track track = (Track) obj;
            if (track != null) {
                return track;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (b06.C(((Track) obj2).getId(), str, true)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Track track2 = (Track) obj2;
            if (track2 != null) {
                return track2;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : list) {
                Track track3 = (Track) obj6;
                if (!b06.C(track3.getLang(), str, true)) {
                    String lang = track3.getLang();
                    if (lang != null) {
                        str2 = U(lang);
                    } else {
                        str2 = null;
                    }
                    if (b06.C(str2, str, true)) {
                    }
                }
                arrayList.add(obj6);
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj3 = arrayList.get(i2);
                    i2++;
                    if (((Track) obj3).getDefault()) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            Track track4 = (Track) obj3;
            if (track4 != null) {
                return track4;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    obj4 = arrayList.get(i3);
                    i3++;
                    String label = ((Track) obj4).getLabel();
                    if (label == null) {
                        label = "";
                    }
                    Locale locale = Locale.ENGLISH;
                    locale.getClass();
                    String lowerCase = label.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!uz5.M(lowerCase, "forced", false) && !uz5.M(lowerCase, "closed caption", false)) {
                        Pattern compile = Pattern.compile("(^|[^a-z])cc([^a-z]|$)");
                        compile.getClass();
                        if (!compile.matcher(lowerCase).find()) {
                            break;
                        }
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            Track track5 = (Track) obj4;
            if (track5 != null) {
                return track5;
            }
            Track track6 = (Track) yo0.m0(arrayList);
            if (track6 != null) {
                return track6;
            }
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((Track) next).getDefault()) {
                obj5 = next;
                break;
            }
        }
        Track track7 = (Track) obj5;
        if (track7 == null) {
            return (Track) yo0.m0(list);
        }
        return track7;
    }

    public static final vv6 S(im0 im0Var, cw6 cw6Var, String str, j21 j21Var, dc5 dc5Var, sb2 sb2Var) {
        cw6Var.getClass();
        j21Var.getClass();
        zp2 zp2Var = new zp2(cw6Var, new c93(im0Var, dc5Var, sb2Var), j21Var);
        im0Var.e();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            return zp2Var.w(im0Var, str);
        }
        String e2 = im0Var.e();
        if (e2 != null) {
            return zp2Var.w(im0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e2));
        }
        ze0.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final ai3 T(Server server) {
        List<Provider> list;
        ai3 y = te4.y();
        List<Provider> list2 = null;
        if (server != null) {
            list = server.getSub();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            y.add(new zw("source:sub", "Japanese", "ja", "sub", null, null, null, 112));
        }
        if (server != null) {
            list2 = server.getDub();
        }
        if (list2 != null && !list2.isEmpty()) {
            y.add(new zw("source:dub", "English", "en", "dub", null, null, null, 112));
        }
        return te4.r(y);
    }

    public static final String U(String str) {
        str.getClass();
        String displayLanguage = Locale.forLanguageTag(str).getDisplayLanguage(Locale.ENGLISH);
        displayLanguage.getClass();
        if (uz5.V(displayLanguage)) {
            displayLanguage = null;
        }
        if (displayLanguage == null) {
            return str;
        }
        return displayLanguage;
    }

    public static final String V(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static final int W(String str, int i2, int i3) {
        while (i3 > i2 && t80.c0(str.charAt(i3 - 1))) {
            i3--;
        }
        return i3;
    }

    public static final int X(String str, int i2, int i3) {
        while (i2 < i3 && t80.c0(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    public static ea2 Y(c12 c12Var, int i2, ea2 ea2Var) {
        int i3;
        zi4 zi4Var = new zi4(i2);
        if (c12Var.j(zi4Var.a, 0, i2, true)) {
            c12Var.u();
            int i4 = zi4Var.i();
            if (v(i4) == 1) {
                if (zi4Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    zi4Var.k(bArr, 0, 10);
                    int u2 = u(bArr);
                    if (u2 > 0 && zi4Var.c >= u2 + 4) {
                        zi4Var.N(u2);
                        i4 = zi4Var.i();
                    }
                }
            }
            if (v(i4) == 2 && zi4Var.a() >= 7) {
                int i5 = zi4Var.b;
                byte[] bArr2 = new byte[7];
                zi4Var.k(bArr2, 0, 7);
                zi4Var.N(i5);
                yi0 x = x(bArr2);
                x.o(42);
                if (x.f()) {
                    i3 = 12;
                } else {
                    i3 = 8;
                }
                int g2 = x.g(i3) + 1;
                if (g2 > 0 && zi4Var.a() >= g2) {
                    byte[] bArr3 = new byte[g2];
                    zi4Var.k(bArr3, 0, g2);
                    String str = (String) J(bArr3).e;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (Objects.equals(ea2Var.p, str)) {
                        return ea2Var;
                    }
                    da2 a2 = ea2Var.a();
                    a2.o = qy3.n(str);
                    return new ea2(a2);
                }
            }
        }
        return ea2Var;
    }

    public static final void Z(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (!z) {
            StringBuilder u2 = qx1.u("OffsetMapping.originalToTransformed returned invalid mapping: ", i4, " -> ", i2, " is not in range of transformed text [0, ");
            u2.append(i3);
            u2.append("]");
            hz2.c(u2.toString());
        }
    }

    public static final void a(boolean z, ub2 ub2Var, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        yz3 yz3Var2;
        long j2;
        float f2;
        boolean z3;
        boolean z4;
        kd2 kd2Var2 = kd2Var;
        ub2Var.getClass();
        kd2Var2.f0(631108862);
        if (kd2Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (kd2Var2.h(ub2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 384;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i6 & 1, z2)) {
            if (z) {
                kd2Var2.e0(905237098);
                j2 = n03.r(kd2Var2).o;
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(905238764);
                j2 = n03.r(kd2Var2).r;
                kd2Var2.q(false);
            }
            px5 a2 = jq5.a(j2, z51.V(300, 6, null), "checkboxBackgroundColor", kd2Var2);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            px5 b2 = xj.b(f2, z51.V(200, 6, null), "checkboxCheckScale", kd2Var2, 3120, 20);
            vz3 vz3Var = vz3.x;
            yz3 f3 = m37.f(bx7.h(ar5.i(vz3Var, 22.0f), ((ep0) a2.getValue()).a, n03.w(kd2Var2).a), 0.5f, ep0.b(0.1f, n03.r(kd2Var2).o), n03.w(kd2Var2).a);
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i6 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (z5 || Q == q18Var) {
                Q = new ch((byte) 0, ub2Var, z);
                kd2Var2.n0(Q);
            }
            yz3 A = kb0.A(f3, false, null, null, false, (sb2) Q, kd2Var, 0, 31);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new b3((byte) 23);
                kd2Var.n0(Q2);
            }
            yz3 a3 = rh5.a(A, false, (ub2) Q2);
            vo3 c2 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, a3);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            xh4 H = w65.H(R.drawable.check, kd2Var, 0);
            long j3 = n03.r(kd2Var).n;
            yz3 i7 = ar5.i(vz3Var, 18.0f);
            float floatValue = ((Number) b2.getValue()).floatValue();
            yt2.a(H, null, oi4.E(i7, floatValue, floatValue), j3, kd2Var, 56, 0);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u2 = kd2Var2.u();
        if (u2 != null) {
            u2.d = new dh(z, ub2Var, yz3Var2, i2, (byte) 0);
        }
    }

    public static final void a0(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (!z) {
            StringBuilder u2 = qx1.u("OffsetMapping.transformedToOriginal returned invalid mapping: ", i4, " -> ", i2, " is not in range of original text [0, ");
            u2.append(i3);
            u2.append("]");
            hz2.c(u2.toString());
        }
    }

    public static final mv0 b() {
        return new mv0();
    }

    public static final long[] b0(long[] jArr, LinkedHashSet linkedHashSet, Long l2) {
        Iterable iterable;
        if (l2 != null && !linkedHashSet.contains(l2)) {
            return jArr;
        }
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (!linkedHashSet.contains(Long.valueOf(j2))) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        if (l2 != null) {
            iterable = te4.H(l2);
        } else {
            iterable = nt1.x;
        }
        return yo0.J0(yo0.I0(yo0.M0(yo0.u0(iterable, arrayList))));
    }

    public static final void c(final yz3 yz3Var, long j2, final long j3, final jc2 jc2Var, kd2 kd2Var, final int i2) {
        int i3;
        boolean z;
        long j4;
        float f2;
        om5 a2;
        kd2Var.f0(1428256508);
        if (kd2Var.f(yz3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        byte b2 = 1;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            if (jc2Var != null) {
                f2 = db.d;
            } else {
                f2 = db.f;
            }
            if (jc2Var != null) {
                kd2Var.e0(-1051012910);
                a2 = dn5.a(db.c, kd2Var);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-1050955529);
                a2 = dn5.a(db.e, kd2Var);
                kd2Var.q(false);
            }
            j4 = j2;
            yz3 h2 = bx7.h(ar5.a(yz3Var, f2, f2), j4, a2);
            yz3 yz3Var2 = vz3.x;
            if (jc2Var != null) {
                yz3Var2 = n77.T(yz3Var2, 4.0f, 0.0f, 2);
            }
            yz3 w2 = h2.w(yz3Var2);
            z75 a3 = y75.a(x97.A, pk2.I, kd2Var, 54);
            int s2 = s(kd2Var);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, w2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a3);
            ss5.i(p7.E, kd2Var, l2);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s2))) {
                h11.p(s2, kd2Var, s2, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            if (jc2Var != null) {
                kd2Var.e0(1345815094);
                jf7.b(j3, pl6.a(db.b, kd2Var), nx7.R(541712501, new fa(jc2Var, b2), kd2Var), kd2Var, 390);
                kd2Var.q(false);
            } else {
                kd2Var.e0(1346141834);
                kd2Var.q(false);
            }
            kd2Var.q(true);
        } else {
            j4 = j2;
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            final long j5 = j4;
            u2.d = new ic2(j5, j3, jc2Var, i2) { // from class: w20
                public final /* synthetic */ jc2 A;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(3505);
                    h98.c(yz3.this, this.y, this.z, this.A, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r30, java.lang.String r31, defpackage.yz3 r32, defpackage.kd2 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h98.d(java.lang.String, java.lang.String, yz3, kd2, int, int):void");
    }

    public static j43 e() {
        return new j43(null);
    }

    public static final void f(kk2 kk2Var, String str, int i2, int i3, int i4) {
        if (i3 == -1) {
            int X = X(str, i2, i4);
            int W = W(str, X, i4);
            if (W > X) {
                kk2Var.j(str.substring(X, W), nt1.x);
                return;
            }
            return;
        }
        int X2 = X(str, i2, i3);
        int W2 = W(str, X2, i3);
        if (W2 > X2) {
            String substring = str.substring(X2, W2);
            int X3 = X(str, i3 + 1, i4);
            kk2Var.h(substring, str.substring(X3, W(str, X3, i4)));
        }
    }

    public static final Bundle g(ai4... ai4VarArr) {
        Bundle bundle = new Bundle(ai4VarArr.length);
        for (ai4 ai4Var : ai4VarArr) {
            String str = (String) ai4Var.x;
            Object obj = ai4Var.y;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    ze0.k(qx1.n("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                ze0.k(qx1.n("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                return null;
            }
        }
        return bundle;
    }

    public static final String h(String str) {
        String obj = uz5.w0(str).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = obj.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final void i(l11 l11Var, CancellationException cancellationException) {
        h43 h43Var = (h43) l11Var.get(h95.F);
        if (h43Var != null) {
            h43Var.l(cancellationException);
        }
    }

    public static final void j(h43 h43Var, String str, Throwable th) {
        h43Var.l(z51.b(str, th));
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return uk0.b[c2];
        }
        return (byte) 0;
    }

    public static final w44 l(w42 w42Var, Object obj, fg3 fg3Var, eg3 eg3Var, l11 l11Var, kd2 kd2Var, int i2) {
        boolean z;
        Object[] objArr = {w42Var, fg3Var, eg3Var, l11Var};
        boolean h2 = kd2Var.h(fg3Var);
        byte b2 = 1;
        if ((((i2 & 7168) ^ 3072) > 2048 && kd2Var.d(eg3Var.ordinal())) || (i2 & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = z | h2 | kd2Var.h(l11Var) | kd2Var.h(w42Var);
        Object Q = kd2Var.Q();
        Object obj2 = au0.a;
        if (h3 || Q == obj2) {
            Object scVar = new sc(fg3Var, eg3Var, l11Var, w42Var, null, (byte) 4);
            kd2Var.n0(scVar);
            Q = scVar;
        }
        ic2 ic2Var = (ic2) Q;
        Object Q2 = kd2Var.Q();
        if (Q2 == obj2) {
            Q2 = xt5.g(obj);
            kd2Var.n0(Q2);
        }
        w44 w44Var = (w44) Q2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h4 = kd2Var.h(ic2Var);
        Object Q3 = kd2Var.Q();
        if (h4 || Q3 == obj2) {
            Q3 = new vt5(ic2Var, w44Var, null, b2);
            kd2Var.n0(Q3);
        }
        db.i(copyOf, (ic2) Q3, kd2Var);
        return w44Var;
    }

    public static final w44 m(qx5 qx5Var, kd2 kd2Var) {
        return l(qx5Var, qx5Var.getValue(), ((og3) kd2Var.j(vj3.a)).getLifecycle(), eg3.A, it1.x, kd2Var, 0);
    }

    public static void n(Object obj, String str, String str2) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    public static final void o(l11 l11Var) {
        h43 h43Var = (h43) l11Var.get(h95.F);
        if (h43Var != null && !h43Var.isActive()) {
            throw h43Var.I();
        }
    }

    public static final di6 p(p65 p65Var, ko koVar) {
        p65Var.getClass();
        int length = koVar.y.length();
        String str = koVar.y;
        int length2 = str.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            Z(i2, length2, i2);
        }
        Z(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < min2; i3++) {
            a0(i3, length, i3);
        }
        a0(length2, length, length2);
        return new di6(koVar, new h12(str.length(), str.length(), (byte) 6));
    }

    public static final zw q(String str, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        list.getClass();
        Object obj4 = null;
        if (!list.isEmpty() && str != null && !uz5.V(str)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (b06.C(((zw) obj).b, str, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zw zwVar = (zw) obj;
            if (zwVar == null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (b06.C(((zw) obj2).c, str, true)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                zwVar = (zw) obj2;
                if (zwVar == null) {
                    if (uz5.N(str, '-')) {
                        String language = Locale.forLanguageTag(str).getLanguage();
                        language.getClass();
                        if (uz5.V(language)) {
                            language = null;
                        }
                        if (language != null) {
                            for (Object obj5 : list) {
                                zw zwVar2 = (zw) obj5;
                                String str4 = zwVar2.c;
                                String str5 = zwVar2.b;
                                if (b06.C(str4, language, true) && (b06.C(str5, U(language), true) || b06.C(str5, "Native", true))) {
                                    obj4 = obj5;
                                    break;
                                }
                            }
                            return (zw) obj4;
                        }
                    } else {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                String str6 = ((zw) obj3).c;
                                if (str6 != null) {
                                    str3 = U(str6);
                                } else {
                                    str3 = null;
                                }
                                if (b06.C(str3, str, true)) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        zwVar = (zw) obj3;
                        if (zwVar == null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next = it4.next();
                                String str7 = ((zw) next).c;
                                if (str7 != null) {
                                    str2 = U(str7);
                                } else {
                                    str2 = null;
                                }
                                if (b06.C(str2, U(str), true)) {
                                    obj4 = next;
                                    break;
                                }
                            }
                            return (zw) obj4;
                        }
                    }
                }
            }
            return zwVar;
        }
        return null;
    }

    public static sy3 r(sy3 sy3Var, ia3 ia3Var, xd6 xd6Var, ud1 ud1Var, p82 p82Var) {
        if (sy3Var != null && ia3Var == sy3Var.a && ez5.j(xd6Var, ia3Var).equals(sy3Var.b) && ud1Var.b() == sy3Var.c.x && p82Var == sy3Var.d) {
            return sy3Var;
        }
        sy3 sy3Var2 = sy3.h;
        if (sy3Var2 != null && ia3Var == sy3Var2.a && ez5.j(xd6Var, ia3Var).equals(sy3Var2.b) && ud1Var.b() == sy3Var2.c.x && p82Var == sy3Var2.d) {
            return sy3Var2;
        }
        sy3 sy3Var3 = new sy3(ia3Var, ez5.j(xd6Var, ia3Var), new xd1(ud1Var.b(), ud1Var.getFontScale()), p82Var);
        sy3.h = sy3Var3;
        return sy3Var3;
    }

    public static final int s(kd2 kd2Var) {
        kd2Var.getClass();
        return Long.hashCode(kd2Var.T);
    }

    public static final long t(kd2 kd2Var) {
        return kd2Var.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int u(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h98.u(byte[]):int");
    }

    public static int v(int i2) {
        if (i2 != 2147385345 && i2 != -25230976 && i2 != 536864768 && i2 != -14745368) {
            if (i2 != 1683496997 && i2 != 622876772) {
                if (i2 != 1078008818 && i2 != -233094848) {
                    if (i2 != 1908687592 && i2 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static final h43 w(l11 l11Var) {
        h43 h43Var = (h43) l11Var.get(h95.F);
        if (h43Var != null) {
            return h43Var;
        }
        v71.g(l11Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static yi0 x(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            yi0 yi0Var = new yi0(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                yi0 yi0Var2 = new yi0(copyOf.length, copyOf);
                while (yi0Var2.b() >= 16) {
                    yi0Var2.o(2);
                    int g2 = yi0Var2.g(14) & 16383;
                    int min = Math.min(8 - yi0Var.d, 14);
                    int i4 = yi0Var.d;
                    int i5 = (8 - i4) - min;
                    byte[] bArr3 = yi0Var.b;
                    int i6 = yi0Var.c;
                    byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                    bArr3[i6] = b5;
                    int i7 = 14 - min;
                    bArr3[i6] = (byte) (b5 | ((g2 >>> i7) << i5));
                    int i8 = i6 + 1;
                    while (true) {
                        bArr2 = yi0Var.b;
                        if (i7 > 8) {
                            bArr2[i8] = (byte) (g2 >>> (i7 - 8));
                            i7 -= 8;
                            i8++;
                        }
                    }
                    int i9 = 8 - i7;
                    byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                    bArr2[i8] = b6;
                    bArr2[i8] = (byte) (((g2 & ((1 << i7) - 1)) << i9) | b6);
                    yi0Var.o(14);
                    yi0Var.a();
                }
            }
            yi0Var.k(copyOf.length, copyOf);
            return yi0Var;
        }
        return new yi0(bArr.length, bArr);
    }

    public static int y(int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        if ((i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            return i3 + 2;
        }
        return i3;
    }

    public static final void z(l11 l11Var, Throwable th) {
        if (th instanceof ih1) {
            th = ((ih1) th).x;
        }
        try {
            p11 p11Var = (p11) l11Var.get(o11.x);
            if (p11Var != null) {
                p11Var.handleException(l11Var, th);
            } else {
                nx7.J(l11Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                n03.i(runtimeException, th);
                th = runtimeException;
            }
            nx7.J(l11Var, th);
        }
    }
}
