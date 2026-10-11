package z1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f11928a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11929b;

    public /* synthetic */ i(int i10, long j4, int i11) {
        this.f11928a = i10;
        this.f11929b = j4;
    }

    public static i b(d2.q qVar, f1.t tVar) {
        qVar.n(tVar.f3858a, 0, 8);
        tVar.G(0);
        return new i(tVar.f(), tVar.l(), 0);
    }

    public final boolean a() {
        int i10 = this.f11928a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public i(int i10, long j4) {
        w7.b.g(j4 >= 0);
        this.f11928a = i10;
        this.f11929b = j4;
    }
}
