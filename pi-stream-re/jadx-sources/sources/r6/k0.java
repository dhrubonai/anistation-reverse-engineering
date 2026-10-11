package r6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k0 extends r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9487a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9488b;

    public k0(Object obj, Object obj2) {
        this.f9487a = obj;
        this.f9488b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9487a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9488b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
