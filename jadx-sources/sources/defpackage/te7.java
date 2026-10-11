package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class te7 extends ue7 {
    public final int A;
    public final int B;
    public final byte[] z;

    public te7(byte[] bArr, int i, int i2) {
        we7.n(i, i + i2, bArr.length);
        this.z = bArr;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.we7
    public final byte b(int i) {
        return this.z[this.A + i];
    }

    @Override // defpackage.we7
    public final int c() {
        return this.B;
    }

    @Override // defpackage.we7
    public final ue7 d(int i, int i2) {
        int n = we7.n(i, i2, this.B);
        if (n == 0) {
            return we7.y;
        }
        return new te7(this.z, this.A + i, n);
    }

    @Override // defpackage.we7
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.z, this.A, bArr, 0, i);
    }

    @Override // defpackage.we7
    public final void g(ef7 ef7Var) {
        ef7Var.c(this.z, this.A, this.B);
    }

    @Override // defpackage.we7
    public final boolean h(we7 we7Var) {
        boolean z = we7Var instanceof ve7;
        if (!z && !(we7Var instanceof te7)) {
            return we7Var.h(this);
        }
        int c = we7Var.c();
        int i = this.B;
        if (i <= c) {
            if (i <= we7Var.c()) {
                byte[] bArr = this.z;
                int i2 = this.A;
                if (z) {
                    return we7.o(i2, 0, i, bArr, ((ve7) we7Var).z);
                }
                if (we7Var instanceof te7) {
                    te7 te7Var = (te7) we7Var;
                    return we7.o(i2, te7Var.A, i, bArr, te7Var.z);
                }
                return we7Var.d(0, i).equals(d(i2, i + i2));
            }
            int c2 = we7Var.c();
            jz7.b(String.valueOf(i).length() + 27 + String.valueOf(c2).length(), i, c2);
            return false;
        }
        jz7.a(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
        return false;
    }

    @Override // defpackage.we7
    public final int i(int i, int i2) {
        return wf7.a(i, this.A, i2, this.z);
    }
}
