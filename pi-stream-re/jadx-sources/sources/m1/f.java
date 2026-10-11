package m1;

/* loaded from: classes.dex */
public final class f implements a2.a, z1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7061a;

    public final void a() {
        long j4;
        j jVar = this.f7061a;
        synchronized (a2.b.f33b) {
            if (a2.b.f34c) {
                j4 = a2.b.f35d;
            } else {
                j4 = -9223372036854775807L;
            }
        }
        jVar.L = j4;
        jVar.w(true);
    }

    @Override // z1.p
    public final void b() {
        j jVar = this.f7061a;
        jVar.A.b();
        b bVar = jVar.C;
        if (bVar == null) {
        } else {
            throw bVar;
        }
    }
}
