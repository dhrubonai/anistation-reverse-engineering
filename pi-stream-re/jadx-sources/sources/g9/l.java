package g9;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import r6.h0;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static volatile l f4517a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f4518b;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r0 != null) goto L54;
     */
    static {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.l.<clinit>():void");
    }

    public static void i(int i10, String str, Throwable th) {
        Level level;
        h0.u(str, "message");
        if (i10 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f4518b.log(level, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public w7.b b(X509TrustManager x509TrustManager) {
        return new j9.a(c(x509TrustManager));
    }

    public j9.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        h0.s(acceptedIssuers, "trustManager.acceptedIssuers");
        return new j9.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        h0.u(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f4518b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        h0.u(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        h0.u(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        h0.s(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k10 = k();
            k10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k10.getSocketFactory();
            h0.s(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager m() {
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
            return (X509TrustManager) trustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        h0.s(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
