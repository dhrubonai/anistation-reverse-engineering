package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ix4 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ lx4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix4(lx4 lx4Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = lx4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        lx4 lx4Var = this.z;
        switch (b) {
            case 0:
                return new ix4(lx4Var, vz0Var, (byte) 0);
            default:
                return new ix4(lx4Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((ix4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ix4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float f;
        byte b = this.x;
        w11 w11Var = w11.x;
        lx4 lx4Var = this.z;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    mx4 mx4Var = lx4Var.Q;
                    if (lx4Var.N) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    this.y = true;
                    Object f2 = mx4Var.a.f(this, new Float(f));
                    if (f2 != w11Var) {
                        f2 = pn6Var;
                    }
                    if (f2 == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    if (!lx4Var.Q.a.e()) {
                        mx4 mx4Var2 = lx4Var.Q;
                        float h = lx4Var.T.h() / lx4Var.g1();
                        this.y = true;
                        Object f3 = mx4Var2.a.f(this, new Float(h));
                        if (f3 != w11Var) {
                            f3 = pn6Var;
                        }
                        if (f3 == w11Var) {
                            return w11Var;
                        }
                    }
                }
                return pn6Var;
        }
    }
}
