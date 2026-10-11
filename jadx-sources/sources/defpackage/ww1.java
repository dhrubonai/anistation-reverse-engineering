package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ww1 extends la2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public final /* synthetic */ qb0 D;
    public final long y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww1(qb0 qb0Var, bv5 bv5Var, long j) {
        super(bv5Var);
        bv5Var.getClass();
        this.D = qb0Var;
        this.y = j;
        this.A = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.B) {
            return iOException;
        }
        this.B = true;
        if (iOException == null && this.A) {
            this.A = false;
        }
        return this.D.b(true, false, iOException);
    }

    @Override // defpackage.la2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.C) {
            return;
        }
        this.C = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.la2, defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (!this.C) {
            try {
                long j0 = this.x.j0(j, pa0Var);
                if (this.A) {
                    this.A = false;
                }
                if (j0 == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.z + j0;
                long j3 = this.y;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
                }
                this.z = j2;
                if (j2 == j3) {
                    a(null);
                }
                return j0;
            } catch (IOException e) {
                throw a(e);
            }
        }
        ze0.m("closed");
        return 0L;
    }
}
