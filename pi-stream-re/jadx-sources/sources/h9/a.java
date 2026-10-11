package h9;

import android.net.ssl.SSLSockets;
import f9.x;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final x f5158a = new x(10, 0);

    @Override // h9.n
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // h9.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean g10;
        applicationProtocol = sSLSocket.getApplicationProtocol();
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
        return f5158a.y();
    }

    @Override // h9.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            g9.l lVar = g9.l.f4517a;
            sSLParameters.setApplicationProtocols((String[]) x.l(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
