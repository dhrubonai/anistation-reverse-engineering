package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g0 extends t36 implements ic2 {
    public final /* synthetic */ qt4 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ u34 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(qt4 qt4Var, u34 u34Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.A = qt4Var;
        this.z = u34Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        qt4 qt4Var = this.A;
        u34 u34Var = this.z;
        switch (b) {
            case 0:
                return new g0(qt4Var, u34Var, vz0Var);
            case 1:
                return new g0(u34Var, qt4Var, vz0Var, (byte) 1);
            default:
                return new g0(u34Var, qt4Var, vz0Var, (byte) 2);
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
                return ((g0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((g0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((g0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        qt4 qt4Var = this.A;
        u34 u34Var = this.z;
        w11 w11Var = w11.x;
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
                rt4 rt4Var = new rt4(qt4Var);
                this.y = true;
                if (u34Var.a(rt4Var, this) == w11Var) {
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
                this.y = true;
                if (u34Var.a(qt4Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
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
                this.y = true;
                if (u34Var.a(qt4Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(u34 u34Var, qt4 qt4Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = u34Var;
        this.A = qt4Var;
    }
}
