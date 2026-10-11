package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t27 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t27(v27 v27Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        v27 v27Var = this.z;
        switch (b) {
            case 0:
                return new t27(v27Var, str, vz0Var, (byte) 0);
            case 1:
                return new t27(v27Var, str, vz0Var, (byte) 1);
            case 2:
                return new t27(v27Var, str, vz0Var, (byte) 2);
            case 3:
                return new t27(v27Var, str, vz0Var, (byte) 3);
            default:
                return new t27(v27Var, str, vz0Var, (byte) 4);
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
                return ((t27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((t27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((t27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((t27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((t27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        String str = this.A;
        v27 v27Var = this.z;
        w11 w11Var = w11.x;
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
                    ot6 ot6Var = v27Var.e;
                    this.y = true;
                    Object c = ((qt6) ot6Var).a.c(str, this);
                    if (c != w11Var) {
                        c = pn6Var;
                    }
                    if (c == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
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
                    ot6 ot6Var2 = v27Var.e;
                    this.y = true;
                    Object g = ((qt6) ot6Var2).a.g(str, this);
                    if (g != w11Var) {
                        g = pn6Var;
                    }
                    if (g == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 2:
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
                    ot6 ot6Var3 = v27Var.e;
                    this.y = true;
                    Object h = ((qt6) ot6Var3).a.h(str, this);
                    if (h != w11Var) {
                        h = pn6Var;
                    }
                    if (h == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 3:
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
                    ot6 ot6Var4 = v27Var.e;
                    this.y = true;
                    Object i = ((qt6) ot6Var4).a.i(str, this);
                    if (i != w11Var) {
                        i = pn6Var;
                    }
                    if (i == w11Var) {
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
                    ot6 ot6Var5 = v27Var.e;
                    this.y = true;
                    Object j = ((qt6) ot6Var5).a.j(str, this);
                    if (j != w11Var) {
                        j = pn6Var;
                    }
                    if (j == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
