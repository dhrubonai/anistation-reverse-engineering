package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ep4 {
    public static final ep4 H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
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
    public final int A;
    public final jr3 B;
    public final long C;
    public final long D;
    public final long E;
    public final qh6 F;
    public final hh6 G;
    public final yx1 a;
    public final int b;
    public final sk5 c;
    public final jo4 d;
    public final jo4 e;
    public final int f;
    public final rn4 g;
    public final int h;
    public final boolean i;
    public final kf6 j;
    public final int k;
    public final hv6 l;
    public final jr3 m;
    public final float n;
    public final float o;
    public final int p;
    public final ru q;
    public final c31 r;
    public final rf1 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        sk5 sk5Var = sk5.l;
        jo4 jo4Var = sk5.k;
        rn4 rn4Var = rn4.d;
        hv6 hv6Var = hv6.d;
        gf6 gf6Var = kf6.a;
        jr3 jr3Var = jr3.M;
        H = new ep4(null, 0, sk5Var, jo4Var, jo4Var, 0, rn4Var, 0, false, hv6Var, gf6Var, 0, jr3Var, 1.0f, 1.0f, ru.i, 0, c31.d, rf1.e, 0, false, false, 1, 0, 1, false, false, jr3Var, 5000L, 15000L, 3000L, qh6.b, hh6.J);
        String str = eq6.a;
        I = Integer.toString(1, 36);
        J = Integer.toString(2, 36);
        K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        M = Integer.toString(5, 36);
        N = Integer.toString(6, 36);
        O = Integer.toString(7, 36);
        P = Integer.toString(33, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        a0 = Integer.toString(18, 36);
        b0 = Integer.toString(19, 36);
        c0 = Integer.toString(20, 36);
        d0 = Integer.toString(21, 36);
        e0 = Integer.toString(22, 36);
        f0 = Integer.toString(23, 36);
        g0 = Integer.toString(24, 36);
        h0 = Integer.toString(25, 36);
        i0 = Integer.toString(26, 36);
        j0 = Integer.toString(27, 36);
        k0 = Integer.toString(28, 36);
        l0 = Integer.toString(29, 36);
        m0 = Integer.toString(30, 36);
        n0 = Integer.toString(31, 36);
        Integer.toString(32, 36);
        o0 = Integer.toString(34, 36);
    }

    public ep4(yx1 yx1Var, int i, sk5 sk5Var, jo4 jo4Var, jo4 jo4Var2, int i2, rn4 rn4Var, int i3, boolean z, hv6 hv6Var, kf6 kf6Var, int i4, jr3 jr3Var, float f, float f2, ru ruVar, int i5, c31 c31Var, rf1 rf1Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, jr3 jr3Var2, long j, long j2, long j3, qh6 qh6Var, hh6 hh6Var) {
        this.a = yx1Var;
        this.b = i;
        this.c = sk5Var;
        this.d = jo4Var;
        this.e = jo4Var2;
        this.f = i2;
        this.g = rn4Var;
        this.h = i3;
        this.i = z;
        this.l = hv6Var;
        this.j = kf6Var;
        this.k = i4;
        this.m = jr3Var;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = ruVar;
        this.r = c31Var;
        this.s = rf1Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = jr3Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = qh6Var;
        this.G = hh6Var;
    }

    public final ep4 a(qh6 qh6Var) {
        boolean z;
        kf6 kf6Var = this.j;
        boolean p = kf6Var.p();
        sk5 sk5Var = this.c;
        if (!p && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        return new ep4(this.a, this.b, sk5Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, kf6Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, qh6Var, this.G);
    }

    public final ep4 b(int i, int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        int i3 = this.A;
        if (i3 == 3 && z && i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        kf6 kf6Var = this.j;
        boolean p = kf6Var.p();
        sk5 sk5Var = this.c;
        if (p || sk5Var.a.b < kf6Var.o()) {
            z3 = true;
        }
        io3.B(z3);
        return new ep4(this.a, this.b, sk5Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, kf6Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ep4 c(kf6 kf6Var, sk5 sk5Var, int i) {
        boolean z;
        if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        return new ep4(this.a, this.b, sk5Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, kf6Var, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ep4 d(hh6 hh6Var) {
        boolean z;
        kf6 kf6Var = this.j;
        boolean p = kf6Var.p();
        sk5 sk5Var = this.c;
        if (!p && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        return new ep4(this.a, this.b, sk5Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, kf6Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, hh6Var);
    }

    public final ep4 e(go4 go4Var, boolean z, boolean z2) {
        jr3 jr3Var;
        float f;
        float f2;
        ru ruVar;
        c31 c31Var;
        int i;
        boolean z3;
        jr3 jr3Var2;
        qh6 qh6Var;
        int i2;
        boolean a = go4Var.a(16);
        boolean a2 = go4Var.a(17);
        sk5 sk5Var = this.c;
        sk5 a3 = sk5Var.a(a, a2);
        jo4 b = this.d.b(a, a2);
        jo4 b2 = this.e.b(a, a2);
        boolean z4 = true;
        kf6 kf6Var = this.j;
        if (!a2 && a && !kf6Var.p()) {
            int i3 = sk5Var.a.b;
            if (kf6Var.o() != 1) {
                jf6 m = kf6Var.m(i3, new jf6(), 0L);
                jw2 k = nw2.k();
                int i4 = m.n;
                while (true) {
                    i2 = m.o;
                    if (i4 > i2) {
                        break;
                    }
                    hf6 f3 = kf6Var.f(i4, new hf6(), true);
                    f3.c = 0;
                    k.c(f3);
                    i4++;
                }
                m.o = i2 - m.n;
                m.n = 0;
                kf6Var = new if6(nw2.s(m), k.g(), new int[]{0});
            }
        } else if (z || !a2) {
            kf6Var = kf6.a;
        }
        kf6 kf6Var2 = kf6Var;
        if (!go4Var.a(18)) {
            jr3Var = jr3.M;
        } else {
            jr3Var = this.m;
        }
        jr3 jr3Var3 = jr3Var;
        if (!go4Var.a(22)) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            f = this.n;
            f2 = this.o;
        }
        if (!go4Var.a(21)) {
            ruVar = ru.i;
        } else {
            ruVar = this.q;
        }
        ru ruVar2 = ruVar;
        if (!go4Var.a(28)) {
            c31Var = c31.d;
        } else {
            c31Var = this.r;
        }
        c31 c31Var2 = c31Var;
        if (!go4Var.a(23)) {
            i = 0;
            z3 = false;
        } else {
            i = this.t;
            z3 = this.u;
        }
        if (!go4Var.a(18)) {
            jr3Var2 = jr3.M;
        } else {
            jr3Var2 = this.B;
        }
        jr3 jr3Var4 = jr3Var2;
        if (!z2 && go4Var.a(30)) {
            qh6Var = this.F;
        } else {
            qh6Var = qh6.b;
        }
        qh6 qh6Var2 = qh6Var;
        if (!kf6Var2.p() && a3.a.b >= kf6Var2.o()) {
            z4 = false;
        }
        io3.B(z4);
        return new ep4(this.a, this.b, a3, b, b2, this.f, this.g, this.h, this.i, this.l, kf6Var2, this.k, jr3Var3, f, f2, ruVar2, this.p, c31Var2, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, jr3Var4, this.C, this.D, this.E, qh6Var2, this.G);
    }

    public final Bundle f(int i) {
        Bundle bundle;
        long j;
        long j2;
        long j3;
        int i2;
        boolean z;
        Bundle bundle2;
        ArrayList arrayList;
        int i3;
        hf6 hf6Var;
        int i4;
        int i5;
        Bundle c;
        Bundle bundle3 = new Bundle();
        yx1 yx1Var = this.a;
        if (yx1Var != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(yx1.G, yx1Var.x);
            bundle4.putLong(yx1.H, yx1Var.y);
            bundle4.putString(yx1.I, yx1Var.getMessage());
            bundle4.putBundle(yx1.L, Bundle.EMPTY);
            Throwable cause = yx1Var.getCause();
            if (cause != null) {
                bundle4.putString(yx1.J, cause.getClass().getName());
                bundle4.putString(yx1.K, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i6 = this.b;
        if (i6 != 0) {
            bundle3.putInt(c0, i6);
        }
        sk5 sk5Var = this.c;
        if (i < 3 || !sk5Var.equals(sk5.l)) {
            bundle3.putBundle(b0, sk5Var.b(i));
        }
        jo4 jo4Var = this.d;
        if (i < 3 || !sk5.k.a(jo4Var)) {
            bundle3.putBundle(d0, jo4Var.c(i));
        }
        jo4 jo4Var2 = this.e;
        if (i < 3 || !sk5.k.a(jo4Var2)) {
            bundle3.putBundle(e0, jo4Var2.c(i));
        }
        int i7 = this.f;
        if (i7 != 0) {
            bundle3.putInt(f0, i7);
        }
        rn4 rn4Var = rn4.d;
        rn4 rn4Var2 = this.g;
        if (!rn4Var2.equals(rn4Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(rn4.e, rn4Var2.a);
            bundle5.putFloat(rn4.f, rn4Var2.b);
            bundle3.putBundle(I, bundle5);
        }
        int i8 = this.h;
        if (i8 != 0) {
            bundle3.putInt(J, i8);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle3.putBoolean(K, z2);
        }
        gf6 gf6Var = kf6.a;
        kf6 kf6Var = this.j;
        boolean z3 = false;
        long j4 = 0;
        boolean z4 = true;
        if (!kf6Var.equals(gf6Var)) {
            ArrayList arrayList2 = new ArrayList();
            int o = kf6Var.o();
            jf6 jf6Var = new jf6();
            int i9 = 0;
            while (i9 < o) {
                jf6 m = kf6Var.m(i9, jf6Var, 0L);
                m.getClass();
                Bundle bundle6 = new Bundle();
                if (!ar3.g.equals(m.c)) {
                    bundle6.putBundle(jf6.s, m.c.c(i, z3));
                }
                long j5 = m.e;
                if (j5 != -9223372036854775807L) {
                    bundle6.putLong(jf6.t, j5);
                }
                long j6 = m.f;
                if (j6 != -9223372036854775807L) {
                    bundle6.putLong(jf6.u, j6);
                }
                long j7 = m.g;
                if (j7 != -9223372036854775807L) {
                    bundle6.putLong(jf6.v, j7);
                }
                boolean z5 = m.h;
                if (z5) {
                    bundle6.putBoolean(jf6.w, z5);
                }
                boolean z6 = m.i;
                if (z6) {
                    bundle6.putBoolean(jf6.x, z6);
                }
                uq3 uq3Var = m.j;
                if (uq3Var != null) {
                    bundle6.putBundle(jf6.y, uq3Var.b());
                }
                boolean z7 = m.k;
                if (z7) {
                    bundle6.putBoolean(jf6.z, z7);
                }
                long j8 = m.l;
                if (j8 != 0) {
                    bundle6.putLong(jf6.A, j8);
                }
                long j9 = m.m;
                if (j9 != -9223372036854775807L) {
                    bundle6.putLong(jf6.B, j9);
                }
                int i10 = m.n;
                if (i10 != 0) {
                    bundle6.putInt(jf6.C, i10);
                }
                int i11 = m.o;
                if (i11 != 0) {
                    bundle6.putInt(jf6.D, i11);
                }
                long j10 = m.p;
                if (j10 != 0) {
                    bundle6.putLong(jf6.E, j10);
                }
                Object obj = m.a;
                if (obj instanceof String) {
                    bundle6.putString(jf6.F, (String) obj);
                }
                arrayList2.add(bundle6);
                i9++;
                z3 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            int h = kf6Var.h();
            hf6 hf6Var2 = new hf6();
            int i12 = 0;
            while (i12 < h) {
                hf6 f = kf6Var.f(i12, hf6Var2, z4);
                f.getClass();
                Bundle bundle7 = new Bundle();
                int i13 = f.c;
                if (i13 != 0) {
                    bundle7.putInt(hf6.h, i13);
                }
                long j11 = j4;
                long j12 = f.d;
                if (j12 != -9223372036854775807L) {
                    bundle7.putLong(hf6.i, j12);
                }
                long j13 = f.e;
                if (j13 != j11) {
                    bundle7.putLong(hf6.j, j13);
                }
                boolean z8 = f.f;
                if (z8) {
                    bundle7.putBoolean(hf6.k, z8);
                }
                if (!f.g.equals(y5.c)) {
                    String str = hf6.l;
                    y5 y5Var = f.g;
                    y5Var.getClass();
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    w5[] w5VarArr = y5Var.b;
                    i3 = h;
                    int length = w5VarArr.length;
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = i14;
                        w5 w5Var = w5VarArr[i15];
                        w5Var.getClass();
                        int i16 = length;
                        Bundle bundle9 = new Bundle();
                        hf6 hf6Var3 = hf6Var2;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(w5.h, j11);
                        bundle9.putInt(w5.i, w5Var.a);
                        bundle9.putInt(w5.o, -1);
                        bundle9.putParcelableArrayList(w5.j, new ArrayList<>(Arrays.asList(w5Var.b)));
                        String str2 = w5.p;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        ar3[] ar3VarArr = w5Var.c;
                        int i17 = i12;
                        int length2 = ar3VarArr.length;
                        int i18 = 0;
                        while (i18 < length2) {
                            ar3 ar3Var = ar3VarArr[i18];
                            if (ar3Var == null) {
                                i5 = i18;
                                c = null;
                            } else {
                                i5 = i18;
                                c = ar3Var.c(i, true);
                            }
                            arrayList6.add(c);
                            i18 = i5 + 1;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList6);
                        bundle9.putIntArray(w5.k, w5Var.d);
                        bundle9.putLongArray(w5.l, w5Var.e);
                        bundle9.putLong(w5.m, 0L);
                        bundle9.putBoolean(w5.n, false);
                        bundle9.putStringArrayList(w5.q, new ArrayList<>(Arrays.asList(w5Var.f)));
                        String str3 = w5.s;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        for (x5 x5Var : w5Var.g) {
                            arrayList7.add(null);
                        }
                        bundle9.putParcelableArrayList(str3, arrayList7);
                        bundle9.putBoolean(w5.r, false);
                        arrayList4.add(bundle9);
                        i14 = i15 + 1;
                        length = i16;
                        hf6Var2 = hf6Var3;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                        i12 = i17;
                        j11 = 0;
                    }
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    hf6Var = hf6Var2;
                    i4 = i12;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(y5.e, arrayList4);
                    }
                    bundle7.putBundle(str, bundle8);
                } else {
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    i3 = h;
                    hf6Var = hf6Var2;
                    i4 = i12;
                }
                Object obj2 = f.a;
                if (obj2 instanceof String) {
                    bundle7.putString(hf6.m, (String) obj2);
                }
                Object obj3 = f.b;
                if (obj3 instanceof String) {
                    bundle7.putString(hf6.n, (String) obj3);
                }
                arrayList3.add(bundle7);
                i12 = i4 + 1;
                h = i3;
                hf6Var2 = hf6Var;
                bundle3 = bundle2;
                arrayList2 = arrayList;
                j4 = 0;
                z4 = true;
            }
            Bundle bundle11 = bundle3;
            ArrayList arrayList8 = arrayList2;
            int[] iArr = new int[o];
            if (o > 0) {
                z = true;
                i2 = 0;
                iArr[0] = kf6Var.a(true);
            } else {
                i2 = 0;
                z = true;
            }
            int i19 = z ? 1 : 0;
            while (i19 < o) {
                iArr[i19] = kf6Var.e(iArr[i19 - 1], i2, z);
                i19++;
                i2 = 0;
                z = true;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(kf6.b, new lb0(arrayList8));
            bundle12.putBinder(kf6.c, new lb0(arrayList3));
            bundle12.putIntArray(kf6.d, iArr);
            bundle = bundle11;
            bundle.putBundle(L, bundle12);
        } else {
            bundle = bundle3;
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(n0, i20);
        }
        hv6 hv6Var = hv6.d;
        hv6 hv6Var2 = this.l;
        if (!hv6Var2.equals(hv6Var)) {
            Bundle bundle13 = new Bundle();
            int i21 = hv6Var2.a;
            if (i21 != 0) {
                bundle13.putInt(hv6.e, i21);
            }
            int i22 = hv6Var2.b;
            if (i22 != 0) {
                bundle13.putInt(hv6.f, i22);
            }
            float f2 = hv6Var2.c;
            if (f2 != 1.0f) {
                bundle13.putFloat(hv6.g, f2);
            }
            bundle.putBundle(M, bundle13);
        }
        jr3 jr3Var = jr3.M;
        jr3 jr3Var2 = this.m;
        if (!jr3Var2.equals(jr3Var)) {
            bundle.putBundle(N, jr3Var2.c(i));
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            bundle.putFloat(O, f3);
        }
        float f4 = this.o;
        if (f4 != 1.0f) {
            bundle.putFloat(P, f4);
        }
        int i23 = this.p;
        if (i23 != 0) {
            bundle.putInt(o0, i23);
        }
        ru ruVar = ru.i;
        ru ruVar2 = this.q;
        if (!ruVar2.equals(ruVar)) {
            Bundle bundle14 = new Bundle();
            int i24 = ruVar2.a;
            if (i24 != 0) {
                bundle14.putInt(ru.j, i24);
            }
            int i25 = ruVar2.b;
            if (i25 != 0) {
                bundle14.putInt(ru.k, i25);
            }
            int i26 = ruVar2.c;
            if (i26 != 1) {
                bundle14.putInt(ru.l, i26);
            }
            int i27 = ruVar2.d;
            if (i27 != 1) {
                bundle14.putInt(ru.m, i27);
            }
            int i28 = ruVar2.e;
            if (i28 != 0) {
                bundle14.putInt(ru.n, i28);
            }
            boolean z9 = ruVar2.f;
            if (z9) {
                bundle14.putBoolean(ru.o, z9);
            }
            boolean z10 = ruVar2.g;
            if (!z10) {
                bundle14.putBoolean(ru.p, z10);
            }
            bundle.putBundle(Q, bundle14);
        }
        c31 c31Var = c31.d;
        c31 c31Var2 = this.r;
        if (!c31Var2.equals(c31Var)) {
            Bundle bundle15 = new Bundle();
            String str4 = c31.e;
            o15 o15Var = c31Var2.a;
            jw2 k = nw2.k();
            for (int i29 = 0; i29 < o15Var.A; i29++) {
                if (((b31) o15Var.get(i29)).d == null) {
                    k.c((b31) o15Var.get(i29));
                }
            }
            o15 g = k.g();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(g.A);
            z62 listIterator = g.listIterator(0);
            while (listIterator.hasNext()) {
                b31 b31Var = (b31) listIterator.next();
                Bundle b = b31Var.b();
                Bitmap bitmap = b31Var.d;
                if (bitmap != null) {
                    b.putParcelable(b31.w, bitmap);
                }
                arrayList9.add(b);
            }
            bundle15.putParcelableArrayList(str4, arrayList9);
            bundle15.putLong(c31.f, c31Var2.b);
            bundle.putBundle(g0, bundle15);
        }
        rf1 rf1Var = rf1.e;
        rf1 rf1Var2 = this.s;
        if (!rf1Var2.equals(rf1Var)) {
            Bundle bundle16 = new Bundle();
            boolean z11 = rf1Var2.a;
            if (z11) {
                bundle16.putInt(rf1.f, z11 ? 1 : 0);
            }
            int i30 = rf1Var2.b;
            if (i30 != 0) {
                bundle16.putInt(rf1.g, i30);
            }
            int i31 = rf1Var2.c;
            if (i31 != 0) {
                bundle16.putInt(rf1.h, i31);
            }
            String str5 = rf1Var2.d;
            if (str5 != null) {
                bundle16.putString(rf1.i, str5);
            }
            bundle.putBundle(R, bundle16);
        }
        int i32 = this.t;
        if (i32 != 0) {
            bundle.putInt(S, i32);
        }
        boolean z12 = this.u;
        if (z12) {
            bundle.putBoolean(T, z12);
        }
        boolean z13 = this.v;
        if (z13) {
            bundle.putBoolean(U, z13);
        }
        int i33 = this.w;
        if (i33 != 1) {
            bundle.putInt(V, i33);
        }
        int i34 = this.z;
        if (i34 != 0) {
            bundle.putInt(W, i34);
        }
        int i35 = this.A;
        if (i35 != 1) {
            bundle.putInt(X, i35);
        }
        boolean z14 = this.x;
        if (z14) {
            bundle.putBoolean(Y, z14);
        }
        boolean z15 = this.y;
        if (z15) {
            bundle.putBoolean(Z, z15);
        }
        jr3 jr3Var3 = jr3.M;
        jr3 jr3Var4 = this.B;
        if (!jr3Var4.equals(jr3Var3)) {
            bundle.putBundle(h0, jr3Var4.c(i));
        }
        if (i < 6) {
            j = 0;
        } else {
            j = 5000;
        }
        long j14 = this.C;
        if (j14 != j) {
            bundle.putLong(i0, j14);
        }
        if (i < 6) {
            j2 = 0;
        } else {
            j2 = 15000;
        }
        long j15 = this.D;
        if (j15 != j2) {
            bundle.putLong(j0, j15);
        }
        if (i < 6) {
            j3 = 0;
        } else {
            j3 = 3000;
        }
        long j16 = this.E;
        if (j16 != j3) {
            bundle.putLong(k0, j16);
        }
        qh6 qh6Var = qh6.b;
        qh6 qh6Var2 = this.F;
        if (!qh6Var2.equals(qh6Var)) {
            Bundle bundle17 = new Bundle();
            bundle17.putParcelableArrayList(qh6.c, kb0.L(qh6Var2.a, new pb0((byte) 19)));
            bundle.putBundle(m0, bundle17);
        }
        hh6 hh6Var = hh6.J;
        hh6 hh6Var2 = this.G;
        if (!hh6Var2.equals(hh6Var)) {
            bundle.putBundle(l0, hh6Var2.c());
        }
        return bundle;
    }
}
