package c1;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f1972a;

    static {
        new z(new androidx.lifecycle.q0());
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
    }

    public z(androidx.lifecycle.q0 q0Var) {
        q0Var.getClass();
        f1.b0.c0(0L);
        f1.b0.c0(Long.MIN_VALUE);
        this.f1972a = Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        zVar.getClass();
        if (this.f1972a == zVar.f1972a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1972a;
        return (((((((((int) 0) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + 0) * 31) + 0) * 31) + 0;
    }
}
