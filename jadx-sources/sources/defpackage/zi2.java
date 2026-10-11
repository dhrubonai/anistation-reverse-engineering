package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zi2 implements ds1 {
    public final kg5 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public bh6 j;
    public yi2 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final e64 d = new e64(7);
    public final e64 e = new e64(8);
    public final e64 f = new e64(6);
    public long m = -9223372036854775807L;
    public final zi4 o = new zi4();

    public zi2(kg5 kg5Var, boolean z, boolean z2) {
        this.a = kg5Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        int i;
        int i2;
        this.j.getClass();
        String str = eq6.a;
        int i3 = zi4Var.b;
        int i4 = zi4Var.c;
        byte[] bArr = zi4Var.a;
        this.g += zi4Var.a();
        this.j.e(zi4Var.a(), zi4Var);
        while (true) {
            int J = io3.J(bArr, i3, i4, this.h);
            if (J == i4) {
                h(bArr, i3, i4);
                return;
            }
            int i5 = bArr[J + 3] & 31;
            if (J > 0 && bArr[J - 1] == 0) {
                J--;
                i = 4;
            } else {
                i = 3;
            }
            int i6 = J;
            int i7 = i;
            int i8 = i6 - i3;
            if (i8 > 0) {
                h(bArr, i3, i6);
            }
            int i9 = i4 - i6;
            long j = this.g - i9;
            if (i8 < 0) {
                i2 = -i8;
            } else {
                i2 = 0;
            }
            b(i9, i2, j, this.m);
            i(j, i5, this.m);
            i3 = i6 + i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a4, code lost:
    
        if (r3.j == r4.j) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ae, code lost:
    
        if (r9 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c0, code lost:
    
        if (r3.n == r4.n) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d1, code lost:
    
        if (r3.p == r4.p) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01df, code lost:
    
        if (r3.l == r4.l) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023a, code lost:
    
        if (r3 == 1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi2.b(int, int, long, long):void");
    }

    @Override // defpackage.ds1
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        io3.E(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.c(0);
        yi2 yi2Var = this.k;
        if (yi2Var != null) {
            yi2Var.k = false;
            yi2Var.o = false;
            xi2 xi2Var = yi2Var.n;
            xi2Var.b = false;
            xi2Var.a = false;
        }
    }

    @Override // defpackage.ds1
    public final void e() {
        this.j.getClass();
        String str = eq6.a;
        this.a.d.c(0);
        b(0, 0, this.g, this.m);
        i(this.g, 9, this.m);
        b(0, 0, this.g, this.m);
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        boolean z;
        this.m = j;
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z | z2;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.i = lk6Var.e;
        lk6Var.b();
        bh6 G = d12Var.G(lk6Var.d, 2);
        this.j = G;
        this.k = new yi2(G, this.b, this.c);
        this.a.b(d12Var, lk6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi2.h(byte[], int, int):void");
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        yi2 yi2Var = this.k;
        boolean z = this.n;
        yi2Var.i = i;
        yi2Var.l = j2;
        yi2Var.j = j;
        yi2Var.s = z;
        if (!yi2Var.b || i != 1) {
            if (yi2Var.c) {
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        xi2 xi2Var = yi2Var.m;
        yi2Var.m = yi2Var.n;
        yi2Var.n = xi2Var;
        xi2Var.b = false;
        xi2Var.a = false;
        yi2Var.h = 0;
        yi2Var.k = true;
    }
}
