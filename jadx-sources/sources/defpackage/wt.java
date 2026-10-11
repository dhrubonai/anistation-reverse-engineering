package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wt implements pq5 {
    public final /* synthetic */ byte x;
    public final Object y;
    public final Object z;

    public /* synthetic */ wt(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                iu5 iu5Var = (iu5) obj;
                wt wtVar = (wt) this.z;
                iu5Var.h();
                try {
                    wtVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.pq5
    public final of6 d() {
        switch (this.x) {
            case 0:
                return (iu5) this.y;
            default:
                return (of6) this.z;
        }
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        long j2;
        byte b = this.x;
        Object obj = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                tl7.m(pa0Var.y, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    zf5 zf5Var = pa0Var.x;
                    zf5Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += zf5Var.c - zf5Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                zf5Var = zf5Var.f;
                                zf5Var.getClass();
                            }
                        }
                    }
                    iu5 iu5Var = (iu5) obj;
                    wt wtVar = (wt) obj2;
                    iu5Var.h();
                    try {
                        wtVar.f0(j2, pa0Var);
                        if (iu5Var.i()) {
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
                }
                return;
            default:
                tl7.m(pa0Var.y, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((of6) obj2).f();
                    zf5 zf5Var2 = pa0Var.x;
                    zf5Var2.getClass();
                    int min = (int) Math.min(j4, zf5Var2.c - zf5Var2.b);
                    ((OutputStream) obj).write(zf5Var2.a, zf5Var2.b, min);
                    int i = zf5Var2.b + min;
                    zf5Var2.b = i;
                    long j5 = min;
                    j4 -= j5;
                    pa0Var.y -= j5;
                    if (i == zf5Var2.c) {
                        pa0Var.x = zf5Var2.a();
                        hg5.a(zf5Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.pq5, java.io.Flushable
    public final void flush() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                iu5 iu5Var = (iu5) obj;
                wt wtVar = (wt) this.z;
                iu5Var.h();
                try {
                    wtVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.x) {
            case 0:
                return "AsyncTimeout.sink(" + ((wt) this.z) + ')';
            default:
                return "sink(" + ((OutputStream) this.y) + ')';
        }
    }
}
