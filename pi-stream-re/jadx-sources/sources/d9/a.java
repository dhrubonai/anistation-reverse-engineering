package d9;

import androidx.appcompat.widget.w;
import androidx.lifecycle.q0;
import o7.j;
import r6.h0;
import y8.b0;
import y8.c0;
import y8.d0;
import y8.e0;
import y8.f0;
import y8.l;
import y8.o;
import y8.q;
import y8.r;
import y8.s;
import y8.y;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final l f3253a;

    public a(l lVar) {
        h0.u(lVar, "cookieJar");
        this.f3253a = lVar;
    }

    @Override // y8.r
    public final d0 a(f fVar) {
        f0 f0Var;
        w wVar = fVar.f3260e;
        wVar.getClass();
        y yVar = new y(wVar);
        b0 b0Var = (b0) wVar.f684e;
        if (b0Var != null) {
            s b10 = b0Var.b();
            if (b10 != null) {
                yVar.b("Content-Type", b10.f11792a);
            }
            long a10 = b0Var.a();
            if (a10 != -1) {
                yVar.b("Content-Length", String.valueOf(a10));
                yVar.f11849c.f("Transfer-Encoding");
            } else {
                yVar.b("Transfer-Encoding", "chunked");
                yVar.f11849c.f("Content-Length");
            }
        }
        Object obj = wVar.f683d;
        String b11 = ((o) obj).b("Host");
        boolean z9 = false;
        Object obj2 = wVar.f681b;
        if (b11 == null) {
            yVar.b("Host", z8.b.v((q) obj2, false));
        }
        if (((o) obj).b("Connection") == null) {
            yVar.b("Connection", "Keep-Alive");
        }
        if (((o) obj).b("Accept-Encoding") == null && ((o) obj).b("Range") == null) {
            yVar.b("Accept-Encoding", "gzip");
            z9 = true;
        }
        q qVar = (q) obj2;
        l lVar = this.f3253a;
        ((q0) lVar).getClass();
        h0.u(qVar, "url");
        if (((o) obj).b("User-Agent") == null) {
            yVar.b("User-Agent", "okhttp/4.12.0");
        }
        d0 b12 = fVar.b(yVar.a());
        o oVar = b12.f11696f;
        e.b(lVar, qVar, oVar);
        c0 c0Var = new c0(b12);
        c0Var.f11678a = wVar;
        if (z9 && j.l1("gzip", d0.a(b12, "Content-Encoding")) && e.a(b12) && (f0Var = b12.f11697x) != null) {
            k9.l lVar2 = new k9.l(((e0) f0Var).f11706c);
            h4.c d10 = oVar.d();
            d10.f("Content-Encoding");
            d10.f("Content-Length");
            c0Var.f11683f = d10.b().d();
            c0Var.f11684g = new e0(d0.a(b12, "Content-Type"), -1L, new k9.q(lVar2));
        }
        return c0Var.a();
    }
}
