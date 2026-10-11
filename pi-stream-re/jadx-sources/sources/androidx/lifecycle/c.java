package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1076a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1077b;

    public c(int i10, Method method) {
        this.f1076a = i10;
        this.f1077b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1076a == cVar.f1076a && this.f1077b.getName().equals(cVar.f1077b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1077b.getName().hashCode() + (this.f1076a * 31);
    }
}
