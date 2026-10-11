package g9;

import f9.x;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import r6.h0;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final x f4498d = new x(5, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4499e;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f4500c = new BouncyCastleJsseProvider();

    static {
        boolean z9 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, x.class.getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f4499e = z9;
    }

    @Override // g9.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) x.l(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.d(sSLSocket, str, list);
    }

    @Override // g9.l
    public final String f(SSLSocket sSLSocket) {
        boolean g10;
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null) {
                g10 = true;
            } else {
                g10 = h0.g(applicationProtocol, "");
            }
            if (!g10) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // g9.l
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f4500c);
        h0.s(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // g9.l
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
            return (X509TrustManager) trustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        h0.s(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
