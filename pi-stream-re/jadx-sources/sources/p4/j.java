package p4;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f8570a;

    public j(e eVar) {
        super(eVar);
        this.f8570a = Integer.MIN_VALUE;
    }

    public final long a(long j4) {
        int i10 = this.f8570a;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j4 > i10) {
            return i10;
        }
        return j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i10 = this.f8570a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final void f(long j4) {
        int i10 = this.f8570a;
        if (i10 != Integer.MIN_VALUE && j4 != -1) {
            this.f8570a = (int) (i10 - j4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f8570a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        f(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f8570a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long a10 = a(j4);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        f(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a(i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        f(read);
        return read;
    }
}
