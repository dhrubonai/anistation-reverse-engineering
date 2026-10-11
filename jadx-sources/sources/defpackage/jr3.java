package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jr3 {
    public static final jr3 M = new jr3(new hr3());
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
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
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Integer E;
    public final Integer F;
    public final CharSequence G;
    public final CharSequence H;
    public final CharSequence I;
    public final Integer J;
    public final Bundle K;
    public final nw2 L;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final yx4 i;
    public final yx4 j;
    public final byte[] k;
    public ob0 l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    static {
        String str = eq6.a;
        N = Integer.toString(0, 36);
        O = Integer.toString(1, 36);
        P = Integer.toString(2, 36);
        Q = Integer.toString(3, 36);
        R = Integer.toString(4, 36);
        S = Integer.toString(5, 36);
        T = Integer.toString(6, 36);
        U = Integer.toString(8, 36);
        V = Integer.toString(9, 36);
        W = Integer.toString(10, 36);
        X = Integer.toString(11, 36);
        Y = Integer.toString(12, 36);
        Z = Integer.toString(13, 36);
        a0 = Integer.toString(14, 36);
        b0 = Integer.toString(15, 36);
        c0 = Integer.toString(16, 36);
        d0 = Integer.toString(17, 36);
        e0 = Integer.toString(18, 36);
        f0 = Integer.toString(19, 36);
        g0 = Integer.toString(20, 36);
        h0 = Integer.toString(21, 36);
        i0 = Integer.toString(22, 36);
        j0 = Integer.toString(23, 36);
        k0 = Integer.toString(24, 36);
        l0 = Integer.toString(25, 36);
        m0 = Integer.toString(26, 36);
        n0 = Integer.toString(27, 36);
        o0 = Integer.toString(28, 36);
        p0 = Integer.toString(29, 36);
        q0 = Integer.toString(30, 36);
        r0 = Integer.toString(31, 36);
        s0 = Integer.toString(32, 36);
        t0 = Integer.toString(33, 36);
        u0 = Integer.toString(34, 36);
        v0 = Integer.toString(35, 36);
        w0 = Integer.toString(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 36);
    }

    public jr3(hr3 hr3Var) {
        Boolean bool = hr3Var.r;
        Integer num = hr3Var.q;
        Integer num2 = hr3Var.I;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = hr3Var.a;
        this.b = hr3Var.b;
        this.c = hr3Var.c;
        this.d = hr3Var.d;
        this.e = hr3Var.e;
        this.f = hr3Var.f;
        this.g = hr3Var.g;
        this.h = hr3Var.h;
        this.i = hr3Var.i;
        this.j = hr3Var.j;
        this.k = hr3Var.k;
        this.l = hr3Var.l;
        this.m = hr3Var.m;
        this.n = hr3Var.n;
        this.o = hr3Var.o;
        this.p = hr3Var.p;
        this.q = num;
        this.r = bool;
        this.s = hr3Var.s;
        Integer num3 = hr3Var.t;
        this.t = num3;
        this.u = num3;
        this.v = hr3Var.u;
        this.w = hr3Var.v;
        this.x = hr3Var.w;
        this.y = hr3Var.x;
        this.z = hr3Var.y;
        this.A = hr3Var.z;
        this.B = hr3Var.A;
        this.C = hr3Var.B;
        this.D = hr3Var.C;
        this.E = hr3Var.D;
        this.F = hr3Var.E;
        this.G = hr3Var.F;
        this.H = hr3Var.G;
        this.I = hr3Var.H;
        this.J = num2;
        this.L = hr3Var.K;
        this.K = hr3Var.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022d  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jr3 b(int r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr3.b(int, android.os.Bundle):jr3");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hr3, java.lang.Object] */
    public final hr3 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = this.n;
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.D = this.E;
        obj.C = this.D;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.K = this.L;
        obj.J = this.K;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle c(int r11) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr3.c(int):android.os.Bundle");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && jr3.class == obj.getClass()) {
            jr3 jr3Var = (jr3) obj;
            if (TextUtils.equals(this.a, jr3Var.a) && TextUtils.equals(this.b, jr3Var.b) && TextUtils.equals(this.c, jr3Var.c) && TextUtils.equals(this.d, jr3Var.d) && TextUtils.equals(this.e, jr3Var.e) && TextUtils.equals(this.f, jr3Var.f) && TextUtils.equals(this.g, jr3Var.g) && Objects.equals(this.h, jr3Var.h) && Objects.equals(this.i, jr3Var.i) && Objects.equals(this.j, jr3Var.j) && Arrays.equals(this.k, jr3Var.k) && Objects.equals(this.m, jr3Var.m) && Objects.equals(this.n, jr3Var.n) && Objects.equals(this.o, jr3Var.o) && Objects.equals(this.p, jr3Var.p) && Objects.equals(this.q, jr3Var.q) && Objects.equals(this.r, jr3Var.r) && Objects.equals(this.s, jr3Var.s) && Objects.equals(this.u, jr3Var.u) && Objects.equals(this.v, jr3Var.v) && Objects.equals(this.w, jr3Var.w) && Objects.equals(this.x, jr3Var.x) && Objects.equals(this.y, jr3Var.y) && Objects.equals(this.z, jr3Var.z) && TextUtils.equals(this.A, jr3Var.A) && TextUtils.equals(this.B, jr3Var.B) && TextUtils.equals(this.C, jr3Var.C) && TextUtils.equals(this.D, jr3Var.D) && Objects.equals(this.E, jr3Var.E) && Objects.equals(this.F, jr3Var.F) && TextUtils.equals(this.G, jr3Var.G) && TextUtils.equals(this.H, jr3Var.H) && TextUtils.equals(this.I, jr3Var.I) && Objects.equals(this.J, jr3Var.J) && Objects.equals(this.L, jr3Var.L)) {
                if (this.K == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (jr3Var.K == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.k));
        if (this.K == null) {
            z = true;
        } else {
            z = false;
        }
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, valueOf, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, Boolean.valueOf(z), this.L);
    }
}
