package x3;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11233d;

    @Override // x3.o
    public final boolean a(v3.a aVar) {
        switch (this.f11233d) {
            case 1:
                return false;
            case 2:
                if (aVar != v3.a.DATA_DISK_CACHE && aVar != v3.a.MEMORY_CACHE) {
                    return true;
                }
                return false;
            default:
                if (aVar == v3.a.REMOTE) {
                    return true;
                }
                return false;
        }
    }
}
