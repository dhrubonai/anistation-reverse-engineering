package l;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6564a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6565b;

    /* renamed from: c, reason: collision with root package name */
    public c f6566c;

    /* renamed from: d, reason: collision with root package name */
    public c f6567d;

    public c(Object obj, Object obj2) {
        this.f6564a = obj;
        this.f6565b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6564a.equals(cVar.f6564a) && this.f6565b.equals(cVar.f6565b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6564a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6565b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6564a.hashCode() ^ this.f6565b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f6564a + "=" + this.f6565b;
    }
}
