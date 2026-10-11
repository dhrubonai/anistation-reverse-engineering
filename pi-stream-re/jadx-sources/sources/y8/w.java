package y8;

import c1.i0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class w implements Cloneable {
    public static final List U = z8.b.k(x.HTTP_2, x.HTTP_1_1);
    public static final List V = z8.b.k(i.f11744e, i.f11745f);
    public final l A;
    public final m B;
    public final Proxy C;
    public final ProxySelector D;
    public final b E;
    public final SocketFactory F;
    public final SSLSocketFactory G;
    public final X509TrustManager H;
    public final List I;
    public final List J;
    public final HostnameVerifier K;
    public final f L;
    public final w7.b M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final long S;
    public final f8.h T;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f11830a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.h f11831b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11832c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11833d;

    /* renamed from: e, reason: collision with root package name */
    public final w.f f11834e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11835f;

    /* renamed from: x, reason: collision with root package name */
    public final b f11836x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11837y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f11838z;

    public w(v vVar) {
        ProxySelector proxySelector;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        this.f11830a = vVar.f11805a;
        this.f11831b = vVar.f11806b;
        this.f11832c = z8.b.w(vVar.f11807c);
        this.f11833d = z8.b.w(vVar.f11808d);
        this.f11834e = vVar.f11809e;
        this.f11835f = vVar.f11810f;
        this.f11836x = vVar.f11811g;
        this.f11837y = vVar.f11812h;
        this.f11838z = vVar.f11813i;
        this.A = vVar.f11814j;
        this.B = vVar.f11815k;
        Proxy proxy = vVar.f11816l;
        this.C = proxy;
        if (proxy != null) {
            proxySelector = i9.a.f5471a;
        } else {
            proxySelector = vVar.f11817m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = i9.a.f5471a;
            }
        }
        this.D = proxySelector;
        this.E = vVar.f11818n;
        this.F = vVar.o;
        List list = vVar.f11821r;
        this.I = list;
        this.J = vVar.f11822s;
        this.K = vVar.f11823t;
        this.N = vVar.f11826w;
        this.O = vVar.f11827x;
        this.P = vVar.f11828y;
        this.Q = vVar.f11829z;
        this.R = vVar.A;
        this.S = vVar.B;
        f8.h hVar = vVar.C;
        this.T = hVar == null ? new f8.h(6) : hVar;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f11746a) {
                    z9 = false;
                    break;
                }
            }
        }
        z9 = true;
        if (z9) {
            this.G = null;
            this.M = null;
            this.H = null;
            this.L = f.f11708c;
        } else {
            SSLSocketFactory sSLSocketFactory = vVar.f11819p;
            if (sSLSocketFactory != null) {
                this.G = sSLSocketFactory;
                w7.b bVar = vVar.f11825v;
                r6.h0.q(bVar);
                this.M = bVar;
                X509TrustManager x509TrustManager = vVar.f11820q;
                r6.h0.q(x509TrustManager);
                this.H = x509TrustManager;
                f fVar = vVar.f11824u;
                this.L = r6.h0.g(fVar.f11710b, bVar) ? fVar : new f(fVar.f11709a, bVar);
            } else {
                g9.l lVar = g9.l.f4517a;
                X509TrustManager m5 = g9.l.f4517a.m();
                this.H = m5;
                g9.l lVar2 = g9.l.f4517a;
                r6.h0.q(m5);
                this.G = lVar2.l(m5);
                w7.b b10 = g9.l.f4517a.b(m5);
                this.M = b10;
                f fVar2 = vVar.f11824u;
                r6.h0.q(b10);
                this.L = r6.h0.g(fVar2.f11710b, b10) ? fVar2 : new f(fVar2.f11709a, b10);
            }
        }
        List list2 = this.f11832c;
        r6.h0.r(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list2.contains(null)) {
            List list3 = this.f11833d;
            r6.h0.r(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list3.contains(null)) {
                List list4 = this.I;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (((i) it2.next()).f11746a) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                X509TrustManager x509TrustManager2 = this.H;
                w7.b bVar2 = this.M;
                SSLSocketFactory sSLSocketFactory2 = this.G;
                if (z10) {
                    if (sSLSocketFactory2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (bVar2 == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (x509TrustManager2 == null) {
                                if (!r6.h0.g(this.L, f.f11708c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (sSLSocketFactory2 != null) {
                    if (bVar2 != null) {
                        if (x509TrustManager2 != null) {
                            return;
                        } else {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + list2).toString());
    }

    public final Object clone() {
        return super.clone();
    }
}
