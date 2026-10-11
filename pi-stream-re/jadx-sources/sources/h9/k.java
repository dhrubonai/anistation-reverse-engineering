package h9;

import f9.x;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import r6.h0;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final x f5176a = new x(15, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final j f5177b = new j();

    @Override // h9.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // h9.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // h9.n
    public final boolean c() {
        boolean z9 = g9.g.f4502d;
        return g9.g.f4502d;
    }

    @Override // h9.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            g9.l lVar = g9.l.f4517a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) x.l(list).toArray(new String[0]));
        }
    }
}
