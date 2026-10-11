package c9;

import java.net.Socket;

/* loaded from: classes.dex */
public final class h extends k9.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f2127m;

    public h(i iVar) {
        this.f2127m = iVar;
    }

    @Override // k9.e
    public final void k() {
        Socket socket;
        i iVar = this.f2127m;
        if (!iVar.G) {
            iVar.G = true;
            e eVar = iVar.H;
            if (eVar != null) {
                eVar.f2112d.cancel();
            }
            k kVar = iVar.I;
            if (kVar != null && (socket = kVar.f2139c) != null) {
                z8.b.d(socket);
            }
            iVar.f2132e.getClass();
        }
    }
}
