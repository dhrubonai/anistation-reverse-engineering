package d2;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f3111c = new c0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3113b;

    public c0(long j4, long j10) {
        this.f3112a = j4;
        this.f3113b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f3112a == c0Var.f3112a && this.f3113b == c0Var.f3113b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3112a) * 31) + ((int) this.f3113b);
    }

    public final String toString() {
        return "[timeUs=" + this.f3112a + ", position=" + this.f3113b + "]";
    }
}
