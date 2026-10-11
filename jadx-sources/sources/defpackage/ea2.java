package defpackage;

import android.text.TextUtils;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ea2 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final ea2 V = new ea2(new da2());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String a0 = Integer.toString(4, 36);
    public static final String b0 = Integer.toString(5, 36);
    public static final String c0 = Integer.toString(6, 36);
    public static final String d0 = Integer.toString(7, 36);
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final int A;
    public final float B;
    public final int C;
    public final boolean D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final hp0 H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public final String a;
    public final String b;
    public final nw2 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final fy3 m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final List s;
    public final op1 t;
    public final long u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        Integer.toString(8, 36);
        e0 = Integer.toString(9, 36);
        f0 = Integer.toString(10, 36);
        g0 = Integer.toString(11, 36);
        h0 = Integer.toString(12, 36);
        i0 = Integer.toString(13, 36);
        j0 = Integer.toString(14, 36);
        k0 = Integer.toString(15, 36);
        l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        n0 = Integer.toString(18, 36);
        o0 = Integer.toString(19, 36);
        p0 = Integer.toString(20, 36);
        q0 = Integer.toString(21, 36);
        r0 = Integer.toString(22, 36);
        s0 = Integer.toString(23, 36);
        t0 = Integer.toString(24, 36);
        u0 = Integer.toString(25, 36);
        v0 = Integer.toString(26, 36);
        w0 = Integer.toString(27, 36);
        x0 = Integer.toString(28, 36);
        y0 = Integer.toString(29, 36);
        z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
        H0 = Integer.toString(38, 36);
        I0 = Integer.toString(39, 36);
        J0 = Integer.toString(40, 36);
        K0 = Integer.toString(41, 36);
    }

    public ea2(da2 da2Var) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        this.a = da2Var.a;
        String V2 = eq6.V(da2Var.d);
        this.d = V2;
        if (da2Var.c.isEmpty() && da2Var.b != null) {
            this.c = nw2.s(new w93(V2, da2Var.b));
            this.b = da2Var.b;
        } else if (!da2Var.c.isEmpty() && da2Var.b == null) {
            nw2 nw2Var = da2Var.c;
            this.c = nw2Var;
            int size = nw2Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = nw2Var.get(i);
                    i++;
                    w93 w93Var = (w93) obj;
                    if (TextUtils.equals(w93Var.a, V2)) {
                        str = w93Var.b;
                        break;
                    }
                } else {
                    str = ((w93) nw2Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!da2Var.c.isEmpty() || da2Var.b != null) {
                for (int i2 = 0; i2 < da2Var.c.size(); i2++) {
                    if (!((w93) da2Var.c.get(i2)).b.equals(da2Var.b)) {
                    }
                }
                z = false;
                io3.B(z);
                this.c = da2Var.c;
                this.b = da2Var.b;
            }
            z = true;
            io3.B(z);
            this.c = da2Var.c;
            this.b = da2Var.b;
        }
        this.e = da2Var.e;
        if (da2Var.h != 0 && (da2Var.f & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.A("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = da2Var.f;
        this.g = da2Var.g;
        this.h = da2Var.h;
        int i3 = da2Var.i;
        this.i = i3;
        int i4 = da2Var.j;
        this.j = i4;
        this.k = i4 != -1 ? i4 : i3;
        this.l = da2Var.k;
        this.m = da2Var.l;
        this.n = da2Var.m;
        this.o = da2Var.n;
        this.p = da2Var.o;
        this.q = da2Var.p;
        this.r = da2Var.q;
        List list = da2Var.r;
        this.s = list == null ? Collections.EMPTY_LIST : list;
        op1 op1Var = da2Var.s;
        this.t = op1Var;
        this.u = da2Var.t;
        this.v = da2Var.u;
        this.w = da2Var.v;
        this.x = da2Var.w;
        this.y = da2Var.x;
        this.z = da2Var.y;
        this.A = da2Var.z;
        this.B = da2Var.A;
        int i5 = da2Var.B;
        this.C = i5 == -1 ? 0 : i5;
        this.D = da2Var.C;
        float f = da2Var.D;
        this.E = f == -1.0f ? 1.0f : f;
        this.F = da2Var.E;
        this.G = da2Var.F;
        this.H = da2Var.G;
        this.I = da2Var.H;
        int i6 = da2Var.I;
        this.J = i6;
        int i7 = da2Var.J;
        this.K = i7;
        if (i6 != -1 && i7 != -1) {
            if (Integer.bitCount(i7) == i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                ze0.m(ss5.f("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i6), Integer.valueOf(i7)));
                throw null;
            }
        }
        this.L = da2Var.K;
        this.M = da2Var.L;
        int i8 = da2Var.M;
        this.N = i8 == -1 ? 0 : i8;
        int i9 = da2Var.N;
        this.O = i9 != -1 ? i9 : 0;
        this.P = da2Var.O;
        this.Q = da2Var.P;
        this.R = da2Var.Q;
        this.S = da2Var.R;
        int i10 = da2Var.S;
        if (i10 == 0 && op1Var != null) {
            this.T = 1;
        } else {
            this.T = i10;
        }
    }

    public static String d(ea2 ea2Var) {
        float f;
        int i;
        String str;
        String str2;
        String str3;
        float f2;
        if (ea2Var == null) {
            return "null";
        }
        int i2 = ea2Var.e;
        nw2 nw2Var = ea2Var.c;
        String str4 = ea2Var.d;
        int i3 = ea2Var.L;
        int i4 = ea2Var.K;
        int i5 = ea2Var.J;
        int i6 = ea2Var.I;
        int i7 = ea2Var.C;
        float f3 = ea2Var.B;
        int i8 = ea2Var.y;
        hp0 hp0Var = ea2Var.H;
        float f4 = ea2Var.E;
        int i9 = ea2Var.A;
        int i10 = ea2Var.z;
        int i11 = ea2Var.x;
        int i12 = ea2Var.w;
        op1 op1Var = ea2Var.t;
        String str5 = ea2Var.l;
        float f5 = ea2Var.g;
        int i13 = ea2Var.k;
        String str6 = ea2Var.n;
        String str7 = ea2Var.o;
        int i14 = ea2Var.f;
        tv tvVar = new tv(String.valueOf(','), (byte) 2);
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(ea2Var.a);
        sb.append(", mimeType=");
        sb.append(ea2Var.p);
        if (str7 != null) {
            sb.append(", container=");
            sb.append(str7);
        }
        if (str6 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str6);
        }
        if (i13 != -1) {
            sb.append(", bitrate=");
            sb.append(i13);
        }
        float f6 = -1.0f;
        if (f5 != -1.0f) {
            sb.append(", selectionPriority=");
            sb.append(f5);
        }
        if (str5 != null) {
            sb.append(", codecs=");
            sb.append(str5);
        }
        if (op1Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < op1Var.A) {
                UUID uuid = op1Var.x[i15].y;
                if (uuid.equals(ce0.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(ce0.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(ce0.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(ce0.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(ce0.b)) {
                    linkedHashSet.add("universal");
                } else {
                    f2 = f6;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i15++;
                    f6 = f2;
                }
                f2 = f6;
                i15++;
                f6 = f2;
            }
            f = f6;
            sb.append(", drm=[");
            tvVar.a(sb, linkedHashSet.iterator());
            sb.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            sb.append(", res=");
            sb.append(i12);
            sb.append("x");
            sb.append(i11);
        }
        if (i10 != -1 && i9 != -1) {
            sb.append(", decRes=");
            sb.append(i10);
            sb.append("x");
            sb.append(i9);
        }
        double d = f4;
        int i16 = wi1.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f4)};
            String str8 = eq6.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (hp0Var != null) {
            int i17 = hp0Var.f;
            int i18 = hp0Var.e;
            if ((i18 != -1 && i17 != -1) || hp0Var.f()) {
                sb.append(", color=");
                if (hp0Var.f()) {
                    String c = hp0.c(hp0Var.a);
                    String b = hp0.b(hp0Var.b);
                    String e = hp0.e(hp0Var.c);
                    String str9 = eq6.a;
                    Locale locale = Locale.US;
                    str2 = qx1.n(c, "/", b, "/", e);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i18 != -1 && i17 != -1) {
                    str3 = i18 + "/" + i17;
                } else {
                    str3 = "NA/NA";
                }
                sb.append(str2 + "/" + str3);
            }
        }
        if (i8 != -1) {
            sb.append(", pixelFormat=");
            sb.append(i8);
        }
        if (f3 != f) {
            sb.append(", fps=");
            sb.append(f3);
        }
        if (i7 != 0) {
            sb.append(", rotation=");
            sb.append(i7);
        }
        if (ea2Var.D) {
            sb.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i6);
        }
        if (i5 != -1) {
            sb.append(", channels=");
            sb.append(i5);
        }
        if (i4 != -1) {
            sb.append(", channel_mask=");
            sb.append(i4);
        }
        if (i3 != -1) {
            sb.append(", sample_rate=");
            sb.append(i3);
        }
        if (str4 != null) {
            sb.append(", language=");
            sb.append(str4);
        }
        if (!nw2Var.isEmpty()) {
            sb.append(", labels=[");
            tvVar.a(sb, tl7.S(nw2Var, new pb0((byte) 6)).iterator());
            sb.append("]");
        }
        if (i2 != 0) {
            sb.append(", selectionFlags=[");
            String str10 = eq6.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            tvVar.a(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i14 != 0) {
            sb.append(", roleFlags=[");
            String str11 = eq6.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                arrayList2.add("auxiliary");
            }
            tvVar.a(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i = i14;
        }
        if ((32768 & i) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i19 = ea2Var.h;
            String str12 = eq6.a;
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 != 3) {
                            if (i19 == 4) {
                                str = "depth metadata";
                            } else {
                                ze0.m("Unsupported auxiliary track type");
                                return null;
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [da2, java.lang.Object] */
    public final da2 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        obj.K = this.L;
        obj.L = this.M;
        obj.M = this.N;
        obj.N = this.O;
        obj.O = this.P;
        obj.P = this.Q;
        obj.Q = this.R;
        obj.R = this.S;
        obj.S = this.T;
        return obj;
    }

    public final int b() {
        int i;
        int i2 = this.w;
        if (i2 == -1 || (i = this.x) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(ea2 ea2Var) {
        List list = this.s;
        if (list.size() != ea2Var.s.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) ea2Var.s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final ea2 e(ea2 ea2Var) {
        String str;
        nw2 nw2Var;
        String str2;
        op1 op1Var;
        int i;
        float f;
        if (this == ea2Var) {
            return this;
        }
        int h = qy3.h(this.p);
        String str3 = ea2Var.a;
        nw2 nw2Var2 = ea2Var.c;
        float f2 = ea2Var.g;
        int i2 = ea2Var.R;
        int i3 = ea2Var.S;
        String str4 = ea2Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (nw2Var2.isEmpty()) {
            nw2Var2 = this.c;
        }
        if ((h != 3 && h != 1) || (str = ea2Var.d) == null) {
            str = this.d;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = ea2Var.i;
        }
        int i5 = this.j;
        if (i5 == -1) {
            i5 = ea2Var.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String x = eq6.x(h, ea2Var.l);
            if (eq6.h0(x).length == 1) {
                str5 = x;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = ea2Var.n;
        }
        fy3 fy3Var = ea2Var.m;
        fy3 fy3Var2 = this.m;
        if (fy3Var2 != null) {
            fy3Var = fy3Var2.b(fy3Var);
        }
        float f3 = this.B;
        if (f3 == -1.0f) {
            nw2Var = nw2Var2;
            if (h == 2) {
                f3 = ea2Var.B;
            }
        } else {
            nw2Var = nw2Var2;
        }
        int i6 = this.e | ea2Var.e;
        int i7 = this.f | ea2Var.f;
        op1 op1Var2 = ea2Var.t;
        ArrayList arrayList = new ArrayList();
        if (op1Var2 != null) {
            String str7 = op1Var2.z;
            np1[] np1VarArr = op1Var2.x;
            int length = np1VarArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                np1 np1Var = np1VarArr[i9];
                int i10 = length;
                if (np1Var.B != null) {
                    arrayList.add(np1Var);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        op1 op1Var3 = this.t;
        if (op1Var3 != null) {
            if (str2 == null) {
                str2 = op1Var3.z;
            }
            int size = arrayList.size();
            np1[] np1VarArr2 = op1Var3.x;
            String str8 = str2;
            int length2 = np1VarArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                np1 np1Var2 = np1VarArr2[i12];
                int i13 = length2;
                if (np1Var2.B != null) {
                    UUID uuid = np1Var2.y;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i = size;
                            if (((np1) arrayList.get(i14)).y.equals(uuid)) {
                                break;
                            }
                            i14++;
                            size = i;
                        } else {
                            i = size;
                            arrayList.add(np1Var2);
                            break;
                        }
                    }
                } else {
                    i = size;
                    f = f3;
                }
                i11 = i12 + 1;
                length2 = i13;
                f3 = f;
                size = i;
            }
            str2 = str8;
        }
        float f4 = f3;
        if (arrayList.isEmpty()) {
            op1Var = null;
        } else {
            op1Var = new op1(str2, false, (np1[]) arrayList.toArray(new np1[0]));
        }
        da2 a = a();
        a.a = str3;
        a.b = str4;
        a.c = nw2.o(nw2Var);
        a.d = str;
        a.e = i6;
        a.f = i7;
        a.g = f2;
        a.i = i4;
        a.j = i5;
        a.k = str5;
        a.l = fy3Var;
        a.m = str6;
        a.s = op1Var;
        a.a(f4);
        a.Q = i2;
        a.R = i3;
        return new ea2(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && ea2.class == obj.getClass()) {
            ea2 ea2Var = (ea2) obj;
            int i2 = this.U;
            if ((i2 == 0 || (i = ea2Var.U) == 0 || i2 == i) && this.e == ea2Var.e && this.f == ea2Var.f && this.h == ea2Var.h && this.i == ea2Var.i && this.j == ea2Var.j && this.q == ea2Var.q && this.u == ea2Var.u && this.w == ea2Var.w && this.x == ea2Var.x && this.y == ea2Var.y && this.z == ea2Var.z && this.A == ea2Var.A && this.C == ea2Var.C && this.D == ea2Var.D && this.G == ea2Var.G && this.I == ea2Var.I && this.J == ea2Var.J && this.K == ea2Var.K && this.L == ea2Var.L && this.M == ea2Var.M && this.N == ea2Var.N && this.O == ea2Var.O && this.P == ea2Var.P && this.R == ea2Var.R && this.S == ea2Var.S && this.T == ea2Var.T && Float.compare(this.B, ea2Var.B) == 0 && Float.compare(this.g, ea2Var.g) == 0 && Float.compare(this.E, ea2Var.E) == 0 && Objects.equals(this.a, ea2Var.a) && Objects.equals(this.b, ea2Var.b) && this.c.equals(ea2Var.c) && Objects.equals(this.l, ea2Var.l) && Objects.equals(this.n, ea2Var.n) && Objects.equals(this.o, ea2Var.o) && Objects.equals(this.p, ea2Var.p) && Objects.equals(this.d, ea2Var.d) && Arrays.equals(this.F, ea2Var.F) && Objects.equals(this.m, ea2Var.m) && Objects.equals(this.H, ea2Var.H) && Objects.equals(this.t, ea2Var.t) && c(ea2Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = this.U;
        if (i == 0) {
            int i2 = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.c.hashCode() + ((i3 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int floatToIntBits = (((((((Float.floatToIntBits(this.g) + ((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
            String str4 = this.l;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (floatToIntBits + hashCode4) * 31;
            fy3 fy3Var = this.m;
            if (fy3Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = fy3Var.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.n;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.o;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            String str7 = this.p;
            if (str7 != null) {
                i2 = str7.hashCode();
            }
            int floatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((((Float.floatToIntBits(this.B) + ((((((((((((((((i7 + i2) * 31) + this.q) * 31) + ((int) this.u)) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
            this.U = floatToIntBits2;
            return floatToIntBits2;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.p);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.H);
        sb.append("], [");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.K);
        sb.append(", ");
        return zo5.k(this.L, "])", sb);
    }
}
