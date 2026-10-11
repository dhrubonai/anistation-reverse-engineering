package x2;

import androidx.appcompat.widget.a0;
import d2.b0;
import d2.q;
import d2.u;
import d2.v;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f11095a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f11096b;

    /* renamed from: c, reason: collision with root package name */
    public long f11097c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f11098d = -1;

    public c(v vVar, a0 a0Var) {
        this.f11095a = vVar;
        this.f11096b = a0Var;
    }

    @Override // x2.h
    public final b0 g() {
        boolean z9;
        if (this.f11097c != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        return new u(this.f11095a, 0, this.f11097c);
    }

    @Override // x2.h
    public final long m(q qVar) {
        long j4 = this.f11098d;
        if (j4 < 0) {
            return -1L;
        }
        long j10 = -(j4 + 2);
        this.f11098d = -1L;
        return j10;
    }

    @Override // x2.h
    public final void t(long j4) {
        long[] jArr = (long[]) this.f11096b.f403b;
        this.f11098d = jArr[f1.b0.f(jArr, j4, true)];
    }
}
