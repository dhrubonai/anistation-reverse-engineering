package i3;

import a3.g;
import c1.r0;
import c1.u;
import c1.v;
import d2.g0;
import d2.q;
import d2.r;
import f1.b0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r f5324a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f5325b;

    /* renamed from: c, reason: collision with root package name */
    public final d2.b f5326c;

    /* renamed from: d, reason: collision with root package name */
    public final v f5327d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5328e;

    /* renamed from: f, reason: collision with root package name */
    public long f5329f;

    /* renamed from: g, reason: collision with root package name */
    public int f5330g;

    /* renamed from: h, reason: collision with root package name */
    public long f5331h;

    public c(r rVar, g0 g0Var, d2.b bVar, String str, int i10) {
        this.f5324a = rVar;
        this.f5325b = g0Var;
        this.f5326c = bVar;
        int i11 = (bVar.f3095c * bVar.f3099g) / 8;
        if (bVar.f3098f == i11) {
            int i12 = bVar.f3096d * i11;
            int i13 = i12 * 8;
            int max = Math.max(i11, i12 / 10);
            this.f5328e = max;
            u k10 = g.k(str);
            k10.f1903g = i13;
            k10.f1904h = i13;
            k10.f1909m = max;
            k10.f1920y = bVar.f3095c;
            k10.f1921z = bVar.f3096d;
            k10.A = i10;
            this.f5327d = new v(k10);
            return;
        }
        StringBuilder u9 = g.u("Expected block size: ", i11, "; got: ");
        u9.append(bVar.f3098f);
        throw r0.a(u9.toString(), null);
    }

    @Override // i3.b
    public final boolean a(q qVar, long j4) {
        int i10;
        int i11;
        long j10 = j4;
        while (j10 > 0 && (i10 = this.f5330g) < (i11 = this.f5328e)) {
            int c6 = this.f5325b.c(qVar, (int) Math.min(i11 - i10, j10), true);
            if (c6 == -1) {
                j10 = 0;
            } else {
                this.f5330g += c6;
                j10 -= c6;
            }
        }
        int i12 = this.f5326c.f3098f;
        int i13 = this.f5330g / i12;
        if (i13 > 0) {
            long V = this.f5329f + b0.V(this.f5331h, 1000000L, r1.f3096d);
            int i14 = i13 * i12;
            int i15 = this.f5330g - i14;
            this.f5325b.d(V, 1, i14, i15, null);
            this.f5331h += i13;
            this.f5330g = i15;
        }
        if (j10 <= 0) {
            return true;
        }
        return false;
    }

    @Override // i3.b
    public final void b(int i10, long j4) {
        this.f5324a.s(new e(this.f5326c, 1, i10, j4));
        this.f5325b.b(this.f5327d);
    }

    @Override // i3.b
    public final void c(long j4) {
        this.f5329f = j4;
        this.f5330g = 0;
        this.f5331h = 0L;
    }
}
