package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wy4 implements cb0 {
    public final pq5 x;
    public final pa0 y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    public wy4(pq5 pq5Var) {
        pq5Var.getClass();
        this.x = pq5Var;
        this.y = new Object();
    }

    @Override // defpackage.cb0
    public final cb0 U(int i, byte[] bArr) {
        bArr.getClass();
        if (!this.z) {
            this.y.l0(i, bArr);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 V(String str) {
        str.getClass();
        if (!this.z) {
            this.y.A0(str);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    public final cb0 a() {
        if (!this.z) {
            pa0 pa0Var = this.y;
            long a = pa0Var.a();
            if (a > 0) {
                this.x.f0(a, pa0Var);
            }
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 b0(long j) {
        if (!this.z) {
            this.y.x0(j);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        pq5 pq5Var = this.x;
        if (!this.z) {
            try {
                pa0 pa0Var = this.y;
                long j = pa0Var.y;
                if (j > 0) {
                    pq5Var.f0(j, pa0Var);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                pq5Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.z = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.pq5
    public final of6 d() {
        return this.x.d();
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (!this.z) {
            this.y.f0(j, pa0Var);
            a();
        } else {
            ze0.m("closed");
        }
    }

    @Override // defpackage.cb0, defpackage.pq5, java.io.Flushable
    public final void flush() {
        if (!this.z) {
            pa0 pa0Var = this.y;
            long j = pa0Var.y;
            pq5 pq5Var = this.x;
            if (j > 0) {
                pq5Var.f0(j, pa0Var);
            }
            pq5Var.flush();
            return;
        }
        ze0.m("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.z;
    }

    public final cb0 l(long j) {
        boolean z;
        if (!this.z) {
            pa0 pa0Var = this.y;
            if (j == 0) {
                pa0Var.w0(48);
            } else {
                int i = 0;
                if (j < 0) {
                    j = -j;
                    if (j < 0) {
                        pa0Var.A0("-9223372036854775808");
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                byte[] bArr = b.a;
                int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
                if (j > b.b[numberOfLeadingZeros]) {
                    i = 1;
                }
                int i2 = numberOfLeadingZeros + i;
                if (z) {
                    i2++;
                }
                zf5 k0 = pa0Var.k0(i2);
                byte[] bArr2 = k0.a;
                int i3 = k0.c + i2;
                while (j != 0) {
                    i3--;
                    bArr2[i3] = b.a[(int) (j % 10)];
                    j /= 10;
                }
                if (z) {
                    bArr2[i3 - 1] = 45;
                }
                k0.c += i2;
                pa0Var.y += i2;
            }
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 m0(zd0 zd0Var) {
        zd0Var.getClass();
        if (!this.z) {
            this.y.u0(zd0Var);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    public final String toString() {
        return "buffer(" + this.x + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.z) {
            int write = this.y.write(byteBuffer);
            a();
            return write;
        }
        ze0.m("closed");
        return 0;
    }

    @Override // defpackage.cb0
    public final cb0 writeByte(int i) {
        if (!this.z) {
            this.y.w0(i);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 writeInt(int i) {
        if (!this.z) {
            this.y.y0(i);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 writeShort(int i) {
        if (!this.z) {
            this.y.z0(i);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }

    @Override // defpackage.cb0
    public final cb0 write(byte[] bArr) {
        if (!this.z) {
            this.y.l0(bArr.length, bArr);
            a();
            return this;
        }
        ze0.m("closed");
        return null;
    }
}
