package o4;

import java.security.MessageDigest;
import v3.i;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Object f8192b;

    public b(Object obj) {
        w7.b.q(obj);
        this.f8192b = obj;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f8192b.toString().getBytes(i.f10644a));
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8192b.equals(((b) obj).f8192b);
        }
        return false;
    }

    @Override // v3.i
    public final int hashCode() {
        return this.f8192b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f8192b + '}';
    }
}
