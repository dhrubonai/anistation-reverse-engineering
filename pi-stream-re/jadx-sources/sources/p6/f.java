package p6;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8619c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile h f8620a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f8621b = f8619c;

    public f(g gVar) {
        this.f8620a = gVar;
    }

    public static h b(g gVar) {
        return gVar instanceof f ? gVar : new f(gVar);
    }

    @Override // p6.h
    public final Object a() {
        Object obj = this.f8621b;
        Object obj2 = f8619c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f8621b;
                if (obj == obj2) {
                    obj = this.f8620a.a();
                    Object obj3 = this.f8621b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8621b = obj;
                    this.f8620a = null;
                }
            }
        }
        return obj;
    }
}
