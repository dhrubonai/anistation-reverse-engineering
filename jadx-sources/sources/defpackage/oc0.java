package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc0 extends InputStream {
    public final wc0 x;
    public final l11 y;

    public oc0(wc0 wc0Var, h43 h43Var) {
        this.x = wc0Var;
        this.y = h43Var == null ? it1.x : h43Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        iv.p(this.x);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        wc0 wc0Var = this.x;
        if (!wc0Var.h()) {
            if (wc0Var.g().D()) {
                bx7.K(this.y, new hu1(this, null, (byte) 2));
            }
            int E = wc0Var.g().E(bArr, i, Math.min(zz.G(wc0Var), i2) + i);
            if (E >= 0) {
                return E;
            }
            if (wc0Var.h()) {
                return -1;
            }
            return 0;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        wc0 wc0Var = this.x;
        if (wc0Var.h()) {
            return -1;
        }
        if (wc0Var.g().D()) {
            bx7.K(this.y, new hu1(this, null, (byte) 2));
        }
        if (wc0Var.h()) {
            return -1;
        }
        return wc0Var.g().readByte() & 255;
    }
}
