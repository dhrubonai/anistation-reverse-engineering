package x3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f11216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11217b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11218c;

    public k(v3.c cVar, Object obj, v3.l lVar) {
        this.f11216a = cVar;
        this.f11217b = obj;
        this.f11218c = lVar;
    }

    public final void a(p pVar, v3.l lVar) {
        try {
            pVar.a().h((v3.i) this.f11216a, new k((v3.o) this.f11217b, (d0) this.f11218c, lVar));
        } finally {
            ((d0) this.f11218c).a();
        }
    }

    public k(q qVar, l4.g gVar, u uVar) {
        this.f11218c = qVar;
        this.f11217b = gVar;
        this.f11216a = uVar;
    }
}
