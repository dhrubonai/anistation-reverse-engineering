package p1;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.lifecycle.q0;
import c1.f1;
import d2.g0;
import f.p0;
import h1.y;
import j1.m0;
import j1.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p7.a0;
import r6.h0;
import v1.b0;
import v1.g1;
import v1.t0;
import v1.x0;

/* loaded from: classes.dex */
public final class t implements z1.j, z1.m, x0, d2.r, t0 {

    /* renamed from: p0, reason: collision with root package name */
    public static final Set f8499p0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final b0 B;
    public final int C;
    public final ArrayList E;
    public final List F;
    public final q G;
    public final q H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public w1.f L;
    public s[] M;
    public final HashSet O;
    public final SparseIntArray P;
    public r Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public c1.v W;
    public c1.v X;
    public boolean Y;
    public g1 Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f8500a;

    /* renamed from: a0, reason: collision with root package name */
    public Set f8501a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f8502b;

    /* renamed from: b0, reason: collision with root package name */
    public int[] f8503b0;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f8504c;

    /* renamed from: c0, reason: collision with root package name */
    public int f8505c0;

    /* renamed from: d, reason: collision with root package name */
    public final j f8506d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f8507d0;

    /* renamed from: e, reason: collision with root package name */
    public final z1.d f8508e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean[] f8509e0;

    /* renamed from: f, reason: collision with root package name */
    public final c1.v f8510f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean[] f8511f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f8512g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f8513h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f8514i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f8515j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f8516k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f8517l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f8518m0;

    /* renamed from: n0, reason: collision with root package name */
    public c1.p f8519n0;

    /* renamed from: o0, reason: collision with root package name */
    public l f8520o0;

    /* renamed from: x, reason: collision with root package name */
    public final o1.q f8521x;

    /* renamed from: y, reason: collision with root package name */
    public final o1.n f8522y;

    /* renamed from: z, reason: collision with root package name */
    public final q0 f8523z;
    public final z1.o A = new z1.o("Loader:HlsSampleStreamWrapper");
    public final i4.v D = new i4.v(3, 0);
    public int[] N = new int[0];

    public t(String str, int i10, p0 p0Var, j jVar, Map map, z1.d dVar, long j4, c1.v vVar, o1.q qVar, o1.n nVar, q0 q0Var, b0 b0Var, int i11) {
        this.f8500a = str;
        this.f8502b = i10;
        this.f8504c = p0Var;
        this.f8506d = jVar;
        this.K = map;
        this.f8508e = dVar;
        this.f8510f = vVar;
        this.f8521x = qVar;
        this.f8522y = nVar;
        this.f8523z = q0Var;
        this.B = b0Var;
        this.C = i11;
        Set set = f8499p0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new s[0];
        this.f8511f0 = new boolean[0];
        this.f8509e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = Collections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new q(this, 0);
        this.H = new q(this, 1);
        this.I = f1.b0.l(null);
        this.f8512g0 = j4;
        this.f8513h0 = j4;
    }

    public static int B(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    public static d2.o w(int i10, int i11) {
        f1.o.f("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new d2.o();
    }

    public static c1.v y(c1.v vVar, c1.v vVar2, boolean z9) {
        String str;
        String str2;
        int i10;
        int i11;
        if (vVar == null) {
            return vVar2;
        }
        String str3 = vVar2.f1935m;
        int i12 = c1.q0.i(str3);
        String str4 = vVar.f1932j;
        if (f1.b0.r(i12, str4) == 1) {
            str2 = f1.b0.s(i12, str4);
            str = c1.q0.e(str2);
        } else {
            String c6 = c1.q0.c(str4, str3);
            str = str3;
            str2 = c6;
        }
        c1.u uVar = new c1.u(vVar2);
        uVar.f1897a = vVar.f1923a;
        uVar.f1898b = vVar.f1924b;
        uVar.d(vVar.f1925c);
        uVar.f1900d = vVar.f1926d;
        uVar.f1901e = vVar.f1927e;
        uVar.f1902f = vVar.f1928f;
        if (z9) {
            i10 = vVar.f1929g;
        } else {
            i10 = -1;
        }
        uVar.f1903g = i10;
        if (z9) {
            i11 = vVar.f1930h;
        } else {
            i11 = -1;
        }
        uVar.f1904h = i11;
        uVar.f1905i = str2;
        if (i12 == 2) {
            uVar.f1912q = vVar.f1939r;
            uVar.f1913r = vVar.f1940s;
            uVar.f1914s = vVar.f1941t;
        }
        if (str != null) {
            uVar.e(str);
        }
        int i13 = vVar.f1947z;
        if (i13 != -1 && i12 == 1) {
            uVar.f1920y = i13;
        }
        c1.p0 p0Var = vVar.f1933k;
        if (p0Var != null) {
            c1.p0 p0Var2 = vVar2.f1933k;
            if (p0Var2 != null) {
                p0Var = p0Var2.e(p0Var);
            }
            uVar.f1906j = p0Var;
        }
        return new c1.v(uVar);
    }

    public final l A() {
        return (l) this.E.get(r0.size() - 1);
    }

    public final boolean C() {
        if (this.f8513h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        int i10;
        c1.v y9;
        boolean z9;
        if (!this.Y && this.f8503b0 == null && this.T) {
            int i11 = 0;
            for (s sVar : this.M) {
                if (sVar.t() == null) {
                    return;
                }
            }
            g1 g1Var = this.Z;
            if (g1Var != null) {
                int i12 = g1Var.f10432a;
                int[] iArr = new int[i12];
                this.f8503b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        s[] sVarArr = this.M;
                        if (i14 < sVarArr.length) {
                            c1.v t9 = sVarArr[i14].t();
                            w7.b.w(t9);
                            c1.v vVar = this.Z.a(i13).f1693d[0];
                            String str = vVar.f1935m;
                            String str2 = t9.f1935m;
                            int i15 = c1.q0.i(str2);
                            if (i15 == 3 ? f1.b0.a(str2, str) && ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || t9.E == vVar.E) : i15 == c1.q0.i(str)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                this.f8503b0[i13] = i14;
                                break;
                            }
                            i14++;
                        }
                    }
                }
                Iterator it = this.J.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).c();
                }
                return;
            }
            int length = this.M.length;
            int i16 = -1;
            int i17 = 0;
            int i18 = -2;
            while (true) {
                int i19 = 2;
                if (i17 >= length) {
                    break;
                }
                c1.v t10 = this.M[i17].t();
                w7.b.w(t10);
                String str3 = t10.f1935m;
                if (!c1.q0.n(str3)) {
                    if (c1.q0.k(str3)) {
                        i19 = 1;
                    } else if (c1.q0.m(str3)) {
                        i19 = 3;
                    } else {
                        i19 = -2;
                    }
                }
                if (B(i19) > B(i18)) {
                    i16 = i17;
                    i18 = i19;
                } else if (i19 == i18 && i16 != -1) {
                    i16 = -1;
                }
                i17++;
            }
            f1 f1Var = this.f8506d.f8447h;
            int i20 = f1Var.f1690a;
            this.f8505c0 = -1;
            this.f8503b0 = new int[length];
            for (int i21 = 0; i21 < length; i21++) {
                this.f8503b0[i21] = i21;
            }
            f1[] f1VarArr = new f1[length];
            int i22 = 0;
            while (i11 < length) {
                c1.v t11 = this.M[i11].t();
                w7.b.w(t11);
                c1.v vVar2 = this.f8510f;
                String str4 = this.f8500a;
                if (i11 == i16) {
                    c1.v[] vVarArr = new c1.v[i20];
                    for (int i23 = i22; i23 < i20; i23++) {
                        c1.v vVar3 = f1Var.f1693d[i23];
                        if (i18 == 1 && vVar2 != null) {
                            vVar3 = vVar3.d(vVar2);
                        }
                        if (i20 == 1) {
                            y9 = t11.d(vVar3);
                        } else {
                            y9 = y(vVar3, t11, true);
                        }
                        vVarArr[i23] = y9;
                    }
                    f1VarArr[i11] = new f1(str4, vVarArr);
                    this.f8505c0 = i11;
                    i10 = 0;
                } else {
                    if (i18 != 2 || !c1.q0.k(t11.f1935m)) {
                        vVar2 = null;
                    }
                    StringBuilder a10 = p.j.a(str4, ":muxed:");
                    a10.append(i11 < i16 ? i11 : i11 - 1);
                    f1VarArr[i11] = new f1(a10.toString(), y(vVar2, t11, false));
                    i10 = 0;
                }
                i11++;
                i22 = i10;
            }
            this.Z = x(f1VarArr);
            boolean z10 = i22;
            if (this.f8501a0 == null) {
                z10 = 1;
            }
            w7.b.u(z10);
            this.f8501a0 = Collections.emptySet();
            this.U = true;
            this.f8504c.G();
        }
    }

    public final void E() {
        this.A.b();
        j jVar = this.f8506d;
        v1.b bVar = jVar.o;
        if (bVar == null) {
            Uri uri = jVar.f8454p;
            if (uri != null && jVar.f8458t) {
                q1.b bVar2 = (q1.b) ((q1.c) jVar.f8446g).f8985d.get(uri);
                bVar2.f8974b.b();
                IOException iOException = bVar2.A;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(f1[] f1VarArr, int... iArr) {
        this.Z = x(f1VarArr);
        this.f8501a0 = new HashSet();
        for (int i10 : iArr) {
            this.f8501a0.add(this.Z.a(i10));
        }
        this.f8505c0 = 0;
        Handler handler = this.I;
        p0 p0Var = this.f8504c;
        Objects.requireNonNull(p0Var);
        handler.post(new q(p0Var, 2));
        this.U = true;
    }

    public final void G() {
        for (s sVar : this.M) {
            sVar.A(this.f8514i0);
        }
        this.f8514i0 = false;
    }

    public final boolean H(long j4, boolean z9) {
        l lVar;
        boolean z10;
        boolean D;
        this.f8512g0 = j4;
        if (C()) {
            this.f8513h0 = j4;
            return true;
        }
        boolean z11 = this.f8506d.f8455q;
        ArrayList arrayList = this.E;
        if (z11) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                lVar = (l) arrayList.get(i10);
                if (lVar.f10772x == j4) {
                    break;
                }
            }
        }
        lVar = null;
        if (this.T && !z9) {
            int length = this.M.length;
            for (int i11 = 0; i11 < length; i11++) {
                s sVar = this.M[i11];
                if (lVar != null) {
                    D = sVar.C(lVar.f(i11));
                } else {
                    D = sVar.D(j4, false);
                }
                if (!D && (this.f8511f0[i11] || !this.f8507d0)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.f8513h0 = j4;
        this.f8516k0 = false;
        arrayList.clear();
        z1.o oVar = this.A;
        if (oVar.e()) {
            if (this.T) {
                for (s sVar2 : this.M) {
                    sVar2.j();
                }
            }
            oVar.a();
        } else {
            oVar.f11944c = null;
            G();
        }
        return true;
    }

    @Override // v1.t0
    public final void a() {
        this.I.post(this.G);
    }

    @Override // d2.r
    public final void b() {
        this.f8517l0 = true;
        this.I.post(this.H);
    }

    @Override // v1.x0
    public final boolean c() {
        return this.A.e();
    }

    @Override // z1.m
    public final void e() {
        for (s sVar : this.M) {
            sVar.A(true);
            o1.k kVar = sVar.f10541h;
            if (kVar != null) {
                kVar.a(sVar.f10538e);
                sVar.f10541h = null;
                sVar.f10540g = null;
            }
        }
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        w1.f fVar = (w1.f) lVar;
        this.L = null;
        j jVar = this.f8506d;
        jVar.getClass();
        if (fVar instanceof f) {
            f fVar2 = (f) fVar;
            jVar.f8453n = fVar2.A;
            p0 p0Var = jVar.f8449j;
            Uri uri = fVar2.f10767b.f4597a;
            byte[] bArr = fVar2.C;
            bArr.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) p0Var.f3762b;
            uri.getClass();
        }
        long j11 = fVar.f10766a;
        Uri uri2 = fVar.f10774z.f4562c;
        v1.n nVar = new v1.n(j10);
        this.f8523z.getClass();
        this.B.g(nVar, fVar.f10768c, this.f8502b, fVar.f10769d, fVar.f10770e, fVar.f10771f, fVar.f10772x, fVar.f10773y);
        if (!this.U) {
            m0 m0Var = new m0();
            m0Var.f5830a = this.f8512g0;
            n(new n0(m0Var));
            return;
        }
        this.f8504c.s(this);
    }

    public final void g() {
        w7.b.u(this.U);
        this.Z.getClass();
        this.f8501a0.getClass();
    }

    @Override // v1.x0
    public final long h() {
        if (C()) {
            return this.f8513h0;
        }
        if (this.f8516k0) {
            return Long.MIN_VALUE;
        }
        return A().f10773y;
    }

    @Override // d2.r
    public final g0 i(int i10, int i11) {
        g0 g0Var;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f8499p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        boolean z9 = false;
        if (contains) {
            w7.b.g(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.N[i12] = i10;
                }
                if (this.N[i12] == i10) {
                    g0Var = this.M[i12];
                } else {
                    g0Var = w(i10, i11);
                }
            }
            g0Var = null;
        } else {
            int i13 = 0;
            while (true) {
                g0[] g0VarArr = this.M;
                if (i13 >= g0VarArr.length) {
                    break;
                }
                if (this.N[i13] == i10) {
                    g0Var = g0VarArr[i13];
                    break;
                }
                i13++;
            }
        }
        if (g0Var == null) {
            if (this.f8517l0) {
                return w(i10, i11);
            }
            int length = this.M.length;
            if (i11 == 1 || i11 == 2) {
                z9 = true;
            }
            s sVar = new s(this.f8508e, this.f8521x, this.f8522y, this.K);
            sVar.f10552t = this.f8512g0;
            if (z9) {
                sVar.I = this.f8519n0;
                sVar.f10558z = true;
            }
            long j4 = this.f8518m0;
            if (sVar.F != j4) {
                sVar.F = j4;
                sVar.f10558z = true;
            }
            if (this.f8520o0 != null) {
                sVar.C = r6.B;
            }
            sVar.f10539f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i14);
            this.N = copyOf;
            copyOf[length] = i10;
            s[] sVarArr = this.M;
            int i15 = f1.b0.f3799a;
            Object[] copyOf2 = Arrays.copyOf(sVarArr, sVarArr.length + 1);
            copyOf2[sVarArr.length] = sVar;
            this.M = (s[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f8511f0, i14);
            this.f8511f0 = copyOf3;
            copyOf3[length] = z9;
            this.f8507d0 |= z9;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (B(i11) > B(this.R)) {
                this.S = length;
                this.R = i11;
            }
            this.f8509e0 = Arrays.copyOf(this.f8509e0, i14);
            g0Var = sVar;
        }
        if (i11 == 5) {
            if (this.Q == null) {
                this.Q = new r(g0Var, this.C);
            }
            return this.Q;
        }
        return g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030e  */
    @Override // v1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(j1.n0 r61) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.t.n(j1.n0):boolean");
    }

    @Override // v1.x0
    public final long o() {
        if (this.f8516k0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f8513h0;
        }
        long j4 = this.f8512g0;
        l A = A();
        if (!A.Z) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                A = (l) arrayList.get(arrayList.size() - 2);
            } else {
                A = null;
            }
        }
        if (A != null) {
            j4 = Math.max(j4, A.f10773y);
        }
        if (this.T) {
            for (s sVar : this.M) {
                j4 = Math.max(j4, sVar.o());
            }
        }
        return j4;
    }

    @Override // z1.j
    public final z1.i q(z1.l lVar, long j4, long j10, IOException iOException, int i10) {
        boolean z9;
        z1.i iVar;
        int i11;
        w1.f fVar = (w1.f) lVar;
        boolean z10 = fVar instanceof l;
        if (z10 && !((l) fVar).f8463c0 && (iOException instanceof y) && ((i11 = ((y) iOException).f4644d) == 410 || i11 == 404)) {
            return z1.o.f11939d;
        }
        long j11 = fVar.f10774z.f4561b;
        Uri uri = fVar.f10774z.f4562c;
        v1.n nVar = new v1.n(j10);
        f1.r rVar = new f1.r(nVar, new v1.s(fVar.f10768c, this.f8502b, fVar.f10769d, fVar.f10770e, fVar.f10771f, f1.b0.c0(fVar.f10772x), f1.b0.c0(fVar.f10773y)), iOException, i10);
        j jVar = this.f8506d;
        z1.h o = a0.o(jVar.f8456r);
        this.f8523z.getClass();
        z1.i y9 = q0.y(o, rVar);
        boolean z11 = false;
        if (y9 != null && y9.f11928a == 2) {
            y1.s sVar = jVar.f8456r;
            z9 = sVar.o(sVar.u(jVar.f8447h.b(fVar.f10769d)), y9.f11929b);
        } else {
            z9 = false;
        }
        if (z9) {
            if (z10 && j11 == 0) {
                ArrayList arrayList = this.E;
                if (((l) arrayList.remove(arrayList.size() - 1)) == fVar) {
                    z11 = true;
                }
                w7.b.u(z11);
                if (arrayList.isEmpty()) {
                    this.f8513h0 = this.f8512g0;
                } else {
                    ((l) h0.X(arrayList)).f8462b0 = true;
                }
            }
            iVar = z1.o.f11940e;
        } else {
            long A = q0.A(rVar);
            if (A != -9223372036854775807L) {
                iVar = z1.o.c(A, false);
            } else {
                iVar = z1.o.f11941f;
            }
        }
        z1.i iVar2 = iVar;
        boolean z12 = !iVar2.a();
        this.B.i(nVar, fVar.f10768c, this.f8502b, fVar.f10769d, fVar.f10770e, fVar.f10771f, fVar.f10772x, fVar.f10773y, iOException, z12);
        if (z12) {
            this.L = null;
        }
        if (z9) {
            if (!this.U) {
                m0 m0Var = new m0();
                m0Var.f5830a = this.f8512g0;
                n(new n0(m0Var));
            } else {
                this.f8504c.s(this);
            }
        }
        return iVar2;
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        w1.f fVar = (w1.f) lVar;
        this.L = null;
        long j11 = fVar.f10766a;
        Uri uri = fVar.f10774z.f4562c;
        v1.n nVar = new v1.n(j10);
        this.f8523z.getClass();
        this.B.d(nVar, fVar.f10768c, this.f8502b, fVar.f10769d, fVar.f10770e, fVar.f10771f, fVar.f10772x, fVar.f10773y);
        if (!z9) {
            if (C() || this.V == 0) {
                G();
            }
            if (this.V > 0) {
                this.f8504c.s(this);
            }
        }
    }

    @Override // d2.r
    public final void s(d2.b0 b0Var) {
    }

    @Override // v1.x0
    public final void v(long j4) {
        int size;
        boolean s9;
        z1.o oVar = this.A;
        if (!oVar.d() && !C()) {
            boolean e10 = oVar.e();
            j jVar = this.f8506d;
            List list = this.F;
            if (e10) {
                this.L.getClass();
                w1.f fVar = this.L;
                if (jVar.o != null) {
                    s9 = false;
                } else {
                    s9 = jVar.f8456r.s(j4, fVar, list);
                }
                if (s9) {
                    oVar.a();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0) {
                int i10 = size2 - 1;
                if (jVar.b((l) list.get(i10)) != 2) {
                    break;
                } else {
                    size2 = i10;
                }
            }
            if (size2 < list.size()) {
                z(size2);
            }
            if (jVar.o == null && jVar.f8456r.length() >= 2) {
                size = jVar.f8456r.g(j4, list);
            } else {
                size = list.size();
            }
            if (size < this.E.size()) {
                z(size);
            }
        }
    }

    public final g1 x(f1[] f1VarArr) {
        for (int i10 = 0; i10 < f1VarArr.length; i10++) {
            f1 f1Var = f1VarArr[i10];
            c1.v[] vVarArr = new c1.v[f1Var.f1690a];
            for (int i11 = 0; i11 < f1Var.f1690a; i11++) {
                c1.v vVar = f1Var.f1693d[i11];
                int o = this.f8521x.o(vVar);
                c1.u a10 = vVar.a();
                a10.H = o;
                vVarArr[i11] = a10.a();
            }
            f1VarArr[i10] = new f1(f1Var.f1691b, vVarArr);
        }
        return new g1(f1VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(int r19) {
        /*
            r18 = this;
            r0 = r18
            z1.o r1 = r0.A
            boolean r1 = r1.e()
            r2 = 1
            r1 = r1 ^ r2
            w7.b.u(r1)
            r1 = r19
        Lf:
            java.util.ArrayList r3 = r0.E
            int r4 = r3.size()
            r5 = -1
            r6 = 0
            if (r1 >= r4) goto L55
            r4 = r1
        L1a:
            int r7 = r3.size()
            if (r4 >= r7) goto L2e
            java.lang.Object r7 = r3.get(r4)
            p1.l r7 = (p1.l) r7
            boolean r7 = r7.E
            if (r7 == 0) goto L2b
            goto L49
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            java.lang.Object r4 = r3.get(r1)
            p1.l r4 = (p1.l) r4
            r7 = r6
        L35:
            p1.s[] r8 = r0.M
            int r8 = r8.length
            if (r7 >= r8) goto L4e
            int r8 = r4.f(r7)
            p1.s[] r9 = r0.M
            r9 = r9[r7]
            int r10 = r9.f10549q
            int r9 = r9.f10551s
            int r10 = r10 + r9
            if (r10 <= r8) goto L4b
        L49:
            r4 = r6
            goto L4f
        L4b:
            int r7 = r7 + 1
            goto L35
        L4e:
            r4 = r2
        L4f:
            if (r4 == 0) goto L52
            goto L56
        L52:
            int r1 = r1 + 1
            goto Lf
        L55:
            r1 = r5
        L56:
            if (r1 != r5) goto L59
            return
        L59:
            p1.l r4 = r18.A()
            long r4 = r4.f10773y
            java.lang.Object r7 = r3.get(r1)
            p1.l r7 = (p1.l) r7
            int r8 = r3.size()
            f1.b0.T(r1, r8, r3)
            r1 = r6
        L6d:
            p1.s[] r8 = r0.M
            int r8 = r8.length
            if (r1 >= r8) goto L80
            int r8 = r7.f(r1)
            p1.s[] r9 = r0.M
            r9 = r9[r1]
            r9.l(r8)
            int r1 = r1 + 1
            goto L6d
        L80:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L8b
            long r1 = r0.f8512g0
            r0.f8513h0 = r1
            goto L93
        L8b:
            java.lang.Object r1 = r6.h0.X(r3)
            p1.l r1 = (p1.l) r1
            r1.f8462b0 = r2
        L93:
            r0.f8516k0 = r6
            int r10 = r0.R
            long r1 = r7.f10772x
            v1.b0 r3 = r0.B
            r3.getClass()
            v1.s r6 = new v1.s
            r9 = 1
            r11 = 0
            r12 = 3
            r13 = 0
            long r14 = f1.b0.c0(r1)
            long r16 = f1.b0.c0(r4)
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            r3.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.t.z(int):void");
    }
}
