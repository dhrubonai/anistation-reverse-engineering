package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Range;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p25 extends v30 {
    public static final rf1 L;
    public static final Range M;
    public static final Range N;
    public static final go4 O;
    public static final long[] P;
    public go4 A;
    public int B;
    public int C;
    public long D;
    public int E;
    public int F;
    public long G;
    public jo4 H;
    public jr3 I;
    public jr3 J;
    public rf1 K;
    public final kh0 b;
    public final br3 c;
    public final short d;
    public final short e;
    public final short f;
    public final dn0 g;
    public final hf6 h;
    public final l25 i;
    public final m25 j;
    public final o25 k;
    public final n25 l;
    public final j25 m;
    public final ui3 n;
    public i75 o;
    public final l33 p;
    public final l33 q;
    public boolean r;
    public int s;
    public final l33 t;
    public final l33 u;
    public gi0 v;
    public s25 w;
    public pi0 x;
    public final l33 y;
    public final l33 z;

    static {
        yq6 yq6Var = new yq6(1);
        yq6Var.b = 20;
        L = yq6Var.b();
        M = new Range(0, 20);
        N = new Range(Float.valueOf(0.0f), Float.valueOf(1.0f));
        cr3.a("media3.cast");
        fo4 fo4Var = new fo4();
        fo4Var.a.c(1, 2, 3, 4, 10, 23, 26, 34, 25, 33, 15, 13, 16, 17, 18, 19, 31, 20, 30, 32);
        O = fo4Var.b();
        P = new long[0];
    }

    public p25(u98 u98Var) {
        boolean z;
        gi0 gi0Var;
        Context context = (Context) u98Var.z;
        tl7.U();
        kh0 kh0Var = kh0.D;
        if (kh0Var == null) {
            kh0Var = new kh0(context);
            kh0.D = kh0Var;
        }
        boolean z2 = false;
        if (((Context) kh0Var.A) == null && ((xh0) kh0Var.B) == null && ((Throwable) kh0Var.C) == null && !kh0Var.x) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        kh0 kh0Var2 = kh0.D;
        br3 br3Var = (br3) u98Var.A;
        kb0.B("RemoteCastPlayer", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "]");
        this.b = kh0Var2;
        this.c = br3Var;
        this.d = (short) 5000;
        this.e = (short) 15000;
        this.f = (short) 3000;
        this.g = new dn0(br3Var);
        this.h = new hf6();
        this.j = new m25(this, (byte) 0);
        o25 o25Var = new o25(this);
        this.k = o25Var;
        this.l = new n25(this);
        this.m = new j25(this, (byte) 5);
        this.n = new ui3(Looper.getMainLooper(), f46.a, new h25(this, (byte) 6));
        byte b = 15;
        this.p = new l33(b, Boolean.FALSE, z2);
        this.q = new l33(b, (Object) 0, z2);
        this.s = 20;
        this.t = new l33(b, Float.valueOf(1.0f), z2);
        this.u = new l33(b, rn4.d, z2);
        this.B = 1;
        this.x = pi0.k;
        jr3 jr3Var = jr3.M;
        this.I = jr3Var;
        this.J = jr3Var;
        this.y = new l33(b, qh6.b, z2);
        fo4 fo4Var = new fo4();
        fo4Var.a.b(O.a);
        this.A = fo4Var.b();
        this.z = new l33(b, hh6.J, z2);
        this.F = -1;
        this.G = -9223372036854775807L;
        kh0Var2.getClass();
        hh0 hh0Var = new hh0(context);
        tl7.U();
        if (((xh0) kh0Var2.B) == null && ((Throwable) kh0Var2.C) == null && !kh0Var2.x) {
            try {
                kh0Var2.a(hh0Var);
            } catch (IllegalStateException e) {
                throw new IllegalStateException("Must initialize Cast prior to using it. To achieve this, call androidx.media3.cast.Cast.getSingletoninstance(context).initialize() in Application#onCreate() method.", e);
            }
        }
        kh0Var2.getClass();
        tl7.U();
        xh0 xh0Var = (xh0) kh0Var2.B;
        if (xh0Var != null) {
            a34.s();
            xh0Var.c.a(o25Var);
        } else {
            ((ArrayList) kh0Var2.y).add(o25Var);
        }
        tl7.U();
        xh0 xh0Var2 = (xh0) kh0Var2.B;
        if (xh0Var2 != null) {
            a34.s();
            gi0Var = xh0Var2.c.c();
        } else {
            gi0Var = null;
        }
        k1(gi0Var);
        t1();
        if (Build.VERSION.SDK_INT >= 30) {
            l25 l25Var = new l25(this, context);
            this.i = l25Var;
            l25Var.b();
            this.K = l25Var.a();
            return;
        }
        this.i = null;
        this.K = L;
    }

    public static int h1(s25 s25Var, kf6 kf6Var) {
        ur3 c;
        int i;
        if (s25Var != null) {
            a34.s();
            bx3 e = s25Var.e();
            if (e == null) {
                c = null;
            } else {
                c = e.c(e.z);
            }
            if (c != null) {
                i = kf6Var.b(Integer.valueOf(c.y));
            } else {
                i = -1;
            }
            if (i != -1) {
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.ko4
    public final void B0(int i, int i2, int i3) {
        boolean z;
        jf6 jf6Var;
        int i4 = 0;
        if (i >= 0 && i <= i2 && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int length = this.x.g.length;
        int min = Math.min(i2, length);
        int i5 = min - i;
        int min2 = Math.min(i3, length - i5);
        if (i < length && i != min && i != min2) {
            int[] iArr = new int[i5];
            int i6 = 0;
            while (true) {
                jf6Var = this.a;
                if (i6 >= i5) {
                    break;
                }
                this.x.m(i6 + i, jf6Var, 0L);
                iArr[i6] = ((Integer) jf6Var.a).intValue();
                i6++;
            }
            if (this.w != null && j1() != null) {
                if (i < min2) {
                    min2 += i5;
                }
                pi0 pi0Var = this.x;
                if (min2 < pi0Var.g.length) {
                    pi0Var.m(min2, jf6Var, 0L);
                    i4 = ((Integer) jf6Var.a).intValue();
                }
                s25 s25Var = this.w;
                s25Var.getClass();
                a34.s();
                if (!s25Var.x()) {
                    s25.w();
                } else {
                    s25.z(new pe7(s25Var, iArr, i4));
                }
            }
        }
    }

    @Override // defpackage.ko4
    public final ru C() {
        return ru.i;
    }

    @Override // defpackage.ko4
    public final void D(int i, boolean z) {
        gi0 gi0Var = this.v;
        if (gi0Var == null) {
            return;
        }
        try {
            a34.s();
            sm7 sm7Var = gi0Var.i;
            if (sm7Var != null && sm7Var.k()) {
                o76 b = o76.b();
                b.d = new mn0(sm7Var, z);
                b.c = (short) 8412;
                sm7Var.d(1, b.a());
            }
            l1(this.s, z);
            this.n.b();
        } catch (IOException e) {
            kb0.P("RemoteCastPlayer", "Ignoring setDeviceMuted due to exception", e);
        }
    }

    @Override // defpackage.ko4
    public final int D0() {
        return 0;
    }

    @Override // defpackage.ko4
    public final void E() {
        i0(0);
    }

    @Override // defpackage.ko4
    public final void F(int i, int i2) {
        if (this.v == null) {
            return;
        }
        int intValue = ((Integer) M.clamp(Integer.valueOf(i))).intValue();
        try {
            this.v.e(intValue / 20.0f);
            l1(intValue, this.r);
            this.n.b();
        } catch (IOException e) {
            kb0.P("RemoteCastPlayer", "Ignoring setDeviceVolume due to exception", e);
        }
    }

    @Override // defpackage.ko4
    public final int F0() {
        return ((Integer) this.q.y).intValue();
    }

    @Override // defpackage.ko4
    public final void G(int i) {
        F(this.s + 1, i);
    }

    @Override // defpackage.ko4
    public final kf6 G0() {
        return this.x;
    }

    @Override // defpackage.ko4
    public final int H() {
        return -1;
    }

    @Override // defpackage.ko4
    public final boolean H0() {
        return this.r;
    }

    @Override // defpackage.ko4
    public final Looper J0() {
        return Looper.getMainLooper();
    }

    @Override // defpackage.ko4
    public final sq5 K() {
        return sq5.c;
    }

    @Override // defpackage.ko4
    public final void N0() {
        G(0);
    }

    @Override // defpackage.ko4
    public final boolean O0() {
        return false;
    }

    @Override // defpackage.ko4
    public final hh6 P0() {
        return (hh6) this.z.y;
    }

    @Override // defpackage.ko4
    public final void R(int i, int i2) {
        boolean z;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int length = this.x.g.length;
        int min = Math.min(i2, length);
        if (i < length && i != min) {
            int i3 = min - i;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                jf6 jf6Var = this.a;
                this.x.m(i4 + i, jf6Var, 0L);
                iArr[i4] = ((Integer) jf6Var.a).intValue();
            }
            if (this.w != null && j1() != null) {
                pi0 pi0Var = this.x;
                if (!pi0Var.p()) {
                    int s0 = s0();
                    hf6 hf6Var = this.h;
                    pi0Var.f(s0, hf6Var, true);
                    Object obj = hf6Var.b;
                    String str = eq6.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i3) {
                            break;
                        }
                        if (obj.equals(Integer.valueOf(iArr[i5]))) {
                            this.H = i1();
                            break;
                        }
                        i5++;
                    }
                }
                s25 s25Var = this.w;
                s25Var.getClass();
                a34.s();
                if (!s25Var.x()) {
                    s25.w();
                } else {
                    s25.z(new od7(s25Var, iArr, (byte) 0));
                }
            }
        }
    }

    @Override // defpackage.ko4
    public final void R0(int i) {
        F(i, 0);
    }

    @Override // defpackage.ko4
    public final void U(float f) {
        BasePendingResult basePendingResult;
        if (this.w == null) {
            return;
        }
        float floatValue = ((Float) N.clamp(Float.valueOf(f))).floatValue();
        p1(floatValue);
        this.n.b();
        s25 s25Var = this.w;
        double d = floatValue;
        s25Var.getClass();
        a34.s();
        if (!s25Var.x()) {
            basePendingResult = s25.w();
        } else {
            vk7 vk7Var = new vk7(s25Var, d, (byte) 0);
            s25.z(vk7Var);
            basePendingResult = vk7Var;
        }
        b55 j25Var = new j25(this, (byte) 3);
        this.t.z = j25Var;
        basePendingResult.f(j25Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [tr3, java.lang.Object] */
    @Override // defpackage.ko4
    public final void W(List list, int i, long j) {
        long j2;
        long j3;
        int i2;
        ArrayList arrayList;
        int intValue = ((Integer) this.q.y).intValue();
        if (this.w != null && !list.isEmpty()) {
            if (j == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if (i == -1) {
                i2 = s0();
                j3 = Z0();
            } else {
                j3 = j2;
                i2 = i;
            }
            if (!this.x.p()) {
                this.H = i1();
            }
            ur3[] q1 = q1(list);
            dn0 dn0Var = this.g;
            ((HashMap) dn0Var.A).clear();
            dn0Var.I(list, q1);
            List asList = Arrays.asList(q1);
            if (asList == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(asList);
            }
            int i3 = 1;
            int min = Math.min(i2, list.size() - 1);
            byte b = 0;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        p65.b();
                        return;
                    }
                } else {
                    i3 = 2;
                }
            } else {
                i3 = 0;
            }
            ?? obj = new Object();
            obj.x = null;
            obj.y = null;
            obj.z = 0;
            obj.A = null;
            obj.B = null;
            obj.C = i3;
            obj.D = arrayList;
            obj.E = min;
            obj.F = j3;
            obj.G = false;
            gr3 gr3Var = new gr3(null, obj, Boolean.valueOf(n()), j3, 1.0d, null, null, null, null, null, null, 0L);
            s25 s25Var = this.w;
            s25Var.getClass();
            a34.s();
            if (!s25Var.x()) {
                s25.w();
            } else {
                s25.z(new ek7(s25Var, gr3Var, b));
            }
        }
    }

    @Override // defpackage.ko4
    public final jr3 W0() {
        return this.I;
    }

    @Override // defpackage.ko4
    public final yx1 X() {
        return null;
    }

    @Override // defpackage.ko4
    public final void X0(List list) {
        W(list, 0, -9223372036854775807L);
    }

    @Override // defpackage.ko4
    public final void Y(boolean z) {
        BasePendingResult basePendingResult;
        if (this.w != null) {
            n1(1, this.B, z);
            this.n.b();
            if (j1() == null) {
                return;
            }
            s25 s25Var = this.w;
            byte b = 0;
            boolean z2 = false;
            boolean z3 = false;
            s25Var.getClass();
            if (z) {
                a34.s();
                if (!s25Var.x()) {
                    basePendingResult = s25.w();
                } else {
                    sf7 sf7Var = new sf7(s25Var, (byte) 5, z3 ? 1 : 0);
                    s25.z(sf7Var);
                    basePendingResult = sf7Var;
                }
            } else {
                a34.s();
                if (!s25Var.x()) {
                    basePendingResult = s25.w();
                } else {
                    sf7 sf7Var2 = new sf7(s25Var, (byte) 3, z2 ? 1 : 0);
                    s25.z(sf7Var2);
                    basePendingResult = sf7Var2;
                }
            }
            b55 j25Var = new j25(this, b);
            this.p.z = j25Var;
            basePendingResult.f(j25Var);
        }
    }

    @Override // defpackage.ko4
    public final long Z0() {
        long j = this.G;
        if (j != -9223372036854775807L) {
            return j;
        }
        s25 s25Var = this.w;
        if (s25Var != null) {
            return s25Var.a();
        }
        return this.D;
    }

    @Override // defpackage.ko4
    public final long a0() {
        return this.e;
    }

    @Override // defpackage.ko4
    public final long a1() {
        return this.d;
    }

    @Override // defpackage.ko4
    public final void b(rn4 rn4Var) {
        BasePendingResult basePendingResult;
        if (this.w == null) {
            return;
        }
        rn4 rn4Var2 = new rn4(eq6.i(rn4Var.a, 0.5f, 2.0f));
        m1(rn4Var2);
        this.n.b();
        s25 s25Var = this.w;
        double d = rn4Var2.a;
        s25Var.getClass();
        a34.s();
        byte b = 1;
        if (!s25Var.x()) {
            basePendingResult = s25.w();
        } else {
            vk7 vk7Var = new vk7(s25Var, d, (byte) 1);
            s25.z(vk7Var);
            basePendingResult = vk7Var;
        }
        j25 j25Var = new j25(this, b);
        this.u.z = j25Var;
        basePendingResult.f(j25Var);
    }

    @Override // defpackage.ko4
    public final void c0(int i, List list) {
        boolean z;
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        pi0 pi0Var = this.x;
        if (i < pi0Var.g.length) {
            jf6 jf6Var = this.a;
            pi0Var.m(i, jf6Var, 0L);
            i2 = ((Integer) jf6Var.a).intValue();
        }
        if (this.w != null && j1() != null) {
            ur3[] q1 = q1(list);
            this.g.I(list, q1);
            s25 s25Var = this.w;
            s25Var.getClass();
            a34.s();
            if (!s25Var.x()) {
                s25.w();
            } else {
                s25.z(new pe7(s25Var, q1, i2));
            }
        }
    }

    @Override // defpackage.ko4
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ko4
    public final rn4 e() {
        return (rn4) this.u.y;
    }

    @Override // defpackage.ko4
    public final int f() {
        return this.s;
    }

    @Override // defpackage.v30
    public final void f1(int i, int i2, long j, boolean z) {
        boolean z2;
        BasePendingResult basePendingResult;
        jr3 jr3Var;
        BasePendingResult basePendingResult2;
        if (i != -1) {
            byte b = 1;
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.n(z2);
            if (!this.x.p() && i >= this.x.g.length) {
                return;
            }
            bx3 j1 = j1();
            if (j == -9223372036854775807L) {
                j = 0;
            }
            ui3 ui3Var = this.n;
            if (j1 != null) {
                int s0 = s0();
                s25 s25Var = this.w;
                j25 j25Var = this.m;
                if (s0 != i) {
                    pi0 pi0Var = this.x;
                    hf6 hf6Var = this.h;
                    pi0Var.f(i, hf6Var, false);
                    int intValue = ((Integer) hf6Var.b).intValue();
                    s25Var.getClass();
                    a34.s();
                    if (!s25Var.x()) {
                        basePendingResult2 = s25.w();
                    } else {
                        si7 si7Var = new si7(s25Var, intValue, j);
                        s25.z(si7Var);
                        basePendingResult2 = si7Var;
                    }
                    basePendingResult2.f(j25Var);
                } else {
                    s25Var.getClass();
                    xs3 xs3Var = new xs3(j);
                    a34.s();
                    if (!s25Var.x()) {
                        basePendingResult = s25.w();
                    } else {
                        ek7 ek7Var = new ek7(s25Var, xs3Var, b);
                        s25.z(ek7Var);
                        basePendingResult = ek7Var;
                    }
                    basePendingResult.f(j25Var);
                }
                jo4 i1 = i1();
                this.E++;
                this.F = i;
                this.G = j;
                jo4 i12 = i1();
                ui3Var.c(11, new i25(i1, i12, (byte) 2));
                if (i1.b != i12.b) {
                    pi0 pi0Var2 = this.x;
                    jf6 jf6Var = this.a;
                    pi0Var2.m(i, jf6Var, 0L);
                    ui3Var.c(1, new ev3(jf6Var.c));
                    jr3 jr3Var2 = this.I;
                    ar3 q = q();
                    if (q != null) {
                        jr3Var = q.d;
                    } else {
                        jr3Var = jr3.M;
                    }
                    this.I = jr3Var;
                    if (!jr3Var2.equals(jr3Var)) {
                        ui3Var.c(14, new h25(this, (byte) 5));
                    }
                }
                r1();
            }
            ui3Var.b();
        }
    }

    @Override // defpackage.ko4
    public final rf1 getDeviceInfo() {
        return this.K;
    }

    @Override // defpackage.ko4
    public final float getVolume() {
        return ((Float) this.t.y).floatValue();
    }

    @Override // defpackage.ko4
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ko4
    public final int h0() {
        if (this.x.p()) {
            return 1;
        }
        return this.B;
    }

    @Override // defpackage.ko4
    public final void i0(int i) {
        F(this.s - 1, i);
    }

    public final jo4 i1() {
        Object obj;
        ar3 ar3Var;
        Object obj2;
        pi0 pi0Var = this.x;
        if (!pi0Var.p()) {
            int s0 = s0();
            hf6 hf6Var = this.h;
            pi0Var.f(s0, hf6Var, true);
            Object obj3 = hf6Var.b;
            int i = hf6Var.c;
            jf6 jf6Var = this.a;
            pi0Var.m(i, jf6Var, 0L);
            obj = jf6Var.a;
            obj2 = obj3;
            ar3Var = jf6Var.c;
        } else {
            obj = null;
            ar3Var = null;
            obj2 = null;
        }
        return new jo4(obj, s0(), ar3Var, obj2, s0(), Z0(), Z0(), -1, -1);
    }

    @Override // defpackage.ko4
    public final long j() {
        long Z0 = Z0();
        long Z02 = Z0();
        if (Z0 != -9223372036854775807L && Z02 != -9223372036854775807L) {
            return Z0 - Z02;
        }
        return 0L;
    }

    @Override // defpackage.ko4
    public final qh6 j0() {
        return (qh6) this.y.y;
    }

    public final bx3 j1() {
        s25 s25Var = this.w;
        if (s25Var != null) {
            return s25Var.e();
        }
        return null;
    }

    @Override // defpackage.ko4
    public final jr3 k0() {
        return this.J;
    }

    public final void k1(gi0 gi0Var) {
        s25 s25Var;
        gi0 gi0Var2 = this.v;
        m25 m25Var = this.j;
        if (gi0Var2 != null) {
            a34.s();
            if (m25Var != null) {
                gi0Var2.d.remove(m25Var);
            }
        }
        if (gi0Var != null) {
            a34.s();
            if (m25Var != null) {
                gi0Var.d.add(m25Var);
            }
        }
        this.v = gi0Var;
        if (gi0Var != null) {
            a34.s();
            s25Var = gi0Var.j;
        } else {
            s25Var = null;
        }
        s25 s25Var2 = this.w;
        if (s25Var2 != s25Var) {
            n25 n25Var = this.l;
            o25 o25Var = this.k;
            if (s25Var2 != null) {
                s25Var2.r(o25Var);
                s25 s25Var3 = this.w;
                s25Var3.getClass();
                a34.s();
                km7 km7Var = (km7) s25Var3.i.remove(o25Var);
                if (km7Var != null) {
                    HashSet hashSet = km7Var.a;
                    hashSet.remove(o25Var);
                    if (hashSet.isEmpty()) {
                        s25Var3.j.remove(Long.valueOf(km7Var.b));
                        km7Var.e.b.removeCallbacks(km7Var.c);
                        km7Var.d = false;
                    }
                }
                nq3 d = this.w.d();
                d.getClass();
                a34.s();
                ((Set) d.m).remove(n25Var);
            }
            this.w = s25Var;
            this.p.z = null;
            this.q.z = null;
            this.t.z = null;
            this.u.z = null;
            this.y.z = null;
            this.z.z = null;
            this.E = 0;
            this.F = -1;
            this.G = -9223372036854775807L;
            this.H = null;
            i75 i75Var = this.o;
            if (s25Var != null) {
                if (i75Var != null) {
                    ((fi0) i75Var.y).E1();
                }
                nq3 d2 = s25Var.d();
                d2.getClass();
                a34.s();
                ((Set) d2.m).add(n25Var);
                s25Var.p(o25Var);
                a34.s();
                if (o25Var != null) {
                    ConcurrentHashMap concurrentHashMap = s25Var.i;
                    if (!concurrentHashMap.containsKey(o25Var)) {
                        ConcurrentHashMap concurrentHashMap2 = s25Var.j;
                        km7 km7Var2 = (km7) concurrentHashMap2.get(1000L);
                        if (km7Var2 == null) {
                            km7Var2 = new km7(s25Var);
                            concurrentHashMap2.put(1000L, km7Var2);
                        }
                        km7Var2.a.add(o25Var);
                        concurrentHashMap.put(o25Var, km7Var2);
                        if (s25Var.h()) {
                            s25 s25Var4 = km7Var2.e;
                            h15 h15Var = s25Var4.b;
                            gm7 gm7Var = km7Var2.c;
                            h15Var.removeCallbacks(gm7Var);
                            km7Var2.d = true;
                            s25Var4.b.postDelayed(gm7Var, km7Var2.b);
                        }
                    }
                }
                t1();
                return;
            }
            if (i75Var != null) {
                ((fi0) i75Var.y).E1();
            }
        }
    }

    @Override // defpackage.ko4
    public final go4 l() {
        return this.A;
    }

    public final void l1(int i, boolean z) {
        if (this.s == i && this.r == z) {
            return;
        }
        this.s = i;
        this.r = z;
        this.n.c(30, new sv3(i, z));
    }

    @Override // defpackage.ko4
    public final c31 m0() {
        return c31.d;
    }

    public final void m1(rn4 rn4Var) {
        l33 l33Var = this.u;
        if (((rn4) l33Var.y).equals(rn4Var)) {
            return;
        }
        l33Var.y = rn4Var;
        this.n.c(12, new nv3(rn4Var));
        r1();
    }

    @Override // defpackage.ko4
    public final boolean n() {
        return ((Boolean) this.p.y).booleanValue();
    }

    public final void n1(int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = this.B;
        l33 l33Var = this.p;
        boolean z5 = false;
        if (i3 == 3 && ((Boolean) l33Var.y).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) l33Var.y).booleanValue() != z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.B != i2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            this.B = i2;
            l33Var.y = Boolean.valueOf(z);
            sv3 sv3Var = new sv3(z, i2, (byte) 2);
            ui3 ui3Var = this.n;
            ui3Var.c(-1, sv3Var);
            byte b = 7;
            if (z4) {
                ui3Var.c(4, new x61(i2, b));
            }
            if (z3) {
                ui3Var.c(5, new sv3(z, i, (byte) 3));
            }
            if (i2 == 3 && z) {
                z5 = true;
            }
            if (z2 != z5) {
                ui3Var.c(7, new jy1((byte) 5, z5));
            }
        }
    }

    @Override // defpackage.ko4
    public final void o0(jr3 jr3Var) {
        jr3Var.getClass();
        if (jr3Var.equals(this.J)) {
            return;
        }
        this.J = jr3Var;
        this.n.g(15, new h25(this, (byte) 0));
    }

    public final void o1(int i) {
        l33 l33Var = this.q;
        if (((Integer) l33Var.y).intValue() != i) {
            l33Var.y = Integer.valueOf(i);
            this.n.c(8, new x61(i, (byte) 8));
            r1();
        }
    }

    public final void p1(float f) {
        l33 l33Var = this.t;
        if (((Float) l33Var.y).floatValue() != f) {
            l33Var.y = Float.valueOf(f);
            this.n.c(22, new ky1(f, (byte) 3));
            r1();
        }
    }

    public final ur3[] q1(List list) {
        ur3[] ur3VarArr = new ur3[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ur3VarArr[i] = this.c.a((ar3) list.get(i));
        }
        return ur3VarArr;
    }

    @Override // defpackage.ko4
    public final int r0() {
        return -1;
    }

    public final void r1() {
        boolean z;
        bx3 e;
        bx3 e2;
        go4 go4Var = this.A;
        fo4 fo4Var = new fo4(eq6.u(this, O));
        s25 s25Var = this.w;
        boolean z2 = false;
        if (s25Var != null && (e2 = s25Var.e()) != null) {
            z = e2.d(4L);
        } else {
            z = false;
        }
        fo4Var.a(22, z);
        s25 s25Var2 = this.w;
        if (s25Var2 != null && (e = s25Var2.e()) != null) {
            z2 = e.d(4L);
        }
        fo4Var.a(24, z2);
        go4 b = fo4Var.b();
        this.A = b;
        if (!b.equals(go4Var)) {
            this.n.c(13, new h25(this, (byte) 4));
        }
    }

    @Override // defpackage.ko4
    public final void release() {
        l25 l25Var;
        kb0.B("RemoteCastPlayer", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "] [" + cr3.b() + "]");
        if (Build.VERSION.SDK_INT >= 30 && (l25Var = this.i) != null) {
            l25Var.c();
        }
        kh0 kh0Var = this.b;
        kh0Var.getClass();
        tl7.U();
        xh0 xh0Var = (xh0) kh0Var.B;
        o25 o25Var = this.k;
        if (xh0Var != null) {
            a34.s();
            pk5 pk5Var = xh0Var.c;
            pk5Var.getClass();
            a34.s();
            if (o25Var != null) {
                try {
                    el7 el7Var = pk5Var.a;
                    lm7 lm7Var = new lm7(o25Var);
                    Parcel K = el7Var.K();
                    nn7.c(K, lm7Var);
                    el7Var.M(K, 3);
                } catch (RemoteException e) {
                    pk5.c.a(e, "Unable to call %s on %s.", "removeSessionManagerListener", el7.class.getSimpleName());
                }
            }
        } else {
            ((ArrayList) kh0Var.y).remove(o25Var);
        }
        tl7.U();
        xh0 xh0Var2 = (xh0) kh0Var.B;
        if (xh0Var2 != null) {
            a34.s();
            xh0Var2.c.b(false);
        }
    }

    @Override // defpackage.ko4
    public final int s0() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        return this.C;
    }

    public final void s1() {
        double d;
        boolean z;
        gi0 gi0Var = this.v;
        if (gi0Var != null) {
            a34.s();
            sm7 sm7Var = gi0Var.i;
            if (sm7Var != null && sm7Var.k()) {
                sm7Var.j();
                d = sm7Var.v;
            } else {
                d = 0.0d;
            }
            int intValue = ((Integer) M.clamp(Integer.valueOf((int) Math.round(d * 20.0d)))).intValue();
            gi0 gi0Var2 = this.v;
            gi0Var2.getClass();
            a34.s();
            sm7 sm7Var2 = gi0Var2.i;
            if (sm7Var2 != null && sm7Var2.k()) {
                sm7Var2.j();
                if (sm7Var2.w) {
                    z = true;
                    l1(intValue, z);
                }
            }
            z = false;
            l1(intValue, z);
        }
    }

    @Override // defpackage.ko4
    public final void stop() {
        this.B = 1;
        s25 s25Var = this.w;
        if (s25Var != null) {
            a34.s();
            if (!s25Var.x()) {
                s25.w();
            } else {
                s25.z(new sf7(s25Var, (byte) 4));
            }
        }
    }

    public final void t1() {
        Object obj;
        jr3 jr3Var;
        Object obj2;
        if (this.w == null) {
            return;
        }
        int i = this.C;
        jr3 jr3Var2 = this.I;
        boolean p = this.x.p();
        hf6 hf6Var = this.h;
        if (!p) {
            this.x.f(i, hf6Var, true);
            obj = hf6Var.b;
        } else {
            obj = null;
        }
        v1(null);
        s1();
        w1(null);
        z1(null);
        u1(null);
        boolean x1 = x1();
        pi0 pi0Var = this.x;
        this.C = h1(this.w, pi0Var);
        ar3 q = q();
        if (q != null) {
            jr3Var = q.d;
        } else {
            jr3Var = jr3.M;
        }
        this.I = jr3Var;
        if (!pi0Var.p()) {
            pi0Var.f(this.C, hf6Var, true);
            obj2 = hf6Var.b;
        } else {
            obj2 = null;
        }
        ui3 ui3Var = this.n;
        if (!x1 && !Objects.equals(obj, obj2) && this.E == 0) {
            pi0Var.f(i, hf6Var, true);
            jf6 jf6Var = this.a;
            pi0Var.n(i, jf6Var);
            long l0 = eq6.l0(jf6Var.m);
            Object obj3 = jf6Var.a;
            int i2 = hf6Var.c;
            jo4 jo4Var = new jo4(obj3, i2, jf6Var.c, hf6Var.b, i2, l0, l0, -1, -1);
            pi0Var.f(this.C, hf6Var, true);
            pi0Var.n(this.C, jf6Var);
            Object obj4 = jf6Var.a;
            int i3 = hf6Var.c;
            ui3Var.c(11, new i25(jo4Var, new jo4(obj4, i3, jf6Var.c, hf6Var.b, i3, eq6.l0(jf6Var.l), eq6.l0(jf6Var.l), -1, -1), (byte) 1));
            ui3Var.c(1, new h25(this, (byte) 2));
        }
        y1(null);
        if (!jr3Var2.equals(this.I)) {
            ui3Var.c(14, new h25(this, (byte) 3));
        }
        r1();
        ui3Var.b();
    }

    @Override // defpackage.ko4
    public final long u() {
        return this.f;
    }

    @Override // defpackage.ko4
    public final void u0(int i) {
        int i2;
        BasePendingResult basePendingResult;
        if (this.w == null) {
            return;
        }
        o1(i);
        this.n.b();
        s25 s25Var = this.w;
        byte b = 2;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    p65.b();
                    return;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 0;
        }
        s25Var.getClass();
        a34.s();
        if (!s25Var.x()) {
            basePendingResult = s25.w();
        } else {
            ch7 ch7Var = new ch7(s25Var, i2);
            s25.z(ch7Var);
            basePendingResult = ch7Var;
        }
        b55 j25Var = new j25(this, b);
        this.q.z = j25Var;
        basePendingResult.f(j25Var);
    }

    public final void u1(j25 j25Var) {
        float f;
        l33 l33Var = this.u;
        if (((b55) l33Var.z) == j25Var) {
            bx3 e = this.w.e();
            if (e != null) {
                f = (float) e.A;
            } else {
                f = rn4.d.a;
            }
            if (f > 0.0f) {
                m1(new rn4(f));
            }
            l33Var.z = null;
        }
    }

    @Override // defpackage.ko4
    public final void v(io4 io4Var) {
        this.n.a(io4Var);
    }

    @Override // defpackage.ko4
    public final void v0(boolean z) {
        D(0, z);
    }

    public final void v1(j25 j25Var) {
        int i;
        l33 l33Var = this.p;
        boolean booleanValue = ((Boolean) l33Var.y).booleanValue();
        int i2 = 1;
        if (((b55) l33Var.z) == j25Var) {
            booleanValue = !this.w.l();
            l33Var.z = null;
        }
        if (booleanValue != ((Boolean) l33Var.y).booleanValue()) {
            i = 4;
        } else {
            i = 1;
        }
        int f = this.w.f();
        if (f != 2 && f != 3) {
            if (f == 4 || f == 5) {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        n1(i, i2, booleanValue);
    }

    @Override // defpackage.ko4
    public final void w0(io4 io4Var) {
        this.n.e(io4Var);
    }

    public final void w1(j25 j25Var) {
        int i;
        l33 l33Var = this.q;
        if (((b55) l33Var.z) == j25Var) {
            bx3 e = this.w.e();
            int i2 = 0;
            if (e != null && (i = e.M) != 0) {
                i2 = 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            p65.l();
                            return;
                        }
                    } else {
                        i2 = 1;
                    }
                }
            }
            o1(i2);
            l33Var.z = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x1() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p25.x1():boolean");
    }

    @Override // defpackage.ko4
    public final void y0(List list, int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int length = this.x.g.length;
        if (i > length) {
            return;
        }
        int min = Math.min(i2, length);
        c0(min, list);
        R(i, min);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [ew2, yw2] */
    public final void y1(j25 j25Var) {
        MediaInfo mediaInfo;
        List list;
        List ul3Var;
        boolean z;
        ui3 ui3Var;
        BasePendingResult basePendingResult;
        int i;
        int i2;
        String str;
        if (this.w != null) {
            l33 l33Var = this.y;
            if (((b55) l33Var.z) == j25Var) {
                l33Var.z = null;
                bx3 j1 = j1();
                if (j1 != null) {
                    mediaInfo = j1.x;
                } else {
                    mediaInfo = null;
                }
                if (mediaInfo != null) {
                    list = mediaInfo.C;
                } else {
                    list = null;
                }
                ui3 ui3Var2 = this.n;
                if (list != null && !list.isEmpty()) {
                    long[] jArr = j1.H;
                    if (jArr == null) {
                        jArr = P;
                    }
                    boolean z2 = false;
                    if (jArr.length == 0) {
                        ul3Var = Collections.EMPTY_LIST;
                    } else {
                        ul3Var = new ul3(jArr, 0, jArr.length);
                    }
                    zw2 m = zw2.m(ul3Var);
                    nw2 o = nw2.o(list);
                    int i3 = j1.z;
                    ?? ew2Var = new ew2(4);
                    io3.t(4, "initialCapacity");
                    Object[] objArr = new Object[4];
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        z = z2;
                        if (i4 >= list.size()) {
                            break;
                        }
                        MediaTrack mediaTrack = (MediaTrack) o.get(i4);
                        ui3 ui3Var3 = ui3Var2;
                        long j = mediaTrack.x;
                        String str2 = eq6.a;
                        Locale locale = Locale.US;
                        String str3 = "item=" + i3 + ",track=" + j;
                        String str4 = mediaTrack.A;
                        int i6 = mediaTrack.y;
                        if (i6 != 1) {
                            i = 2;
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    i2 = -1;
                                } else {
                                    i2 = 2;
                                }
                            } else {
                                i2 = 1;
                            }
                        } else {
                            i = 2;
                            i2 = 3;
                        }
                        if (i2 != qy3.h(str4)) {
                            if (i2 != 1) {
                                if (i2 != i) {
                                    if (i2 != 3) {
                                        str = null;
                                    } else {
                                        str = "text/x-unknown";
                                    }
                                } else {
                                    str = "video/x-unknown";
                                }
                            } else {
                                str = "audio/x-unknown";
                            }
                            if (str != null) {
                                str4 = str;
                            }
                        }
                        da2 da2Var = new da2();
                        da2Var.a = mediaTrack.z;
                        da2Var.n = qy3.n(str4);
                        da2Var.d = mediaTrack.C;
                        yg6 yg6Var = new yg6(str3, new ea2(da2Var));
                        int i7 = i5 + 1;
                        int b = fw2.b(objArr.length, i7);
                        if (b > objArr.length) {
                            objArr = Arrays.copyOf(objArr, b);
                        }
                        objArr[i5] = yg6Var;
                        int i8 = i3;
                        if (m.contains(Long.valueOf(mediaTrack.x))) {
                            ew2Var.c(yg6Var);
                        }
                        i4++;
                        i3 = i8;
                        i5 = i7;
                        z2 = z ? 1 : 0;
                        ui3Var2 = ui3Var3;
                    }
                    ui3 ui3Var4 = ui3Var2;
                    o15 j2 = nw2.j(objArr, i5);
                    zw2 h = ew2Var.h();
                    l33 l33Var2 = this.z;
                    Object obj = l33Var2.y;
                    hh6 hh6Var = (hh6) obj;
                    if (!hh6Var.equals(obj) && !((hh6) l33Var2.y).equals(hh6Var)) {
                        l33Var2.y = hh6Var;
                        iy1 iy1Var = new iy1(hh6Var, (byte) 1);
                        ui3Var = ui3Var4;
                        ui3Var.c(19, iy1Var);
                    } else {
                        ui3Var = ui3Var4;
                    }
                    if (!h.equals(h)) {
                        l33Var.z = new j25(this, (byte) 4);
                        ArrayList arrayList = new ArrayList(h.size());
                        ho6 it = h.iterator();
                        while (it.hasNext()) {
                            yg6 yg6Var2 = (yg6) it.next();
                            int indexOf = j2.indexOf(yg6Var2);
                            if (indexOf != -1) {
                                arrayList.add(Long.valueOf(((MediaTrack) o.get(indexOf)).x));
                            } else {
                                ov3.p(yg6Var2, "CastTrackSelector produced a TrackGroup that was not in the list of available track groups: ");
                                return;
                            }
                        }
                        s25 s25Var = this.w;
                        Object[] array = arrayList.toArray();
                        int length = array.length;
                        long[] jArr2 = new long[length];
                        for (int i9 = z ? 1 : 0; i9 < length; i9++) {
                            Object obj2 = array[i9];
                            obj2.getClass();
                            jArr2[i9] = ((Number) obj2).longValue();
                        }
                        s25Var.getClass();
                        a34.s();
                        if (!s25Var.x()) {
                            basePendingResult = s25.w();
                        } else {
                            ek7 ek7Var = new ek7(s25Var, jArr2, (byte) 2);
                            s25.z(ek7Var);
                            basePendingResult = ek7Var;
                        }
                        basePendingResult.f((b55) l33Var.z);
                    }
                    int i10 = j2.A;
                    ph6[] ph6VarArr = new ph6[i10];
                    for (int i11 = z ? 1 : 0; i11 < i10; i11++) {
                        yg6 yg6Var3 = (yg6) j2.get(i11);
                        boolean[] zArr = new boolean[1];
                        zArr[z ? 1 : 0] = h.contains(yg6Var3);
                        ph6VarArr[i11] = new ph6(yg6Var3, z, new int[]{4}, zArr);
                    }
                    qh6 qh6Var = new qh6(nw2.p(ph6VarArr));
                    if (!qh6Var.equals(l33Var.y)) {
                        l33Var.y = qh6Var;
                        ui3Var.c(2, new xv3(qh6Var, (byte) 6));
                        r1();
                        return;
                    }
                    return;
                }
                qh6 qh6Var2 = qh6.b;
                if (!qh6Var2.equals(l33Var.y)) {
                    l33Var.y = qh6Var2;
                    ui3Var2.c(2, new xv3(qh6Var2, (byte) 6));
                    r1();
                }
            }
        }
    }

    @Override // defpackage.ko4
    public final hv6 z() {
        return hv6.d;
    }

    public final void z1(j25 j25Var) {
        float f;
        l33 l33Var = this.t;
        if (((b55) l33Var.z) == j25Var) {
            bx3 e = this.w.e();
            if (e == null) {
                f = 1.0f;
            } else {
                f = (float) e.F;
            }
            p1(((Float) N.clamp(Float.valueOf(f))).floatValue());
            l33Var.z = null;
        }
    }

    @Override // defpackage.ko4
    public final void L0() {
    }

    @Override // defpackage.ko4
    public final void S() {
    }

    @Override // defpackage.ko4
    public final void a() {
    }

    @Override // defpackage.ko4
    public final void d0() {
    }

    @Override // defpackage.ko4
    public final void I(SurfaceView surfaceView) {
    }

    @Override // defpackage.ko4
    public final void L(hh6 hh6Var) {
    }

    @Override // defpackage.ko4
    public final void T(SurfaceHolder surfaceHolder) {
    }

    @Override // defpackage.ko4
    public final void U0(TextureView textureView) {
    }

    @Override // defpackage.ko4
    public final void Y0(SurfaceHolder surfaceHolder) {
    }

    @Override // defpackage.ko4
    public final void g(Surface surface) {
    }

    @Override // defpackage.ko4
    public final void p(Surface surface) {
    }

    @Override // defpackage.ko4
    public final void r(boolean z) {
    }

    @Override // defpackage.ko4
    public final void y(TextureView textureView) {
    }

    @Override // defpackage.ko4
    public final void z0(SurfaceView surfaceView) {
    }

    @Override // defpackage.ko4
    public final void n0(ru ruVar, boolean z) {
    }
}
