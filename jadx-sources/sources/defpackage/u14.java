package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u14 implements bh6 {
    public ea2 a;
    public final byte[] b = new byte[16000];

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        while (i > 0) {
            byte[] bArr = this.b;
            int min = Math.min(i, bArr.length);
            zi4Var.k(bArr, 0, min);
            i -= min;
        }
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = this.b;
            boolean z2 = false;
            int read = m41Var.read(bArr, 0, Math.min(i2, bArr.length));
            if (read != -1) {
                z2 = true;
            }
            io3.B(z2);
            i2 -= read;
        }
        return i;
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
        this.a = ea2Var;
    }

    @Override // defpackage.bh6
    public final void a(long j, int i, int i2, int i3, ah6 ah6Var) {
    }
}
