package d2;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f3091a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f3092b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f3091a = c0Var;
        this.f3092b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f3091a.equals(a0Var.f3091a) && this.f3092b.equals(a0Var.f3092b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3092b.hashCode() + (this.f3091a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        c0 c0Var = this.f3091a;
        sb.append(c0Var);
        c0 c0Var2 = this.f3092b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a3.g.t(sb, str, "]");
    }
}
