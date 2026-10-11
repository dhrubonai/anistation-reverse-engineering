package y2;

import c1.u;
import c1.v;
import d2.g0;
import d2.p;
import d2.q;
import d2.r;
import d2.z;
import f.r0;
import f1.b0;
import f1.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final l f11550a;

    /* renamed from: c, reason: collision with root package name */
    public final v f11552c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11553d;

    /* renamed from: g, reason: collision with root package name */
    public g0 f11556g;

    /* renamed from: h, reason: collision with root package name */
    public int f11557h;

    /* renamed from: i, reason: collision with root package name */
    public int f11558i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f11559j;

    /* renamed from: k, reason: collision with root package name */
    public long f11560k;

    /* renamed from: b, reason: collision with root package name */
    public final w1.o f11551b = new w1.o(6);

    /* renamed from: f, reason: collision with root package name */
    public byte[] f11555f = b0.f3804f;

    /* renamed from: e, reason: collision with root package name */
    public final t f11554e = new t();

    public h(l lVar, v vVar) {
        this.f11550a = lVar;
        vVar.getClass();
        u uVar = new u(vVar);
        uVar.e("application/x-media3-cues");
        uVar.f1905i = vVar.f1935m;
        uVar.E = lVar.x();
        this.f11552c = new v(uVar);
        this.f11553d = new ArrayList();
        this.f11558i = 0;
        this.f11559j = b0.f3805g;
        this.f11560k = -9223372036854775807L;
    }

    @Override // d2.p
    public final void a() {
        if (this.f11558i == 5) {
            return;
        }
        this.f11550a.f();
        this.f11558i = 5;
    }

    public final void b(g gVar) {
        w7.b.w(this.f11556g);
        byte[] bArr = gVar.f11549b;
        int length = bArr.length;
        t tVar = this.f11554e;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
        this.f11556g.f(length, tVar);
        this.f11556g.d(gVar.f11548a, 1, length, 0, null);
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        boolean z9;
        int i10 = this.f11558i;
        if (i10 != 0 && i10 != 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        this.f11560k = j10;
        if (this.f11558i == 2) {
            this.f11558i = 1;
        }
        if (this.f11558i == 4) {
            this.f11558i = 3;
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        boolean z9;
        if (this.f11558i == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        g0 i10 = rVar.i(0, 3);
        this.f11556g = i10;
        i10.b(this.f11552c);
        rVar.b();
        rVar.s(new z(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f11558i = 1;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        return true;
    }

    @Override // d2.p
    public final int i(q qVar, d2.t tVar) {
        boolean z9;
        int i10;
        boolean z10;
        int f10;
        boolean z11;
        r0 r0Var;
        int i11;
        int i12 = this.f11558i;
        if (i12 != 0 && i12 != 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        if (this.f11558i == 1) {
            if (qVar.c() != -1) {
                i11 = com.bumptech.glide.d.m(qVar.c());
            } else {
                i11 = 1024;
            }
            if (i11 > this.f11555f.length) {
                this.f11555f = new byte[i11];
            }
            this.f11557h = 0;
            this.f11558i = 2;
        }
        int i13 = this.f11558i;
        ArrayList arrayList = this.f11553d;
        if (i13 == 2) {
            byte[] bArr = this.f11555f;
            if (bArr.length == this.f11557h) {
                this.f11555f = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f11555f;
            int i14 = this.f11557h;
            int p3 = qVar.p(bArr2, i14, bArr2.length - i14);
            if (p3 != -1) {
                this.f11557h += p3;
            }
            long c6 = qVar.c();
            if ((c6 != -1 && this.f11557h == c6) || p3 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                try {
                    long j4 = this.f11560k;
                    if (j4 != -9223372036854775807L) {
                        r0Var = new r0(j4, true);
                    } else {
                        r0Var = r0.f3774c;
                    }
                    this.f11550a.k(this.f11555f, r0Var, new w.f(this, 17));
                    Collections.sort(arrayList);
                    this.f11559j = new long[arrayList.size()];
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        this.f11559j[i15] = ((g) arrayList.get(i15)).f11548a;
                    }
                    this.f11555f = b0.f3804f;
                    this.f11558i = 4;
                } catch (RuntimeException e10) {
                    throw c1.r0.a("SubtitleParser failed.", e10);
                }
            }
        }
        if (this.f11558i == 3) {
            if (qVar.c() != -1) {
                i10 = com.bumptech.glide.d.m(qVar.c());
            } else {
                i10 = 1024;
            }
            if (qVar.a(i10) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j10 = this.f11560k;
                if (j10 == -9223372036854775807L) {
                    f10 = 0;
                } else {
                    f10 = b0.f(this.f11559j, j10, true);
                }
                while (f10 < arrayList.size()) {
                    b((g) arrayList.get(f10));
                    f10++;
                }
                this.f11558i = 4;
            }
        }
        if (this.f11558i != 4) {
            return 0;
        }
        return -1;
    }
}
