package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u27 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u27(v27 v27Var, boolean z, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
        this.A = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        boolean z = this.A;
        v27 v27Var = this.z;
        switch (b) {
            case 0:
                return new u27(v27Var, z, vz0Var, (byte) 0);
            case 1:
                return new u27(v27Var, z, vz0Var, (byte) 1);
            case 2:
                return new u27(v27Var, z, vz0Var, (byte) 2);
            default:
                return new u27(v27Var, z, vz0Var, (byte) 3);
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
                return ((u27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((u27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((u27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((u27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        boolean z = this.A;
        v27 v27Var = this.z;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
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
                    ot6 ot6Var = v27Var.e;
                    this.y = true;
                    Object d = ((qt6) ot6Var).a.d(z, this);
                    if (d != w11Var) {
                        d = pn6Var;
                    }
                    if (d == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ot6 ot6Var2 = v27Var.e;
                    this.y = true;
                    Object e = ((qt6) ot6Var2).a.e(z, this);
                    if (e != w11Var) {
                        e = pn6Var;
                    }
                    if (e == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 2:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ot6 ot6Var3 = v27Var.e;
                    this.y = true;
                    Object f = ((qt6) ot6Var3).a.f(z, this);
                    if (f != w11Var) {
                        f = pn6Var;
                    }
                    if (f == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ot6 ot6Var4 = v27Var.e;
                    this.y = true;
                    Object l = ((qt6) ot6Var4).a.l(z, this);
                    if (l != w11Var) {
                        l = pn6Var;
                    }
                    if (l == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
