package x3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final l4.g f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11251b;

    public s(l4.g gVar, Executor executor) {
        this.f11250a = gVar;
        this.f11251b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f11250a.equals(((s) obj).f11250a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11250a.hashCode();
    }
}
