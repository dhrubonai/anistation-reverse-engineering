package y1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f11464a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11465b;

    public a(long j4, long j10) {
        this.f11464a = j4;
        this.f11465b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f11464a == aVar.f11464a && this.f11465b == aVar.f11465b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11464a) * 31) + ((int) this.f11465b);
    }
}
