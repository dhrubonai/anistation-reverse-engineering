package j9;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6279a;

    public b(X509Certificate... x509CertificateArr) {
        h0.u(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            h0.s(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f6279a = linkedHashMap;
    }

    @Override // j9.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        boolean z9;
        Set set = (Set) this.f6279a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z9 = true;
            } catch (Exception unused) {
                z9 = false;
            }
            if (z9) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof b) || !h0.g(((b) obj).f6279a, this.f6279a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6279a.hashCode();
    }
}
