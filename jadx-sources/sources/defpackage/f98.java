package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f98 extends d98 {
    public final byte[] z;

    public f98(byte[] bArr) {
        bArr.getClass();
        this.z = bArr;
    }

    @Override // defpackage.d98
    public final byte b(int i) {
        return this.z[i];
    }

    @Override // defpackage.d98
    public final byte c(int i) {
        return this.z[i];
    }

    @Override // defpackage.d98
    public final int d() {
        return this.z.length;
    }

    @Override // defpackage.d98
    public final d98 f(int i, int i2) {
        byte[] bArr = this.z;
        int j = d98.j(0, i2, bArr.length);
        if (j == 0) {
            return d98.y;
        }
        return new c98(bArr, 0, j);
    }

    @Override // defpackage.d98
    public final void g(j98 j98Var) {
        byte[] bArr = this.z;
        j98Var.x(bArr, 0, bArr.length);
    }

    @Override // defpackage.d98
    public final boolean h(d98 d98Var) {
        boolean z = d98Var instanceof f98;
        byte[] bArr = this.z;
        if (z) {
            return Arrays.equals(bArr, ((f98) d98Var).z);
        }
        boolean z2 = d98Var instanceof c98;
        if (z2) {
            c98 c98Var = (c98) d98Var;
            int i = c98Var.B;
            int length = bArr.length;
            if (length <= i) {
                if (length <= i) {
                    if (z) {
                        return d98.k(0, 0, length, bArr, ((f98) d98Var).z);
                    }
                    if (z2) {
                        return d98.k(0, c98Var.A, length, bArr, c98Var.z);
                    }
                    return d98Var.f(0, length).equals(f(0, length));
                }
                jz7.b(String.valueOf(length).length() + 27 + String.valueOf(i).length(), length, i);
                return false;
            }
            jz7.a(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        return d98Var.h(this);
    }

    @Override // defpackage.d98
    public final int i(int i, int i2) {
        Charset charset = la8.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.z[i3];
        }
        return i;
    }
}
