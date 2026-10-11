package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i05 implements nr {
    public final r34 x = new r34();
    public final f44 y = new f44();
    public final Object z;

    public i05(Object obj) {
        this.z = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0017. Please report as an issue. */
    public final void a(rm6 rm6Var, b25 b25Var) {
        Exception exc;
        r34 r34Var = this.x;
        int i = r34Var.b;
        f44 f44Var = new f44();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            f44 f44Var2 = this.y;
            if (i2 < i) {
                int i4 = i2 + 1;
                try {
                    try {
                        switch (r34Var.c(i2)) {
                            case 0:
                                rm6Var.p();
                                i2 = i4;
                            case 1:
                                int i5 = i3 + 1;
                                rm6Var.j(f44Var2.g(i3));
                                i3 = i5;
                                i2 = i4;
                            case 2:
                                int i6 = i2 + 2;
                                i2 += 3;
                                rm6Var.n(r34Var.c(i4), r34Var.c(i6));
                            case 3:
                                int i7 = i2 + 2;
                                try {
                                    int i8 = i2 + 3;
                                    try {
                                        i2 += 4;
                                        rm6Var.l(r34Var.c(i4), r34Var.c(i7), r34Var.c(i8));
                                    } catch (Exception e) {
                                        exc = e;
                                        i2 = i8;
                                        break;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    i2 = i7;
                                    break;
                                }
                            case 4:
                                rm6Var.a();
                                i2 = i4;
                            case 5:
                                i2 += 2;
                                int i9 = i3 + 1;
                                rm6Var.i(r34Var.c(i4), f44Var2.g(i3));
                                i3 = i9;
                            case 6:
                                i2 += 2;
                                try {
                                    r34Var.c(i4);
                                    int i10 = i3 + 1;
                                    i3 = i10;
                                } catch (Exception e3) {
                                    exc = e3;
                                    break;
                                }
                            case 7:
                                int i11 = i3 + 1;
                                Object g = f44Var2.g(i3);
                                g.getClass();
                                wk6.j(2, g);
                                i3 += 2;
                                rm6Var.m(f44Var2.g(i11), (ic2) g);
                                i2 = i4;
                            case 8:
                                Object obj = rm6Var.z;
                                if (obj instanceof it0) {
                                    it0 it0Var = (it0) obj;
                                    if (((z44) b25Var.e).k(it0Var)) {
                                        it0Var.c();
                                    }
                                }
                                f44Var.a(obj);
                                rm6Var.k();
                                i2 = i4;
                            default:
                                i2 = i4;
                        }
                    } catch (Exception e4) {
                        exc = e4;
                        i2 = i4;
                    }
                } catch (Throwable th) {
                    rm6Var.r();
                    throw th;
                }
            } else {
                if (i3 != f44Var2.b) {
                    eu0.a("Applier operation size mismatch");
                }
                f44Var2.d();
                r34Var.b = 0;
                rm6Var.r();
                return;
            }
            exc = e3;
            throw new kt0(f44Var2, f44Var, r34Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.nr
    public final Object h() {
        return this.z;
    }

    @Override // defpackage.nr
    public final void i(int i, Object obj) {
        r34 r34Var = this.x;
        r34Var.a(5);
        r34Var.a(i);
        this.y.a(obj);
    }

    @Override // defpackage.nr
    public final void j(Object obj) {
        this.x.a(1);
        this.y.a(obj);
    }

    @Override // defpackage.nr
    public final void k() {
        this.x.a(8);
    }

    @Override // defpackage.nr
    public final void l(int i, int i2, int i3) {
        r34 r34Var = this.x;
        r34Var.a(3);
        r34Var.a(i);
        r34Var.a(i2);
        r34Var.a(i3);
    }

    @Override // defpackage.nr
    public final void m(Object obj, ic2 ic2Var) {
        this.x.a(7);
        f44 f44Var = this.y;
        f44Var.a(ic2Var);
        f44Var.a(obj);
    }

    @Override // defpackage.nr
    public final void n(int i, int i2) {
        r34 r34Var = this.x;
        r34Var.a(2);
        r34Var.a(i);
        r34Var.a(i2);
    }

    @Override // defpackage.nr
    public final void p() {
        this.x.a(0);
    }

    @Override // defpackage.nr
    public final void q(int i, Object obj) {
        r34 r34Var = this.x;
        r34Var.a(6);
        r34Var.a(i);
        this.y.a(obj);
    }
}
