package r6;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final q6.f f9546a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f9547b;

    public u(q6.f fVar, m1 m1Var) {
        this.f9546a = fVar;
        this.f9547b = m1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q6.f fVar = this.f9546a;
        return this.f9547b.compare(fVar.apply(obj), fVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f9546a.equals(uVar.f9546a) && this.f9547b.equals(uVar.f9547b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9546a, this.f9547b});
    }

    public final String toString() {
        return this.f9547b + ".onResultOf(" + this.f9546a + ")";
    }
}
