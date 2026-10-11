package w6;

import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f11014a;

    public c(Throwable th) {
        h0.u(th, "exception");
        this.f11014a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h0.g(this.f11014a, ((c) obj).f11014a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11014a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11014a + ')';
    }
}
