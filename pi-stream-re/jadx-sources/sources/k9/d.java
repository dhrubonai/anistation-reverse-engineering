package k9;

import java.io.IOException;
import java.io.InputStream;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6507a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6508b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6509c;

    public d(v vVar, d dVar) {
        this.f6508b = vVar;
        this.f6509c = dVar;
    }

    @Override // k9.w
    public final y c() {
        switch (this.f6507a) {
            case 0:
                return (e) this.f6508b;
            default:
                return (y) this.f6509c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f6507a;
        Object obj = this.f6508b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                w wVar = (w) this.f6509c;
                eVar.h();
                try {
                    wVar.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f6507a) {
            case 0:
                return "AsyncTimeout.source(" + ((w) this.f6509c) + ')';
            default:
                return "source(" + ((InputStream) this.f6508b) + ')';
        }
    }

    @Override // k9.w
    public final long z(g gVar, long j4) {
        boolean z9;
        int i10 = this.f6507a;
        Object obj = this.f6509c;
        Object obj2 = this.f6508b;
        switch (i10) {
            case 0:
                h0.u(gVar, "sink");
                e eVar = (e) obj2;
                w wVar = (w) obj;
                eVar.h();
                try {
                    long z10 = wVar.z(gVar, j4);
                    if (!eVar.i()) {
                        return z10;
                    }
                    throw eVar.j(null);
                } catch (IOException e10) {
                    if (!eVar.i()) {
                        throw e10;
                    }
                    throw eVar.j(e10);
                } finally {
                    eVar.i();
                }
            default:
                h0.u(gVar, "sink");
                if (j4 == 0) {
                    return 0L;
                }
                if (j4 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    try {
                        ((y) obj).f();
                        r H = gVar.H(1);
                        int read = ((InputStream) obj2).read(H.f6545a, H.f6547c, (int) Math.min(j4, 8192 - H.f6547c));
                        if (read == -1) {
                            if (H.f6546b == H.f6547c) {
                                gVar.f6520a = H.a();
                                s.a(H);
                            }
                            return -1L;
                        }
                        H.f6547c += read;
                        long j10 = read;
                        gVar.f6521b += j10;
                        return j10;
                    } catch (AssertionError e11) {
                        if (com.bumptech.glide.c.D(e11)) {
                            throw new IOException(e11);
                        }
                        throw e11;
                    }
                }
                throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
        }
    }

    public d(InputStream inputStream, y yVar) {
        this.f6508b = inputStream;
        this.f6509c = yVar;
    }
}
