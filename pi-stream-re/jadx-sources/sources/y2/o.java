package y2;

import c1.q0;
import c1.u;
import c1.v;
import d2.f0;
import d2.g0;
import f.r0;
import f1.b0;
import f1.t;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class o implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f11570a;

    /* renamed from: b, reason: collision with root package name */
    public final k f11571b;

    /* renamed from: h, reason: collision with root package name */
    public l f11577h;

    /* renamed from: i, reason: collision with root package name */
    public v f11578i;

    /* renamed from: c, reason: collision with root package name */
    public final w1.o f11572c = new w1.o(6);

    /* renamed from: e, reason: collision with root package name */
    public int f11574e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f11575f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f11576g = b0.f3804f;

    /* renamed from: d, reason: collision with root package name */
    public final t f11573d = new t();

    public o(g0 g0Var, k kVar) {
        this.f11570a = g0Var;
        this.f11571b = kVar;
    }

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        if (this.f11577h == null) {
            return this.f11570a.a(lVar, i10, z9);
        }
        g(i10);
        int p3 = lVar.p(this.f11576g, this.f11575f, i10);
        if (p3 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f11575f += p3;
        return p3;
    }

    @Override // d2.g0
    public final void b(v vVar) {
        boolean z9;
        l lVar;
        vVar.f1935m.getClass();
        String str = vVar.f1935m;
        if (q0.i(str) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        boolean equals = vVar.equals(this.f11578i);
        k kVar = this.f11571b;
        if (!equals) {
            this.f11578i = vVar;
            w1.o oVar = (w1.o) kVar;
            if (oVar.w(vVar)) {
                lVar = oVar.r(vVar);
            } else {
                lVar = null;
            }
            this.f11577h = lVar;
        }
        l lVar2 = this.f11577h;
        g0 g0Var = this.f11570a;
        if (lVar2 == null) {
            g0Var.b(vVar);
            return;
        }
        u uVar = new u(vVar);
        uVar.e("application/x-media3-cues");
        uVar.f1905i = str;
        uVar.f1911p = Long.MAX_VALUE;
        uVar.E = ((w1.o) kVar).t(vVar);
        g0Var.b(new v(uVar));
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
        boolean z9;
        if (this.f11577h == null) {
            this.f11570a.d(j4, i10, i11, i12, f0Var);
            return;
        }
        if (f0Var == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.f("DRM on subtitles is not supported", z9);
        int i13 = (this.f11575f - i12) - i11;
        this.f11577h.o(this.f11576g, i13, i11, r0.f3774c, new k1.d(i10, 2, j4, this));
        int i14 = i13 + i11;
        this.f11574e = i14;
        if (i14 == this.f11575f) {
            this.f11574e = 0;
            this.f11575f = 0;
        }
    }

    @Override // d2.g0
    public final void e(int i10, int i11, t tVar) {
        if (this.f11577h == null) {
            this.f11570a.e(i10, i11, tVar);
            return;
        }
        g(i10);
        tVar.d(this.f11576g, this.f11575f, i10);
        this.f11575f += i10;
    }

    @Override // d2.g0
    public final void f(int i10, t tVar) {
        e(i10, 0, tVar);
    }

    public final void g(int i10) {
        byte[] bArr;
        int length = this.f11576g.length;
        int i11 = this.f11575f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f11574e;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr2 = this.f11576g;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.f11574e, bArr, 0, i12);
        this.f11574e = 0;
        this.f11575f = i12;
        this.f11576g = bArr;
    }
}
