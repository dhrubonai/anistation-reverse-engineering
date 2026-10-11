package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fd4 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final zi4 g = new zi4(255);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [short, int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [short, int] */
    public final boolean a(c12 c12Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        zi4 zi4Var = this.g;
        zi4Var.K(27);
        try {
            z2 = c12Var.j(zi4Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && zi4Var.C() == 1332176723) {
            if (zi4Var.A() != 0) {
                if (!z) {
                    throw bj4.d("unsupported bit stream revision");
                }
            } else {
                this.a = zi4Var.A();
                this.b = zi4Var.p();
                zi4Var.r();
                zi4Var.r();
                zi4Var.r();
                ?? A = zi4Var.A();
                this.c = A;
                this.d = A + 27;
                zi4Var.K(A);
                try {
                    z3 = c12Var.j(zi4Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = zi4Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(c12 c12Var, long j) {
        boolean z;
        boolean z2;
        if (c12Var.getPosition() == c12Var.k()) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        zi4 zi4Var = this.g;
        zi4Var.K(4);
        while (true) {
            if (j != -1 && c12Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z2 = c12Var.j(zi4Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            zi4Var.N(0);
            if (zi4Var.C() == 1332176723) {
                c12Var.u();
                return true;
            }
            c12Var.v(1);
        }
        do {
            if (j != -1 && c12Var.getPosition() >= j) {
                break;
            }
        } while (c12Var.n(1) != -1);
        return false;
    }
}
