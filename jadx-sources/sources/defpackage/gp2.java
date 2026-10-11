package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gp2 implements bv5 {
    public int A;
    public int B;
    public int C;
    public final db0 x;
    public int y;
    public int z;

    public gp2(db0 db0Var) {
        this.x = db0Var;
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x.d();
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        int i;
        int readInt;
        pa0Var.getClass();
        do {
            int i2 = this.B;
            db0 db0Var = this.x;
            if (i2 == 0) {
                db0Var.skip(this.C);
                this.C = 0;
                if ((this.z & 4) == 0) {
                    i = this.A;
                    int s = dq6.s(db0Var);
                    this.B = s;
                    this.y = s;
                    int readByte = db0Var.readByte() & 255;
                    this.z = db0Var.readByte() & 255;
                    Logger logger = hp2.A;
                    if (logger.isLoggable(Level.FINE)) {
                        zd0 zd0Var = vo2.a;
                        logger.fine(vo2.a(true, this.A, this.y, readByte, this.z));
                    }
                    readInt = db0Var.readInt() & Integer.MAX_VALUE;
                    this.A = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j0 = db0Var.j0(Math.min(j, i2), pa0Var);
                if (j0 != -1) {
                    this.B -= (int) j0;
                    return j0;
                }
            }
            return -1L;
        } while (readInt == i);
        qi2.k("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
