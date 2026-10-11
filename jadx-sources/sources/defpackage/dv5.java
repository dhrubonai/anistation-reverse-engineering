package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dv5 implements wc0 {
    public final cv5 b;
    private volatile zn0 closed;

    public dv5(cv5 cv5Var) {
        this.b = cv5Var;
    }

    @Override // defpackage.wc0
    public final void a(Throwable th) {
        String str;
        if (this.closed != null) {
            return;
        }
        this.b.close();
        if (th == null || (str = th.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        this.closed = new zn0(new IOException(str, th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public final Throwable b() {
        Throwable th;
        zn0 zn0Var = this.closed;
        if (zn0Var != null && (th = zn0Var.a) != 0) {
            if (th instanceof m01) {
                return ((m01) th).a();
            }
            if (th instanceof CancellationException) {
                return z51.b(((CancellationException) th).getMessage(), zn0Var.a);
            }
            return new co0(th);
        }
        return null;
    }

    @Override // defpackage.wc0
    public final Object c(int i, xz0 xz0Var) {
        Throwable b = b();
        if (b == null) {
            return Boolean.valueOf(this.b.g(i));
        }
        throw b;
    }

    @Override // defpackage.wc0
    public final oa0 g() {
        Throwable b = b();
        if (b == null) {
            return this.b.c();
        }
        throw b;
    }

    @Override // defpackage.wc0
    public final boolean h() {
        return this.b.D();
    }
}
