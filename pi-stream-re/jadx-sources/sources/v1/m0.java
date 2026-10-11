package v1;

import android.net.Uri;
import android.os.Handler;
import j1.j1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 implements u, d2.r, z1.j, z1.m, t0 {

    /* renamed from: e0, reason: collision with root package name */
    public static final Map f10463e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final c1.v f10464f0;
    public final long A;
    public final z1.o B = new z1.o("ProgressiveMediaPeriod");
    public final f.c C;
    public final c1.r D;
    public final g0 E;
    public final g0 F;
    public final Handler G;
    public final boolean H;
    public t I;
    public p2.b J;
    public u0[] K;
    public k0[] L;
    public boolean M;
    public boolean N;
    public boolean O;
    public l0 P;
    public d2.b0 Q;
    public long R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public long Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10465a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f10466a0;

    /* renamed from: b, reason: collision with root package name */
    public final h1.h f10467b;

    /* renamed from: b0, reason: collision with root package name */
    public int f10468b0;

    /* renamed from: c, reason: collision with root package name */
    public final o1.q f10469c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10470c0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.q0 f10471d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f10472d0;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f10473e;

    /* renamed from: f, reason: collision with root package name */
    public final o1.n f10474f;

    /* renamed from: x, reason: collision with root package name */
    public final o0 f10475x;

    /* renamed from: y, reason: collision with root package name */
    public final z1.d f10476y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10477z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f10463e0 = Collections.unmodifiableMap(hashMap);
        c1.u uVar = new c1.u();
        uVar.f1897a = "icy";
        uVar.e("application/x-icy");
        f10464f0 = new c1.v(uVar);
    }

    public m0(Uri uri, h1.h hVar, f.c cVar, o1.q qVar, o1.n nVar, androidx.lifecycle.q0 q0Var, b0 b0Var, o0 o0Var, z1.d dVar, String str, int i10, long j4) {
        boolean z9;
        this.f10465a = uri;
        this.f10467b = hVar;
        this.f10469c = qVar;
        this.f10474f = nVar;
        this.f10471d = q0Var;
        this.f10473e = b0Var;
        this.f10475x = o0Var;
        this.f10476y = dVar;
        this.f10477z = str;
        this.A = i10;
        this.C = cVar;
        this.R = j4;
        if (j4 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.H = z9;
        this.D = new c1.r(1);
        this.E = new g0(this, 0);
        this.F = new g0(this, 1);
        this.G = f1.b0.l(null);
        this.L = new k0[0];
        this.K = new u0[0];
        this.Z = -9223372036854775807L;
        this.T = 1;
    }

    public final void A(int i10) {
        g();
        l0 l0Var = this.P;
        boolean[] zArr = l0Var.f10457d;
        if (!zArr[i10]) {
            c1.v vVar = l0Var.f10454a.a(i10).f1693d[0];
            this.f10473e.a(c1.q0.i(vVar.f1935m), vVar, 0, null, this.Y);
            zArr[i10] = true;
        }
    }

    public final void B(int i10) {
        g();
        boolean[] zArr = this.P.f10455b;
        if (this.f10466a0 && zArr[i10] && !this.K[i10].u(false)) {
            this.Z = 0L;
            this.f10466a0 = false;
            this.V = true;
            this.Y = 0L;
            this.f10468b0 = 0;
            for (u0 u0Var : this.K) {
                u0Var.A(false);
            }
            t tVar = this.I;
            tVar.getClass();
            tVar.s(this);
        }
    }

    public final u0 C(k0 k0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (k0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        o1.q qVar = this.f10469c;
        qVar.getClass();
        o1.n nVar = this.f10474f;
        nVar.getClass();
        u0 u0Var = new u0(this.f10476y, qVar, nVar);
        u0Var.f10539f = this;
        int i11 = length + 1;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.L, i11);
        k0VarArr[length] = k0Var;
        int i12 = f1.b0.f3799a;
        this.L = k0VarArr;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.K, i11);
        u0VarArr[length] = u0Var;
        this.K = u0VarArr;
        return u0Var;
    }

    public final void D() {
        i0 i0Var = new i0(this, this.f10465a, this.f10467b, this.C, this, this.D);
        if (this.N) {
            w7.b.u(y());
            long j4 = this.R;
            if (j4 != -9223372036854775807L && this.Z > j4) {
                this.f10470c0 = true;
                this.Z = -9223372036854775807L;
                return;
            }
            d2.b0 b0Var = this.Q;
            b0Var.getClass();
            long j10 = b0Var.j(this.Z).f3091a.f3113b;
            long j11 = this.Z;
            i0Var.f10446x.f3191a = j10;
            i0Var.A = j11;
            i0Var.f10448z = true;
            i0Var.D = false;
            for (u0 u0Var : this.K) {
                u0Var.f10552t = this.Z;
            }
            this.Z = -9223372036854775807L;
        }
        this.f10468b0 = w();
        this.f10473e.m(new n(i0Var.f10440a, i0Var.B, this.B.g(i0Var, this, this.f10471d.z(this.T))), 1, -1, null, 0, null, i0Var.A, this.R);
    }

    public final boolean E() {
        if (!this.V && !y()) {
            return false;
        }
        return true;
    }

    @Override // v1.t0
    public final void a() {
        this.G.post(this.E);
    }

    @Override // d2.r
    public final void b() {
        this.M = true;
        this.G.post(this.E);
    }

    @Override // v1.x0
    public final boolean c() {
        boolean z9;
        if (this.B.e()) {
            c1.r rVar = this.D;
            synchronized (rVar) {
                z9 = rVar.f1885a;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        g();
        if (!this.Q.g()) {
            return 0L;
        }
        d2.a0 j10 = this.Q.j(j4);
        return j1Var.a(j4, j10.f3091a.f3112a, j10.f3092b.f3112a);
    }

    @Override // z1.m
    public final void e() {
        for (u0 u0Var : this.K) {
            u0Var.A(true);
            o1.k kVar = u0Var.f10541h;
            if (kVar != null) {
                kVar.a(u0Var.f10538e);
                u0Var.f10541h = null;
                u0Var.f10540g = null;
            }
        }
        f.c cVar = this.C;
        d2.p pVar = (d2.p) cVar.f3636c;
        if (pVar != null) {
            pVar.a();
            cVar.f3636c = null;
        }
        cVar.f3637d = null;
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        d2.b0 b0Var;
        long j11;
        i0 i0Var = (i0) lVar;
        if (this.R == -9223372036854775807L && (b0Var = this.Q) != null) {
            boolean g10 = b0Var.g();
            long x9 = x(true);
            if (x9 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = x9 + 10000;
            }
            this.R = j11;
            this.f10475x.u(j11, g10, this.S);
        }
        Uri uri = i0Var.f10442c.f4562c;
        n nVar = new n(j10);
        this.f10471d.getClass();
        this.f10473e.g(nVar, 1, -1, null, 0, null, i0Var.A, this.R);
        this.f10470c0 = true;
        t tVar = this.I;
        tVar.getClass();
        tVar.s(this);
    }

    public final void g() {
        w7.b.u(this.N);
        this.P.getClass();
        this.Q.getClass();
    }

    @Override // v1.x0
    public final long h() {
        return o();
    }

    @Override // d2.r
    public final d2.g0 i(int i10, int i11) {
        return C(new k0(i10, false));
    }

    @Override // v1.u
    public final long j() {
        if (this.V) {
            if (this.f10470c0 || w() > this.f10468b0) {
                this.V = false;
                return this.Y;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        this.I = tVar;
        this.D.e();
        D();
    }

    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        boolean[] zArr3;
        boolean z9;
        y1.s sVar;
        boolean z10;
        boolean z11;
        g();
        l0 l0Var = this.P;
        g1 g1Var = l0Var.f10454a;
        int i10 = this.W;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = sVarArr.length;
            zArr3 = l0Var.f10456c;
            if (i12 >= length) {
                break;
            }
            v0 v0Var = v0VarArr[i12];
            if (v0Var != null && (sVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((j0) v0Var).f10449a;
                w7.b.u(zArr3[i13]);
                this.W--;
                zArr3[i13] = false;
                v0VarArr[i12] = null;
            }
            i12++;
        }
        if (!this.H && (!this.U ? j4 != 0 : i10 == 0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i14 = 0; i14 < sVarArr.length; i14++) {
            if (v0VarArr[i14] == null && (sVar = sVarArr[i14]) != null) {
                if (sVar.length() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w7.b.u(z10);
                if (sVar.f(0) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w7.b.u(z11);
                int b10 = g1Var.b(sVar.k());
                w7.b.u(!zArr3[b10]);
                this.W++;
                zArr3[b10] = true;
                v0VarArr[i14] = new j0(this, b10);
                zArr2[i14] = true;
                if (!z9) {
                    u0 u0Var = this.K[b10];
                    if (u0Var.f10549q + u0Var.f10551s != 0 && !u0Var.D(j4, true)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
            }
        }
        if (this.W == 0) {
            this.f10466a0 = false;
            this.V = false;
            z1.o oVar = this.B;
            if (oVar.e()) {
                u0[] u0VarArr = this.K;
                int length2 = u0VarArr.length;
                while (i11 < length2) {
                    u0VarArr[i11].j();
                    i11++;
                }
                oVar.a();
            } else {
                for (u0 u0Var2 : this.K) {
                    u0Var2.A(false);
                }
            }
        } else if (z9) {
            j4 = t(j4);
            while (i11 < v0VarArr.length) {
                if (v0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.U = true;
        return j4;
    }

    @Override // v1.u
    public final g1 m() {
        g();
        return this.P.f10454a;
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        if (!this.f10470c0) {
            z1.o oVar = this.B;
            if (!oVar.d() && !this.f10466a0) {
                if (!this.N || this.W != 0) {
                    boolean e10 = this.D.e();
                    if (!oVar.e()) {
                        D();
                        return true;
                    }
                    return e10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // v1.x0
    public final long o() {
        long j4;
        boolean z9;
        g();
        if (this.f10470c0 || this.W == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.Z;
        }
        if (this.O) {
            int length = this.K.length;
            j4 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                l0 l0Var = this.P;
                if (l0Var.f10455b[i10] && l0Var.f10456c[i10]) {
                    u0 u0Var = this.K[i10];
                    synchronized (u0Var) {
                        z9 = u0Var.f10555w;
                    }
                    if (!z9) {
                        j4 = Math.min(j4, this.K[i10].o());
                    }
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = x(false);
        }
        if (j4 == Long.MIN_VALUE) {
            return this.Y;
        }
        return j4;
    }

    @Override // v1.u
    public final void p() {
        int z9 = this.f10471d.z(this.T);
        z1.o oVar = this.B;
        IOException iOException = oVar.f11944c;
        if (iOException == null) {
            z1.k kVar = oVar.f11943b;
            if (kVar != null) {
                if (z9 == Integer.MIN_VALUE) {
                    z9 = kVar.f11930a;
                }
                IOException iOException2 = kVar.f11934e;
                if (iOException2 != null && kVar.f11935f > z9) {
                    throw iOException2;
                }
            }
            if (this.f10470c0 && !this.N) {
                throw c1.r0.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    @Override // z1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.i q(z1.l r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.m0.q(z1.l, long, long, java.io.IOException, int):z1.i");
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        i0 i0Var = (i0) lVar;
        Uri uri = i0Var.f10442c.f4562c;
        n nVar = new n(j10);
        this.f10471d.getClass();
        this.f10473e.d(nVar, 1, -1, null, 0, null, i0Var.A, this.R);
        if (!z9) {
            for (u0 u0Var : this.K) {
                u0Var.A(false);
            }
            if (this.W > 0) {
                t tVar = this.I;
                tVar.getClass();
                tVar.s(this);
            }
        }
    }

    @Override // d2.r
    public final void s(d2.b0 b0Var) {
        this.G.post(new f.m0(10, this, b0Var));
    }

    @Override // v1.u
    public final long t(long j4) {
        boolean z9;
        boolean D;
        g();
        boolean[] zArr = this.P.f10455b;
        if (!this.Q.g()) {
            j4 = 0;
        }
        this.V = false;
        this.Y = j4;
        if (y()) {
            this.Z = j4;
            return j4;
        }
        if (this.T != 7) {
            int length = this.K.length;
            for (int i10 = 0; i10 < length; i10++) {
                u0 u0Var = this.K[i10];
                if (this.H) {
                    D = u0Var.C(u0Var.f10549q);
                } else {
                    D = u0Var.D(j4, false);
                }
                if (!D && (zArr[i10] || !this.O)) {
                    z9 = false;
                    break;
                }
            }
            z9 = true;
            if (z9) {
                return j4;
            }
        }
        this.f10466a0 = false;
        this.Z = j4;
        this.f10470c0 = false;
        z1.o oVar = this.B;
        if (oVar.e()) {
            for (u0 u0Var2 : this.K) {
                u0Var2.j();
            }
            oVar.a();
        } else {
            oVar.f11944c = null;
            for (u0 u0Var3 : this.K) {
                u0Var3.A(false);
            }
        }
        return j4;
    }

    @Override // v1.u
    public final void u(long j4) {
        if (this.H) {
            return;
        }
        g();
        if (y()) {
            return;
        }
        boolean[] zArr = this.P.f10456c;
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.K[i10].i(j4, zArr[i10]);
        }
    }

    @Override // v1.x0
    public final void v(long j4) {
    }

    public final int w() {
        int i10 = 0;
        for (u0 u0Var : this.K) {
            i10 += u0Var.f10549q + u0Var.f10548p;
        }
        return i10;
    }

    public final long x(boolean z9) {
        long j4 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.K.length; i10++) {
            if (!z9) {
                l0 l0Var = this.P;
                l0Var.getClass();
                if (!l0Var.f10456c[i10]) {
                }
            }
            j4 = Math.max(j4, this.K[i10].o());
        }
        return j4;
    }

    public final boolean y() {
        if (this.Z != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        boolean z9;
        c1.p0 d10;
        int i10;
        if (!this.f10472d0 && !this.N && this.M && this.Q != null) {
            for (u0 u0Var : this.K) {
                if (u0Var.t() == null) {
                    return;
                }
            }
            this.D.c();
            int length = this.K.length;
            c1.f1[] f1VarArr = new c1.f1[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                c1.v t9 = this.K[i11].t();
                t9.getClass();
                String str = t9.f1935m;
                boolean k10 = c1.q0.k(str);
                if (!k10 && !c1.q0.n(str)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                zArr[i11] = z9;
                this.O = z9 | this.O;
                p2.b bVar = this.J;
                if (bVar != null) {
                    if (k10 || this.L[i11].f10452b) {
                        c1.p0 p0Var = t9.f1933k;
                        if (p0Var == null) {
                            d10 = new c1.p0(bVar);
                        } else {
                            d10 = p0Var.d(bVar);
                        }
                        c1.u uVar = new c1.u(t9);
                        uVar.f1906j = d10;
                        t9 = new c1.v(uVar);
                    }
                    if (k10 && t9.f1929g == -1 && t9.f1930h == -1 && (i10 = bVar.f8546a) != -1) {
                        c1.u uVar2 = new c1.u(t9);
                        uVar2.f1903g = i10;
                        t9 = new c1.v(uVar2);
                    }
                }
                int o = this.f10469c.o(t9);
                c1.u a10 = t9.a();
                a10.H = o;
                f1VarArr[i11] = new c1.f1(Integer.toString(i11), a10.a());
            }
            this.P = new l0(new g1(f1VarArr), zArr);
            this.N = true;
            t tVar = this.I;
            tVar.getClass();
            tVar.i(this);
        }
    }
}
