package h1;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f4584a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4585b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4587d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4588e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4586c = new byte[1];

    public j(h hVar, l lVar) {
        this.f4584a = hVar;
        this.f4585b = lVar;
    }

    public final void a() {
        if (!this.f4587d) {
            this.f4584a.m(this.f4585b);
            this.f4587d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f4588e) {
            this.f4584a.close();
            this.f4588e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4586c;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        w7.b.u(!this.f4588e);
        a();
        int p3 = this.f4584a.p(bArr, i10, i11);
        if (p3 == -1) {
            return -1;
        }
        return p3;
    }
}
