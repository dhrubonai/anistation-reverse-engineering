package b4;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f1489a;

    public r(String str) {
        this.f1489a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f1489a.equals(((r) obj).f1489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1489a.hashCode();
    }

    public final String toString() {
        return a3.g.t(new StringBuilder("StringHeaderFactory{value='"), this.f1489a, "'}");
    }
}
