package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fp2 implements xw1 {
    public static final List g = dq6.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = dq6.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final ez4 a;
    public final tc3 b;
    public final ep2 c;
    public volatile lp2 d;
    public final iw4 e;
    public volatile boolean f;

    public fp2(jd4 jd4Var, ez4 ez4Var, tc3 tc3Var, ep2 ep2Var) {
        jd4Var.getClass();
        ep2Var.getClass();
        this.a = ez4Var;
        this.b = tc3Var;
        this.c = ep2Var;
        List list = jd4Var.O;
        iw4 iw4Var = iw4.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(iw4Var) ? iw4Var : iw4.HTTP_2;
    }

    @Override // defpackage.xw1
    public final bv5 a(p45 p45Var) {
        lp2 lp2Var = this.d;
        lp2Var.getClass();
        return lp2Var.i;
    }

    @Override // defpackage.xw1
    public final void b() {
        lp2 lp2Var = this.d;
        lp2Var.getClass();
        lp2Var.f().close();
    }

    @Override // defpackage.xw1
    public final pq5 c(l35 l35Var, long j) {
        l35Var.getClass();
        lp2 lp2Var = this.d;
        lp2Var.getClass();
        return lp2Var.f();
    }

    @Override // defpackage.xw1
    public final void cancel() {
        this.f = true;
        lp2 lp2Var = this.d;
        if (lp2Var != null) {
            lp2Var.e(9);
        }
    }

    @Override // defpackage.xw1
    public final o45 d(boolean z) {
        ik2 ik2Var;
        lp2 lp2Var = this.d;
        if (lp2Var != null) {
            synchronized (lp2Var) {
                lp2Var.k.h();
                while (lp2Var.g.isEmpty() && lp2Var.m == 0) {
                    try {
                        try {
                            lp2Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        lp2Var.k.k();
                        throw th;
                    }
                }
                lp2Var.k.k();
                if (!lp2Var.g.isEmpty()) {
                    Object removeFirst = lp2Var.g.removeFirst();
                    removeFirst.getClass();
                    ik2Var = (ik2) removeFirst;
                } else {
                    IOException iOException = lp2Var.n;
                    if (iOException == null) {
                        int i = lp2Var.m;
                        if (i == 0) {
                            throw null;
                        }
                        throw new yy5(i);
                    }
                    throw iOException;
                }
            }
            iw4 iw4Var = this.e;
            ArrayList arrayList = new ArrayList(20);
            int size = ik2Var.size();
            eb2 eb2Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                String c = ik2Var.c(i2);
                String g2 = ik2Var.g(i2);
                if (a34.i(c, ":status")) {
                    eb2Var = jy5.g("HTTP/1.1 " + g2);
                } else if (!h.contains(c)) {
                    c.getClass();
                    g2.getClass();
                    arrayList.add(c);
                    arrayList.add(uz5.w0(g2).toString());
                }
            }
            if (eb2Var != null) {
                o45 o45Var = new o45();
                o45Var.b = iw4Var;
                o45Var.c = eb2Var.y;
                o45Var.d = (String) eb2Var.A;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                gk2 gk2Var = new gk2((byte) 0);
                dp0.Z(gk2Var.a, strArr);
                o45Var.f = gk2Var;
                if (z && o45Var.c == 100) {
                    return null;
                }
                return o45Var;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        qi2.k("stream wasn't created");
        return null;
    }

    @Override // defpackage.xw1
    public final long e(p45 p45Var) {
        if (!pq2.a(p45Var)) {
            return 0L;
        }
        return dq6.j(p45Var);
    }

    @Override // defpackage.xw1
    public final ez4 f() {
        return this.a;
    }

    @Override // defpackage.xw1
    public final void g(l35 l35Var) {
        boolean z;
        int i;
        lp2 lp2Var;
        l35Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = false;
        if (l35Var.d != null) {
            z = true;
        } else {
            z = false;
        }
        ik2 ik2Var = l35Var.c;
        ArrayList arrayList = new ArrayList(ik2Var.size() + 4);
        arrayList.add(new ak2(ak2.f, l35Var.b));
        zd0 zd0Var = ak2.g;
        ws2 ws2Var = l35Var.a;
        ws2Var.getClass();
        String b = ws2Var.b();
        String d = ws2Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new ak2(zd0Var, b));
        String b2 = ik2Var.b("Host");
        if (b2 != null) {
            arrayList.add(new ak2(ak2.i, b2));
        }
        arrayList.add(new ak2(ak2.h, ws2Var.a));
        int size = ik2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String c = ik2Var.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = c.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && a34.i(ik2Var.g(i2), "trailers"))) {
                arrayList.add(new ak2(lowerCase, ik2Var.g(i2)));
            }
        }
        ep2 ep2Var = this.c;
        ep2Var.getClass();
        boolean z3 = !z;
        synchronized (ep2Var.T) {
            synchronized (ep2Var) {
                try {
                    if (ep2Var.B > 1073741823) {
                        ep2Var.q(8);
                    }
                    if (!ep2Var.C) {
                        i = ep2Var.B;
                        ep2Var.B = i + 2;
                        lp2Var = new lp2(i, ep2Var, z3, false, null);
                        if (!z || ep2Var.Q >= ep2Var.R || lp2Var.e >= lp2Var.f) {
                            z2 = true;
                        }
                        if (lp2Var.h()) {
                            ep2Var.y.put(Integer.valueOf(i), lp2Var);
                        }
                    } else {
                        throw new IOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ep2Var.T.t(z3, i, arrayList);
        }
        if (z2) {
            ep2Var.T.flush();
        }
        this.d = lp2Var;
        boolean z4 = this.f;
        lp2 lp2Var2 = this.d;
        if (!z4) {
            lp2Var2.getClass();
            kp2 kp2Var = lp2Var2.k;
            long j = this.b.d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kp2Var.g(j, timeUnit);
            lp2 lp2Var3 = this.d;
            lp2Var3.getClass();
            lp2Var3.l.g(this.b.e, timeUnit);
            return;
        }
        lp2Var2.getClass();
        lp2Var2.e(9);
        qi2.k("Canceled");
    }

    @Override // defpackage.xw1
    public final void h() {
        this.c.flush();
    }
}
