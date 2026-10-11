package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class k5 extends nj0 implements vz4 {
    @Override // defpackage.t43
    public final boolean L(Throwable th) {
        h98.z(this.A, th);
        return true;
    }

    @Override // defpackage.t43
    public final void W(Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = z51.b(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.B.l(cancellationException);
    }
}
