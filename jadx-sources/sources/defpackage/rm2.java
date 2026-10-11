package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rm2 implements bh6 {
    public static final ea2 f;
    public static final ea2 g;
    public final bh6 a;
    public final ea2 b;
    public ea2 c;
    public byte[] d;
    public int e;

    static {
        da2 da2Var = new da2();
        da2Var.o = qy3.n("application/id3");
        f = new ea2(da2Var);
        da2 da2Var2 = new da2();
        da2Var2.o = qy3.n("application/x-emsg");
        g = new ea2(da2Var2);
    }

    public rm2(bh6 bh6Var, int i) {
        this.a = bh6Var;
        if (i != 1) {
            if (i == 3) {
                this.b = g;
            } else {
                ze0.k(qx1.h(i, "Unknown metadataType: "));
                throw null;
            }
        } else {
            this.b = f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.bh6
    public final void a(long j, int i, int i2, int i3, ah6 ah6Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        zi4 zi4Var = new zi4(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.p;
        ea2 ea2Var = this.b;
        String str2 = ea2Var.p;
        String str3 = ea2Var.p;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.c.p)) {
                tw1 Y = kq.Y(zi4Var);
                ea2 a = Y.a();
                if (a != null && Objects.equals(str3, a.p)) {
                    byte[] c = Y.c();
                    c.getClass();
                    zi4Var = new zi4(c);
                } else {
                    kb0.O("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + Y.a());
                    return;
                }
            } else {
                kb0.O("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.p);
                return;
            }
        }
        int a2 = zi4Var.a();
        bh6 bh6Var = this.a;
        bh6Var.e(a2, zi4Var);
        bh6Var.a(j, i, a2, 0, ah6Var);
    }

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            bArr = Arrays.copyOf(bArr, (i3 / 2) + i3);
            this.d = bArr;
        }
        zi4Var.k(bArr, this.e, i);
        this.e += i;
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            bArr = Arrays.copyOf(bArr, (i2 / 2) + i2);
            this.d = bArr;
        }
        int read = m41Var.read(bArr, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
        this.c = ea2Var;
        this.a.g(this.b);
    }
}
