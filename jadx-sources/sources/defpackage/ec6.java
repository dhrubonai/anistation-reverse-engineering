package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ec6 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ cc6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec6(cc6 cc6Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = cc6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        cc6 cc6Var = this.z;
        switch (b) {
            case 0:
                return new ec6(cc6Var, vz0Var, (byte) 0);
            case 1:
                return new ec6(cc6Var, vz0Var, (byte) 1);
            default:
                return new ec6(cc6Var, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((ec6) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((ec6) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ec6) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        cc6 cc6Var = this.z;
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
                this.y = true;
                cc6Var.d(this);
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
                boolean booleanValue = ((Boolean) cc6Var.t.getValue()).booleanValue();
                this.y = true;
                cc6Var.c(booleanValue, this);
                if (pn6Var == w11Var) {
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
                if (cc6Var.s(false, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
