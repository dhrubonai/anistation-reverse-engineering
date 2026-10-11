package v2;

import d2.a0;
import d2.c0;
import f1.b0;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f10619a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10621c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10622d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10623e;

    public g(long[] jArr, long[] jArr2, long j4, long j10, int i10) {
        this.f10619a = jArr;
        this.f10620b = jArr2;
        this.f10621c = j4;
        this.f10622d = j10;
        this.f10623e = i10;
    }

    @Override // v2.f
    public final long b(long j4) {
        return this.f10619a[b0.f(this.f10620b, j4, true)];
    }

    @Override // v2.f
    public final long d() {
        return this.f10622d;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        long[] jArr = this.f10619a;
        int f10 = b0.f(jArr, j4, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f10620b;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j4 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override // v2.f
    public final int k() {
        return this.f10623e;
    }

    @Override // d2.b0
    public final long l() {
        return this.f10621c;
    }
}
