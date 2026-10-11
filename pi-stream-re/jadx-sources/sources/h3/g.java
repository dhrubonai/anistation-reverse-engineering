package h3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f4746w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4747a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4751e;

    /* renamed from: f, reason: collision with root package name */
    public String f4752f;

    /* renamed from: g, reason: collision with root package name */
    public d2.g0 f4753g;

    /* renamed from: h, reason: collision with root package name */
    public d2.g0 f4754h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4758l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4759m;

    /* renamed from: p, reason: collision with root package name */
    public int f4761p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4762q;

    /* renamed from: s, reason: collision with root package name */
    public int f4764s;

    /* renamed from: u, reason: collision with root package name */
    public d2.g0 f4766u;

    /* renamed from: v, reason: collision with root package name */
    public long f4767v;

    /* renamed from: b, reason: collision with root package name */
    public final f1.s f4748b = new f1.s(new byte[7], 0, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final f1.t f4749c = new f1.t(Arrays.copyOf(f4746w, 10));

    /* renamed from: i, reason: collision with root package name */
    public int f4755i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f4756j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4757k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f4760n = -1;
    public int o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f4763r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f4765t = -9223372036854775807L;

    public g(String str, int i10, boolean z9) {
        this.f4747a = z9;
        this.f4750d = str;
        this.f4751e = i10;
    }

    @Override // h3.k
    public final void a() {
        this.f4765t = -9223372036854775807L;
        this.f4759m = false;
        this.f4755i = 0;
        this.f4756j = 0;
        this.f4757k = 256;
    }

    public final boolean b(int i10, f1.t tVar, byte[] bArr) {
        int min = Math.min(tVar.f3860c - tVar.f3859b, i10 - this.f4756j);
        tVar.d(bArr, this.f4756j, min);
        int i11 = this.f4756j + min;
        this.f4756j = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0281, code lost:
    
        if (r9[r8] != 51) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0264, code lost:
    
        if (((r8 & 8) >> 3) == r7) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0288 A[EDGE_INSN: B:47:0x0288->B:48:0x0288 BREAK  A[LOOP:1: B:8:0x019d->B:36:0x02f8], SYNTHETIC] */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r23) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.g.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4765t = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4752f = i0Var.f4810e;
        i0Var.b();
        d2.g0 i10 = rVar.i(i0Var.f4809d, 1);
        this.f4753g = i10;
        this.f4766u = i10;
        if (this.f4747a) {
            i0Var.a();
            i0Var.b();
            d2.g0 i11 = rVar.i(i0Var.f4809d, 5);
            this.f4754h = i11;
            c1.u uVar = new c1.u();
            i0Var.b();
            uVar.f1897a = i0Var.f4810e;
            uVar.e("application/id3");
            i11.b(new c1.v(uVar));
            return;
        }
        this.f4754h = new d2.o();
    }

    @Override // h3.k
    public final void g() {
    }
}
