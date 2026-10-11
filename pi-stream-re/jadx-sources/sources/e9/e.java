package e9;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public long f3609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j4) {
        super(hVar);
        this.f3610e = hVar;
        this.f3609d = j4;
        if (j4 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3600b) {
            return;
        }
        if (this.f3609d != 0 && !z8.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f3610e.f3616b.l();
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
                long j10 = this.f3609d;
                if (j10 == 0) {
                    return -1L;
                }
                long z10 = super.z(gVar, Math.min(j10, j4));
                if (z10 != -1) {
                    long j11 = this.f3609d - z10;
                    this.f3609d = j11;
                    if (j11 == 0) {
                        a();
                    }
                    return z10;
                }
                this.f3610e.f3616b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
