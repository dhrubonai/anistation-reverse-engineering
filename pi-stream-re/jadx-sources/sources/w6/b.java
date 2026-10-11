package w6;

import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11013b;

    public b(Object obj, Object obj2) {
        this.f11012a = obj;
        this.f11013b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h0.g(this.f11012a, bVar.f11012a) && h0.g(this.f11013b, bVar.f11013b);
    }

    public final int hashCode() {
        Object obj = this.f11012a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f11013b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f11012a + ", " + this.f11013b + ')';
    }
}
