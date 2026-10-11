package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk2 implements b12 {
    public final /* synthetic */ byte a;
    public final cq5 b;
    public d12 c;
    public b12 d;
    public Pair e;
    public final b12 f;

    public vk2(int i, byte b) {
        w43 w43Var;
        uk2 uk2Var;
        this.a = b;
        switch (b) {
            case 1:
                this.b = new cq5("image/jpeg", 65496, 2);
                if ((i & 1) == 0) {
                    w43Var = new w43();
                } else {
                    w43Var = null;
                }
                this.f = w43Var;
                return;
            default:
                this.b = new cq5("image/heif", -1, -1);
                if ((i & 1) != 0) {
                    uk2Var = null;
                } else {
                    uk2Var = new uk2();
                }
                this.f = uk2Var;
                return;
        }
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        byte b = this.a;
        b12 b12Var = this.b;
        boolean z = false;
        b12 b12Var2 = this.f;
        switch (b) {
            case 0:
                b12 b12Var3 = this.d;
                if (b12Var3 == null) {
                    b12 b12Var4 = (uk2) b12Var2;
                    if (b12Var3 == null) {
                        z = true;
                    }
                    io3.B(z);
                    b12Var4.getClass();
                    if (n03.I(c12Var, true)) {
                        b12Var = b12Var4;
                    }
                    this.d = b12Var;
                    c12Var.u();
                    Pair pair = this.e;
                    if (pair != null) {
                        this.d.c(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    b12 b12Var5 = this.d;
                    d12 d12Var = this.c;
                    d12Var.getClass();
                    b12Var5.e(d12Var);
                }
                return this.d.a(c12Var, d42Var);
            default:
                b12 b12Var6 = this.d;
                if (b12Var6 == null) {
                    b12 b12Var7 = (w43) b12Var2;
                    if (b12Var6 == null) {
                        z = true;
                    }
                    io3.B(z);
                    b12Var7.getClass();
                    if (b12Var7.b(c12Var)) {
                        b12Var = b12Var7;
                    }
                    this.d = b12Var;
                    c12Var.u();
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        this.d.c(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    b12 b12Var8 = this.d;
                    d12 d12Var2 = this.c;
                    d12Var2.getClass();
                    b12Var8.e(d12Var2);
                }
                return this.d.a(c12Var, d42Var);
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        byte b = this.a;
        b12 b12Var = this.f;
        switch (b) {
            case 0:
                if (((uk2) b12Var) != null && n03.I(c12Var, true)) {
                    return true;
                }
                ((p81) c12Var).C = 0;
                return n03.I(c12Var, false);
            default:
                w43 w43Var = (w43) b12Var;
                if (w43Var != null && w43Var.b(c12Var)) {
                    return true;
                }
                ((p81) c12Var).C = 0;
                return this.b.b(c12Var);
        }
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        switch (this.a) {
            case 0:
                b12 b12Var = this.d;
                if (b12Var != null) {
                    b12Var.c(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
            default:
                b12 b12Var2 = this.d;
                if (b12Var2 != null) {
                    b12Var2.c(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        byte b = this.a;
        cq5 cq5Var = this.b;
        b12 b12Var = this.f;
        switch (b) {
            case 0:
                this.c = d12Var;
                if (((uk2) b12Var) == null) {
                    this.d = cq5Var;
                    cq5Var.e(d12Var);
                    return;
                }
                return;
            default:
                this.c = d12Var;
                if (((w43) b12Var) == null) {
                    this.d = cq5Var;
                    cq5Var.e(d12Var);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.b12
    public final void release() {
        byte b = this.a;
        b12 b12Var = this.f;
        switch (b) {
            case 0:
                uk2 uk2Var = (uk2) b12Var;
                if (uk2Var != null) {
                    uk2Var.release();
                    return;
                }
                return;
            default:
                w43 w43Var = (w43) b12Var;
                if (w43Var != null) {
                    w43Var.release();
                    return;
                }
                return;
        }
    }
}
