package g9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements j9.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4492a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4493b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f4492a = x509TrustManager;
        this.f4493b = method;
    }

    @Override // j9.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4493b.invoke(this.f4492a, x509Certificate);
            h0.r(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h0.g(this.f4492a, bVar.f4492a) && h0.g(this.f4493b, bVar.f4493b);
    }

    public final int hashCode() {
        return this.f4493b.hashCode() + (this.f4492a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4492a + ", findByIssuerAndSignatureMethod=" + this.f4493b + ')';
    }
}
