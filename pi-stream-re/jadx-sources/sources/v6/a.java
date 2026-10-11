package v6;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10668c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f10669a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10670b = f10668c;

    public a(b bVar) {
        this.f10669a = bVar;
    }

    public static b a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean z9;
        Object obj = this.f10670b;
        Object obj2 = f10668c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f10670b;
                if (obj == obj2) {
                    obj = this.f10669a.get();
                    Object obj3 = this.f10670b;
                    if (obj3 != obj2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f10670b = obj;
                    this.f10669a = null;
                }
            }
        }
        return obj;
    }
}
