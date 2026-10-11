package p4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Class f8571a;

    /* renamed from: b, reason: collision with root package name */
    public Class f8572b;

    /* renamed from: c, reason: collision with root package name */
    public Class f8573c;

    public k(Class cls, Class cls2, Class cls3) {
        this.f8571a = cls;
        this.f8572b = cls2;
        this.f8573c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f8571a.equals(kVar.f8571a) && this.f8572b.equals(kVar.f8572b) && m.b(this.f8573c, kVar.f8573c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f8572b.hashCode() + (this.f8571a.hashCode() * 31)) * 31;
        Class cls = this.f8573c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f8571a + ", second=" + this.f8572b + '}';
    }
}
