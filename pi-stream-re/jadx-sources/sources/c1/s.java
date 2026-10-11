package c1;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f1889a;

    public s(SparseBooleanArray sparseBooleanArray) {
        this.f1889a = sparseBooleanArray;
    }

    public final int a(int i10) {
        w7.b.m(i10, b());
        return this.f1889a.keyAt(i10);
    }

    public final int b() {
        return this.f1889a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (f1.b0.f3799a < 24) {
            if (b() != sVar.b()) {
                return false;
            }
            for (int i10 = 0; i10 < b(); i10++) {
                if (a(i10) != sVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.f1889a.equals(sVar.f1889a);
    }

    public final int hashCode() {
        if (f1.b0.f3799a < 24) {
            int b10 = b();
            for (int i10 = 0; i10 < b(); i10++) {
                b10 = (b10 * 31) + a(i10);
            }
            return b10;
        }
        return this.f1889a.hashCode();
    }
}
