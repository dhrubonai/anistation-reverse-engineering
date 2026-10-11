package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class so2 extends po2 {
    public long A;
    public final /* synthetic */ uo2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(uo2 uo2Var, long j) {
        super(uo2Var);
        this.B = uo2Var;
        this.A = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.y) {
            return;
        }
        if (this.A != 0) {
            byte[] bArr = dq6.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = dq6.t(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.B.b.k();
                a();
            }
        }
        this.y = true;
    }

    @Override // defpackage.po2, defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (j >= 0) {
            if (!this.y) {
                long j2 = this.A;
                if (j2 == 0) {
                    return -1L;
                }
                long j0 = super.j0(Math.min(j2, j), pa0Var);
                if (j0 != -1) {
                    long j3 = this.A - j0;
                    this.A = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return j0;
                }
                this.B.b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            ze0.m("closed");
            return 0L;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return 0L;
    }
}
