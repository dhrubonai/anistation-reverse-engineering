package h9;

import f9.x;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final x f5171a = new x(13, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final g f5172b = new g();

    @Override // h9.n
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // h9.n
    public final String b(SSLSocket sSLSocket) {
        boolean g10;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            g10 = true;
        } else {
            g10 = h0.g(applicationProtocol, "");
        }
        if (g10) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // h9.n
    public final boolean c() {
        return g9.d.f4498d.y();
    }

    @Override // h9.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            g9.l lVar = g9.l.f4517a;
            parameters.setApplicationProtocols((String[]) x.l(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
