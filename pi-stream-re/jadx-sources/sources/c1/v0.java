package c1;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f1948a;

    static {
        new r(0).b();
        f1.b0.J(0);
    }

    public v0(s sVar) {
        this.f1948a = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        return this.f1948a.equals(((v0) obj).f1948a);
    }

    public final int hashCode() {
        return this.f1948a.hashCode();
    }
}
