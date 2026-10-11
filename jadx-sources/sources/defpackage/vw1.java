package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vw1 implements pq5 {
    public long A;
    public boolean B;
    public final /* synthetic */ qb0 C;
    public final pq5 x;
    public final long y;
    public boolean z;

    public vw1(qb0 qb0Var, pq5 pq5Var, long j) {
        pq5Var.getClass();
        this.C = qb0Var;
        this.x = pq5Var;
        this.y = j;
    }

    public final void a() {
        this.x.close();
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        long j = this.y;
        if (j != -1 && this.A != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            l(null);
        } catch (IOException e) {
            throw l(e);
        }
    }

    @Override // defpackage.pq5
    public final of6 d() {
        return this.x.d();
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        if (!this.B) {
            long j2 = this.y;
            if (j2 != -1 && this.A + j > j2) {
                StringBuilder n = zo5.n(j2, "expected ", " bytes but received ");
                n.append(this.A + j);
                throw new ProtocolException(n.toString());
            }
            try {
                this.x.f0(j, pa0Var);
                this.A += j;
                return;
            } catch (IOException e) {
                throw l(e);
            }
        }
        ze0.m("closed");
    }

    @Override // defpackage.pq5, java.io.Flushable
    public final void flush() {
        try {
            p();
        } catch (IOException e) {
            throw l(e);
        }
    }

    public final IOException l(IOException iOException) {
        if (this.z) {
            return iOException;
        }
        this.z = true;
        return this.C.b(false, true, iOException);
    }

    public final void p() {
        this.x.flush();
    }

    public final String toString() {
        return vw1.class.getSimpleName() + '(' + this.x + ')';
    }
}
