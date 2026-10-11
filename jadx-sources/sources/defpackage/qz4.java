package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qz4 implements cv5 {
    public final rk4 x;
    public boolean y;
    public final oa0 z = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oa0] */
    public qz4(rk4 rk4Var) {
        this.x = rk4Var;
    }

    @Override // defpackage.iy4
    public final long C(oa0 oa0Var, long j) {
        if (!this.y) {
            if (j >= 0) {
                oa0 oa0Var2 = this.z;
                if (oa0Var2.z == 0 && this.x.C(oa0Var2, 8192L) == -1) {
                    return -1L;
                }
                return oa0Var2.C(oa0Var, Math.min(j, oa0Var2.z));
            }
            ze0.e(h11.h(j, "byteCount: "));
            return 0L;
        }
        ze0.m("Source is closed.");
        return 0L;
    }

    @Override // defpackage.cv5
    public final boolean D() {
        if (!this.y) {
            oa0 oa0Var = this.z;
            if (!oa0Var.D() || this.x.C(oa0Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        ze0.m("Source is closed.");
        return false;
    }

    @Override // defpackage.cv5
    public final int E(byte[] bArr, int i, int i2) {
        q23.j(bArr.length, i, i2);
        oa0 oa0Var = this.z;
        if (oa0Var.z == 0 && this.x.C(oa0Var, 8192L) == -1) {
            return -1;
        }
        return oa0Var.E(bArr, i, ((int) Math.min(i2 - i, oa0Var.z)) + i);
    }

    @Override // defpackage.cv5
    public final oa0 c() {
        return this.z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.x.B = true;
        oa0 oa0Var = this.z;
        oa0Var.skip(oa0Var.z);
    }

    @Override // defpackage.cv5
    public final boolean g(long j) {
        oa0 oa0Var;
        if (!this.y) {
            if (j < 0) {
                ze0.e(h11.h(j, "byteCount: "));
                return false;
            }
            do {
                oa0Var = this.z;
                if (oa0Var.z >= j) {
                    return true;
                }
            } while (this.x.C(oa0Var, 8192L) != -1);
            return false;
        }
        ze0.m("Source is closed.");
        return false;
    }

    @Override // defpackage.cv5
    public final void m(long j) {
        if (g(j)) {
        } else {
            throw new EOFException(qx1.j(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // defpackage.cv5
    public final byte readByte() {
        m(1L);
        return this.z.readByte();
    }

    @Override // defpackage.cv5
    public final int readInt() {
        m(4L);
        return this.z.readInt();
    }

    @Override // defpackage.cv5
    public final long readLong() {
        m(8L);
        return this.z.readLong();
    }

    public final String toString() {
        return "buffered(" + this.x + ')';
    }
}
