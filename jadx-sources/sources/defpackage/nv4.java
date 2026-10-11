package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nv4 implements or3, d12, kj3, nj3, e95 {
    public static final Map r0;
    public static final ea2 s0;
    public final q18 A;
    public final eb2 B;
    public final tp1 C;
    public final qv4 D;
    public final l7 E;
    public final String F;
    public final long G;
    public final ea2 H;
    public final long I;
    public final dn0 J;
    public final dn0 K;
    public final nv0 L;
    public final hv4 M;
    public final hv4 N;
    public final Handler O;
    public nr3 P;
    public bu2 Q;
    public jv4[] R;
    public f95[] S;
    public mv4[] T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public zp2 Y;
    public hf5 Z;
    public long a0;
    public boolean b0;
    public int c0;
    public long d0 = Long.MIN_VALUE;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public final ArrayList j0;
    public boolean k0;
    public long l0;
    public long m0;
    public boolean n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final Uri x;
    public final q41 y;
    public final xp1 z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        r0 = Collections.unmodifiableMap(hashMap);
        da2 da2Var = new da2();
        da2Var.a = "icy";
        da2Var.o = qy3.n("application/x-icy");
        s0 = new ea2(da2Var);
    }

    public nv4(Uri uri, q41 q41Var, dn0 dn0Var, xp1 xp1Var, tp1 tp1Var, q18 q18Var, eb2 eb2Var, qv4 qv4Var, l7 l7Var, String str, int i, ea2 ea2Var, long j, l04 l04Var) {
        dn0 dn0Var2;
        this.x = uri;
        this.y = q41Var;
        this.z = xp1Var;
        this.C = tp1Var;
        this.A = q18Var;
        this.B = eb2Var;
        this.D = qv4Var;
        this.E = l7Var;
        this.F = str;
        this.G = i;
        this.H = ea2Var;
        byte b = 2;
        if (l04Var != null) {
            dn0Var2 = new dn0(l04Var, b);
        } else {
            dn0Var2 = new dn0("ProgressiveMediaPeriod", (byte) 2);
        }
        this.J = dn0Var2;
        this.K = dn0Var;
        this.I = j;
        this.L = new nv0();
        this.M = new hv4(this, (byte) 1);
        this.N = new hv4(this, (byte) 2);
        this.O = eq6.p(null);
        this.T = new mv4[0];
        this.S = new f95[0];
        this.R = new jv4[0];
        this.j0 = new ArrayList();
        this.m0 = -9223372036854775807L;
        this.c0 = 1;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, zp2] */
    public final void A() {
        long j;
        boolean z;
        boolean z2;
        fy3 a;
        char c;
        if (!this.q0 && !this.V && this.U && this.Z != null) {
            for (f95 f95Var : this.S) {
                if (f95Var.r() == null) {
                    return;
                }
            }
            this.L.d();
            int length = this.S.length;
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char c2 = 1;
                if (i2 >= length) {
                    break;
                }
                ea2 r = this.S[i2].r();
                r.getClass();
                int h = qy3.h(r.p);
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                c = 0;
                            } else {
                                c = 2;
                            }
                        } else {
                            c = 1;
                        }
                    } else {
                        c = 4;
                    }
                } else {
                    c = 3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                c2 = 0;
                            } else {
                                c2 = 2;
                            }
                        }
                    } else {
                        c2 = 4;
                    }
                } else {
                    c2 = 3;
                }
                if (c > c2) {
                    i3 = i2;
                    i = h;
                }
                i2++;
            }
            yg6[] yg6VarArr = new yg6[length];
            boolean[] zArr = new boolean[length];
            int i4 = 0;
            while (true) {
                j = this.I;
                if (i4 >= length) {
                    break;
                }
                ea2 r2 = this.S[i4].r();
                r2.getClass();
                String str = r2.p;
                boolean i5 = qy3.i(str);
                if (!i5 && !qy3.m(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i4] = z;
                this.W |= z;
                boolean k = qy3.k(str);
                if (j != -9223372036854775807L && length == 1 && k) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.X = z2;
                bu2 bu2Var = this.Q;
                if (bu2Var != null) {
                    int i6 = bu2Var.a;
                    if (i5 || this.T[i4].b) {
                        fy3 fy3Var = r2.m;
                        if (fy3Var == null) {
                            a = new fy3(bu2Var);
                        } else {
                            a = fy3Var.a(bu2Var);
                        }
                        da2 a2 = r2.a();
                        a2.l = a;
                        r2 = new ea2(a2);
                    }
                    if (i5 && r2.i == -1 && r2.j == -1 && i6 != -1) {
                        da2 a3 = r2.a();
                        a3.i = i6;
                        r2 = new ea2(a3);
                    }
                }
                int e = this.z.e(r2);
                da2 a4 = r2.a();
                a4.S = e;
                ea2 ea2Var = new ea2(a4);
                if (i4 != i3) {
                    da2 a5 = ea2Var.a();
                    a5.m = Integer.toString(i3);
                    ea2Var = new ea2(a5);
                }
                yg6VarArr[i4] = new yg6(Integer.toString(i4), ea2Var);
                this.S[i4].A(this.d0);
                i4++;
            }
            zg6 zg6Var = new zg6(yg6VarArr);
            ?? obj = new Object();
            obj.x = zg6Var;
            obj.y = zArr;
            int i7 = zg6Var.a;
            obj.z = new boolean[i7];
            obj.A = new boolean[i7];
            this.Y = obj;
            if (this.X && this.a0 == -9223372036854775807L) {
                this.a0 = j;
                this.Z = new iv4(this, this.Z);
            }
            this.D.u(this.a0, this.Z, this.b0);
            this.V = true;
            nr3 nr3Var = this.P;
            nr3Var.getClass();
            nr3Var.a(this);
        }
    }

    @Override // defpackage.kj3
    public final q03 B(mj3 mj3Var, long j, long j2, IOException iOException, int i) {
        long min;
        int i2;
        q03 q03Var;
        hf5 hf5Var;
        kv4 kv4Var = (kv4) mj3Var;
        iy5 iy5Var = kv4Var.c;
        hj3 hj3Var = new hj3(kv4Var.a, kv4Var.k, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        String str = eq6.a;
        this.A.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof bj4) || (th instanceof FileNotFoundException) || (th instanceof lq2) || (th instanceof oj3) || ((th instanceof s41) && ((s41) th).x == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
        boolean z = false;
        if (min == -9223372036854775807L) {
            q03Var = dn0.F;
        } else {
            int x = x();
            if (x > this.o0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.k0 && ((hf5Var = this.Z) == null || hf5Var.h() == -9223372036854775807L)) {
                if (this.V && !J()) {
                    this.n0 = true;
                    q03Var = dn0.E;
                } else {
                    this.f0 = this.V;
                    this.l0 = 0L;
                    this.o0 = 0;
                    for (f95 f95Var : this.S) {
                        f95Var.x(false);
                    }
                    kv4Var.g.a = 0L;
                    kv4Var.j = 0L;
                    kv4Var.i = true;
                    kv4Var.m = false;
                }
            } else {
                this.o0 = x;
            }
            q03Var = new q03(i2, min);
        }
        int i3 = q03Var.x;
        if (i3 == 0 || i3 == 1) {
            z = true;
        }
        this.B.r(ij3Var, 1, -1, null, 0, null, kv4Var.j, this.a0, iOException, !z);
        return q03Var;
    }

    public final void C(int i) {
        w();
        zp2 zp2Var = this.Y;
        boolean[] zArr = (boolean[]) zp2Var.A;
        if (!zArr[i]) {
            ea2 ea2Var = ((zg6) zp2Var.x).a(i).d[0];
            eb2 eb2Var = this.B;
            eb2Var.h(new fs0((Object) eb2Var, (Object) new fr3(1, qy3.h(ea2Var.p), ea2Var, 0, null, eq6.l0(this.l0), -9223372036854775807L), (byte) 11));
            zArr[i] = true;
        }
    }

    public final void D(int i) {
        w();
        if (this.n0) {
            if ((!this.W || ((boolean[]) this.Y.y)[i]) && !this.S[i].s(false)) {
                this.m0 = 0L;
                this.n0 = false;
                this.f0 = true;
                this.l0 = 0L;
                this.o0 = 0;
                for (f95 f95Var : this.S) {
                    f95Var.x(false);
                }
                nr3 nr3Var = this.P;
                nr3Var.getClass();
                nr3Var.g(this);
            }
        }
    }

    public final bh6 E(mv4 mv4Var) {
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            if (mv4Var.equals(this.T[i])) {
                return this.S[i];
            }
        }
        if (this.U) {
            kb0.O("ProgressiveMediaPeriod", "Extractor added new track (id=" + mv4Var.a + ") after finishing tracks.");
            return new vg1();
        }
        xp1 xp1Var = this.z;
        xp1Var.getClass();
        f95 f95Var = new f95(this.E, xp1Var, this.C);
        jv4 jv4Var = new jv4(f95Var);
        f95Var.f = this;
        int i2 = length + 1;
        mv4[] mv4VarArr = (mv4[]) Arrays.copyOf(this.T, i2);
        mv4VarArr[length] = mv4Var;
        String str = eq6.a;
        this.T = mv4VarArr;
        f95[] f95VarArr = (f95[]) Arrays.copyOf(this.S, i2);
        f95VarArr[length] = f95Var;
        this.S = f95VarArr;
        jv4[] jv4VarArr = (jv4[]) Arrays.copyOf(this.R, i2);
        jv4VarArr[length] = jv4Var;
        this.R = jv4VarArr;
        return jv4Var;
    }

    public final void F(hf5 hf5Var) {
        hf5 zyVar;
        boolean z;
        if (this.Q == null) {
            zyVar = hf5Var;
        } else {
            zyVar = new zy(-9223372036854775807L);
        }
        this.Z = zyVar;
        this.a0 = hf5Var.h();
        int i = 1;
        if (!this.k0 && hf5Var.h() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = z;
        if (z) {
            i = 7;
        }
        this.c0 = i;
        if (this.V) {
            this.D.u(this.a0, hf5Var, z);
        } else {
            A();
        }
    }

    @Override // defpackage.d12
    public final bh6 G(int i, int i2) {
        return E(new mv4(i, false));
    }

    public final void H() {
        kv4 kv4Var = new kv4(this, this.x, this.y, this.K, this, this.L);
        if (this.V) {
            io3.B(z());
            long j = this.d0;
            if (j == Long.MIN_VALUE) {
                j = this.a0;
            }
            if (j != -9223372036854775807L && this.m0 > j) {
                this.p0 = true;
                this.m0 = -9223372036854775807L;
                return;
            }
            hf5 hf5Var = this.Z;
            hf5Var.getClass();
            long j2 = hf5Var.f(this.m0).a.b;
            long j3 = this.m0;
            kv4Var.g.a = j2;
            kv4Var.j = j3;
            kv4Var.i = true;
            kv4Var.m = false;
            for (f95 f95Var : this.S) {
                f95Var.t = this.m0;
            }
            this.m0 = -9223372036854775807L;
        }
        this.o0 = x();
        this.J.T(kv4Var, this, this.A.i(this.c0));
    }

    @Override // defpackage.d12
    public final void I(hf5 hf5Var) {
        this.O.post(new f32((Object) this, (Object) hf5Var, (byte) 24));
    }

    public final boolean J() {
        if (!this.f0 && !z()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nj3
    public final void a() {
        for (f95 f95Var : this.S) {
            f95Var.x(true);
            qp1 qp1Var = f95Var.h;
            if (qp1Var != null) {
                qp1Var.c(f95Var.e);
                f95Var.h = null;
                f95Var.g = null;
            }
        }
        dn0 dn0Var = this.K;
        b12 b12Var = (b12) dn0Var.z;
        if (b12Var != null) {
            b12Var.release();
            dn0Var.z = null;
        }
        dn0Var.A = null;
    }

    @Override // defpackage.or3
    public final long b(long j) {
        this.d0 = j;
        for (f95 f95Var : this.S) {
            f95Var.A(j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18, types: [wx3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.or3
    public final long c(jz1[] jz1VarArr, boolean[] zArr, g95[] g95VarArr, boolean[] zArr2, long j) {
        int i;
        ?? r9;
        ArrayList arrayList;
        boolean z;
        boolean[] zArr3;
        zg6 zg6Var;
        jz1 jz1Var;
        ?? r13;
        ?? r132;
        boolean z2;
        jz1[] jz1VarArr2 = jz1VarArr;
        long j2 = j;
        w();
        zp2 zp2Var = this.Y;
        zg6 zg6Var2 = (zg6) zp2Var.x;
        boolean[] zArr4 = (boolean[]) zp2Var.z;
        int i2 = this.i0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 < jz1VarArr2.length) {
                jz1 jz1Var2 = jz1VarArr2[i4];
                if (jz1Var2 != null && Objects.equals(zg6Var2.a(zg6Var2.b(jz1Var2.c())).d[0].p, "application/x-itut-t35")) {
                    r9 = true;
                    break;
                }
                i4++;
            } else {
                r9 = false;
                break;
            }
        }
        int i5 = 0;
        while (true) {
            int length = jz1VarArr2.length;
            arrayList = this.j0;
            if (i5 >= length) {
                break;
            }
            g95 g95Var = g95VarArr[i5];
            if (g95Var != null && (jz1VarArr2[i5] == null || !zArr[i5] || (r9 != false && (g95Var instanceof wx3)))) {
                if (g95Var instanceof wx3) {
                    wx3 wx3Var = (wx3) g95Var;
                    arrayList.remove(wx3Var);
                    int i6 = wx3Var.x.x;
                    io3.B(zArr4[i6]);
                    this.i0--;
                    zArr4[i6] = false;
                    int i7 = wx3Var.y.x;
                    io3.B(zArr4[i7]);
                    this.i0--;
                    zArr4[i7] = false;
                } else {
                    int i8 = ((lv4) g95Var).x;
                    io3.B(zArr4[i8]);
                    this.i0--;
                    zArr4[i8] = false;
                }
                g95VarArr[i5] = null;
            }
            i5++;
        }
        if (!this.e0 ? !(j2 == 0 || this.X) : i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i9 = 0;
        boolean z3 = false;
        while (i9 < jz1VarArr2.length) {
            if (g95VarArr[i9] == null && (jz1Var = jz1VarArr2[i9]) != null) {
                if (jz1Var.length() == i) {
                    r13 = i;
                } else {
                    r13 = i3;
                }
                io3.B(r13);
                if (jz1Var.j(i3) == 0) {
                    r132 = i;
                } else {
                    r132 = i3;
                }
                io3.B(r132);
                int b = zg6Var2.b(jz1Var.c());
                io3.B(!zArr4[b]);
                boolean z4 = i;
                this.i0++;
                zArr4[b] = z4;
                z3 |= jz1Var.n().v;
                int i10 = i3;
                lv4 lv4Var = new lv4(this, b, jz1Var.n().v);
                if (Build.VERSION.SDK_INT >= 37 && r9 == false && qy3.m(jz1Var.n().p)) {
                    int i11 = i10;
                    while (i11 < zg6Var2.a) {
                        if (ko0.f(zg6Var2.a(i11).d[i10])) {
                            io3.B(!zArr4[i11]);
                            this.i0++;
                            zArr4[i11] = z4;
                            zArr3 = zArr4;
                            zg6Var = zg6Var2;
                            ?? wx3Var2 = new wx3(lv4Var, new lv4(this, i11, i10), jz1Var.n());
                            arrayList.add(wx3Var2);
                            lv4Var = wx3Var2;
                            break;
                        }
                        i11++;
                        i10 = 0;
                    }
                }
                zArr3 = zArr4;
                zg6Var = zg6Var2;
                g95VarArr[i9] = lv4Var;
                zArr2[i9] = z4;
                if (!z) {
                    f95 f95Var = this.S[b];
                    if (f95Var.o() != 0 && !f95Var.z(j2, z4)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2;
                }
            } else {
                zArr3 = zArr4;
                zg6Var = zg6Var2;
            }
            i9++;
            jz1VarArr2 = jz1VarArr;
            zArr4 = zArr3;
            zg6Var2 = zg6Var;
            i3 = 0;
            i = 1;
        }
        if (this.g0 || !this.e0) {
            this.g0 = z3;
        }
        if (this.i0 == 0) {
            this.n0 = false;
            this.f0 = false;
            this.g0 = false;
            dn0 dn0Var = this.J;
            if (dn0Var.F()) {
                for (f95 f95Var2 : this.S) {
                    f95Var2.j();
                }
                dn0Var.p();
            } else {
                boolean z5 = false;
                this.p0 = false;
                f95[] f95VarArr = this.S;
                int length2 = f95VarArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    f95VarArr[i12].x(z5);
                    i12++;
                    z5 = false;
                }
            }
        } else if (z) {
            j2 = j(j2);
            for (int i13 = 0; i13 < g95VarArr.length; i13++) {
                g95 g95Var2 = g95VarArr[i13];
                if (g95Var2 != null) {
                    zArr2[i13] = true;
                    if (g95Var2 instanceof wx3) {
                        wx3 wx3Var3 = (wx3) g95Var2;
                        wx3Var3.B.clear();
                        wx3Var3.D = null;
                        wx3Var3.E = -9223372036854775807L;
                        wx3Var3.F = false;
                        wx3Var3.G = false;
                        wx3Var3.A.f();
                    }
                }
            }
        }
        this.e0 = true;
        return j2;
    }

    @Override // defpackage.ui5
    public final boolean d() {
        if (!this.p0 && this.J.F() && this.L.e()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.or3
    public final void e() {
        this.h0 = true;
    }

    @Override // defpackage.ui5
    public final long f() {
        return s();
    }

    @Override // defpackage.kj3
    public final void g(mj3 mj3Var, long j, long j2, boolean z) {
        kv4 kv4Var = (kv4) mj3Var;
        iy5 iy5Var = kv4Var.c;
        hj3 hj3Var = new hj3(kv4Var.a, kv4Var.k, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        this.A.getClass();
        this.B.p(ij3Var, 1, -1, null, 0, null, kv4Var.j, this.a0);
        if (!z) {
            for (f95 f95Var : this.S) {
                f95Var.x(false);
            }
            if (this.i0 > 0) {
                nr3 nr3Var = this.P;
                nr3Var.getClass();
                nr3Var.g(this);
            }
        }
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        w();
        if (!this.Z.b()) {
            return 0L;
        }
        gf5 f = this.Z.f(j);
        return if5Var.a(j, f.a.a, f.b.a);
    }

    @Override // defpackage.or3
    public final void i() {
        int i = this.A.i(this.c0);
        dn0 dn0Var = this.J;
        IOException iOException = (IOException) dn0Var.A;
        if (iOException == null) {
            lj3 lj3Var = (lj3) dn0Var.z;
            if (lj3Var != null) {
                if (i == Integer.MIN_VALUE) {
                    i = lj3Var.x;
                }
                IOException iOException2 = lj3Var.B;
                if (iOException2 != null && lj3Var.C > i) {
                    throw iOException2;
                }
            }
            if (this.p0 && !this.V) {
                throw bj4.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.or3
    public final long j(long j) {
        boolean z;
        long j2;
        int i;
        ArrayList arrayList = this.j0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wx3 wx3Var = (wx3) obj;
            wx3Var.B.clear();
            wx3Var.D = null;
            wx3Var.E = -9223372036854775807L;
            wx3Var.F = false;
            wx3Var.G = false;
            wx3Var.A.f();
        }
        w();
        boolean[] zArr = (boolean[]) this.Y.y;
        if (!this.Z.b()) {
            j = 0;
        }
        this.f0 = false;
        if (this.l0 == j) {
            z = true;
        } else {
            z = false;
        }
        this.l0 = j;
        if (z()) {
            this.m0 = j;
            return j;
        }
        if (this.c0 != 7 && (this.p0 || this.J.F())) {
            int length = this.S.length;
            for (int i3 = 0; i3 < length; i3++) {
                f95 f95Var = this.S[i3];
                if (!this.R[i3].d.get()) {
                    if (this.X) {
                        f95Var.y(f95Var.q);
                    } else {
                        synchronized (f95Var) {
                            if (f95Var.p == 0) {
                                j2 = Long.MIN_VALUE;
                            } else {
                                j2 = f95Var.n[f95Var.r];
                            }
                        }
                        if (j2 != Long.MIN_VALUE && j <= j2 && (i = f95Var.q) == 0 && z) {
                            f95Var.y(i);
                        } else if (f95Var.z(j, this.p0)) {
                            continue;
                        } else if (!zArr[i3] && this.W) {
                        }
                    }
                }
            }
            return j;
        }
        this.n0 = false;
        this.m0 = j;
        this.p0 = false;
        this.g0 = false;
        if (this.J.F()) {
            for (f95 f95Var2 : this.S) {
                f95Var2.j();
            }
            this.J.p();
            return j;
        }
        this.J.A = null;
        for (f95 f95Var3 : this.S) {
            f95Var3.x(false);
        }
        return j;
    }

    @Override // defpackage.kj3
    public final void k(mj3 mj3Var, long j, long j2) {
        long j3;
        kv4 kv4Var = (kv4) mj3Var;
        if (this.a0 == -9223372036854775807L && this.Z != null) {
            long y = y(true);
            if (y == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = y + 10000;
            }
            this.a0 = j3;
            this.D.u(j3, this.Z, this.b0);
        }
        iy5 iy5Var = kv4Var.c;
        hj3 hj3Var = new hj3(kv4Var.a, kv4Var.k, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        this.A.getClass();
        this.B.q(ij3Var, 1, -1, null, 0, null, kv4Var.j, this.a0);
        this.p0 = true;
        nr3 nr3Var = this.P;
        nr3Var.getClass();
        nr3Var.g(this);
    }

    @Override // defpackage.or3
    public final void l(long j) {
        if (!this.X) {
            w();
            if (!z()) {
                boolean[] zArr = (boolean[]) this.Y.z;
                int length = this.S.length;
                for (int i = 0; i < length; i++) {
                    this.S[i].i(j, zArr[i]);
                }
            }
        }
    }

    @Override // defpackage.or3
    public final long n() {
        if (!this.h0 && this.g0) {
            this.g0 = false;
            return this.l0;
        }
        if (this.f0) {
            if (this.p0 || x() > this.o0) {
                this.f0 = false;
                return this.l0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        this.P = nr3Var;
        ea2 ea2Var = this.H;
        if (ea2Var != null) {
            G(0, 3).g(ea2Var);
            F(new tx2(-9223372036854775807L, new long[]{0}, new long[]{0}));
            t();
            this.m0 = j;
            return;
        }
        this.L.f();
        H();
    }

    @Override // defpackage.or3
    public final zg6 p() {
        w();
        return (zg6) this.Y.x;
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        if (!this.p0) {
            dn0 dn0Var = this.J;
            if (((IOException) dn0Var.A) == null && !this.n0) {
                if ((!this.V && this.H == null) || this.i0 != 0) {
                    boolean f = this.L.f();
                    if (!dn0Var.F()) {
                        H();
                        return true;
                    }
                    return f;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.kj3
    public final void r(mj3 mj3Var, long j, long j2, int i) {
        kv4 kv4Var = (kv4) mj3Var;
        iy5 iy5Var = kv4Var.c;
        hj3 hj3Var = new hj3(kv4Var.a, kv4Var.k, j);
        if (i != 0) {
            hj3Var.f = iy5Var.z;
            hj3Var.g = iy5Var.A;
            hj3Var.c = j2;
            hj3Var.d = iy5Var.y;
        }
        this.B.x(new ij3(hj3Var), 1, -1, null, 0, null, kv4Var.j, this.a0, i);
    }

    @Override // defpackage.ui5
    public final long s() {
        long j;
        boolean z;
        long j2;
        w();
        if (this.p0 || this.i0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.m0;
        }
        if (this.W) {
            int length = this.S.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zp2 zp2Var = this.Y;
                if (((boolean[]) zp2Var.y)[i] && ((boolean[]) zp2Var.z)[i]) {
                    f95 f95Var = this.S[i];
                    synchronized (f95Var) {
                        z = f95Var.z;
                    }
                    if (z) {
                        continue;
                    } else {
                        f95 f95Var2 = this.S[i];
                        synchronized (f95Var2) {
                            j2 = f95Var2.w;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = y(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.l0;
        }
        return j;
    }

    @Override // defpackage.d12
    public final void t() {
        this.U = true;
        this.O.post(this.M);
    }

    @Override // defpackage.e95
    public final void u() {
        this.O.post(this.M);
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        boolean z;
        if (this.i0 > 0 && !z()) {
            boolean z2 = false;
            if (this.d0 != Long.MIN_VALUE) {
                w();
                boolean z3 = true;
                int i = 0;
                while (true) {
                    f95[] f95VarArr = this.S;
                    if (i >= f95VarArr.length) {
                        break;
                    }
                    zp2 zp2Var = this.Y;
                    if (((boolean[]) zp2Var.z)[i] && (((boolean[]) zp2Var.y)[i] || !this.W)) {
                        f95 f95Var = f95VarArr[i];
                        synchronized (f95Var) {
                            if (f95Var.x != -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        z3 &= z;
                    }
                    i++;
                }
                z2 = z3;
            }
            if (z2) {
                this.p0 = true;
            }
        }
    }

    public final void w() {
        io3.B(this.V);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final int x() {
        int i = 0;
        for (f95 f95Var : this.S) {
            i += f95Var.q + f95Var.p;
        }
        return i;
    }

    public final long y(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.S.length; i++) {
            if (!z) {
                zp2 zp2Var = this.Y;
                zp2Var.getClass();
                if (!((boolean[]) zp2Var.z)[i]) {
                    continue;
                }
            }
            f95 f95Var = this.S[i];
            synchronized (f95Var) {
                j = f95Var.w;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean z() {
        if (this.m0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
