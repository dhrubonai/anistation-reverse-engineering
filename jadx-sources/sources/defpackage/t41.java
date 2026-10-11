package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t41 extends InputStream {
    public final q41 x;
    public final v41 y;
    public boolean A = false;
    public boolean B = false;
    public final byte[] z = new byte[1];

    public t41(q41 q41Var, v41 v41Var) {
        this.x = q41Var;
        this.y = v41Var;
    }

    public final void a() {
        if (!this.A) {
            this.x.h(this.y);
            this.A = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.x.close();
            this.B = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        io3.B(!this.B);
        a();
        int read = this.x.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.z;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
