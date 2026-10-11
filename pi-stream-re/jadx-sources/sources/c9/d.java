package c9;

import androidx.lifecycle.q0;
import java.io.IOException;
import java.net.ProtocolException;
import k9.w;
import k9.y;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2103b;

    /* renamed from: c, reason: collision with root package name */
    public long f2104c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2106e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2107f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f2108x;

    public d(e eVar, w wVar, long j4) {
        h0.u(wVar, "delegate");
        this.f2108x = eVar;
        this.f2102a = wVar;
        this.f2103b = j4;
        this.f2105d = true;
        if (j4 == 0) {
            f(null);
        }
    }

    public final void a() {
        this.f2102a.close();
    }

    @Override // k9.w
    public final y c() {
        return this.f2102a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2107f) {
            return;
        }
        this.f2107f = true;
        try {
            a();
            f(null);
        } catch (IOException e10) {
            throw f(e10);
        }
    }

    public final IOException f(IOException iOException) {
        if (this.f2106e) {
            return iOException;
        }
        this.f2106e = true;
        e eVar = this.f2108x;
        if (iOException == null && this.f2105d) {
            this.f2105d = false;
            eVar.f2110b.getClass();
            h0.u(eVar.f2109a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f2102a + ')';
    }

    @Override // k9.w
    public final long z(k9.g gVar, long j4) {
        h0.u(gVar, "sink");
        if (!this.f2107f) {
            try {
                long z9 = this.f2102a.z(gVar, j4);
                if (this.f2105d) {
                    this.f2105d = false;
                    e eVar = this.f2108x;
                    q0 q0Var = eVar.f2110b;
                    i iVar = eVar.f2109a;
                    q0Var.getClass();
                    h0.u(iVar, "call");
                }
                if (z9 == -1) {
                    f(null);
                    return -1L;
                }
                long j10 = this.f2104c + z9;
                long j11 = this.f2103b;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
                }
                this.f2104c = j10;
                if (j10 == j11) {
                    f(null);
                }
                return z9;
            } catch (IOException e10) {
                throw f(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
