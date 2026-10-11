package f9;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public final class u implements d9.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4088g = z8.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f4089h = z8.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final c9.k f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.f f4091b;

    /* renamed from: c, reason: collision with root package name */
    public final t f4092c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f4093d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.x f4094e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4095f;

    public u(y8.w wVar, c9.k kVar, d9.f fVar, t tVar) {
        h0.u(kVar, "connection");
        this.f4090a = kVar;
        this.f4091b = fVar;
        this.f4092c = tVar;
        y8.x xVar = y8.x.H2_PRIOR_KNOWLEDGE;
        this.f4094e = wVar.J.contains(xVar) ? xVar : y8.x.HTTP_2;
    }

    @Override // d9.d
    public final k9.u a(androidx.appcompat.widget.w wVar, long j4) {
        b0 b0Var = this.f4093d;
        h0.q(b0Var);
        return b0Var.g();
    }

    @Override // d9.d
    public final void b() {
        b0 b0Var = this.f4093d;
        h0.q(b0Var);
        b0Var.g().close();
    }

    @Override // d9.d
    public final void c() {
        this.f4092c.flush();
    }

    @Override // d9.d
    public final void cancel() {
        this.f4095f = true;
        b0 b0Var = this.f4093d;
        if (b0Var != null) {
            b0Var.e(b.CANCEL);
        }
    }

    @Override // d9.d
    public final void d(androidx.appcompat.widget.w wVar) {
        boolean z9;
        int i10;
        b0 b0Var;
        if (this.f4093d != null) {
            return;
        }
        boolean z10 = true;
        if (((y8.b0) wVar.f684e) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        y8.o oVar = (y8.o) wVar.f683d;
        ArrayList arrayList = new ArrayList((oVar.f11770a.length / 2) + 4);
        arrayList.add(new c(c.f3998f, (String) wVar.f682c));
        k9.j jVar = c.f3999g;
        y8.q qVar = (y8.q) wVar.f681b;
        h0.u(qVar, "url");
        String b10 = qVar.b();
        String d10 = qVar.d();
        if (d10 != null) {
            b10 = b10 + '?' + d10;
        }
        arrayList.add(new c(jVar, b10));
        String b11 = ((y8.o) wVar.f683d).b("Host");
        if (b11 != null) {
            arrayList.add(new c(c.f4001i, b11));
        }
        arrayList.add(new c(c.f4000h, qVar.f11780a));
        int length = oVar.f11770a.length / 2;
        for (int i11 = 0; i11 < length; i11++) {
            String c6 = oVar.c(i11);
            Locale locale = Locale.US;
            h0.s(locale, "US");
            String lowerCase = c6.toLowerCase(locale);
            h0.s(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4088g.contains(lowerCase) || (h0.g(lowerCase, "te") && h0.g(oVar.e(i11), "trailers"))) {
                arrayList.add(new c(lowerCase, oVar.e(i11)));
            }
        }
        t tVar = this.f4092c;
        tVar.getClass();
        boolean z11 = !z9;
        synchronized (tVar.P) {
            synchronized (tVar) {
                if (tVar.f4084f > 1073741823) {
                    tVar.v(b.REFUSED_STREAM);
                }
                if (!tVar.f4085x) {
                    i10 = tVar.f4084f;
                    tVar.f4084f = i10 + 2;
                    b0Var = new b0(i10, tVar, z11, false, null);
                    if (z9 && tVar.M < tVar.N && b0Var.f3986e < b0Var.f3987f) {
                        z10 = false;
                    }
                    if (b0Var.i()) {
                        tVar.f4081c.put(Integer.valueOf(i10), b0Var);
                    }
                } else {
                    throw new a();
                }
            }
            tVar.P.t(i10, arrayList, z11);
        }
        if (z10) {
            tVar.P.flush();
        }
        this.f4093d = b0Var;
        if (!this.f4095f) {
            b0 b0Var2 = this.f4093d;
            h0.q(b0Var2);
            a0 a0Var = b0Var2.f3992k;
            long j4 = this.f4091b.f3262g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a0Var.g(j4, timeUnit);
            b0 b0Var3 = this.f4093d;
            h0.q(b0Var3);
            b0Var3.f3993l.g(this.f4091b.f3263h, timeUnit);
            return;
        }
        b0 b0Var4 = this.f4093d;
        h0.q(b0Var4);
        b0Var4.e(b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // d9.d
    public final long e(y8.d0 d0Var) {
        if (!d9.e.a(d0Var)) {
            return 0L;
        }
        return z8.b.j(d0Var);
    }

    @Override // d9.d
    public final k9.w f(y8.d0 d0Var) {
        b0 b0Var = this.f4093d;
        h0.q(b0Var);
        return b0Var.f3990i;
    }

    @Override // d9.d
    public final y8.c0 g(boolean z9) {
        y8.o oVar;
        b0 b0Var = this.f4093d;
        if (b0Var != null) {
            synchronized (b0Var) {
                b0Var.f3992k.h();
                while (b0Var.f3988g.isEmpty() && b0Var.f3994m == null) {
                    try {
                        b0Var.l();
                    } catch (Throwable th) {
                        b0Var.f3992k.l();
                        throw th;
                    }
                }
                b0Var.f3992k.l();
                if (!b0Var.f3988g.isEmpty()) {
                    Object removeFirst = b0Var.f3988g.removeFirst();
                    h0.s(removeFirst, "headersQueue.removeFirst()");
                    oVar = (y8.o) removeFirst;
                } else {
                    IOException iOException = b0Var.f3995n;
                    if (iOException == null) {
                        b bVar = b0Var.f3994m;
                        h0.q(bVar);
                        throw new g0(bVar);
                    }
                    throw iOException;
                }
            }
            y8.x xVar = this.f4094e;
            h0.u(xVar, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int length = oVar.f11770a.length / 2;
            d9.h hVar = null;
            for (int i10 = 0; i10 < length; i10++) {
                String c6 = oVar.c(i10);
                String e10 = oVar.e(i10);
                if (h0.g(c6, ":status")) {
                    hVar = y8.j.r("HTTP/1.1 " + e10);
                } else if (!f4089h.contains(c6)) {
                    h0.u(c6, "name");
                    h0.u(e10, "value");
                    arrayList.add(c6);
                    arrayList.add(o7.j.G1(e10).toString());
                }
            }
            if (hVar != null) {
                y8.c0 c0Var = new y8.c0();
                c0Var.f11679b = xVar;
                c0Var.f11680c = hVar.f3267b;
                String str = hVar.f3268c;
                h0.u(str, "message");
                c0Var.f11681d = str;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                h4.c cVar = new h4.c();
                ArrayList arrayList2 = cVar.f5004a;
                h0.u(arrayList2, "<this>");
                h0.u(strArr, "elements");
                arrayList2.addAll(x6.i.g1(strArr));
                c0Var.f11683f = cVar;
                if (z9 && c0Var.f11680c == 100) {
                    return null;
                }
                return c0Var;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // d9.d
    public final c9.k h() {
        return this.f4090a;
    }
}
