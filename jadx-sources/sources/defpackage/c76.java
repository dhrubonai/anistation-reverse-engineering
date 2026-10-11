package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c76 extends t36 implements ic2 {
    public final /* synthetic */ ot4 A;
    public final /* synthetic */ uq4 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ jc2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c76(jc2 jc2Var, ot4 ot4Var, uq4 uq4Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = jc2Var;
        this.A = ot4Var;
        this.B = uq4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new c76(this.z, this.A, this.B, vz0Var, (byte) 0);
            case 1:
                return new c76(this.z, this.A, this.B, vz0Var, (byte) 1);
            default:
                return new c76(this.z, this.A, this.B, vz0Var, (byte) 2);
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
                return ((c76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((c76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((c76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        uq4 uq4Var = this.B;
        ot4 ot4Var = this.A;
        jc2 jc2Var = this.z;
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
                xc4 xc4Var = new xc4(uq4Var.c);
                this.y = true;
                if (jc2Var.invoke(ot4Var, xc4Var, this) == w11Var) {
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
                xc4 xc4Var2 = new xc4(uq4Var.c);
                this.y = true;
                if (jc2Var.invoke(ot4Var, xc4Var2, this) == w11Var) {
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
                xc4 xc4Var3 = new xc4(uq4Var.c);
                this.y = true;
                if (jc2Var.invoke(ot4Var, xc4Var3, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
