package r6;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b0 extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f9441a;

    public b0(Comparator comparator) {
        comparator.getClass();
        this.f9441a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f9441a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f9441a.equals(((b0) obj).f9441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9441a.hashCode();
    }

    public final String toString() {
        return this.f9441a.toString();
    }
}
