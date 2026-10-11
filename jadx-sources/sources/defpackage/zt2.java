package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zt2 implements q41 {
    public final byte[] A;
    public int B;
    public final q41 x;
    public final int y;
    public final kv4 z;

    public zt2(q41 q41Var, int i, kv4 kv4Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.x = q41Var;
        this.y = i;
        this.z = kv4Var;
        this.A = new byte[1];
        this.B = i;
    }

    @Override // defpackage.q41
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.B;
        q41 q41Var = this.x;
        if (i3 == 0) {
            byte[] bArr2 = this.A;
            int i4 = 0;
            if (q41Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = q41Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        zi4 zi4Var = new zi4(i5, bArr3);
                        kv4 kv4Var = this.z;
                        if (!kv4Var.m) {
                            max = kv4Var.j;
                        } else {
                            max = Math.max(kv4Var.n.y(true), kv4Var.j);
                        }
                        long j = max;
                        int a = zi4Var.a();
                        bh6 bh6Var = kv4Var.l;
                        bh6Var.getClass();
                        bh6Var.e(a, zi4Var);
                        bh6Var.a(j, 1, a, 0, null);
                        kv4Var.m = true;
                    }
                }
                i3 = this.y;
                this.B = i3;
            }
            return -1;
        }
        int read2 = q41Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.B -= read2;
        }
        return read2;
    }

    @Override // defpackage.q41
    public final Map s() {
        return this.x.s();
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.x.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.x.z(n71Var);
    }
}
