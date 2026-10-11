package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t6 {
    public final l68 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final ej0 e;
    public final l68 f;
    public final ProxySelector g;
    public final ws2 h;
    public final List i;
    public final List j;

    public t6(String str, int i, l68 l68Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ej0 ej0Var, l68 l68Var2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        l68Var.getClass();
        socketFactory.getClass();
        l68Var2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = l68Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = ej0Var;
        this.f = l68Var2;
        this.g = proxySelector;
        ra2 ra2Var = new ra2((byte) 1);
        String str2 = sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            ra2Var.e = "http";
        } else if (str2.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
            ra2Var.e = HttpRequest.DEFAULT_SCHEME;
        } else {
            ze0.k("unexpected scheme: ".concat(str2));
            throw null;
        }
        String T = te4.T(q18.l(str, 0, 0, 7));
        if (T != null) {
            ra2Var.h = T;
            if (1 <= i && i < 65536) {
                ra2Var.b = i;
                this.h = ra2Var.a();
                this.i = dq6.w(list);
                this.j = dq6.w(list2);
                return;
            }
            ze0.e(qx1.h(i, "unexpected port: "));
            throw null;
        }
        ze0.k("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(t6 t6Var) {
        if (this.a.equals(t6Var.a) && this.f.equals(t6Var.f) && this.i.equals(t6Var.i) && this.j.equals(t6Var.j) && a34.i(this.g, t6Var.g) && a34.i(this.c, t6Var.c) && a34.i(this.d, t6Var.d) && a34.i(this.e, t6Var.e) && this.h.e == t6Var.h.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t6) {
            t6 t6Var = (t6) obj;
            if (this.h.equals(t6Var.h) && a(t6Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + zo5.j(this.j, zo5.j(this.i, (this.f.hashCode() + ((this.a.hashCode() + zo5.i(this.h.h, 527, 31)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ws2 ws2Var = this.h;
        sb.append(ws2Var.d);
        sb.append(':');
        sb.append(ws2Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
