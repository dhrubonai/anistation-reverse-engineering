package w6;

import r6.h0;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11010b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f11011a;

    public a() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (1 <= new l7.f(0, 255).f6883b) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (9 <= new l7.f(0, 255).f6883b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (20 <= new l7.f(0, 255).f6883b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            this.f11011a = 67860;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.9.20".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        h0.u(aVar, "other");
        return this.f11011a - aVar.f11011a;
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null && this.f11011a == aVar.f11011a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11011a;
    }

    public final String toString() {
        return "1.9.20";
    }
}
