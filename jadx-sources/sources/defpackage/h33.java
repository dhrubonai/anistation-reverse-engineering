package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h33 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ i33 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h33(i33 i33Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = i33Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        i33 i33Var = this.z;
        switch (b) {
            case 0:
                return new h33(i33Var, vz0Var, (byte) 0);
            case 1:
                return new h33(i33Var, vz0Var, (byte) 1);
            default:
                return new h33(i33Var, vz0Var, (byte) 2);
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
                return ((h33) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((h33) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((h33) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        i33 i33Var = this.z;
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
                ak6 ak6Var = i33Var.c;
                this.y = true;
                if (ak6Var.h(this) == w11Var) {
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
                ak6 ak6Var2 = i33Var.c;
                this.y = true;
                if (ak6Var2.h(this) == w11Var) {
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
                if (i33Var.e(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
