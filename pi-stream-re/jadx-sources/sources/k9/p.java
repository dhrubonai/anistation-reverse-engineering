package k9;

import java.nio.ByteBuffer;
import r6.h0;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final u f6539a;

    /* renamed from: b, reason: collision with root package name */
    public final g f6540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6541c;

    public p(u uVar) {
        h0.u(uVar, "sink");
        this.f6539a = uVar;
        this.f6540b = new g();
    }

    @Override // k9.h
    public final h B(String str) {
        h0.u(str, "string");
        if (!this.f6541c) {
            this.f6540b.Q(str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h C(long j4) {
        if (!this.f6541c) {
            this.f6540b.L(j4);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h a() {
        if (!this.f6541c) {
            g gVar = this.f6540b;
            long j4 = gVar.f6521b;
            if (j4 == 0) {
                j4 = 0;
            } else {
                r rVar = gVar.f6520a;
                h0.q(rVar);
                r rVar2 = rVar.f6551g;
                h0.q(rVar2);
                if (rVar2.f6547c < 8192 && rVar2.f6549e) {
                    j4 -= r6 - rVar2.f6546b;
                }
            }
            if (j4 > 0) {
                this.f6539a.w(gVar, j4);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.u
    public final y c() {
        return this.f6539a.c();
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f6539a;
        if (!this.f6541c) {
            try {
                g gVar = this.f6540b;
                long j4 = gVar.f6521b;
                if (j4 > 0) {
                    uVar.w(gVar, j4);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                uVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f6541c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // k9.h
    public final h d(byte[] bArr, int i10, int i11) {
        h0.u(bArr, "source");
        if (!this.f6541c) {
            this.f6540b.J(bArr, i10, i11);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final long e(w wVar) {
        long j4 = 0;
        while (true) {
            long z9 = ((d) wVar).z(this.f6540b, 8192L);
            if (z9 != -1) {
                j4 += z9;
                a();
            } else {
                return j4;
            }
        }
    }

    @Override // k9.h, k9.u, java.io.Flushable
    public final void flush() {
        if (!this.f6541c) {
            g gVar = this.f6540b;
            long j4 = gVar.f6521b;
            u uVar = this.f6539a;
            if (j4 > 0) {
                uVar.w(gVar, j4);
            }
            uVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h g(long j4) {
        if (!this.f6541c) {
            this.f6540b.M(j4);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h i(int i10) {
        if (!this.f6541c) {
            this.f6540b.O(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6541c;
    }

    @Override // k9.h
    public final h j(int i10) {
        if (!this.f6541c) {
            this.f6540b.N(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h o(int i10) {
        if (!this.f6541c) {
            this.f6540b.K(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h p(byte[] bArr) {
        h0.u(bArr, "source");
        if (!this.f6541c) {
            g gVar = this.f6540b;
            gVar.getClass();
            gVar.J(bArr, 0, bArr.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f6539a + ')';
    }

    @Override // k9.u
    public final void w(g gVar, long j4) {
        h0.u(gVar, "source");
        if (!this.f6541c) {
            this.f6540b.w(gVar, j4);
            a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h0.u(byteBuffer, "source");
        if (!this.f6541c) {
            int write = this.f6540b.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.h
    public final h y(j jVar) {
        h0.u(jVar, "byteString");
        if (!this.f6541c) {
            this.f6540b.I(jVar);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
