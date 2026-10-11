package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bb6 implements kd5 {
    public final /* synthetic */ kd5 a;
    public final he1 b;
    public final he1 c;

    public bb6(kd5 kd5Var, final cb6 cb6Var) {
        this.a = kd5Var;
        final byte b = 0;
        this.b = ut5.b(new sb2() { // from class: ab6
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                boolean z = false;
                cb6 cb6Var2 = cb6Var;
                switch (b2) {
                    case 0:
                        if (cb6Var2.a.h() < cb6Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (cb6Var2.a.h() > 0.0f) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final byte b2 = 1;
        this.c = ut5.b(new sb2() { // from class: ab6
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                boolean z = false;
                cb6 cb6Var2 = cb6Var;
                switch (b22) {
                    case 0:
                        if (cb6Var2.a.h() < cb6Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (cb6Var2.a.h() > 0.0f) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.kd5
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.kd5
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final Object d(c54 c54Var, ic2 ic2Var, xz0 xz0Var) {
        return this.a.d(c54Var, ic2Var, xz0Var);
    }

    @Override // defpackage.kd5
    public final float e(float f) {
        return this.a.e(f);
    }
}
