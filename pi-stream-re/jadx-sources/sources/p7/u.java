package p7;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8746a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.l f8747b;

    public u(Object obj, h7.l lVar) {
        this.f8746a = obj;
        this.f8747b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r6.h0.g(this.f8746a, uVar.f8746a) && r6.h0.g(this.f8747b, uVar.f8747b);
    }

    public final int hashCode() {
        Object obj = this.f8746a;
        return this.f8747b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f8746a + ", onCancellation=" + this.f8747b + ')';
    }
}
