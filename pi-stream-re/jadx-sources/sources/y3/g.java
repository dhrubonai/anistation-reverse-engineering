package y3;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f11589a;

    /* renamed from: b, reason: collision with root package name */
    public int f11590b;

    /* renamed from: c, reason: collision with root package name */
    public Class f11591c;

    public g(c cVar) {
        this.f11589a = cVar;
    }

    @Override // y3.k
    public final void a() {
        this.f11589a.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f11590b != gVar.f11590b || this.f11591c != gVar.f11591c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f11590b * 31;
        Class cls = this.f11591c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return "Key{size=" + this.f11590b + "array=" + this.f11591c + '}';
    }
}
