package c1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1768a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1769b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f1770c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f1771d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f1772e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f1773f;

    static {
        new y().a();
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f1768a = str;
        this.f1769b = f0Var;
        this.f1770c = e0Var;
        this.f1771d = n0Var;
        this.f1772e = a0Var;
        this.f1773f = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (f1.b0.a(this.f1768a, k0Var.f1768a) && this.f1772e.equals(k0Var.f1772e) && f1.b0.a(this.f1769b, k0Var.f1769b) && f1.b0.a(this.f1770c, k0Var.f1770c) && f1.b0.a(this.f1771d, k0Var.f1771d) && f1.b0.a(this.f1773f, k0Var.f1773f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1768a.hashCode() * 31;
        f0 f0Var = this.f1769b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        return this.f1773f.hashCode() + ((this.f1771d.hashCode() + ((this.f1772e.hashCode() + ((this.f1770c.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
