package e9;

import r6.h0;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3614d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3600b) {
            return;
        }
        if (!this.f3614d) {
            a();
        }
        this.f3600b = true;
    }

    @Override // e9.b, k9.w
    public final long z(k9.g gVar, long j4) {
        boolean z9;
        h0.u(gVar, "sink");
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!this.f3600b) {
                if (this.f3614d) {
                    return -1L;
                }
                long z10 = super.z(gVar, j4);
                if (z10 == -1) {
                    this.f3614d = true;
                    a();
                    return -1L;
                }
                return z10;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
