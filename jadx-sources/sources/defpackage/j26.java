package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j26 extends InputStream {
    public final q41 x;
    public long y;

    public j26(q41 q41Var) {
        this.x = q41Var;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        bArr.getClass();
        if (i2 <= 0) {
            return 0;
        }
        long j = this.y;
        q41 q41Var = this.x;
        if (j >= 33554432) {
            if (q41Var.read(new byte[1], 0, 1) != -1) {
                qi2.k("Subtitle exceeds the size limit");
                return 0;
            }
        } else {
            int min = (int) Math.min(i2, 33554432 - j);
            if (min > 0 && (read = q41Var.read(bArr, i, min)) != -1) {
                if (read != 0) {
                    this.y += read;
                    return read;
                }
                qi2.k("Subtitle read made no progress");
                return 0;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
