package j1;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.w f5874a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5875b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5876c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5877d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5878e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5879f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5880g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5881h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5882i;

    public q0(v1.w wVar, long j4, long j10, long j11, long j12, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (z12 && !z10) {
            z13 = false;
        } else {
            z13 = true;
        }
        w7.b.g(z13);
        if (z11 && !z10) {
            z14 = false;
        } else {
            z14 = true;
        }
        w7.b.g(z14);
        if (!z9 || (!z10 && !z11 && !z12)) {
            z15 = true;
        }
        w7.b.g(z15);
        this.f5874a = wVar;
        this.f5875b = j4;
        this.f5876c = j10;
        this.f5877d = j11;
        this.f5878e = j12;
        this.f5879f = z9;
        this.f5880g = z10;
        this.f5881h = z11;
        this.f5882i = z12;
    }

    public final q0 a(long j4) {
        if (j4 == this.f5876c) {
            return this;
        }
        return new q0(this.f5874a, this.f5875b, j4, this.f5877d, this.f5878e, this.f5879f, this.f5880g, this.f5881h, this.f5882i);
    }

    public final q0 b(long j4) {
        if (j4 == this.f5875b) {
            return this;
        }
        return new q0(this.f5874a, j4, this.f5876c, this.f5877d, this.f5878e, this.f5879f, this.f5880g, this.f5881h, this.f5882i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f5875b == q0Var.f5875b && this.f5876c == q0Var.f5876c && this.f5877d == q0Var.f5877d && this.f5878e == q0Var.f5878e && this.f5879f == q0Var.f5879f && this.f5880g == q0Var.f5880g && this.f5881h == q0Var.f5881h && this.f5882i == q0Var.f5882i && f1.b0.a(this.f5874a, q0Var.f5874a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f5874a.hashCode() + 527) * 31) + ((int) this.f5875b)) * 31) + ((int) this.f5876c)) * 31) + ((int) this.f5877d)) * 31) + ((int) this.f5878e)) * 31) + (this.f5879f ? 1 : 0)) * 31) + (this.f5880g ? 1 : 0)) * 31) + (this.f5881h ? 1 : 0)) * 31) + (this.f5882i ? 1 : 0);
    }
}
