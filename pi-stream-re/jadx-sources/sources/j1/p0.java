package j1;

import android.util.Pair;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.u f5857a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5858b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.v0[] f5859c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5860d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5861e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f5862f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5863g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f5864h;

    /* renamed from: i, reason: collision with root package name */
    public final e[] f5865i;

    /* renamed from: j, reason: collision with root package name */
    public final y1.v f5866j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f5867k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f5868l;

    /* renamed from: m, reason: collision with root package name */
    public v1.g1 f5869m;

    /* renamed from: n, reason: collision with root package name */
    public y1.w f5870n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [v1.d] */
    public p0(e[] eVarArr, long j4, y1.v vVar, z1.d dVar, a1 a1Var, q0 q0Var, y1.w wVar) {
        this.f5865i = eVarArr;
        this.o = j4;
        this.f5866j = vVar;
        this.f5867k = a1Var;
        v1.w wVar2 = q0Var.f5874a;
        this.f5858b = wVar2.f10559a;
        this.f5862f = q0Var;
        this.f5869m = v1.g1.f10431d;
        this.f5870n = wVar;
        this.f5859c = new v1.v0[eVarArr.length];
        this.f5864h = new boolean[eVarArr.length];
        a1Var.getClass();
        int i10 = f1.f5735k;
        Pair pair = (Pair) wVar2.f10559a;
        Object obj = pair.first;
        v1.w a10 = wVar2.a(pair.second);
        z0 z0Var = (z0) a1Var.f5622d.get(obj);
        z0Var.getClass();
        a1Var.f5625g.add(z0Var);
        y0 y0Var = (y0) a1Var.f5624f.get(z0Var);
        if (y0Var != null) {
            y0Var.f5929a.e(y0Var.f5930b);
        }
        z0Var.f5935c.add(a10);
        v1.o b10 = z0Var.f5933a.b(a10, dVar, q0Var.f5875b);
        a1Var.f5621c.put(b10, z0Var);
        a1Var.c();
        long j10 = q0Var.f5877d;
        this.f5857a = j10 != -9223372036854775807L ? new v1.d(b10, j10) : b10;
    }

    public final long a(y1.w wVar, long j4, boolean z9, boolean[] zArr) {
        e[] eVarArr;
        v1.v0[] v0VarArr;
        boolean z10;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= wVar.f11535a) {
                break;
            }
            if (z9 || !wVar.a(this.f5870n, i10)) {
                z11 = false;
            }
            this.f5864h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            eVarArr = this.f5865i;
            int length = eVarArr.length;
            v0VarArr = this.f5859c;
            if (i11 >= length) {
                break;
            }
            if (eVarArr[i11].f5707b == -2) {
                v0VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f5870n = wVar;
        c();
        long l10 = this.f5857a.l(wVar.f11537c, this.f5864h, this.f5859c, zArr, j4);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].f5707b == -2 && this.f5870n.b(i12)) {
                v0VarArr[i12] = new v1.k();
            }
        }
        this.f5861e = false;
        for (int i13 = 0; i13 < v0VarArr.length; i13++) {
            if (v0VarArr[i13] != null) {
                w7.b.u(wVar.b(i13));
                if (eVarArr[i13].f5707b != -2) {
                    this.f5861e = true;
                }
            } else {
                if (wVar.f11537c[i13] == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w7.b.u(z10);
            }
        }
        return l10;
    }

    public final void b() {
        boolean z9;
        int i10 = 0;
        if (this.f5868l == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        while (true) {
            y1.w wVar = this.f5870n;
            if (i10 < wVar.f11535a) {
                boolean b10 = wVar.b(i10);
                y1.s sVar = this.f5870n.f11537c[i10];
                if (b10 && sVar != null) {
                    sVar.i();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z9;
        int i10 = 0;
        if (this.f5868l == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        while (true) {
            y1.w wVar = this.f5870n;
            if (i10 < wVar.f11535a) {
                boolean b10 = wVar.b(i10);
                y1.s sVar = this.f5870n.f11537c[i10];
                if (b10 && sVar != null) {
                    sVar.e();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j4;
        if (!this.f5860d) {
            return this.f5862f.f5875b;
        }
        if (this.f5861e) {
            j4 = this.f5857a.o();
        } else {
            j4 = Long.MIN_VALUE;
        }
        if (j4 == Long.MIN_VALUE) {
            return this.f5862f.f5878e;
        }
        return j4;
    }

    public final long e() {
        return this.f5862f.f5875b + this.o;
    }

    public final boolean f() {
        if (this.f5860d && (!this.f5861e || this.f5857a.o() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public final void g() {
        b();
        v1.u uVar = this.f5857a;
        try {
            boolean z9 = uVar instanceof v1.d;
            a1 a1Var = this.f5867k;
            if (z9) {
                a1Var.f(((v1.d) uVar).f10384a);
            } else {
                a1Var.f(uVar);
            }
        } catch (RuntimeException e10) {
            f1.o.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x03c7, code lost:
    
        if (r9 != 2) goto L202;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y1.w h(float r28, c1.e1 r29) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.p0.h(float, c1.e1):y1.w");
    }

    public final void i() {
        v1.u uVar = this.f5857a;
        if (uVar instanceof v1.d) {
            long j4 = this.f5862f.f5877d;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            v1.d dVar = (v1.d) uVar;
            dVar.f10388e = 0L;
            dVar.f10389f = j4;
        }
    }
}
