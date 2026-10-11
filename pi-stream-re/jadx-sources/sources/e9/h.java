package e9;

import c9.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import k9.i;
import k9.u;
import o7.j;
import r6.h0;
import y8.b0;
import y8.c0;
import y8.d0;
import y8.o;
import y8.p;
import y8.q;
import y8.w;
import y8.x;

/* loaded from: classes.dex */
public final class h implements d9.d {

    /* renamed from: a, reason: collision with root package name */
    public final w f3615a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final k9.h f3618d;

    /* renamed from: e, reason: collision with root package name */
    public int f3619e;

    /* renamed from: f, reason: collision with root package name */
    public final a f3620f;

    /* renamed from: g, reason: collision with root package name */
    public o f3621g;

    public h(w wVar, k kVar, i iVar, k9.h hVar) {
        h0.u(kVar, "connection");
        this.f3615a = wVar;
        this.f3616b = kVar;
        this.f3617c = iVar;
        this.f3618d = hVar;
        this.f3620f = new a(iVar);
    }

    @Override // d9.d
    public final u a(androidx.appcompat.widget.w wVar, long j4) {
        b0 b0Var = (b0) wVar.f684e;
        if (b0Var != null) {
            b0Var.getClass();
        }
        boolean z9 = true;
        if (j.l1("chunked", ((o) wVar.f683d).b("Transfer-Encoding"))) {
            if (this.f3619e != 1) {
                z9 = false;
            }
            if (z9) {
                this.f3619e = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f3619e).toString());
        }
        if (j4 != -1) {
            if (this.f3619e != 1) {
                z9 = false;
            }
            if (z9) {
                this.f3619e = 2;
                return new f(this);
            }
            throw new IllegalStateException(("state: " + this.f3619e).toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // d9.d
    public final void b() {
        this.f3618d.flush();
    }

    @Override // d9.d
    public final void c() {
        this.f3618d.flush();
    }

    @Override // d9.d
    public final void cancel() {
        Socket socket = this.f3616b.f2139c;
        if (socket != null) {
            z8.b.d(socket);
        }
    }

    @Override // d9.d
    public final void d(androidx.appcompat.widget.w wVar) {
        boolean z9;
        Proxy.Type type = this.f3616b.f2138b.f11731b.type();
        h0.s(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) wVar.f682c);
        sb.append(' ');
        Object obj = wVar.f681b;
        if (!((q) obj).f11789j && type == Proxy.Type.HTTP) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            sb.append((q) obj);
        } else {
            q qVar = (q) obj;
            h0.u(qVar, "url");
            String b10 = qVar.b();
            String d10 = qVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb.append(b10);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
        j((o) wVar.f683d, sb2);
    }

    @Override // d9.d
    public final long e(d0 d0Var) {
        if (!d9.e.a(d0Var)) {
            return 0L;
        }
        if (j.l1("chunked", d0.a(d0Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return z8.b.j(d0Var);
    }

    @Override // d9.d
    public final k9.w f(d0 d0Var) {
        if (!d9.e.a(d0Var)) {
            return i(0L);
        }
        boolean z9 = true;
        if (j.l1("chunked", d0.a(d0Var, "Transfer-Encoding"))) {
            q qVar = (q) d0Var.f11691a.f681b;
            if (this.f3619e != 4) {
                z9 = false;
            }
            if (z9) {
                this.f3619e = 5;
                return new d(this, qVar);
            }
            throw new IllegalStateException(("state: " + this.f3619e).toString());
        }
        long j4 = z8.b.j(d0Var);
        if (j4 != -1) {
            return i(j4);
        }
        if (this.f3619e != 4) {
            z9 = false;
        }
        if (z9) {
            this.f3619e = 5;
            this.f3616b.l();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f3619e).toString());
    }

    @Override // d9.d
    public final c0 g(boolean z9) {
        boolean z10;
        a aVar = this.f3620f;
        int i10 = this.f3619e;
        boolean z11 = false;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            p pVar = null;
            try {
                String u9 = aVar.f3597a.u(aVar.f3598b);
                aVar.f3598b -= u9.length();
                d9.h r8 = y8.j.r(u9);
                int i11 = r8.f3267b;
                c0 c0Var = new c0();
                x xVar = r8.f3266a;
                h0.u(xVar, "protocol");
                c0Var.f11679b = xVar;
                c0Var.f11680c = i11;
                String str = r8.f3268c;
                h0.u(str, "message");
                c0Var.f11681d = str;
                c0Var.f11683f = aVar.a().d();
                if (z9 && i11 == 100) {
                    return null;
                }
                if (i11 == 100) {
                    this.f3619e = 3;
                } else {
                    if (102 <= i11 && i11 < 200) {
                        z11 = true;
                    }
                    if (z11) {
                        this.f3619e = 3;
                    } else {
                        this.f3619e = 4;
                    }
                }
                return c0Var;
            } catch (EOFException e10) {
                q qVar = this.f3616b.f2138b.f11730a.f11655i;
                qVar.getClass();
                try {
                    p pVar2 = new p();
                    pVar2.c(qVar, "/...");
                    pVar = pVar2;
                } catch (IllegalArgumentException unused) {
                }
                h0.q(pVar);
                char[] cArr = q.f11779k;
                pVar.f11772b = y8.j.c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                pVar.f11773c = y8.j.c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                throw new IOException("unexpected end of stream on " + pVar.a().f11788i, e10);
            }
        }
        throw new IllegalStateException(("state: " + this.f3619e).toString());
    }

    @Override // d9.d
    public final k h() {
        return this.f3616b;
    }

    public final e i(long j4) {
        boolean z9;
        if (this.f3619e == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f3619e = 5;
            return new e(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f3619e).toString());
    }

    public final void j(o oVar, String str) {
        boolean z9;
        h0.u(oVar, "headers");
        h0.u(str, "requestLine");
        if (this.f3619e == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            k9.h hVar = this.f3618d;
            hVar.B(str).B("\r\n");
            int length = oVar.f11770a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                hVar.B(oVar.c(i10)).B(": ").B(oVar.e(i10)).B("\r\n");
            }
            hVar.B("\r\n");
            this.f3619e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f3619e).toString());
    }
}
