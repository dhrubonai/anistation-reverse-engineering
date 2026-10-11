package com.unity3d.coherence;

import defpackage.uo0;
import defpackage.vo0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e implements vo0 {
    public byte[] A;
    public long[] B;
    public boolean C;
    public final long x;
    public final ReentrantReadWriteLock y = new ReentrantReadWriteLock();
    public final AtomicInteger z = new AtomicInteger();

    public e(long j, byte[] bArr) {
        if (bArr.length != 0) {
            this.x = j;
            this.A = (byte[]) bArr.clone();
            this.B = new long[1];
            try {
                a();
                return;
            } catch (uo0 e) {
                long[] jArr = this.B;
                if (jArr != null) {
                    for (int i = 0; i < jArr.length; i++) {
                        long j2 = jArr[i];
                        if (j2 != 0) {
                            CoherenceBridge.vmDrop(this.x, j2);
                            jArr[i] = 0;
                        }
                    }
                }
                throw e;
            }
        }
        throw new Exception("wasmBytes is null or empty");
    }

    public final void a() {
        for (int i = 0; i < this.B.length; i++) {
            byte[] bArr = this.A;
            long j = this.x;
            long vmCreate = CoherenceBridge.vmCreate(j, bArr);
            if (vmCreate != 0) {
                this.B[i] = vmCreate;
            } else {
                throw new Exception("create_vm failed on slot " + i + ": " + CoherenceBridge.vmLastError(j));
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.y;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.C) {
                this.C = true;
                long[] jArr = this.B;
                if (jArr != null) {
                    for (int i = 0; i < jArr.length; i++) {
                        long j = jArr[i];
                        if (j != 0) {
                            CoherenceBridge.vmDrop(this.x, j);
                            jArr[i] = 0;
                        }
                    }
                }
                this.B = new long[0];
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final byte[] l(byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.y;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (!this.C) {
                if (this.B.length != 0) {
                    int floorMod = Math.floorMod(this.z.getAndIncrement(), this.B.length);
                    long j = this.B[floorMod];
                    if (j != 0) {
                        try {
                            VmInvokeResult vmInvokeMain = CoherenceBridge.vmInvokeMain(this.x, j, bArr);
                            if (vmInvokeMain.status == 0) {
                                byte[] bArr2 = vmInvokeMain.bytes;
                                if (bArr2 == null) {
                                    bArr2 = new byte[0];
                                }
                                return bArr2;
                            }
                            String str = vmInvokeMain.errorMessage;
                            if (str == null) {
                                str = "";
                            }
                            throw new Exception(str);
                        } catch (Throwable th) {
                            throw new Exception(th.toString());
                        }
                    }
                    throw new Exception("slot " + floorMod + " has no VM");
                }
                throw new Exception("no VMs");
            }
            throw new Exception("pipeline closed");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final void p(byte[] bArr) {
        if (bArr.length != 0) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.y;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (!this.C) {
                    this.A = (byte[]) bArr.clone();
                    String str = null;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        long[] jArr = this.B;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        long j = jArr[i2];
                        long j2 = this.x;
                        if (j != 0) {
                            CoherenceBridge.vmDrop(j2, j);
                            this.B[i2] = 0;
                        }
                        long vmCreate = CoherenceBridge.vmCreate(j2, this.A);
                        if (vmCreate == 0 && str == null) {
                            str = CoherenceBridge.vmLastError(j2);
                            i = i2;
                        }
                        this.B[i2] = vmCreate;
                        i2++;
                    }
                    if (str == null) {
                        reentrantReadWriteLock.writeLock().unlock();
                        return;
                    }
                    throw new Exception("create_vm failed on slot " + i + ": " + str);
                }
                throw new Exception("pipeline closed");
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        }
        throw new Exception("wasmBytes is null or empty");
    }
}
