package v1;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 implements z1.l {
    public long A;
    public u0 C;
    public boolean D;
    public final /* synthetic */ m0 E;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10441b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.d0 f10442c;

    /* renamed from: d, reason: collision with root package name */
    public final f.c f10443d;

    /* renamed from: e, reason: collision with root package name */
    public final d2.r f10444e;

    /* renamed from: f, reason: collision with root package name */
    public final c1.r f10445f;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f10447y;

    /* renamed from: x, reason: collision with root package name */
    public final d2.t f10446x = new d2.t();

    /* renamed from: z, reason: collision with root package name */
    public boolean f10448z = true;

    /* renamed from: a, reason: collision with root package name */
    public final long f10440a = n.f10478b.getAndIncrement();
    public h1.l B = a(0);

    public i0(m0 m0Var, Uri uri, h1.h hVar, f.c cVar, d2.r rVar, c1.r rVar2) {
        this.E = m0Var;
        this.f10441b = uri;
        this.f10442c = new h1.d0(hVar);
        this.f10443d = cVar;
        this.f10444e = rVar;
        this.f10445f = rVar2;
    }

    public final h1.l a(long j4) {
        Collections.emptyMap();
        String str = this.E.f10477z;
        Map map = m0.f10463e0;
        Uri uri = this.f10441b;
        w7.b.x(uri, "The uri must be set.");
        return new h1.l(uri, 0L, 1, null, map, j4, -1L, str, 6, null);
    }

    @Override // z1.l
    public final void c() {
        h1.h hVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.f10447y) {
            try {
                long j4 = this.f10446x.f3191a;
                h1.l a10 = a(j4);
                this.B = a10;
                long m5 = this.f10442c.m(a10);
                if (this.f10447y) {
                    if (i11 != 1 && this.f10443d.m() != -1) {
                        this.f10446x.f3191a = this.f10443d.m();
                    }
                    w7.b.C(this.f10442c);
                    return;
                }
                if (m5 != -1) {
                    m5 += j4;
                    m0 m0Var = this.E;
                    m0Var.G.post(new g0(m0Var, 2));
                }
                long j10 = m5;
                this.E.J = p2.b.d(this.f10442c.e());
                h1.d0 d0Var = this.f10442c;
                p2.b bVar = this.E.J;
                if (bVar != null && (i10 = bVar.f8551f) != -1) {
                    hVar = new m(d0Var, i10, this);
                    m0 m0Var2 = this.E;
                    m0Var2.getClass();
                    u0 C = m0Var2.C(new k0(0, true));
                    this.C = C;
                    C.b(m0.f10464f0);
                } else {
                    hVar = d0Var;
                }
                long j11 = j4;
                this.f10443d.s(hVar, this.f10441b, this.f10442c.e(), j4, j10, this.f10444e);
                if (this.E.J != null) {
                    Object obj = this.f10443d.f3636c;
                    if (((d2.p) obj) != null) {
                        d2.p c6 = ((d2.p) obj).c();
                        if (c6 instanceof v2.d) {
                            ((v2.d) c6).f10616r = true;
                        }
                    }
                }
                if (this.f10448z) {
                    f.c cVar = this.f10443d;
                    long j12 = this.A;
                    d2.p pVar = (d2.p) cVar.f3636c;
                    pVar.getClass();
                    pVar.e(j11, j12);
                    this.f10448z = false;
                }
                while (true) {
                    long j13 = j11;
                    while (i11 == 0 && !this.f10447y) {
                        try {
                            c1.r rVar = this.f10445f;
                            synchronized (rVar) {
                                while (!rVar.f1885a) {
                                    rVar.wait();
                                }
                            }
                            f.c cVar2 = this.f10443d;
                            d2.t tVar = this.f10446x;
                            d2.p pVar2 = (d2.p) cVar2.f3636c;
                            pVar2.getClass();
                            d2.q qVar = (d2.q) cVar2.f3637d;
                            qVar.getClass();
                            i11 = pVar2.i(qVar, tVar);
                            j11 = this.f10443d.m();
                            if (j11 > this.E.A + j13) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f10445f.c();
                    m0 m0Var3 = this.E;
                    m0Var3.G.post(m0Var3.F);
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f10443d.m() != -1) {
                    this.f10446x.f3191a = this.f10443d.m();
                }
                w7.b.C(this.f10442c);
            } catch (Throwable th) {
                if (i11 != 1 && this.f10443d.m() != -1) {
                    this.f10446x.f3191a = this.f10443d.m();
                }
                w7.b.C(this.f10442c);
                throw th;
            }
        }
    }

    @Override // z1.l
    public final void m() {
        this.f10447y = true;
    }
}
