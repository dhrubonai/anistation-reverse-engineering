package c1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final g f1695g = new g(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1698c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1700e;

    /* renamed from: f, reason: collision with root package name */
    public f.p0 f1701f;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
    }

    public g(int i10, int i11, int i12, int i13, int i14) {
        this.f1696a = i10;
        this.f1697b = i11;
        this.f1698c = i12;
        this.f1699d = i13;
        this.f1700e = i14;
    }

    public final f.p0 a() {
        if (this.f1701f == null) {
            this.f1701f = new f.p0(this, 0);
        }
        return this.f1701f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1696a == gVar.f1696a && this.f1697b == gVar.f1697b && this.f1698c == gVar.f1698c && this.f1699d == gVar.f1699d && this.f1700e == gVar.f1700e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f1696a) * 31) + this.f1697b) * 31) + this.f1698c) * 31) + this.f1699d) * 31) + this.f1700e;
    }
}
