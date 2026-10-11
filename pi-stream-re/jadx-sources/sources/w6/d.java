package w6;

import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11015a;

    public /* synthetic */ d(Object obj) {
        this.f11015a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof c) {
            return ((c) obj).f11014a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (!h0.g(this.f11015a, ((d) obj).f11015a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f11015a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11015a;
        if (obj instanceof c) {
            return ((c) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
