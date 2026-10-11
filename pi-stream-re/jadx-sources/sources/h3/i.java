package h3;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f1.t f4791a;

    /* renamed from: c, reason: collision with root package name */
    public final String f4793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4794d;

    /* renamed from: e, reason: collision with root package name */
    public String f4795e;

    /* renamed from: f, reason: collision with root package name */
    public d2.g0 f4796f;

    /* renamed from: h, reason: collision with root package name */
    public int f4798h;

    /* renamed from: i, reason: collision with root package name */
    public int f4799i;

    /* renamed from: j, reason: collision with root package name */
    public long f4800j;

    /* renamed from: k, reason: collision with root package name */
    public c1.v f4801k;

    /* renamed from: l, reason: collision with root package name */
    public int f4802l;

    /* renamed from: m, reason: collision with root package name */
    public int f4803m;

    /* renamed from: g, reason: collision with root package name */
    public int f4797g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f4805p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4792b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f4804n = -1;
    public int o = -1;

    public i(String str, int i10, int i11) {
        this.f4791a = new f1.t(new byte[i11]);
        this.f4793c = str;
        this.f4794d = i10;
    }

    @Override // h3.k
    public final void a() {
        this.f4797g = 0;
        this.f4798h = 0;
        this.f4799i = 0;
        this.f4805p = -9223372036854775807L;
        this.f4792b.set(0);
    }

    public final boolean b(int i10, f1.t tVar, byte[] bArr) {
        int min = Math.min(tVar.f3860c - tVar.f3859b, i10 - this.f4798h);
        tVar.d(bArr, this.f4798h, min);
        int i11 = this.f4798h + min;
        this.f4798h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void c(d2.a aVar) {
        int i10;
        c1.u uVar;
        int i11 = aVar.f3089b;
        if (i11 != -2147483647 && (i10 = aVar.f3090c) != -1) {
            c1.v vVar = this.f4801k;
            String str = aVar.f3088a;
            if (vVar == null || i10 != vVar.f1947z || i11 != vVar.A || !f1.b0.a(str, vVar.f1935m)) {
                c1.v vVar2 = this.f4801k;
                if (vVar2 == null) {
                    uVar = new c1.u();
                } else {
                    uVar = new c1.u(vVar2);
                }
                uVar.f1897a = this.f4795e;
                uVar.e(str);
                uVar.f1920y = i10;
                uVar.f1921z = i11;
                uVar.f1900d = this.f4793c;
                uVar.f1902f = this.f4794d;
                c1.v vVar3 = new c1.v(uVar);
                this.f4801k = vVar3;
                this.f4796f.b(vVar3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0291, code lost:
    
        throw c1.r0.c("Multiple audio presentations or assets not supported");
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0480  */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r30) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.i.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4805p = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4795e = i0Var.f4810e;
        i0Var.b();
        this.f4796f = rVar.i(i0Var.f4809d, 1);
    }

    @Override // h3.k
    public final void g() {
    }
}
