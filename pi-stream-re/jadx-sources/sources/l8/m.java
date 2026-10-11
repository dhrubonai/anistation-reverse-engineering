package l8;

/* loaded from: classes.dex */
public final class m implements i8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8.b f6964b;

    public /* synthetic */ m(g8.b bVar, int i10) {
        this.f6963a = i10;
        this.f6964b = bVar;
    }

    @Override // i8.c
    public final void e(a8.b bVar) {
        int i10 = this.f6963a;
        g8.b bVar2 = this.f6964b;
        switch (i10) {
            case 0:
                z zVar = ((n) bVar2).f6973t0;
                if (zVar != null) {
                    zVar.d(bVar);
                    return;
                }
                return;
            default:
                z zVar2 = ((n0) bVar2).f6987u0;
                if (zVar2 != null) {
                    zVar2.d(bVar);
                    return;
                }
                return;
        }
    }
}
