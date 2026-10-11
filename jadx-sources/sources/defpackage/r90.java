package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r90 implements r13 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public r90(l68 l68Var) {
        l68Var.getClass();
        this.b = l68Var;
    }

    public static int d(p45 p45Var, int i) {
        String a = p45.a(p45Var, CommonGatewayClient.HEADER_RETRY_AFTER);
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(a).matches()) {
            Integer valueOf = Integer.valueOf(a);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.r13
    public final p45 a(tc3 tc3Var) {
        t45 t45Var;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ej0 ej0Var;
        switch (this.a) {
            case 0:
                l68 l68Var = (l68) this.b;
                l35 l35Var = (l35) tc3Var.i;
                kz a = l35Var.a();
                ws2 ws2Var = l35Var.a;
                ik2 ik2Var = l35Var.c;
                o35 o35Var = l35Var.d;
                if (o35Var != null) {
                    dx3 b = o35Var.b();
                    if (b != null) {
                        a.y("Content-Type", b.a);
                    }
                    long a2 = o35Var.a();
                    if (a2 != -1) {
                        a.y("Content-Length", String.valueOf(a2));
                        ((gk2) a.z).l("Transfer-Encoding");
                    } else {
                        a.y("Transfer-Encoding", "chunked");
                        ((gk2) a.z).l("Content-Length");
                    }
                }
                boolean z = false;
                if (ik2Var.b("Host") == null) {
                    a.y("Host", dq6.v(ws2Var, false));
                }
                if (ik2Var.b("Connection") == null) {
                    a.y("Connection", "Keep-Alive");
                }
                if (ik2Var.b("Accept-Encoding") == null && ik2Var.b("Range") == null) {
                    a.y("Accept-Encoding", "gzip");
                    z = true;
                }
                ws2Var.getClass();
                if (ik2Var.b("User-Agent") == null) {
                    a.y("User-Agent", "okhttp/4.12.0");
                }
                p45 f = tc3Var.f(a.r());
                ik2 ik2Var2 = f.C;
                pq2.b(l68Var, ws2Var, ik2Var2);
                o45 p = f.p();
                p.a = l35Var;
                if (z && "gzip".equalsIgnoreCase(p45.a(f, "Content-Encoding")) && pq2.a(f) && (t45Var = f.D) != null) {
                    ri2 ri2Var = new ri2(t45Var.o0());
                    gk2 d = ik2Var2.d();
                    d.l("Content-Encoding");
                    d.l("Content-Length");
                    p.f = d.i().d();
                    p.g = new oz4(p45.a(f, "Content-Type"), -1L, new xy4(ri2Var));
                }
                return p.a();
            case 1:
                l35 l35Var2 = (l35) tc3Var.i;
                bz4 bz4Var = (bz4) tc3Var.g;
                List list = nt1.x;
                p45 p45Var = null;
                int i = 0;
                l35 l35Var3 = l35Var2;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        l35Var3.getClass();
                        if (bz4Var.F == null) {
                            synchronized (bz4Var) {
                                try {
                                    if (!bz4Var.H) {
                                        if (bz4Var.G) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                    } else {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (z2) {
                                cs1 cs1Var = bz4Var.z;
                                ws2 ws2Var2 = l35Var3.a;
                                jd4 jd4Var = bz4Var.x;
                                if (ws2Var2.i) {
                                    SSLSocketFactory sSLSocketFactory2 = jd4Var.L;
                                    if (sSLSocketFactory2 != null) {
                                        HostnameVerifier hostnameVerifier2 = jd4Var.P;
                                        ej0Var = jd4Var.Q;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        hostnameVerifier = hostnameVerifier2;
                                    } else {
                                        ze0.m("CLEARTEXT-only client");
                                        return null;
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    ej0Var = null;
                                }
                                bz4Var.D = new yw1(cs1Var, new t6(ws2Var2.d, ws2Var2.e, jd4Var.H, jd4Var.K, sSLSocketFactory, hostnameVerifier, ej0Var, jd4Var.J, jd4Var.O, jd4Var.N, jd4Var.I), bz4Var);
                            }
                            try {
                                if (!bz4Var.J) {
                                    try {
                                        p45 f2 = tc3Var.f(l35Var3);
                                        if (p45Var != null) {
                                            o45 p2 = f2.p();
                                            o45 p3 = p45Var.p();
                                            p3.g = null;
                                            p45 a3 = p3.a();
                                            if (a3.D == null) {
                                                p2.j = a3;
                                                f2 = p2.a();
                                            } else {
                                                throw new IllegalArgumentException("priorResponse.body != null");
                                            }
                                        }
                                        p45Var = f2;
                                        l35Var3 = b(p45Var, bz4Var.F);
                                        if (l35Var3 == null) {
                                            bz4Var.f(false);
                                            return p45Var;
                                        }
                                        t45 t45Var2 = p45Var.D;
                                        if (t45Var2 != null) {
                                            dq6.d(t45Var2);
                                        }
                                        i++;
                                        if (i <= 20) {
                                            bz4Var.f(true);
                                        } else {
                                            throw new ProtocolException("Too many follow-up requests: " + i);
                                        }
                                    } catch (IOException e) {
                                        if (c(e, bz4Var, l35Var3, !(e instanceof iw0))) {
                                            list = yo0.v0(list, e);
                                            bz4Var.f(true);
                                        } else {
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                n03.i(e, (Exception) it.next());
                                            }
                                            throw e;
                                        }
                                    } catch (t75 e2) {
                                        boolean c = c(e2.y, bz4Var, l35Var3, false);
                                        IOException iOException = e2.x;
                                        if (c) {
                                            list = yo0.v0(list, iOException);
                                            bz4Var.f(true);
                                        } else {
                                            Iterator it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                n03.i(iOException, (Exception) it2.next());
                                            }
                                            throw iOException;
                                        }
                                    }
                                } else {
                                    throw new IOException("Canceled");
                                }
                            } catch (Throwable th2) {
                                bz4Var.f(true);
                                throw th2;
                            }
                        } else {
                            ze0.m("Check failed.");
                            return null;
                        }
                        z2 = false;
                    }
                }
            default:
                l35 l35Var4 = (l35) tc3Var.i;
                ws2 ws2Var3 = l35Var4.a;
                if (((tq6) this.b).a(ws2Var3.a, ws2Var3.d)) {
                    return tc3Var.f(l35Var4);
                }
                qi2.k("Blocked Shiro resource host");
                return null;
        }
    }

    public l35 b(p45 p45Var, qb0 qb0Var) {
        s75 s75Var;
        ra2 ra2Var;
        ws2 ws2Var;
        p45 p45Var2;
        ez4 ez4Var;
        o35 o35Var = null;
        if (qb0Var != null && (ez4Var = (ez4) qb0Var.B) != null) {
            s75Var = ez4Var.b;
        } else {
            s75Var = null;
        }
        int i = p45Var.A;
        String str = p45Var.x.b;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                }
                            } else if (((jd4) this.b).C && (((p45Var2 = p45Var.G) == null || p45Var2.A != 408) && d(p45Var, 0) <= 0)) {
                                return p45Var.x;
                            }
                        } else {
                            s75Var.getClass();
                            if (s75Var.b.type() == Proxy.Type.HTTP) {
                                ((jd4) this.b).J.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        p45 p45Var3 = p45Var.G;
                        if ((p45Var3 == null || p45Var3.A != 503) && d(p45Var, Integer.MAX_VALUE) == 0) {
                            return p45Var.x;
                        }
                    }
                } else if (qb0Var != null && !a34.i(((yw1) qb0Var.z).b.h.d, ((ez4) qb0Var.B).b.a.h.d)) {
                    ez4 ez4Var2 = (ez4) qb0Var.B;
                    synchronized (ez4Var2) {
                        ez4Var2.k = true;
                    }
                    return p45Var.x;
                }
                return null;
            }
            ((jd4) this.b).D.getClass();
            return null;
        }
        jd4 jd4Var = (jd4) this.b;
        if (jd4Var.E) {
            String a = p45.a(p45Var, "Location");
            l35 l35Var = p45Var.x;
            if (a != null) {
                ws2 ws2Var2 = l35Var.a;
                ws2Var2.getClass();
                try {
                    ra2Var = new ra2((byte) 1);
                    ra2Var.n(ws2Var2, a);
                } catch (IllegalArgumentException unused) {
                    ra2Var = null;
                }
                if (ra2Var != null) {
                    ws2Var = ra2Var.a();
                } else {
                    ws2Var = null;
                }
                if (ws2Var != null && (a34.i(ws2Var.a, l35Var.a.a) || jd4Var.F)) {
                    kz a2 = l35Var.a();
                    if (x97.I(str)) {
                        int i2 = p45Var.A;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z = true;
                        }
                        if (!str.equals("PROPFIND") && i2 != 308 && i2 != 307) {
                            a2.B("GET", null);
                        } else {
                            if (z) {
                                o35Var = l35Var.d;
                            }
                            a2.B(str, o35Var);
                        }
                        if (!z) {
                            ((gk2) a2.z).l("Transfer-Encoding");
                            ((gk2) a2.z).l("Content-Length");
                            ((gk2) a2.z).l("Content-Type");
                        }
                    }
                    if (!dq6.a(l35Var.a, ws2Var)) {
                        ((gk2) a2.z).l("Authorization");
                    }
                    a2.x = ws2Var;
                    return a2.r();
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, bz4 bz4Var, l35 l35Var, boolean z) {
        boolean z2;
        sp spVar;
        ez4 ez4Var;
        if (((jd4) this.b).C && ((!z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            yw1 yw1Var = bz4Var.D;
            yw1Var.getClass();
            int i = yw1Var.f;
            if (i == 0 && yw1Var.g == 0 && yw1Var.h == 0) {
                z2 = false;
            } else {
                if (yw1Var.i == null) {
                    s75 s75Var = null;
                    if (i <= 1 && yw1Var.g <= 1 && yw1Var.h <= 0 && (ez4Var = yw1Var.c.E) != null) {
                        synchronized (ez4Var) {
                            if (ez4Var.l == 0) {
                                if (dq6.a(ez4Var.b.a.h, yw1Var.b.h)) {
                                    s75Var = ez4Var.b;
                                }
                            }
                        }
                    }
                    if (s75Var != null) {
                        yw1Var.i = s75Var;
                    } else {
                        fr0 fr0Var = yw1Var.d;
                        if ((fr0Var == null || !fr0Var.l()) && (spVar = yw1Var.e) != null) {
                            z2 = spVar.e();
                        }
                    }
                }
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public r90(tq6 tq6Var) {
        this.b = tq6Var;
    }

    public r90(jd4 jd4Var) {
        jd4Var.getClass();
        this.b = jd4Var;
    }
}
