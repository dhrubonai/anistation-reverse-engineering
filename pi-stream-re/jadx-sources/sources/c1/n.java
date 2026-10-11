package c1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1838b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1840d;

    static {
        boolean z9;
        m mVar = new m();
        if (mVar.f1807b <= mVar.f1808c) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        new n(mVar);
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
    }

    public n(m mVar) {
        this.f1837a = mVar.f1806a;
        this.f1838b = mVar.f1807b;
        this.f1839c = mVar.f1808c;
        this.f1840d = (String) mVar.f1809d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f1837a == nVar.f1837a && this.f1838b == nVar.f1838b && this.f1839c == nVar.f1839c && f1.b0.a(this.f1840d, nVar.f1840d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f1837a) * 31) + this.f1838b) * 31) + this.f1839c) * 31;
        String str = this.f1840d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
