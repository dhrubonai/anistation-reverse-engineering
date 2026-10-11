package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ve7 extends ue7 {
    public final byte[] z;

    public ve7(byte[] bArr) {
        bArr.getClass();
        this.z = bArr;
    }

    @Override // defpackage.we7
    public final byte b(int i) {
        return this.z[i];
    }

    @Override // defpackage.we7
    public final int c() {
        return this.z.length;
    }

    @Override // defpackage.we7
    public final ue7 d(int i, int i2) {
        byte[] bArr = this.z;
        int n = we7.n(0, i2, bArr.length);
        if (n == 0) {
            return we7.y;
        }
        return new te7(bArr, 0, n);
    }

    @Override // defpackage.we7
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.z, 0, bArr, 0, i);
    }

    @Override // defpackage.we7
    public final void g(ef7 ef7Var) {
        byte[] bArr = this.z;
        ef7Var.c(bArr, 0, bArr.length);
    }

    @Override // defpackage.we7
    public final boolean h(we7 we7Var) {
        boolean z = we7Var instanceof ve7;
        byte[] bArr = this.z;
        if (z) {
            return Arrays.equals(bArr, ((ve7) we7Var).z);
        }
        boolean z2 = we7Var instanceof te7;
        if (z2) {
            te7 te7Var = (te7) we7Var;
            int i = te7Var.B;
            int length = bArr.length;
            if (length <= i) {
                if (length <= i) {
                    if (z) {
                        return we7.o(0, 0, length, bArr, ((ve7) we7Var).z);
                    }
                    if (z2) {
                        return we7.o(0, te7Var.A, length, bArr, te7Var.z);
                    }
                    return we7Var.d(0, length).equals(d(0, length));
                }
                jz7.b(String.valueOf(length).length() + 27 + String.valueOf(i).length(), length, i);
                return false;
            }
            jz7.a(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        return we7Var.h(this);
    }

    @Override // defpackage.we7
    public final int i(int i, int i2) {
        return wf7.a(i, 0, i2, this.z);
    }
}
