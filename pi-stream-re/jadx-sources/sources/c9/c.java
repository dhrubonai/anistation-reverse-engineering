package c9;

import java.io.IOException;
import java.net.ProtocolException;
import k9.u;
import k9.y;
import r6.h0;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2097b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2098c;

    /* renamed from: d, reason: collision with root package name */
    public long f2099d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f2101f;

    public c(e eVar, u uVar, long j4) {
        h0.u(uVar, "delegate");
        this.f2101f = eVar;
        this.f2096a = uVar;
        this.f2097b = j4;
    }

    public final void a() {
        this.f2096a.close();
    }

    @Override // k9.u
    public final y c() {
        return this.f2096a.c();
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2100e) {
            return;
        }
        this.f2100e = true;
        long j4 = this.f2097b;
        if (j4 != -1 && this.f2099d != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            f(null);
        } catch (IOException e10) {
            throw f(e10);
        }
    }

    public final IOException f(IOException iOException) {
        if (this.f2098c) {
            return iOException;
        }
        this.f2098c = true;
        return this.f2101f.a(false, true, iOException);
    }

    @Override // k9.u, java.io.Flushable
    public final void flush() {
        try {
            q();
        } catch (IOException e10) {
            throw f(e10);
        }
    }

    public final void q() {
        this.f2096a.flush();
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f2096a + ')';
    }

    @Override // k9.u
    public final void w(k9.g gVar, long j4) {
        h0.u(gVar, "source");
        if (!this.f2100e) {
            long j10 = this.f2097b;
            if (j10 != -1 && this.f2099d + j4 > j10) {
                throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f2099d + j4));
            }
            try {
                this.f2096a.w(gVar, j4);
                this.f2099d += j4;
                return;
            } catch (IOException e10) {
                throw f(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
