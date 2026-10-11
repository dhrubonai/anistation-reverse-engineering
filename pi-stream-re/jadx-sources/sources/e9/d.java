package e9;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o7.j;
import r6.h0;
import y8.o;
import y8.q;
import y8.w;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public final q f3605d;

    /* renamed from: e, reason: collision with root package name */
    public long f3606e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3607f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f3608x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, q qVar) {
        super(hVar);
        h0.u(qVar, "url");
        this.f3608x = hVar;
        this.f3605d = qVar;
        this.f3606e = -1L;
        this.f3607f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3600b) {
            return;
        }
        if (this.f3607f && !z8.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f3608x.f3616b.l();
            a();
        }
        this.f3600b = true;
    }

    @Override // e9.b, k9.w
    public final long z(k9.g gVar, long j4) {
        boolean z9;
        h0.u(gVar, "sink");
        boolean z10 = true;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!this.f3600b) {
                if (!this.f3607f) {
                    return -1L;
                }
                long j10 = this.f3606e;
                h hVar = this.f3608x;
                if (j10 == 0 || j10 == -1) {
                    if (j10 != -1) {
                        hVar.f3617c.k();
                    }
                    try {
                        this.f3606e = hVar.f3617c.D();
                        String obj = j.G1(hVar.f3617c.k()).toString();
                        if (this.f3606e >= 0) {
                            if (obj.length() <= 0) {
                                z10 = false;
                            }
                            if (!z10 || j.C1(obj, ";", false)) {
                                if (this.f3606e == 0) {
                                    this.f3607f = false;
                                    hVar.f3621g = hVar.f3620f.a();
                                    w wVar = hVar.f3615a;
                                    h0.q(wVar);
                                    o oVar = hVar.f3621g;
                                    h0.q(oVar);
                                    d9.e.b(wVar.A, this.f3605d, oVar);
                                    a();
                                }
                                if (!this.f3607f) {
                                    return -1L;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3606e + obj + '\"');
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long z11 = super.z(gVar, Math.min(j4, this.f3606e));
                if (z11 != -1) {
                    this.f3606e -= z11;
                    return z11;
                }
                hVar.f3616b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
