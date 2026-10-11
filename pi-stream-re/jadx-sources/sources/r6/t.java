package r6;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f9535a;

    /* renamed from: b, reason: collision with root package name */
    public transient s f9536b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f9537c;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            return ((c) this).a().equals(((c) ((e1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
