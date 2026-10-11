package f1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3834a;

    /* renamed from: b, reason: collision with root package name */
    public c1.r f3835b = new c1.r(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3837d;

    public n(Object obj) {
        this.f3834a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.f3834a.equals(((n) obj).f3834a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3834a.hashCode();
    }
}
