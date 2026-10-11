package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j3 implements b12 {
    public final k3 a = new k3("audio/ac3");
    public final zi4 b = new zi4(2786);
    public boolean c;

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        zi4 zi4Var = this.b;
        int read = c12Var.read(zi4Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        zi4Var.N(0);
        zi4Var.M(read);
        boolean z = this.c;
        k3 k3Var = this.a;
        if (!z) {
            k3Var.o = 0L;
            this.c = true;
        }
        k3Var.a(zi4Var);
        return 0;
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        p81 p81Var;
        int x;
        zi4 zi4Var = new zi4(10);
        int i = 0;
        while (true) {
            p81Var = (p81) c12Var;
            p81Var.j(zi4Var.a, 0, 10, false);
            zi4Var.N(0);
            if (zi4Var.D() != 4801587) {
                break;
            }
            zi4Var.O(3);
            int z = zi4Var.z();
            i += z + 10;
            p81Var.x(z, false);
        }
        p81Var.C = 0;
        p81Var.x(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            p81Var.j(zi4Var.a, 0, 6, false);
            zi4Var.N(0);
            if (zi4Var.H() != 2935) {
                p81Var.C = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                p81Var.x(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = zi4Var.a;
                if (bArr.length < 6) {
                    x = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    x = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    x = kb0.x((b & 192) >> 6, b & 63);
                }
                if (x == -1) {
                    break;
                }
                p81Var.x(x - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.a.g(d12Var, new lk6(0, 1));
        d12Var.t();
        d12Var.I(new zy(-9223372036854775807L));
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
