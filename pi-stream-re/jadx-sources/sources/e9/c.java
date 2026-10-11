package e9;

import k9.k;
import k9.u;
import k9.y;
import r6.h0;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3602a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3604c;

    public c(h hVar) {
        this.f3604c = hVar;
        this.f3602a = new k(hVar.f3618d.c());
    }

    @Override // k9.u
    public final y c() {
        return this.f3602a;
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3603b) {
            return;
        }
        this.f3603b = true;
        this.f3604c.f3618d.B("0\r\n\r\n");
        h hVar = this.f3604c;
        k kVar = this.f3602a;
        hVar.getClass();
        y yVar = kVar.f6526e;
        kVar.f6526e = y.f6558d;
        yVar.a();
        yVar.b();
        this.f3604c.f3619e = 3;
    }

    @Override // k9.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3603b) {
            return;
        }
        this.f3604c.f3618d.flush();
    }

    @Override // k9.u
    public final void w(k9.g gVar, long j4) {
        h0.u(gVar, "source");
        if (!this.f3603b) {
            if (j4 == 0) {
                return;
            }
            h hVar = this.f3604c;
            hVar.f3618d.g(j4);
            k9.h hVar2 = hVar.f3618d;
            hVar2.B("\r\n");
            hVar2.w(gVar, j4);
            hVar2.B("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
