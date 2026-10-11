package p6;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f8623a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8624b;

    public k(int i10, long j4) {
        this.f8623a = i10;
        this.f8624b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f8623a == kVar.f8623a && this.f8624b == kVar.f8624b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8623a ^ 1000003;
        long j4 = this.f8624b;
        return (i10 * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f8623a + ", eventTimestamp=" + this.f8624b + "}";
    }
}
