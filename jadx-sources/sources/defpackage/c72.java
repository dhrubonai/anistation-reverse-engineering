package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c72 implements b12 {
    public final zi4 a = new zi4(4);
    public final zi4 b = new zi4(9);
    public final zi4 c = new zi4(11);
    public final zi4 d = new zi4();
    public final gc5 e;
    public d12 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public pw o;
    public iv6 p;

    /* JADX WARN: Type inference failed for: r0v4, types: [gc5, qt0] */
    public c72() {
        ?? qt0Var = new qt0(new vg1());
        qt0Var.y = -9223372036854775807L;
        qt0Var.z = new long[0];
        qt0Var.A = new long[0];
        this.e = qt0Var;
        this.g = (byte) 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v45, types: [short, int] */
    /* JADX WARN: Type inference failed for: r4v45, types: [pw, qt0] */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r36, defpackage.d42 r37) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        zi4 zi4Var = this.a;
        p81 p81Var = (p81) c12Var;
        p81Var.j(zi4Var.a, 0, 3, false);
        zi4Var.N(0);
        if (zi4Var.D() == 4607062) {
            p81Var.j(zi4Var.a, 0, 2, false);
            zi4Var.N(0);
            if ((zi4Var.H() & 250) == 0) {
                p81Var.j(zi4Var.a, 0, 4, false);
                zi4Var.N(0);
                int m = zi4Var.m();
                p81Var.C = 0;
                p81Var.x(m, false);
                p81Var.j(zi4Var.a, 0, 4, false);
                zi4Var.N(0);
                if (zi4Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.f = d12Var;
    }

    public final zi4 f(c12 c12Var) {
        int i = this.l;
        zi4 zi4Var = this.d;
        byte[] bArr = zi4Var.a;
        if (i > bArr.length) {
            zi4Var.L(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            zi4Var.N(0);
        }
        zi4Var.M(this.l);
        c12Var.readFully(zi4Var.a, 0, this.l);
        return zi4Var;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
