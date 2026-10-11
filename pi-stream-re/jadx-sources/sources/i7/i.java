package i7;

import r6.h0;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5410a;

    public i(Class cls) {
        h0.u(cls, "jClass");
        this.f5410a = cls;
    }

    @Override // i7.c
    public final Class a() {
        return this.f5410a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (h0.g(this.f5410a, ((i) obj).f5410a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5410a.hashCode();
    }

    public final String toString() {
        return this.f5410a.toString() + " (Kotlin reflection is not available)";
    }
}
