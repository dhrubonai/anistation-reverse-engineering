package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c22 implements bv5 {
    public final z63 x;
    public long y;
    public boolean z;

    public c22(z63 z63Var, long j) {
        this.x = z63Var;
        this.y = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z63 z63Var = this.x;
        if (this.z) {
            return;
        }
        this.z = true;
        ReentrantLock reentrantLock = z63Var.z;
        reentrantLock.lock();
        try {
            int i = z63Var.y - 1;
            z63Var.y = i;
            if (i == 0) {
                if (z63Var.x) {
                    synchronized (z63Var) {
                        z63Var.A.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return of6.d;
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        long j2;
        long j3;
        int i;
        pa0Var.getClass();
        if (!this.z) {
            z63 z63Var = this.x;
            long j4 = this.y;
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 < j5) {
                        zf5 k0 = pa0Var.k0(1);
                        byte[] bArr = k0.a;
                        int i2 = k0.c;
                        j2 = -1;
                        int min = (int) Math.min(j5 - j6, 8192 - i2);
                        synchronized (z63Var) {
                            bArr.getClass();
                            z63Var.A.seek(j6);
                            i = 0;
                            while (true) {
                                if (i >= min) {
                                    break;
                                }
                                int read = z63Var.A.read(bArr, i2, min - i);
                                if (read == -1) {
                                    if (i == 0) {
                                        i = -1;
                                    }
                                } else {
                                    i += read;
                                }
                            }
                        }
                        if (i == -1) {
                            if (k0.b == k0.c) {
                                pa0Var.x = k0.a();
                                hg5.a(k0);
                            }
                            if (j4 == j6) {
                                j3 = -1;
                            }
                        } else {
                            k0.c += i;
                            long j7 = i;
                            j6 += j7;
                            pa0Var.y += j7;
                        }
                    } else {
                        j2 = -1;
                        break;
                    }
                }
                j3 = j6 - j4;
                if (j3 != j2) {
                    this.y += j3;
                }
                return j3;
            }
            ze0.e(h11.h(j, "byteCount < 0: "));
            return 0L;
        }
        ze0.m("closed");
        return 0L;
    }
}
