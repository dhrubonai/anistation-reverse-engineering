package d9;

import androidx.lifecycle.q0;
import c9.k;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.regex.Pattern;
import r6.h0;
import y8.b0;
import y8.d0;
import y8.g0;
import y8.p;
import y8.q;
import y8.r;
import y8.w;
import y8.y;

/* loaded from: classes.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final w f3265a;

    public g(w wVar) {
        h0.u(wVar, "client");
        this.f3265a = wVar;
    }

    public static int d(d0 d0Var, int i10) {
        String a10 = d0.a(d0Var, "Retry-After");
        if (a10 == null) {
            return i10;
        }
        Pattern compile = Pattern.compile("\\d+");
        h0.s(compile, "compile(...)");
        if (compile.matcher(a10).matches()) {
            Integer valueOf = Integer.valueOf(a10);
            h0.s(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // y8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y8.d0 a(d9.f r32) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.g.a(d9.f):y8.d0");
    }

    public final androidx.appcompat.widget.w b(d0 d0Var, c9.e eVar) {
        g0 g0Var;
        String a10;
        p pVar;
        q qVar;
        k kVar;
        b0 b0Var = null;
        if (eVar != null && (kVar = eVar.f2115g) != null) {
            g0Var = kVar.f2138b;
        } else {
            g0Var = null;
        }
        int i10 = d0Var.f11694d;
        String str = (String) d0Var.f11691a.f682c;
        boolean z9 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 != 421) {
                    if (i10 != 503) {
                        if (i10 != 407) {
                            if (i10 != 408) {
                                switch (i10) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.f3265a.f11835f) {
                                    return null;
                                }
                                d0 d0Var2 = d0Var.A;
                                if ((d0Var2 != null && d0Var2.f11694d == 408) || d(d0Var, 0) > 0) {
                                    return null;
                                }
                                return d0Var.f11691a;
                            }
                        } else {
                            h0.q(g0Var);
                            if (g0Var.f11731b.type() == Proxy.Type.HTTP) {
                                ((q0) this.f3265a.E).getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        d0 d0Var3 = d0Var.A;
                        if ((d0Var3 != null && d0Var3.f11694d == 503) || d(d0Var, com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != 0) {
                            return null;
                        }
                        return d0Var.f11691a;
                    }
                } else {
                    if (eVar == null || !(!h0.g(eVar.f2111c.f2117b.f11655i.f11783d, eVar.f2115g.f2138b.f11730a.f11655i.f11783d))) {
                        return null;
                    }
                    k kVar2 = eVar.f2115g;
                    synchronized (kVar2) {
                        kVar2.f2147k = true;
                    }
                    return d0Var.f11691a;
                }
            } else {
                ((q0) this.f3265a.f11836x).getClass();
                return null;
            }
        }
        w wVar = this.f3265a;
        if (!wVar.f11837y || (a10 = d0.a(d0Var, "Location")) == null) {
            return null;
        }
        androidx.appcompat.widget.w wVar2 = d0Var.f11691a;
        q qVar2 = (q) wVar2.f681b;
        qVar2.getClass();
        try {
            pVar = new p();
            pVar.c(qVar2, a10);
        } catch (IllegalArgumentException unused) {
            pVar = null;
        }
        if (pVar != null) {
            qVar = pVar.a();
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return null;
        }
        if (!h0.g(qVar.f11780a, ((q) wVar2.f681b).f11780a) && !wVar.f11838z) {
            return null;
        }
        y yVar = new y(wVar2);
        if (q6.g.K(str)) {
            boolean g10 = h0.g(str, "PROPFIND");
            int i11 = d0Var.f11694d;
            if (g10 || i11 == 308 || i11 == 307) {
                z9 = true;
            }
            if ((true ^ h0.g(str, "PROPFIND")) && i11 != 308 && i11 != 307) {
                yVar.c("GET", null);
            } else {
                if (z9) {
                    b0Var = (b0) wVar2.f684e;
                }
                yVar.c(str, b0Var);
            }
            if (!z9) {
                yVar.f11849c.f("Transfer-Encoding");
                yVar.f11849c.f("Content-Length");
                yVar.f11849c.f("Content-Type");
            }
        }
        if (!z8.b.a((q) wVar2.f681b, qVar)) {
            yVar.f11849c.f("Authorization");
        }
        yVar.f11847a = qVar;
        return yVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.io.IOException r3, c9.i r4, androidx.appcompat.widget.w r5, boolean r6) {
        /*
            r2 = this;
            y8.w r5 = r2.f3265a
            boolean r5 = r5.f11835f
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            if (r6 == 0) goto Lf
            boolean r5 = r3 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto Lf
            return r0
        Lf:
            boolean r5 = r3 instanceof java.net.ProtocolException
            r1 = 1
            if (r5 == 0) goto L15
            goto L31
        L15:
            boolean r5 = r3 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L20
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L31
            if (r6 != 0) goto L31
            goto L33
        L20:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L2d
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L2d
            goto L31
        L2d:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L37
            return r0
        L37:
            c9.f r3 = r4.f2136z
            r6.h0.q(r3)
            int r4 = r3.f2122g
            if (r4 != 0) goto L4b
            int r5 = r3.f2123h
            if (r5 != 0) goto L4b
            int r5 = r3.f2124i
            if (r5 != 0) goto L4b
            r3 = r0
            goto La2
        L4b:
            y8.g0 r5 = r3.f2125j
            if (r5 == 0) goto L50
            goto L9c
        L50:
            if (r4 > r1) goto L82
            int r4 = r3.f2123h
            if (r4 > r1) goto L82
            int r4 = r3.f2124i
            if (r4 <= 0) goto L5b
            goto L82
        L5b:
            c9.i r4 = r3.f2118c
            c9.k r4 = r4.A
            if (r4 != 0) goto L62
            goto L82
        L62:
            monitor-enter(r4)
            int r5 = r4.f2148l     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L69
            monitor-exit(r4)
            goto L82
        L69:
            y8.g0 r5 = r4.f2138b     // Catch: java.lang.Throwable -> L7f
            y8.a r5 = r5.f11730a     // Catch: java.lang.Throwable -> L7f
            y8.q r5 = r5.f11655i     // Catch: java.lang.Throwable -> L7f
            y8.a r6 = r3.f2117b     // Catch: java.lang.Throwable -> L7f
            y8.q r6 = r6.f11655i     // Catch: java.lang.Throwable -> L7f
            boolean r5 = z8.b.a(r5, r6)     // Catch: java.lang.Throwable -> L7f
            if (r5 != 0) goto L7b
            monitor-exit(r4)
            goto L82
        L7b:
            y8.g0 r5 = r4.f2138b     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r4)
            goto L83
        L7f:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L82:
            r5 = 0
        L83:
            if (r5 == 0) goto L88
            r3.f2125j = r5
            goto L9c
        L88:
            d0.h r4 = r3.f2120e
            if (r4 == 0) goto L94
            boolean r4 = r4.m()
            if (r4 != r1) goto L94
            r4 = r1
            goto L95
        L94:
            r4 = r0
        L95:
            if (r4 == 0) goto L98
            goto L9c
        L98:
            c9.n r3 = r3.f2121f
            if (r3 != 0) goto L9e
        L9c:
            r3 = r1
            goto La2
        L9e:
            boolean r3 = r3.a()
        La2:
            if (r3 != 0) goto La5
            return r0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.g.c(java.io.IOException, c9.i, androidx.appcompat.widget.w, boolean):boolean");
    }
}
