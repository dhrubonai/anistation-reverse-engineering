package n1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f7976a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7977b;

    public q(long j4, long j10) {
        this.f7976a = j4;
        this.f7977b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f7976a == qVar.f7976a && this.f7977b == qVar.f7977b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7976a) * 31) + ((int) this.f7977b);
    }
}
