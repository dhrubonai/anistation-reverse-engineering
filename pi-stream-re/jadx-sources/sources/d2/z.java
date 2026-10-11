package d2;

/* loaded from: classes.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3212a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3213b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3214c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3215d;

    public z(long[] jArr, long[] jArr2, long j4) {
        boolean z9;
        boolean z10;
        if (jArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        int length = jArr2.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3215d = z10;
        if (z10 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f3212a = jArr3;
            long[] jArr4 = new long[i10];
            this.f3213b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f3212a = jArr;
            this.f3213b = jArr2;
        }
        this.f3214c = j4;
    }

    @Override // d2.b0
    public final boolean g() {
        return this.f3215d;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        if (!this.f3215d) {
            c0 c0Var = c0.f3111c;
            return new a0(c0Var, c0Var);
        }
        long[] jArr = this.f3213b;
        int f10 = f1.b0.f(jArr, j4, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f3212a;
        c0 c0Var2 = new c0(j10, jArr2[f10]);
        if (j10 != j4 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new a0(c0Var2, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override // d2.b0
    public final long l() {
        return this.f3214c;
    }
}
