package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uz2 implements iy4 {
    public final InputStream x;

    public uz2(InputStream inputStream) {
        inputStream.getClass();
        this.x = inputStream;
    }

    @Override // defpackage.iy4
    public final long C(oa0 oa0Var, long j) {
        int i;
        if (j == 0) {
            return 0L;
        }
        if (j >= 0) {
            yf5 T = oa0Var.T(1);
            long read = this.x.read(T.a, T.c, (int) Math.min(j, r2.length - r3));
            if (read == -1) {
                i = 0;
            } else {
                i = (int) read;
            }
            if (i == 1) {
                T.c += i;
                oa0Var.z += i;
                return read;
            }
            if (i >= 0 && i <= T.a()) {
                if (i != 0) {
                    T.c += i;
                    oa0Var.z += i;
                    return read;
                }
                if (db.Z(T)) {
                    oa0Var.t();
                }
                return read;
            }
            StringBuilder s = qx1.s(i, "Invalid number of bytes written: ", ". Should be in 0..");
            s.append(T.a());
            throw new IllegalStateException(s.toString().toString());
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
        return 0L;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    public final String toString() {
        return "RawSource(" + this.x + ')';
    }
}
