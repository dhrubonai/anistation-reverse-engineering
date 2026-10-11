package c9;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import f9.b0;
import f9.f0;
import f9.t;
import f9.u;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k9.p;
import k9.q;
import r6.h0;
import y8.c0;
import y8.d0;
import y8.g0;
import y8.o;
import y8.w;
import y8.x;
import y8.y;

/* loaded from: classes.dex */
public final class k extends f9.j {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2138b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f2139c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f2140d;

    /* renamed from: e, reason: collision with root package name */
    public y8.n f2141e;

    /* renamed from: f, reason: collision with root package name */
    public x f2142f;

    /* renamed from: g, reason: collision with root package name */
    public t f2143g;

    /* renamed from: h, reason: collision with root package name */
    public q f2144h;

    /* renamed from: i, reason: collision with root package name */
    public p f2145i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2146j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2147k;

    /* renamed from: l, reason: collision with root package name */
    public int f2148l;

    /* renamed from: m, reason: collision with root package name */
    public int f2149m;

    /* renamed from: n, reason: collision with root package name */
    public int f2150n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2151p;

    /* renamed from: q, reason: collision with root package name */
    public long f2152q;

    public k(l lVar, g0 g0Var) {
        h0.u(lVar, "connectionPool");
        h0.u(g0Var, "route");
        this.f2138b = g0Var;
        this.o = 1;
        this.f2151p = new ArrayList();
        this.f2152q = Long.MAX_VALUE;
    }

    public static void d(w wVar, g0 g0Var, IOException iOException) {
        h0.u(wVar, "client");
        h0.u(g0Var, "failedRoute");
        h0.u(iOException, "failure");
        if (g0Var.f11731b.type() != Proxy.Type.DIRECT) {
            y8.a aVar = g0Var.f11730a;
            aVar.f11654h.connectFailed(aVar.f11655i.f(), g0Var.f11731b.address(), iOException);
        }
        f8.h hVar = wVar.T;
        synchronized (hVar) {
            ((Set) hVar.f3961a).add(g0Var);
        }
    }

    @Override // f9.j
    public final synchronized void a(t tVar, f0 f0Var) {
        int i10;
        h0.u(tVar, "connection");
        h0.u(f0Var, "settings");
        if ((f0Var.f4035a & 16) != 0) {
            i10 = f0Var.f4036b[4];
        } else {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        this.o = i10;
    }

    @Override // f9.j
    public final void b(b0 b0Var) {
        h0.u(b0Var, "stream");
        b0Var.c(f9.b.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, c9.i r22, androidx.lifecycle.q0 r23) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.k.c(int, int, int, int, boolean, c9.i, androidx.lifecycle.q0):void");
    }

    public final void e(int i10, int i11, i iVar, q0 q0Var) {
        int i12;
        Socket createSocket;
        g0 g0Var = this.f2138b;
        Proxy proxy = g0Var.f11731b;
        y8.a aVar = g0Var.f11730a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = j.f2137a[type.ordinal()];
        }
        if (i12 != 1 && i12 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.f11648b.createSocket();
            h0.q(createSocket);
        }
        this.f2139c = createSocket;
        InetSocketAddress inetSocketAddress = this.f2138b.f11732c;
        q0Var.getClass();
        h0.u(iVar, "call");
        h0.u(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i11);
        try {
            g9.l lVar = g9.l.f4517a;
            g9.l.f4517a.e(createSocket, this.f2138b.f11732c, i10);
            try {
                this.f2144h = new q(com.bumptech.glide.c.i0(createSocket));
                this.f2145i = new p(com.bumptech.glide.c.h0(createSocket));
            } catch (NullPointerException e10) {
                if (!h0.g(e10.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f2138b.f11732c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, i iVar, q0 q0Var) {
        y yVar = new y();
        g0 g0Var = this.f2138b;
        y8.q qVar = g0Var.f11730a.f11655i;
        h0.u(qVar, "url");
        yVar.f11847a = qVar;
        yVar.c("CONNECT", null);
        y8.a aVar = g0Var.f11730a;
        yVar.b("Host", z8.b.v(aVar.f11655i, true));
        yVar.b("Proxy-Connection", "Keep-Alive");
        yVar.b("User-Agent", "okhttp/4.12.0");
        androidx.appcompat.widget.w a10 = yVar.a();
        c0 c0Var = new c0();
        c0Var.f11678a = a10;
        c0Var.f11679b = x.HTTP_1_1;
        c0Var.f11680c = 407;
        c0Var.f11681d = "Preemptive Authenticate";
        c0Var.f11684g = z8.b.f12135c;
        c0Var.f11688k = -1L;
        c0Var.f11689l = -1L;
        h4.c cVar = c0Var.f11683f;
        cVar.getClass();
        y8.j.d("Proxy-Authenticate");
        y8.j.e("OkHttp-Preemptive", "Proxy-Authenticate");
        cVar.f("Proxy-Authenticate");
        cVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        c0Var.a();
        ((q0) aVar.f11652f).getClass();
        y8.q qVar2 = (y8.q) a10.f681b;
        e(i10, i11, iVar, q0Var);
        String str = "CONNECT " + z8.b.v(qVar2, true) + " HTTP/1.1";
        q qVar3 = this.f2144h;
        h0.q(qVar3);
        p pVar = this.f2145i;
        h0.q(pVar);
        e9.h hVar = new e9.h(null, this, qVar3, pVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar3.c().g(i11, timeUnit);
        pVar.c().g(i12, timeUnit);
        hVar.j((o) a10.f683d, str);
        hVar.b();
        c0 g10 = hVar.g(false);
        h0.q(g10);
        g10.f11678a = a10;
        d0 a11 = g10.a();
        long j4 = z8.b.j(a11);
        if (j4 != -1) {
            e9.e i13 = hVar.i(j4);
            z8.b.t(i13, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, timeUnit);
            i13.close();
        }
        int i14 = a11.f11694d;
        if (i14 != 200) {
            if (i14 == 407) {
                ((q0) aVar.f11652f).getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(a3.g.n("Unexpected response code for CONNECT: ", i14));
        }
        if (qVar3.f6543b.n() && pVar.f6540b.n()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, int i10, i iVar, q0 q0Var) {
        y8.a aVar = this.f2138b.f11730a;
        SSLSocketFactory sSLSocketFactory = aVar.f11649c;
        x xVar = x.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.f11656j;
            x xVar2 = x.H2_PRIOR_KNOWLEDGE;
            if (list.contains(xVar2)) {
                this.f2140d = this.f2139c;
                this.f2142f = xVar2;
                m(i10);
                return;
            } else {
                this.f2140d = this.f2139c;
                this.f2142f = xVar;
                return;
            }
        }
        q0Var.getClass();
        h0.u(iVar, "call");
        y8.a aVar2 = this.f2138b.f11730a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f11649c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            h0.q(sSLSocketFactory2);
            Socket socket = this.f2139c;
            y8.q qVar = aVar2.f11655i;
            int i11 = 1;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, qVar.f11783d, qVar.f11784e, true);
            h0.r(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                y8.i a10 = bVar.a(sSLSocket2);
                if (a10.f11747b) {
                    g9.l lVar = g9.l.f4517a;
                    g9.l.f4517a.d(sSLSocket2, aVar2.f11655i.f11783d, aVar2.f11656j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                h0.s(session, "sslSocketSession");
                y8.n j4 = y8.j.j(session);
                HostnameVerifier hostnameVerifier = aVar2.f11650d;
                h0.q(hostnameVerifier);
                if (!hostnameVerifier.verify(aVar2.f11655i.f11783d, session)) {
                    List a11 = j4.a();
                    if (!a11.isEmpty()) {
                        Object obj = a11.get(0);
                        h0.r(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) obj;
                        StringBuilder sb = new StringBuilder("\n              |Hostname ");
                        sb.append(aVar2.f11655i.f11783d);
                        sb.append(" not verified:\n              |    certificate: ");
                        y8.f fVar = y8.f.f11708c;
                        StringBuilder sb2 = new StringBuilder("sha256/");
                        k9.j jVar = k9.j.f6522d;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        h0.s(encoded, "publicKey.encoded");
                        sb2.append(f9.x.z(encoded).b("SHA-256").a());
                        sb.append(sb2.toString());
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(x6.m.s0(j9.c.a(x509Certificate, 2), j9.c.a(x509Certificate, 7)));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(h0.a1(sb.toString()));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f11655i.f11783d + " not verified (no certificates)");
                }
                y8.f fVar2 = aVar2.f11651e;
                h0.q(fVar2);
                this.f2141e = new y8.n(j4.f11766a, j4.f11767b, j4.f11768c, new y8.e(fVar2, j4, aVar2, i11));
                fVar2.a(aVar2.f11655i.f11783d, new r0(this, 3));
                if (a10.f11747b) {
                    g9.l lVar2 = g9.l.f4517a;
                    str = g9.l.f4517a.f(sSLSocket2);
                }
                this.f2140d = sSLSocket2;
                this.f2144h = new q(com.bumptech.glide.c.i0(sSLSocket2));
                this.f2145i = new p(com.bumptech.glide.c.h0(sSLSocket2));
                if (str != null) {
                    xVar = y8.j.l(str);
                }
                this.f2142f = xVar;
                g9.l lVar3 = g9.l.f4517a;
                g9.l.f4517a.a(sSLSocket2);
                if (this.f2142f == x.HTTP_2) {
                    m(i10);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    g9.l lVar4 = g9.l.f4517a;
                    g9.l.f4517a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    z8.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f2149m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(y8.a r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.k.i(y8.a, java.util.List):boolean");
    }

    public final boolean j(boolean z9) {
        long j4;
        byte[] bArr = z8.b.f12133a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f2139c;
        h0.q(socket);
        Socket socket2 = this.f2140d;
        h0.q(socket2);
        q qVar = this.f2144h;
        h0.q(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t tVar = this.f2143g;
        if (tVar != null) {
            return tVar.r(nanoTime);
        }
        synchronized (this) {
            j4 = nanoTime - this.f2152q;
        }
        if (j4 < 10000000000L || !z9) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z10 = !qVar.n();
                socket2.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final d9.d k(w wVar, d9.f fVar) {
        Socket socket = this.f2140d;
        h0.q(socket);
        q qVar = this.f2144h;
        h0.q(qVar);
        p pVar = this.f2145i;
        h0.q(pVar);
        t tVar = this.f2143g;
        if (tVar != null) {
            return new u(wVar, this, fVar, tVar);
        }
        int i10 = fVar.f3262g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.c().g(i10, timeUnit);
        pVar.c().g(fVar.f3263h, timeUnit);
        return new e9.h(wVar, this, qVar, pVar);
    }

    public final synchronized void l() {
        this.f2146j = true;
    }

    public final void m(int i10) {
        String concat;
        int i11;
        Socket socket = this.f2140d;
        h0.q(socket);
        q qVar = this.f2144h;
        h0.q(qVar);
        p pVar = this.f2145i;
        h0.q(pVar);
        socket.setSoTimeout(0);
        b9.f fVar = b9.f.f1563i;
        f9.h hVar = new f9.h(fVar);
        String str = this.f2138b.f11730a.f11655i.f11783d;
        h0.u(str, "peerName");
        hVar.f4044c = socket;
        if (hVar.f4042a) {
            concat = z8.b.f12139g + ' ' + str;
        } else {
            concat = "MockWebServer ".concat(str);
        }
        h0.u(concat, "<set-?>");
        hVar.f4045d = concat;
        hVar.f4046e = qVar;
        hVar.f4047f = pVar;
        hVar.f4048g = this;
        hVar.f4050i = i10;
        t tVar = new t(hVar);
        this.f2143g = tVar;
        f0 f0Var = t.S;
        if ((f0Var.f4035a & 16) != 0) {
            i11 = f0Var.f4036b[4];
        } else {
            i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        this.o = i11;
        f9.c0 c0Var = tVar.P;
        synchronized (c0Var) {
            if (!c0Var.f4010e) {
                if (c0Var.f4007b) {
                    Logger logger = f9.c0.f4005x;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(z8.b.h(">> CONNECTION " + f9.g.f4037a.d(), new Object[0]));
                    }
                    c0Var.f4006a.y(f9.g.f4037a);
                    c0Var.f4006a.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        tVar.P.G(tVar.I);
        if (tVar.I.a() != 65535) {
            tVar.P.H(0, r0 - 65535);
        }
        fVar.f().c(new b9.b(0, tVar.Q, tVar.f4082d), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        g0 g0Var = this.f2138b;
        sb.append(g0Var.f11730a.f11655i.f11783d);
        sb.append(':');
        sb.append(g0Var.f11730a.f11655i.f11784e);
        sb.append(", proxy=");
        sb.append(g0Var.f11731b);
        sb.append(" hostAddress=");
        sb.append(g0Var.f11732c);
        sb.append(" cipherSuite=");
        y8.n nVar = this.f2141e;
        if (nVar == null || (obj = nVar.f11767b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2142f);
        sb.append('}');
        return sb.toString();
    }
}
