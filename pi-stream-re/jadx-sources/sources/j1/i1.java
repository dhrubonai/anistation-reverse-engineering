package j1;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f5789c = new i1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f5790a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5791b;

    public i1(int i10, boolean z9) {
        this.f5790a = i10;
        this.f5791b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f5790a == i1Var.f5790a && this.f5791b == i1Var.f5791b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5790a << 1) + (this.f5791b ? 1 : 0);
    }
}
