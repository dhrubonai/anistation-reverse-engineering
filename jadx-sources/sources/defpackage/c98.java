package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c98 extends d98 {
    public final int A;
    public final int B;
    public final byte[] z;

    public c98(byte[] bArr, int i, int i2) {
        d98.j(i, i + i2, bArr.length);
        this.z = bArr;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.d98
    public final byte b(int i) {
        int i2 = this.B;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(h11.g(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
            sb.append("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        return this.z[this.A + i];
    }

    @Override // defpackage.d98
    public final byte c(int i) {
        return this.z[this.A + i];
    }

    @Override // defpackage.d98
    public final int d() {
        return this.B;
    }

    @Override // defpackage.d98
    public final d98 f(int i, int i2) {
        int j = d98.j(i, i2, this.B);
        if (j == 0) {
            return d98.y;
        }
        return new c98(this.z, this.A + i, j);
    }

    @Override // defpackage.d98
    public final void g(j98 j98Var) {
        j98Var.x(this.z, this.A, this.B);
    }

    @Override // defpackage.d98
    public final boolean h(d98 d98Var) {
        boolean z = d98Var instanceof f98;
        if (!z && !(d98Var instanceof c98)) {
            return d98Var.h(this);
        }
        int d = d98Var.d();
        int i = this.B;
        if (i <= d) {
            if (i <= d98Var.d()) {
                byte[] bArr = this.z;
                int i2 = this.A;
                if (z) {
                    return d98.k(i2, 0, i, bArr, ((f98) d98Var).z);
                }
                if (d98Var instanceof c98) {
                    c98 c98Var = (c98) d98Var;
                    return d98.k(i2, c98Var.A, i, bArr, c98Var.z);
                }
                return d98Var.f(0, i).equals(f(i2, i + i2));
            }
            int d2 = d98Var.d();
            jz7.b(String.valueOf(i).length() + 27 + String.valueOf(d2).length(), i, d2);
            return false;
        }
        jz7.a(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
        return false;
    }

    @Override // defpackage.d98
    public final int i(int i, int i2) {
        Charset charset = la8.a;
        int i3 = this.A;
        for (int i4 = i3; i4 < i3 + i2; i4++) {
            i = (i * 31) + this.z[i4];
        }
        return i;
    }
}
