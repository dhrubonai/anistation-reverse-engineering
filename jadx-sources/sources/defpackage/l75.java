package defpackage;

import com.google.protobuf.l;
import com.google.protobuf.u1;
import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l75 extends InputStream {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ u1 D;
    public k75 x;
    public l y;
    public int z;

    public l75(u1 u1Var) {
        this.D = u1Var;
        k75 k75Var = new k75(u1Var);
        this.x = k75Var;
        l next = k75Var.next();
        this.y = next;
        this.z = next.size();
        this.A = 0;
        this.B = 0;
    }

    public final void a() {
        if (this.y != null) {
            int i = this.A;
            int i2 = this.z;
            if (i == i2) {
                this.B += i2;
                this.A = 0;
                if (this.x.hasNext()) {
                    l next = this.x.next();
                    this.y = next;
                    this.z = next.size();
                } else {
                    this.y = null;
                    this.z = 0;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.D.x - (this.B + this.A);
    }

    public final int l(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            a();
            if (this.y == null) {
                break;
            }
            int min = Math.min(this.z - this.A, i3);
            if (bArr != null) {
                this.y.copyTo(bArr, this.A, i, min);
                i += min;
            }
            this.A += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.C = this.B + this.A;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            int l = l(bArr, i, i2);
            if (l == 0) {
                if (i2 <= 0) {
                    if (this.D.x - (this.B + this.A) == 0) {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
            return l;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        k75 k75Var = new k75(this.D);
        this.x = k75Var;
        l next = k75Var.next();
        this.y = next;
        this.z = next.size();
        this.A = 0;
        this.B = 0;
        l(null, 0, this.C);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return l(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        l lVar = this.y;
        if (lVar == null) {
            return -1;
        }
        int i = this.A;
        this.A = i + 1;
        return lVar.byteAt(i) & 255;
    }
}
