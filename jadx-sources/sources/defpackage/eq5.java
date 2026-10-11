package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eq5 implements mj3 {
    public final long a = ij3.h.getAndIncrement();
    public final v41 b;
    public final iy5 c;
    public byte[] d;

    public eq5(q41 q41Var, v41 v41Var) {
        this.b = v41Var;
        this.c = new iy5(q41Var);
    }

    @Override // defpackage.mj3
    public final void a() {
        iy5 iy5Var = this.c;
        iy5Var.y = 0L;
        try {
            iy5Var.h(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) iy5Var.y;
                byte[] bArr = this.d;
                if (bArr == null) {
                    bArr = new byte[1024];
                    this.d = bArr;
                } else if (i2 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                    this.d = bArr;
                }
                i = iy5Var.read(bArr, i2, bArr.length - i2);
            }
            io3.F(iy5Var);
        } catch (Throwable th) {
            io3.F(iy5Var);
            throw th;
        }
    }

    @Override // defpackage.mj3
    public final void b() {
    }
}
