package v1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10451a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10452b;

    public k0(int i10, boolean z9) {
        this.f10451a = i10;
        this.f10452b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10451a == k0Var.f10451a && this.f10452b == k0Var.f10452b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10451a * 31) + (this.f10452b ? 1 : 0);
    }
}
