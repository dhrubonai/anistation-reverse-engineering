package c1;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final i1 f1719d = new i1(new h1());

    /* renamed from: a, reason: collision with root package name */
    public final int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1722c;

    static {
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
    }

    public i1(h1 h1Var) {
        this.f1720a = h1Var.f1708a;
        this.f1721b = h1Var.f1709b;
        this.f1722c = h1Var.f1710c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f1720a == i1Var.f1720a && this.f1721b == i1Var.f1721b && this.f1722c == i1Var.f1722c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1720a + 31) * 31) + (this.f1721b ? 1 : 0)) * 31) + (this.f1722c ? 1 : 0);
    }
}
