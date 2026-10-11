package q6;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f9213a;

    public i(List list) {
        this.f9213a = list;
    }

    @Override // q6.h
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f9213a;
            if (i10 < list.size()) {
                if (!((h) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f9213a.equals(((i) obj).f9213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9213a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z9 = true;
        for (Object obj : this.f9213a) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
