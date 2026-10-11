package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i0 extends t36 implements ic2 {
    public final /* synthetic */ qt4 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ k0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(k0 k0Var, qt4 qt4Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = k0Var;
        this.A = qt4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        qt4 qt4Var = this.A;
        k0 k0Var = this.z;
        switch (b) {
            case 0:
                return new i0(k0Var, qt4Var, vz0Var, (byte) 0);
            case 1:
                return new i0(k0Var, qt4Var, vz0Var, (byte) 1);
            case 2:
                return new i0(k0Var, qt4Var, vz0Var, (byte) 2);
            default:
                return new i0(k0Var, qt4Var, vz0Var, (byte) 3);
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
                return ((i0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((i0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((i0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((i0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        qt4 qt4Var = this.A;
        k0 k0Var = this.z;
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
                u34 u34Var = k0Var.N;
                if (u34Var != null) {
                    pt4 pt4Var = new pt4(qt4Var);
                    this.y = true;
                    if (u34Var.a(pt4Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
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
                u34 u34Var2 = k0Var.N;
                if (u34Var2 != null) {
                    pt4 pt4Var2 = new pt4(qt4Var);
                    this.y = true;
                    if (u34Var2.a(pt4Var2, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
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
                u34 u34Var3 = k0Var.N;
                if (u34Var3 != null) {
                    this.y = true;
                    if (u34Var3.a(qt4Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            default:
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
                u34 u34Var4 = k0Var.N;
                if (u34Var4 != null) {
                    rt4 rt4Var = new rt4(qt4Var);
                    this.y = true;
                    if (u34Var4.a(rt4Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
        }
    }
}
