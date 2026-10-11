package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dd4 implements b12 {
    public d12 a;
    public xy5 b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r25, defpackage.d42 r26) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd4.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        try {
            return f(c12Var);
        } catch (bj4 unused) {
            return false;
        }
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        xy5 xy5Var = this.b;
        if (xy5Var != null) {
            v14 v14Var = xy5Var.a;
            fd4 fd4Var = (fd4) v14Var.A;
            fd4Var.a = (short) 0;
            fd4Var.b = 0L;
            fd4Var.c = (short) 0;
            fd4Var.d = 0;
            fd4Var.e = 0;
            ((zi4) v14Var.B).K(0);
            v14Var.x = -1;
            v14Var.z = false;
            if (j == 0) {
                xy5Var.d(!xy5Var.l);
                return;
            }
            if (xy5Var.h != 0) {
                long j3 = (xy5Var.i * j2) / 1000000;
                xy5Var.e = j3;
                gd4 gd4Var = xy5Var.d;
                String str = eq6.a;
                gd4Var.d(j3);
                xy5Var.h = (byte) 2;
            }
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.a = d12Var;
    }

    public final boolean f(c12 c12Var) {
        boolean z;
        fd4 fd4Var = new fd4();
        if (fd4Var.a(c12Var, true) && (fd4Var.a & 2) == 2) {
            int min = Math.min(fd4Var.e, 8);
            zi4 zi4Var = new zi4(min);
            c12Var.A(zi4Var.a, 0, min);
            zi4Var.N(0);
            if (zi4Var.a() >= 5 && zi4Var.A() == 127 && zi4Var.C() == 1179402563) {
                this.b = new xy5();
                return true;
            }
            zi4Var.N(0);
            try {
                z = ct5.p(1, zi4Var, true);
            } catch (bj4 unused) {
                z = false;
            }
            if (z) {
                this.b = new xy5();
            } else {
                zi4Var.N(0);
                if (ng4.e(zi4Var, ng4.o)) {
                    this.b = new xy5();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
