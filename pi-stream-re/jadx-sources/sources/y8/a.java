package y8;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f11647a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f11648b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f11649c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f11650d;

    /* renamed from: e, reason: collision with root package name */
    public final f f11651e;

    /* renamed from: f, reason: collision with root package name */
    public final b f11652f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f11653g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f11654h;

    /* renamed from: i, reason: collision with root package name */
    public final q f11655i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11656j;

    /* renamed from: k, reason: collision with root package name */
    public final List f11657k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        r6.h0.u(str, "uriHost");
        r6.h0.u(mVar, "dns");
        r6.h0.u(socketFactory, "socketFactory");
        r6.h0.u(bVar, "proxyAuthenticator");
        r6.h0.u(list, "protocols");
        r6.h0.u(list2, "connectionSpecs");
        r6.h0.u(proxySelector, "proxySelector");
        this.f11647a = mVar;
        this.f11648b = socketFactory;
        this.f11649c = sSLSocketFactory;
        this.f11650d = hostnameVerifier;
        this.f11651e = fVar;
        this.f11652f = bVar;
        this.f11653g = proxy;
        this.f11654h = proxySelector;
        p pVar = new p();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (o7.j.l1(str2, "http")) {
            pVar.f11771a = "http";
        } else if (o7.j.l1(str2, "https")) {
            pVar.f11771a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        char[] cArr = q.f11779k;
        boolean z9 = false;
        String p02 = q6.g.p0(j.t(str, 0, 0, false, 7));
        if (p02 != null) {
            pVar.f11774d = p02;
            if (1 <= i10 && i10 < 65536) {
                z9 = true;
            }
            if (z9) {
                pVar.f11775e = i10;
                this.f11655i = pVar.a();
                this.f11656j = z8.b.w(list);
                this.f11657k = z8.b.w(list2);
                return;
            }
            throw new IllegalArgumentException(a3.g.n("unexpected port: ", i10).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(a aVar) {
        r6.h0.u(aVar, "that");
        if (r6.h0.g(this.f11647a, aVar.f11647a) && r6.h0.g(this.f11652f, aVar.f11652f) && r6.h0.g(this.f11656j, aVar.f11656j) && r6.h0.g(this.f11657k, aVar.f11657k) && r6.h0.g(this.f11654h, aVar.f11654h) && r6.h0.g(this.f11653g, aVar.f11653g) && r6.h0.g(this.f11649c, aVar.f11649c) && r6.h0.g(this.f11650d, aVar.f11650d) && r6.h0.g(this.f11651e, aVar.f11651e) && this.f11655i.f11784e == aVar.f11655i.f11784e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (r6.h0.g(this.f11655i, aVar.f11655i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11651e) + ((Objects.hashCode(this.f11650d) + ((Objects.hashCode(this.f11649c) + ((Objects.hashCode(this.f11653g) + ((this.f11654h.hashCode() + ((this.f11657k.hashCode() + ((this.f11656j.hashCode() + ((this.f11652f.hashCode() + ((this.f11647a.hashCode() + ((this.f11655i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.f11655i;
        sb.append(qVar.f11783d);
        sb.append(':');
        sb.append(qVar.f11784e);
        sb.append(", ");
        Proxy proxy = this.f11653g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f11654h;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
