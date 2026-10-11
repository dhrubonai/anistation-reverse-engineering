package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e36 extends g36 {
    public final /* synthetic */ byte A = 1;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e36(x26 x26Var, String str) {
        super(x26Var, str);
        x26Var.getClass();
        str.getClass();
        this.B = x26Var.x(str);
    }

    @Override // defpackage.m85
    public final void J(int i, String str) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                str.getClass();
                ((f36) obj).J(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((h36) obj).w(i, str);
                return;
            default:
                str.getClass();
                a();
                zz.c0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.m85
    public boolean M() {
        switch (this.A) {
            case 0:
                return ((f36) this.B).M();
            default:
                return super.M();
        }
    }

    @Override // defpackage.m85
    public final void b(int i, double d) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).b(i, d);
                return;
            case 1:
                a();
                ((h36) obj).b(i, d);
                return;
            default:
                a();
                zz.c0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final String c0(int i) {
        switch (this.A) {
            case 0:
                return ((f36) this.B).c0(i);
            case 1:
                a();
                zz.c0(21, "no row");
                throw null;
            default:
                a();
                zz.c0(21, "no row");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).close();
                return;
            case 1:
                ((h36) obj).close();
                this.z = true;
                return;
            default:
                this.z = true;
                return;
        }
    }

    @Override // defpackage.m85
    public final void e(int i, long j) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).e(i, j);
                return;
            case 1:
                a();
                ((h36) obj).e(i, j);
                return;
            default:
                a();
                zz.c0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final void f(int i, byte[] bArr) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).f(i, bArr);
                return;
            case 1:
                a();
                ((h36) obj).f(i, bArr);
                return;
            default:
                a();
                zz.c0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final byte[] getBlob(int i) {
        switch (this.A) {
            case 0:
                return ((f36) this.B).getBlob(i);
            case 1:
                a();
                zz.c0(21, "no row");
                throw null;
            default:
                a();
                zz.c0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final int getColumnCount() {
        switch (this.A) {
            case 0:
                return ((f36) this.B).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    @Override // defpackage.m85
    public final String getColumnName(int i) {
        switch (this.A) {
            case 0:
                return ((f36) this.B).getColumnName(i);
            case 1:
                a();
                zz.c0(21, "no row");
                throw null;
            default:
                a();
                zz.c0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final long getLong(int i) {
        switch (this.A) {
            case 0:
                return ((f36) this.B).getLong(i);
            case 1:
                a();
                zz.c0(21, "no row");
                throw null;
            default:
                a();
                zz.c0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final void h(int i) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).h(i);
                return;
            case 1:
                a();
                ((h36) obj).h(i);
                return;
            default:
                a();
                zz.c0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.m85
    public final boolean isNull(int i) {
        switch (this.A) {
            case 0:
                return ((f36) this.B).isNull(i);
            case 1:
                a();
                zz.c0(21, "no row");
                throw null;
            default:
                a();
                zz.c0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.g36, defpackage.m85
    public void k() {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                ((f36) obj).k();
                return;
            case 1:
                a();
                ((h36) obj).k();
                return;
            default:
                super.k();
                return;
        }
    }

    @Override // defpackage.m85
    public final boolean p0() {
        byte b = this.A;
        x26 x26Var = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                f36 f36Var = (f36) obj;
                boolean p0 = f36Var.p0();
                if (f36Var.c0(0).equalsIgnoreCase("wal")) {
                    x26Var.L();
                } else {
                    x26Var.u();
                }
                return p0;
            case 1:
                a();
                ((h36) obj).i();
                return false;
            default:
                int ordinal = ((d36) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    x26Var.B();
                                } else {
                                    ze0.l();
                                }
                            } else {
                                x26Var.R();
                            }
                        } else {
                            x26Var.n();
                        }
                    } else {
                        x26Var.a0();
                    }
                } else {
                    x26Var.P();
                    x26Var.a0();
                }
                return false;
        }
    }

    @Override // defpackage.g36, defpackage.m85
    public void reset() {
        switch (this.A) {
            case 0:
                ((f36) this.B).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e36(x26 x26Var, String str, d36 d36Var) {
        super(x26Var, str);
        x26Var.getClass();
        str.getClass();
        this.B = d36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e36(x26 x26Var, String str, f36 f36Var) {
        super(x26Var, str);
        x26Var.getClass();
        str.getClass();
        this.B = f36Var;
    }
}
