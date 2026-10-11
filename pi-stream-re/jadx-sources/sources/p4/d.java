package p4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f8558a;

    /* renamed from: b, reason: collision with root package name */
    public int f8559b;

    public d(InputStream inputStream, long j4) {
        super(inputStream);
        this.f8558a = j4;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f8559b += i10;
            return;
        }
        long j4 = this.f8559b;
        long j10 = this.f8558a;
        if (j10 - j4 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.f8559b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f8558a - this.f8559b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
