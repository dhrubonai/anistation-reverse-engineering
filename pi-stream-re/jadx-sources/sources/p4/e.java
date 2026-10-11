package p4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f8560c;

    /* renamed from: a, reason: collision with root package name */
    public InputStream f8561a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f8562b;

    static {
        char[] cArr = m.f8575a;
        f8560c = new ArrayDeque(0);
    }

    public final void a() {
        this.f8562b = null;
        this.f8561a = null;
        ArrayDeque arrayDeque = f8560c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8561a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8561a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f8561a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f8561a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f8561a.read();
        } catch (IOException e10) {
            this.f8562b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f8561a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j4) {
        try {
            return this.f8561a.skip(j4);
        } catch (IOException e10) {
            this.f8562b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f8561a.read(bArr);
        } catch (IOException e10) {
            this.f8562b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f8561a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f8562b = e10;
            throw e10;
        }
    }
}
