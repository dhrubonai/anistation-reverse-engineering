package c1;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: e, reason: collision with root package name */
    public static final p1 f1878e = new p1(1.0f, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1881c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1882d;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
    }

    public p1(float f10, int i10, int i11, int i12) {
        this.f1879a = i10;
        this.f1880b = i11;
        this.f1881c = i12;
        this.f1882d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f1879a == p1Var.f1879a && this.f1880b == p1Var.f1880b && this.f1881c == p1Var.f1881c && this.f1882d == p1Var.f1882d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1882d) + ((((((217 + this.f1879a) * 31) + this.f1880b) * 31) + this.f1881c) * 31);
    }
}
