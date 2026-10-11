package y1;

import android.text.TextUtils;
import c1.f1;
import c1.i1;
import f1.b0;
import r6.e0;
import r6.l1;
import r6.m1;
import r6.o0;
import r6.u1;

/* loaded from: classes.dex */
public final class f extends n implements Comparable {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;

    /* renamed from: e, reason: collision with root package name */
    public final int f11491e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11492f;

    /* renamed from: x, reason: collision with root package name */
    public final String f11493x;

    /* renamed from: y, reason: collision with root package name */
    public final j f11494y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f11495z;

    public f(int i10, f1 f1Var, int i11, j jVar, int i12, boolean z9, e eVar, int i13) {
        super(i10, i11, f1Var);
        int i14;
        boolean z10;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        this.f11494y = jVar;
        if (jVar.L) {
            i14 = 24;
        } else {
            i14 = 16;
        }
        int i18 = 1;
        int i19 = 0;
        if (jVar.H && (i13 & i14) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        this.f11493x = p.j(this.f11509d.f1926d);
        this.f11495z = p.h(i12, false);
        int i20 = 0;
        while (true) {
            o0 o0Var = jVar.f1787n;
            int size = o0Var.size();
            i15 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i20 < size) {
                i16 = p.f(this.f11509d, (String) o0Var.get(i20), false);
                if (i16 > 0) {
                    break;
                } else {
                    i20++;
                }
            } else {
                i16 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            }
        }
        this.B = i20;
        this.A = i16;
        this.C = p.b(this.f11509d.f1928f, jVar.o);
        c1.v vVar = this.f11509d;
        int i21 = vVar.f1928f;
        if (i21 != 0 && (i21 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.E = z11;
        if ((vVar.f1927e & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.H = z12;
        int i22 = vVar.f1947z;
        this.I = i22;
        this.J = vVar.A;
        int i23 = vVar.f1931i;
        this.K = i23;
        if ((i23 == -1 || i23 <= jVar.f1789q) && ((i22 == -1 || i22 <= jVar.f1788p) && eVar.apply(vVar))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f11492f = z13;
        String[] D = b0.D();
        int i24 = 0;
        while (true) {
            if (i24 < D.length) {
                i17 = p.f(this.f11509d, D[i24], false);
                if (i17 > 0) {
                    break;
                } else {
                    i24++;
                }
            } else {
                i17 = 0;
                i24 = Integer.MAX_VALUE;
                break;
            }
        }
        this.F = i24;
        this.G = i17;
        int i25 = 0;
        while (true) {
            o0 o0Var2 = jVar.f1790r;
            if (i25 < o0Var2.size()) {
                String str = this.f11509d.f1935m;
                if (str != null && str.equals(o0Var2.get(i25))) {
                    i15 = i25;
                    break;
                }
                i25++;
            } else {
                break;
            }
        }
        this.L = i15;
        if (a3.g.f(i12) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.M = z14;
        if (a3.g.g(i12) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.N = z15;
        j jVar2 = this.f11494y;
        if (p.h(i12, jVar2.N) && ((z16 = this.f11492f) || jVar2.G)) {
            i1 i1Var = jVar2.f1791s;
            int i26 = i1Var.f1720a;
            c1.v vVar2 = this.f11509d;
            if (i26 != 2 || p.l(jVar2, i12, vVar2)) {
                if (p.h(i12, false) && z16 && vVar2.f1931i != -1 && !jVar2.f1798z && !jVar2.f1797y && ((jVar2.P || !z9) && i1Var.f1720a != 2 && (i14 & i12) != 0)) {
                    i18 = 2;
                }
                i19 = i18;
            }
        }
        this.f11491e = i19;
    }

    @Override // y1.n
    public final int a() {
        return this.f11491e;
    }

    @Override // y1.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        f fVar = (f) nVar;
        j jVar = this.f11494y;
        boolean z9 = jVar.J;
        c1.v vVar = fVar.f11509d;
        c1.v vVar2 = this.f11509d;
        if ((z9 || ((i11 = vVar2.f1947z) != -1 && i11 == vVar.f1947z)) && ((this.D || ((str = vVar2.f1935m) != null && TextUtils.equals(str, vVar.f1935m))) && (jVar.I || ((i10 = vVar2.A) != -1 && i10 == vVar.A)))) {
            if (!jVar.K) {
                if (this.M != fVar.M || this.N != fVar.N) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        m1 a10;
        m1 m1Var;
        boolean z9 = this.f11495z;
        boolean z10 = this.f11492f;
        if (z10 && z9) {
            a10 = p.f11515j;
        } else {
            a10 = p.f11515j.a();
        }
        e0 c6 = e0.f9450a.c(z9, fVar.f11495z);
        Integer valueOf = Integer.valueOf(this.B);
        Integer valueOf2 = Integer.valueOf(fVar.B);
        l1.f9489a.getClass();
        u1 u1Var = u1.f9551a;
        e0 b10 = c6.b(valueOf, valueOf2, u1Var).a(this.A, fVar.A).a(this.C, fVar.C).c(this.H, fVar.H).c(this.E, fVar.E).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), u1Var).a(this.G, fVar.G).c(z10, fVar.f11492f).b(Integer.valueOf(this.L), Integer.valueOf(fVar.L), u1Var);
        int i10 = this.K;
        Integer valueOf3 = Integer.valueOf(i10);
        int i11 = fVar.K;
        Integer valueOf4 = Integer.valueOf(i11);
        if (this.f11494y.f1797y) {
            m1Var = p.f11515j.a();
        } else {
            m1Var = p.f11516k;
        }
        e0 b11 = b10.b(valueOf3, valueOf4, m1Var).c(this.M, fVar.M).c(this.N, fVar.N).b(Integer.valueOf(this.I), Integer.valueOf(fVar.I), a10).b(Integer.valueOf(this.J), Integer.valueOf(fVar.J), a10);
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(i11);
        if (!b0.a(this.f11493x, fVar.f11493x)) {
            a10 = p.f11516k;
        }
        return b11.b(valueOf5, valueOf6, a10).e();
    }
}
