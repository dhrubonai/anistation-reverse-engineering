package g9;

import f9.x;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import r6.h0;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4502d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f4503c;

    static {
        boolean z9 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (e.a()) {
                    z9 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f4502d = z9;
    }

    public g() {
        Provider newProvider = Conscrypt.newProvider();
        h0.s(newProvider, "newProvider()");
        this.f4503c = newProvider;
    }

    @Override // g9.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) x.l(list).toArray(new String[0]));
        } else {
            super.d(sSLSocket, str, list);
        }
    }

    @Override // g9.l
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // g9.l
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f4503c);
        h0.s(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // g9.l
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k10 = k();
        k10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k10.getSocketFactory();
        h0.s(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // g9.l
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        h0.q(trustManagers);
        boolean z9 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z9 = false;
        }
        if (z9) {
            TrustManager trustManager = trustManagers[0];
            h0.r(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, f.f4501a);
            return x509TrustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        h0.s(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
