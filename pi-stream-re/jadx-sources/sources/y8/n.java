package y8;

import androidx.lifecycle.r0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f11766a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11767b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11768c;

    /* renamed from: d, reason: collision with root package name */
    public final w6.e f11769d;

    public n(h0 h0Var, g gVar, List list, h7.a aVar) {
        r6.h0.u(h0Var, "tlsVersion");
        r6.h0.u(gVar, "cipherSuite");
        r6.h0.u(list, "localCertificates");
        this.f11766a = h0Var;
        this.f11767b = gVar;
        this.f11768c = list;
        this.f11769d = new w6.e(new r0(aVar, 2));
    }

    public final List a() {
        return (List) this.f11769d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f11766a == this.f11766a && r6.h0.g(nVar.f11767b, this.f11767b) && r6.h0.g(nVar.a(), a()) && r6.h0.g(nVar.f11768c, this.f11768c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11768c.hashCode() + ((a().hashCode() + ((this.f11767b.hashCode() + ((this.f11766a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(x6.j.o0(a10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                r6.h0.s(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f11766a);
        sb.append(" cipherSuite=");
        sb.append(this.f11767b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f11768c;
        ArrayList arrayList2 = new ArrayList(x6.j.o0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                r6.h0.s(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
