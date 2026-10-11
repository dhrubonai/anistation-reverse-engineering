package x3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements v3.i {

    /* renamed from: b, reason: collision with root package name */
    public final v3.i f11171b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.i f11172c;

    public f(v3.i iVar, v3.i iVar2) {
        this.f11171b = iVar;
        this.f11172c = iVar2;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        this.f11171b.a(messageDigest);
        this.f11172c.a(messageDigest);
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f11171b.equals(fVar.f11171b) || !this.f11172c.equals(fVar.f11172c)) {
            return false;
        }
        return true;
    }

    @Override // v3.i
    public final int hashCode() {
        return this.f11172c.hashCode() + (this.f11171b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f11171b + ", signature=" + this.f11172c + '}';
    }
}
