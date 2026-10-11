package x3;

/* loaded from: classes.dex */
public final class p implements p4.f {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f11237a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11238b;

    public /* synthetic */ p(Object obj) {
        this.f11238b = obj;
    }

    public final z3.a a() {
        if (((z3.a) this.f11237a) == null) {
            synchronized (this) {
                if (((z3.a) this.f11237a) == null) {
                    this.f11237a = ((z3.d) this.f11238b).a();
                }
                if (((z3.a) this.f11237a) == null) {
                    this.f11237a = new w1.o(23);
                }
            }
        }
        return (z3.a) this.f11237a;
    }

    @Override // p4.f
    public final Object get() {
        if (this.f11237a == null) {
            synchronized (this) {
                if (this.f11237a == null) {
                    Object obj = ((p4.f) this.f11238b).get();
                    w7.b.q(obj);
                    this.f11237a = obj;
                }
            }
        }
        return this.f11237a;
    }
}
