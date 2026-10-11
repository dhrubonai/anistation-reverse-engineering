package j1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5835a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5836b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5837c;

    public n0(m0 m0Var) {
        this.f5835a = m0Var.f5830a;
        this.f5836b = m0Var.f5831b;
        this.f5837c = m0Var.f5832c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f5835a == n0Var.f5835a && this.f5836b == n0Var.f5836b && this.f5837c == n0Var.f5837c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5835a), Float.valueOf(this.f5836b), Long.valueOf(this.f5837c)});
    }
}
