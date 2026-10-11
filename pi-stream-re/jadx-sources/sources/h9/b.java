package h9;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import r6.h0;

/* loaded from: classes.dex */
public final class b extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final X509TrustManager f5159u;

    /* renamed from: v, reason: collision with root package name */
    public final X509TrustManagerExtensions f5160v;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f5159u = x509TrustManager;
        this.f5160v = x509TrustManagerExtensions;
    }

    @Override // w7.b
    public final List A(String str, List list) {
        h0.u(list, "chain");
        h0.u(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f5160v.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            h0.s(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f5159u == this.f5159u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5159u);
    }
}
