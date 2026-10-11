package i3;

import d2.g0;
import d2.p;
import d2.q;
import d2.r;
import q6.g;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f5332a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f5333b;

    /* renamed from: e, reason: collision with root package name */
    public b f5336e;

    /* renamed from: c, reason: collision with root package name */
    public int f5334c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f5335d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f5337f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5338g = -1;

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        int i10;
        if (j4 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f5334c = i10;
        b bVar = this.f5336e;
        if (bVar != null) {
            bVar.c(j10);
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f5332a = rVar;
        this.f5333b = rVar.i(0, 1);
        rVar.b();
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        return g.g(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0180, code lost:
    
        if (r2 != 65534) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0185, code lost:
    
        if (r3 == 32) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r27, d2.t r28) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.d.i(d2.q, d2.t):int");
    }
}
