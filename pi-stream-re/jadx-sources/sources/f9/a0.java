package f9;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class a0 extends k9.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f3973m;

    public a0(b0 b0Var) {
        this.f3973m = b0Var;
    }

    @Override // k9.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // k9.e
    public final void k() {
        this.f3973m.e(b.CANCEL);
        t tVar = this.f3973m.f3983b;
        synchronized (tVar) {
            long j4 = tVar.G;
            long j10 = tVar.F;
            if (j4 >= j10) {
                tVar.F = j10 + 1;
                tVar.H = System.nanoTime() + 1000000000;
                tVar.f4087z.c(new b9.b(2, tVar, a3.g.t(new StringBuilder(), tVar.f4082d, " ping")), 0L);
            }
        }
    }

    public final void l() {
        if (!i()) {
        } else {
            throw j(null);
        }
    }
}
