package h9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f5178a;

    /* renamed from: b, reason: collision with root package name */
    public n f5179b;

    public m(l lVar) {
        this.f5178a = lVar;
    }

    @Override // h9.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5178a.a(sSLSocket);
    }

    @Override // h9.n
    public final String b(SSLSocket sSLSocket) {
        n nVar;
        synchronized (this) {
            if (this.f5179b == null && this.f5178a.a(sSLSocket)) {
                this.f5179b = this.f5178a.b(sSLSocket);
            }
            nVar = this.f5179b;
        }
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // h9.n
    public final boolean c() {
        return true;
    }

    @Override // h9.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        n nVar;
        h0.u(list, "protocols");
        synchronized (this) {
            if (this.f5179b == null && this.f5178a.a(sSLSocket)) {
                this.f5179b = this.f5178a.b(sSLSocket);
            }
            nVar = this.f5179b;
        }
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }
}
