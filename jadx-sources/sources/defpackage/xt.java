package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xt implements bv5 {
    public final /* synthetic */ byte x = 0;
    public final Object y;
    public final Object z;

    public xt(InputStream inputStream, of6 of6Var) {
        inputStream.getClass();
        this.y = inputStream;
        this.z = of6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                iu5 iu5Var = (iu5) obj;
                xt xtVar = (xt) this.z;
                iu5Var.h();
                try {
                    xtVar.close();
                    if (!iu5Var.i()) {
                        return;
                    } else {
                        throw iu5Var.k(null);
                    }
                } catch (IOException e) {
                    if (!iu5Var.i()) {
                        throw e;
                    }
                    throw iu5Var.k(e);
                } finally {
                    iu5Var.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.bv5
    public final of6 d() {
        switch (this.x) {
            case 0:
                return (iu5) this.y;
            default:
                return (of6) this.z;
        }
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        byte b = this.x;
        Object obj = this.y;
        Object obj2 = this.z;
        pa0Var.getClass();
        switch (b) {
            case 0:
                iu5 iu5Var = (iu5) obj;
                xt xtVar = (xt) obj2;
                iu5Var.h();
                try {
                    long j0 = xtVar.j0(j, pa0Var);
                    if (!iu5Var.i()) {
                        return j0;
                    }
                    throw iu5Var.k(null);
                } catch (IOException e) {
                    if (!iu5Var.i()) {
                        throw e;
                    }
                    throw iu5Var.k(e);
                } finally {
                    iu5Var.i();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    try {
                        ((of6) obj2).f();
                        zf5 k0 = pa0Var.k0(1);
                        int read = ((InputStream) obj).read(k0.a, k0.c, (int) Math.min(j, 8192 - k0.c));
                        if (read == -1) {
                            if (k0.b == k0.c) {
                                pa0Var.x = k0.a();
                                hg5.a(k0);
                            }
                            return -1L;
                        }
                        k0.c += read;
                        long j2 = read;
                        pa0Var.y += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        Logger logger = y97.a;
                        if (e2.getCause() != null) {
                            String message = e2.getMessage();
                            boolean z = false;
                            if (message != null) {
                                z = uz5.M(message, "getsockname failed", false);
                            }
                            if (z) {
                                throw new IOException(e2);
                            }
                        }
                        throw e2;
                    }
                }
                ze0.e(h11.h(j, "byteCount < 0: "));
                return 0L;
        }
    }

    public final String toString() {
        switch (this.x) {
            case 0:
                return "AsyncTimeout.source(" + ((xt) this.z) + ')';
            default:
                return "source(" + ((InputStream) this.y) + ')';
        }
    }

    public xt(iu5 iu5Var, xt xtVar) {
        this.y = iu5Var;
        this.z = xtVar;
    }
}
