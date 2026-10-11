package e9;

import k9.k;
import k9.u;
import k9.y;
import r6.h0;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3611a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3613c;

    public f(h hVar) {
        this.f3613c = hVar;
        this.f3611a = new k(hVar.f3618d.c());
    }

    @Override // k9.u
    public final y c() {
        return this.f3611a;
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3612b) {
            return;
        }
        this.f3612b = true;
        h hVar = this.f3613c;
        hVar.getClass();
        k kVar = this.f3611a;
        y yVar = kVar.f6526e;
        kVar.f6526e = y.f6558d;
        yVar.a();
        yVar.b();
        hVar.f3619e = 3;
    }

    @Override // k9.u, java.io.Flushable
    public final void flush() {
        if (this.f3612b) {
            return;
        }
        this.f3613c.f3618d.flush();
    }

    @Override // k9.u
    public final void w(k9.g gVar, long j4) {
        h0.u(gVar, "source");
        if (!this.f3612b) {
            long j10 = gVar.f6521b;
            byte[] bArr = z8.b.f12133a;
            if ((0 | j4) >= 0 && 0 <= j10 && j10 - 0 >= j4) {
                this.f3613c.f3618d.w(gVar, j4);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalStateException("closed".toString());
    }
}
