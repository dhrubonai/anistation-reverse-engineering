package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ca6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ fa6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca6(fa6 fa6Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = fa6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        fa6 fa6Var = this.z;
        switch (b) {
            case 0:
                return new ca6(fa6Var, vz0Var, (byte) 0);
            case 1:
                return new ca6(fa6Var, vz0Var, (byte) 1);
            case 2:
                return new ca6(fa6Var, vz0Var, (byte) 2);
            case 3:
                return new ca6(fa6Var, vz0Var, (byte) 3);
            case 4:
                return new ca6(fa6Var, vz0Var, (byte) 4);
            default:
                return new ca6(fa6Var, vz0Var, (byte) 5);
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
                return ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 4:
                return ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                ((ca6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return w11.x;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        fa6 fa6Var = this.z;
        w11 w11Var = w11.x;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cc6 cc6Var = fa6Var.P;
                this.y = true;
                cc6Var.c(true, this);
                if (pn6Var == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cc6 cc6Var2 = fa6Var.P;
                this.y = true;
                cc6Var2.d(this);
                if (pn6Var == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cc6 cc6Var3 = fa6Var.P;
                this.y = true;
                if (cc6Var3.s(false, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object collect = new in(new in(wt5.j(new z96(fa6Var, (byte) 7)), (byte) 6), (byte) 7).collect(new rc(fa6Var, (byte) 10), this);
                if (collect != w11Var) {
                    collect = pn6Var;
                }
                if (collect == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 4:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cc6 cc6Var4 = fa6Var.P;
                this.y = true;
                if (cc6Var4.y(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z6 = this.y;
                if (z6) {
                    if (!z6) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m37.N(obj);
                        v71.e();
                    }
                    return null;
                }
                m37.N(obj);
                e52 e52Var = new e52(fa6Var, vz0Var, (byte) 28);
                this.y = true;
                in4.a(fa6Var, e52Var, this);
                return w11Var;
        }
    }
}
