package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yc5 implements kd5 {
    public static final y23 k = new y23(new oa5(7), new la5(22), 14);
    public final qi4 a;
    public float g;
    public final he1 i;
    public final he1 j;
    public final qi4 b = new qi4(0);
    public final qi4 c = new qi4(0);
    public final ti4 d = xt5.g(Boolean.FALSE);
    public final u34 e = new u34();
    public final qi4 f = new qi4(Integer.MAX_VALUE);
    public final ma1 h = new ma1(new pz3((Object) this, (byte) 22));

    public yc5(int i) {
        this.a = new qi4(i);
        final byte b = 0;
        this.i = ut5.b(new sb2(this) { // from class: xc5
            public final /* synthetic */ yc5 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                boolean z = false;
                yc5 yc5Var = this.y;
                switch (b2) {
                    case 0:
                        if (yc5Var.a.h() < yc5Var.f.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (yc5Var.a.h() > 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final byte b2 = 1;
        this.j = ut5.b(new sb2(this) { // from class: xc5
            public final /* synthetic */ yc5 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                boolean z = false;
                yc5 yc5Var = this.y;
                switch (b22) {
                    case 0:
                        if (yc5Var.a.h() < yc5Var.f.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (yc5Var.a.h() > 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.kd5
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.kd5
    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final Object d(c54 c54Var, ic2 ic2Var, xz0 xz0Var) {
        Object d = this.h.d(c54Var, ic2Var, xz0Var);
        if (d == w11.x) {
            return d;
        }
        return pn6.a;
    }

    @Override // defpackage.kd5
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(int i) {
        ub2 ub2Var;
        qi4 qi4Var = this.a;
        this.f.i(i);
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            if (qi4Var.h() > i) {
                qi4Var.i(i);
            }
        } finally {
            et5.k(b, e, ub2Var);
        }
    }
}
