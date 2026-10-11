package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z63 implements Closeable {
    public final RandomAccessFile A;
    public boolean x;
    public int y;
    public final ReentrantLock z = new ReentrantLock();

    public z63(RandomAccessFile randomAccessFile) {
        this.A = randomAccessFile;
    }

    public final c22 a(long j) {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (!this.x) {
                this.y++;
                reentrantLock.unlock();
                return new c22(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (this.x) {
                return;
            }
            this.x = true;
            if (this.y != 0) {
                return;
            }
            synchronized (this) {
                this.A.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (!this.x) {
                synchronized (this) {
                    length = this.A.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }
}
