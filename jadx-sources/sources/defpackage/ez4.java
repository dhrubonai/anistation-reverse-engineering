package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ez4 extends xo2 {
    public final s75 b;
    public Socket c;
    public Socket d;
    public mj2 e;
    public iw4 f;
    public ep2 g;
    public xy4 h;
    public wy4 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public ez4(cs1 cs1Var, s75 s75Var) {
        s75Var.getClass();
        this.b = s75Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(jd4 jd4Var, s75 s75Var, IOException iOException) {
        jd4Var.getClass();
        s75Var.getClass();
        iOException.getClass();
        if (s75Var.b.type() != Proxy.Type.DIRECT) {
            t6 t6Var = s75Var.a;
            t6Var.g.connectFailed(t6Var.h.g(), s75Var.b.address(), iOException);
        }
        sn3 sn3Var = jd4Var.W;
        synchronized (sn3Var) {
            ((LinkedHashSet) sn3Var.y).add(s75Var);
        }
    }

    @Override // defpackage.xo2
    public final synchronized void a(ep2 ep2Var, jl5 jl5Var) {
        int i;
        jl5Var.getClass();
        if ((jl5Var.a & 16) != 0) {
            i = jl5Var.b[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.o = i;
    }

    @Override // defpackage.xo2
    public final void b(lp2 lp2Var) {
        lp2Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, nf0 nf0Var) {
        boolean z2;
        s75 s75Var;
        if (this.f == null) {
            t6 t6Var = this.b.a;
            List list = t6Var.j;
            kw0 kw0Var = new kw0(list);
            if (t6Var.c == null) {
                if (list.contains(jw0.f)) {
                    String str = this.b.a.h.d;
                    lm4 lm4Var = lm4.a;
                    if (!lm4.a.h(str)) {
                        throw new t75(new UnknownServiceException(qx1.m("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new t75(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (t6Var.i.contains(iw4.H2_PRIOR_KNOWLEDGE)) {
                throw new t75(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            t75 t75Var = null;
            do {
                try {
                    s75 s75Var2 = this.b;
                    if (s75Var2.a.c != null && s75Var2.b.type() == Proxy.Type.HTTP) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        f(i, i2, i3, nf0Var);
                        if (this.c == null) {
                            s75Var = this.b;
                            if (s75Var.a.c == null && s75Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                                throw new t75(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.q = System.nanoTime();
                            return;
                        }
                    } else {
                        e(i, i2, nf0Var);
                    }
                    g(kw0Var, nf0Var);
                    this.b.c.getClass();
                    s75Var = this.b;
                    if (s75Var.a.c == null) {
                    }
                    this.q = System.nanoTime();
                    return;
                } catch (IOException e) {
                    Socket socket = this.d;
                    if (socket != null) {
                        dq6.e(socket);
                    }
                    Socket socket2 = this.c;
                    if (socket2 != null) {
                        dq6.e(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.o = 1;
                    this.b.c.getClass();
                    if (t75Var == null) {
                        t75Var = new t75(e);
                    } else {
                        n03.i(t75Var.x, e);
                        t75Var.y = e;
                    }
                    if (z) {
                        kw0Var.d = true;
                        if (kw0Var.c) {
                            if (!(e instanceof ProtocolException)) {
                                if (!(e instanceof InterruptedIOException)) {
                                    if (!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) {
                                        if (e instanceof SSLPeerUnverifiedException) {
                                            throw t75Var;
                                        }
                                    } else {
                                        throw t75Var;
                                    }
                                } else {
                                    throw t75Var;
                                }
                            } else {
                                throw t75Var;
                            }
                        } else {
                            throw t75Var;
                        }
                    } else {
                        throw t75Var;
                    }
                }
            } while (e instanceof SSLException);
            throw t75Var;
        }
        ze0.m("already connected");
    }

    public final void e(int i, int i2, nf0 nf0Var) {
        int i3;
        Socket createSocket;
        s75 s75Var = this.b;
        Proxy proxy = s75Var.b;
        t6 t6Var = s75Var.a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = cz4.a[type.ordinal()];
        }
        byte b = 1;
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = t6Var.b.createSocket();
            createSocket.getClass();
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            lm4 lm4Var = lm4.a;
            lm4.a.e(createSocket, this.b.c, i);
            try {
                iu5 iu5Var = new iu5(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new xy4(new xt(iu5Var, new xt(inputStream, iu5Var)));
                iu5 iu5Var2 = new iu5(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new wy4(new wt(iu5Var2, new wt(outputStream, iu5Var2, b), (byte) 0));
            } catch (NullPointerException e) {
                if (!a34.i(e.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, nf0 nf0Var) {
        kz kzVar = new kz((byte) 8);
        s75 s75Var = this.b;
        kzVar.x = s75Var.a.h;
        kzVar.B("CONNECT", null);
        kzVar.y("Host", dq6.v(s75Var.a.h, true));
        kzVar.y("Proxy-Connection", "Keep-Alive");
        kzVar.y("User-Agent", "okhttp/4.12.0");
        l35 r = kzVar.r();
        gk2 gk2Var = new gk2((byte) 0);
        z51.f("Proxy-Authenticate");
        z51.g("OkHttp-Preemptive", "Proxy-Authenticate");
        gk2Var.l("Proxy-Authenticate");
        gk2Var.h("Proxy-Authenticate", "OkHttp-Preemptive");
        gk2Var.i();
        ws2 ws2Var = r.a;
        e(i, i2, nf0Var);
        String str = "CONNECT " + dq6.v(ws2Var, true) + " HTTP/1.1";
        xy4 xy4Var = this.h;
        xy4Var.getClass();
        wy4 wy4Var = this.i;
        wy4Var.getClass();
        uo2 uo2Var = new uo2(null, this, xy4Var, wy4Var);
        of6 d = xy4Var.x.d();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.g(j, timeUnit);
        wy4Var.x.d().g(i3, timeUnit);
        uo2Var.j(r.c, str);
        uo2Var.b();
        o45 d2 = uo2Var.d(false);
        d2.getClass();
        d2.a = r;
        p45 a = d2.a();
        int i4 = a.A;
        long j2 = dq6.j(a);
        if (j2 != -1) {
            so2 i5 = uo2Var.i(j2);
            dq6.t(i5, Integer.MAX_VALUE);
            i5.close();
        }
        if (i4 != 200) {
            if (i4 == 407) {
                qi2.k("Failed to authenticate with proxy");
                return;
            } else {
                qi2.k(qx1.h(i4, "Unexpected response code for CONNECT: "));
                return;
            }
        }
        if (xy4Var.y.D() && wy4Var.y.D()) {
            return;
        }
        qi2.k("TLS tunnel buffered too many bytes!");
    }

    public final void g(kw0 kw0Var, nf0 nf0Var) {
        iw4 iw4Var = iw4.HTTP_1_1;
        t6 t6Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = t6Var.c;
        if (sSLSocketFactory == null) {
            List list = t6Var.i;
            iw4 iw4Var2 = iw4.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(iw4Var2);
            Socket socket = this.c;
            if (contains) {
                this.d = socket;
                this.f = iw4Var2;
                l();
                return;
            } else {
                this.d = socket;
                this.f = iw4Var;
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            ws2 ws2Var = t6Var.h;
            byte b = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, ws2Var.d, ws2Var.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                jw0 a = kw0Var.a(sSLSocket2);
                if (a.b) {
                    lm4 lm4Var = lm4.a;
                    lm4.a.d(sSLSocket2, t6Var.h.d, t6Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                mj2 E = zz.E(session);
                HostnameVerifier hostnameVerifier = t6Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(t6Var.h.d, session);
                byte b2 = 0;
                if (!verify) {
                    List a2 = E.a();
                    if (!a2.isEmpty()) {
                        Object obj = a2.get(0);
                        obj.getClass();
                        X509Certificate x509Certificate = (X509Certificate) obj;
                        StringBuilder sb = new StringBuilder("\n              |Hostname ");
                        sb.append(t6Var.h.d);
                        sb.append(" not verified:\n              |    certificate: ");
                        ej0 ej0Var = ej0.c;
                        sb.append(h98.M(x509Certificate));
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(yo0.u0(hd4.a(x509Certificate, 2), hd4.a(x509Certificate, 7)));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(vz5.v(sb.toString()));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + t6Var.h.d + " not verified (no certificates)");
                }
                ej0 ej0Var2 = t6Var.e;
                ej0Var2.getClass();
                this.e = new mj2(E.a, E.b, E.c, new dz4(ej0Var2, E, t6Var));
                t6Var.h.d.getClass();
                Iterator it = ej0Var2.a.iterator();
                if (!it.hasNext()) {
                    if (a.b) {
                        lm4 lm4Var2 = lm4.a;
                        str = lm4.a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    iu5 iu5Var = new iu5(sSLSocket2);
                    InputStream inputStream = sSLSocket2.getInputStream();
                    inputStream.getClass();
                    this.h = new xy4(new xt(iu5Var, new xt(inputStream, iu5Var)));
                    iu5 iu5Var2 = new iu5(sSLSocket2);
                    OutputStream outputStream = sSLSocket2.getOutputStream();
                    outputStream.getClass();
                    this.i = new wy4(new wt(iu5Var2, new wt(outputStream, iu5Var2, b), b2));
                    if (str != null) {
                        iw4Var = wc7.q(str);
                    }
                    this.f = iw4Var;
                    lm4 lm4Var3 = lm4.a;
                    lm4.a.a(sSLSocket2);
                    if (this.f == iw4.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                h11.v(it.next());
                throw null;
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    lm4 lm4Var4 = lm4.a;
                    lm4.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    dq6.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (defpackage.hd4.c(r1, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.t6 r9, java.util.List r10) {
        /*
            r8 = this;
            ws2 r0 = r9.h
            java.lang.String r1 = r0.d
            byte[] r2 = defpackage.dq6.a
            java.util.ArrayList r2 = r8.p
            int r2 = r2.size()
            int r3 = r8.o
            r4 = 0
            if (r2 >= r3) goto Ld6
            boolean r2 = r8.j
            if (r2 == 0) goto L17
            goto Ld6
        L17:
            s75 r2 = r8.b
            t6 r3 = r2.a
            t6 r5 = r2.a
            boolean r3 = r3.a(r9)
            if (r3 != 0) goto L25
            goto Ld6
        L25:
            ws2 r3 = r5.h
            java.lang.String r3 = r3.d
            boolean r3 = defpackage.a34.i(r1, r3)
            if (r3 == 0) goto L31
            goto Lcb
        L31:
            ep2 r3 = r8.g
            if (r3 != 0) goto L37
            goto Ld6
        L37:
            if (r10 == 0) goto Ld6
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L41
            goto Ld6
        L41:
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld6
            java.lang.Object r3 = r10.next()
            s75 r3 = (defpackage.s75) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L45
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L45
            java.net.InetSocketAddress r6 = r2.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r3 = defpackage.a34.i(r6, r3)
            if (r3 == 0) goto L45
            javax.net.ssl.HostnameVerifier r10 = r9.d
            hd4 r2 = defpackage.hd4.a
            if (r10 == r2) goto L74
            goto Ld6
        L74:
            byte[] r10 = defpackage.dq6.a
            ws2 r10 = r5.h
            int r0 = r0.e
            int r2 = r10.e
            if (r0 == r2) goto L7f
            goto Ld6
        L7f:
            java.lang.String r10 = r10.d
            boolean r10 = defpackage.a34.i(r1, r10)
            if (r10 == 0) goto L88
            goto La9
        L88:
            boolean r10 = r8.k
            if (r10 != 0) goto Ld6
            mj2 r10 = r8.e
            if (r10 == 0) goto Ld6
            java.util.List r10 = r10.a()
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto Ld6
            java.lang.Object r10 = r10.get(r4)
            r10.getClass()
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.hd4.c(r1, r10)
            if (r10 == 0) goto Ld6
        La9:
            ej0 r9 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            mj2 r8 = r8.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.List r8 = r8.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r1.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Set r8 = r9.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            if (r9 != 0) goto Lcd
        Lcb:
            r8 = 1
            return r8
        Lcd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            defpackage.h11.v(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
        Ld6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez4.h(t6, java.util.List):boolean");
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = dq6.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ep2 ep2Var = this.g;
        if (ep2Var != null) {
            synchronized (ep2Var) {
                if (ep2Var.C) {
                    return false;
                }
                if (ep2Var.K < ep2Var.J) {
                    if (nanoTime >= ep2Var.L) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.D();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final xw1 j(jd4 jd4Var, tc3 tc3Var) {
        jd4Var.getClass();
        int i = tc3Var.d;
        Socket socket = this.d;
        socket.getClass();
        xy4 xy4Var = this.h;
        xy4Var.getClass();
        wy4 wy4Var = this.i;
        wy4Var.getClass();
        ep2 ep2Var = this.g;
        if (ep2Var != null) {
            return new fp2(jd4Var, this, tc3Var, ep2Var);
        }
        socket.setSoTimeout(i);
        of6 d = xy4Var.x.d();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.g(j, timeUnit);
        wy4Var.x.d().g(tc3Var.e, timeUnit);
        return new uo2(jd4Var, this, xy4Var, wy4Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        int i;
        int i2;
        Socket socket = this.d;
        socket.getClass();
        xy4 xy4Var = this.h;
        xy4Var.getClass();
        wy4 wy4Var = this.i;
        wy4Var.getClass();
        socket.setSoTimeout(0);
        u76 u76Var = u76.h;
        tp tpVar = new tp(u76Var);
        String str = this.b.a.h.d;
        str.getClass();
        tpVar.z = socket;
        tpVar.A = dq6.g + ' ' + str;
        tpVar.B = xy4Var;
        tpVar.C = wy4Var;
        tpVar.D = this;
        ep2 ep2Var = new ep2(tpVar);
        this.g = ep2Var;
        jl5 jl5Var = ep2.W;
        if ((jl5Var.a & 16) != 0) {
            i = jl5Var.b[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.o = i;
        mp2 mp2Var = ep2Var.T;
        synchronized (mp2Var) {
            try {
                if (!mp2Var.A) {
                    Logger logger = mp2.C;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(dq6.h(">> CONNECTION " + vo2.a.e(), new Object[0]));
                    }
                    mp2Var.x.m0(vo2.a);
                    mp2Var.x.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        mp2 mp2Var2 = ep2Var.T;
        jl5 jl5Var2 = ep2Var.M;
        synchronized (mp2Var2) {
            try {
                jl5Var2.getClass();
                if (!mp2Var2.A) {
                    mp2Var2.p(0, Integer.bitCount(jl5Var2.a) * 6, 4, 0);
                    for (int i3 = 0; i3 < 10; i3++) {
                        boolean z = true;
                        if (((1 << i3) & jl5Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            if (i3 != 4) {
                                if (i3 != 7) {
                                    i2 = i3;
                                } else {
                                    i2 = 4;
                                }
                            } else {
                                i2 = 3;
                            }
                            mp2Var2.x.writeShort(i2);
                            mp2Var2.x.writeInt(jl5Var2.b[i3]);
                        }
                    }
                    mp2Var2.x.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        if (ep2Var.M.a() != 65535) {
            ep2Var.T.I(0, r9 - 65535);
        }
        u76Var.d().c(new cp2(ep2Var.z, ep2Var.U, (byte) 2), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        s75 s75Var = this.b;
        sb.append(s75Var.a.h.d);
        sb.append(':');
        sb.append(s75Var.a.h.e);
        sb.append(", proxy=");
        sb.append(s75Var.b);
        sb.append(" hostAddress=");
        sb.append(s75Var.c);
        sb.append(" cipherSuite=");
        mj2 mj2Var = this.e;
        if (mj2Var != null) {
            obj = mj2Var.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
