package c1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1674d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1675e;

    static {
        new e0(new d0());
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
    }

    public e0(d0 d0Var) {
        long j4 = d0Var.f1648a;
        long j10 = d0Var.f1649b;
        long j11 = d0Var.f1650c;
        float f10 = d0Var.f1651d;
        float f11 = d0Var.f1652e;
        this.f1671a = j4;
        this.f1672b = j10;
        this.f1673c = j11;
        this.f1674d = f10;
        this.f1675e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f1671a == e0Var.f1671a && this.f1672b == e0Var.f1672b && this.f1673c == e0Var.f1673c && this.f1674d == e0Var.f1674d && this.f1675e == e0Var.f1675e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j4 = this.f1671a;
        long j10 = this.f1672b;
        int i11 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1673c;
        int i12 = (i11 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.f1674d;
        int i13 = 0;
        if (f10 != 0.0f) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        float f11 = this.f1675e;
        if (f11 != 0.0f) {
            i13 = Float.floatToIntBits(f11);
        }
        return i14 + i13;
    }
}
