package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p81 implements c12 {
    public long A;
    public int C;
    public int D;
    public final m41 y;
    public final long z;
    public byte[] B = new byte[65536];
    public final byte[] x = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    static {
        cr3.a("media3.extractor");
    }

    public p81(m41 m41Var, long j, long j2) {
        this.y = m41Var;
        this.A = j;
        this.z = j2;
    }

    @Override // defpackage.c12
    public final void A(byte[] bArr, int i, int i2) {
        j(bArr, i, i2, false);
    }

    public final void a(int i) {
        int i2 = this.C + i;
        byte[] bArr = this.B;
        if (i2 > bArr.length) {
            this.B = Arrays.copyOf(this.B, eq6.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.y.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    public final void c(int i) {
        byte[] bArr;
        int i2 = this.D - i;
        this.D = i2;
        this.C = 0;
        byte[] bArr2 = this.B;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.B = bArr;
    }

    @Override // defpackage.c12
    public final boolean g(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.D;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.B, 0, bArr, i, min);
            c(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = b(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.A += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c12
    public final long getPosition() {
        return this.A;
    }

    @Override // defpackage.c12
    public final boolean i(int i, boolean z) {
        int min = Math.min(this.D, i);
        c(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.x;
            i2 = b(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.A += i2;
        }
        if (i2 != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c12
    public final boolean j(byte[] bArr, int i, int i2, boolean z) {
        if (!x(i2, z)) {
            return false;
        }
        System.arraycopy(this.B, this.C - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.c12
    public final long k() {
        return this.A + this.C;
    }

    @Override // defpackage.c12
    public final void l(int i) {
        x(i, false);
    }

    @Override // defpackage.c12
    public final int n(int i) {
        p81 p81Var;
        int min = Math.min(this.D, i);
        c(min);
        if (min == 0) {
            byte[] bArr = this.x;
            p81Var = this;
            min = p81Var.b(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            p81Var = this;
        }
        if (min != -1) {
            p81Var.A += min;
        }
        return min;
    }

    @Override // defpackage.c12
    public final long p() {
        return this.z;
    }

    @Override // defpackage.c12
    public final int r(byte[] bArr, int i, int i2) {
        p81 p81Var;
        int min;
        a(i2);
        int i3 = this.D;
        int i4 = this.C;
        int i5 = i3 - i4;
        if (i5 == 0) {
            p81Var = this;
            min = p81Var.b(this.B, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            p81Var.D += min;
        } else {
            p81Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(p81Var.B, p81Var.C, bArr, i, min);
        p81Var.C += min;
        return min;
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        p81 p81Var;
        int i3 = this.D;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.B, 0, bArr, i, min);
            c(min);
            i4 = min;
        }
        if (i4 == 0) {
            p81Var = this;
            i4 = p81Var.b(bArr, i, i2, 0, true);
        } else {
            p81Var = this;
        }
        if (i4 != -1) {
            p81Var.A += i4;
        }
        return i4;
    }

    @Override // defpackage.c12
    public final void readFully(byte[] bArr, int i, int i2) {
        g(bArr, i, i2, false);
    }

    @Override // defpackage.c12
    public final void u() {
        this.C = 0;
    }

    @Override // defpackage.c12
    public final void v(int i) {
        i(i, false);
    }

    @Override // defpackage.c12
    public final boolean x(int i, boolean z) {
        a(i);
        int i2 = this.D - this.C;
        while (i2 < i) {
            p81 p81Var = this;
            int i3 = i;
            boolean z2 = z;
            i2 = p81Var.b(this.B, this.C, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            p81Var.D = p81Var.C + i2;
            this = p81Var;
            i = i3;
            z = z2;
        }
        this.C += i;
        return true;
    }
}
