package j1;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f5808c;

    /* renamed from: a, reason: collision with root package name */
    public final long f5809a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5810b;

    static {
        j1 j1Var = new j1(0L, 0L);
        new j1(Long.MAX_VALUE, Long.MAX_VALUE);
        new j1(Long.MAX_VALUE, 0L);
        new j1(0L, Long.MAX_VALUE);
        f5808c = j1Var;
    }

    public j1(long j4, long j10) {
        boolean z9;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        w7.b.g(j10 >= 0);
        this.f5809a = j4;
        this.f5810b = j10;
    }

    public final long a(long j4, long j10, long j11) {
        boolean z9;
        long j12 = this.f5809a;
        long j13 = this.f5810b;
        if (j12 == 0 && j13 == 0) {
            return j4;
        }
        int i10 = f1.b0.f3799a;
        long j14 = j4 - j12;
        if (((j12 ^ j4) & (j4 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j4 + j13;
        if (((j13 ^ j15) & (j4 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z10 = true;
        if (j14 <= j10 && j10 <= j15) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (j14 > j11 || j11 > j15) {
            z10 = false;
        }
        if (z9 && z10) {
            if (Math.abs(j10 - j4) <= Math.abs(j11 - j4)) {
                return j10;
            }
            return j11;
        }
        if (z9) {
            return j10;
        }
        if (z10) {
            return j11;
        }
        return j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f5809a == j1Var.f5809a && this.f5810b == j1Var.f5810b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5809a) * 31) + ((int) this.f5810b);
    }
}
