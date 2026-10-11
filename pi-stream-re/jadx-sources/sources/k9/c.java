package k9;

import java.io.IOException;
import java.io.OutputStream;
import r6.h0;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6504a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6505b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6506c;

    public c(v vVar, c cVar) {
        this.f6505b = vVar;
        this.f6506c = cVar;
    }

    @Override // k9.u
    public final y c() {
        switch (this.f6504a) {
            case 0:
                return (e) this.f6505b;
            default:
                return (y) this.f6506c;
        }
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f6504a;
        Object obj = this.f6505b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                u uVar = (u) this.f6506c;
                eVar.h();
                try {
                    uVar.close();
                    if (!eVar.i()) {
                        return;
                    } else {
                        throw eVar.j(null);
                    }
                } catch (IOException e10) {
                    if (!eVar.i()) {
                        throw e10;
                    }
                    throw eVar.j(e10);
                } finally {
                    eVar.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // k9.u, java.io.Flushable
    public final void flush() {
        int i10 = this.f6504a;
        Object obj = this.f6505b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                u uVar = (u) this.f6506c;
                eVar.h();
                try {
                    uVar.flush();
                    if (!eVar.i()) {
                        return;
                    } else {
                        throw eVar.j(null);
                    }
                } catch (IOException e10) {
                    if (!eVar.i()) {
                        throw e10;
                    }
                    throw eVar.j(e10);
                } finally {
                    eVar.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f6504a) {
            case 0:
                return "AsyncTimeout.sink(" + ((u) this.f6506c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f6505b) + ')';
        }
    }

    @Override // k9.u
    public final void w(g gVar, long j4) {
        int i10 = this.f6504a;
        Object obj = this.f6506c;
        Object obj2 = this.f6505b;
        switch (i10) {
            case 0:
                h0.u(gVar, "source");
                q6.g.h(gVar.f6521b, 0L, j4);
                while (j4 > 0) {
                    r rVar = gVar.f6520a;
                    h0.q(rVar);
                    long j10 = 0;
                    while (true) {
                        if (j10 < 65536) {
                            j10 += rVar.f6547c - rVar.f6546b;
                            if (j10 >= j4) {
                                j10 = j4;
                            } else {
                                rVar = rVar.f6550f;
                                h0.q(rVar);
                            }
                        }
                    }
                    e eVar = (e) obj2;
                    u uVar = (u) obj;
                    eVar.h();
                    try {
                        uVar.w(gVar, j10);
                        if (!eVar.i()) {
                            j4 -= j10;
                        } else {
                            throw eVar.j(null);
                        }
                    } catch (IOException e10) {
                        if (!eVar.i()) {
                            throw e10;
                        }
                        throw eVar.j(e10);
                    } finally {
                        eVar.i();
                    }
                }
                return;
            default:
                h0.u(gVar, "source");
                q6.g.h(gVar.f6521b, 0L, j4);
                while (j4 > 0) {
                    ((y) obj).f();
                    r rVar2 = gVar.f6520a;
                    h0.q(rVar2);
                    int min = (int) Math.min(j4, rVar2.f6547c - rVar2.f6546b);
                    ((OutputStream) obj2).write(rVar2.f6545a, rVar2.f6546b, min);
                    int i11 = rVar2.f6546b + min;
                    rVar2.f6546b = i11;
                    long j11 = min;
                    j4 -= j11;
                    gVar.f6521b -= j11;
                    if (i11 == rVar2.f6547c) {
                        gVar.f6520a = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public c(OutputStream outputStream, v vVar) {
        this.f6505b = outputStream;
        this.f6506c = vVar;
    }
}
