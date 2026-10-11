package l1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f6678d = new j().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6679a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6680b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6681c;

    public k(j jVar) {
        this.f6679a = jVar.f6675a;
        this.f6680b = jVar.f6676b;
        this.f6681c = jVar.f6677c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6679a == kVar.f6679a && this.f6680b == kVar.f6680b && this.f6681c == kVar.f6681c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6679a ? 1 : 0) << 2) + ((this.f6680b ? 1 : 0) << 1) + (this.f6681c ? 1 : 0);
    }
}
