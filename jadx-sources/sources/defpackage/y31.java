package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y31 extends t36 implements ic2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(ub2 ub2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.A = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                y31 y31Var = new y31((byte) 0, vz0Var, this.A);
                y31Var.z = obj;
                return y31Var;
            case 1:
                y31 y31Var2 = new y31((byte) 1, vz0Var, this.A);
                y31Var2.z = obj;
                return y31Var2;
            default:
                y31 y31Var3 = new y31(this.A, vz0Var);
                y31Var3.z = obj;
                return y31Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((y31) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((y31) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((y31) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        ub2 ub2Var = this.A;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object invoke = ub2Var.invoke(this);
                if (invoke == w11Var) {
                    return w11Var;
                }
                return invoke;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object invoke2 = ub2Var.invoke(this);
                if (invoke2 == w11Var) {
                    return w11Var;
                }
                return invoke2;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m37.N(obj);
                    if (((v11) this.z).getCoroutineContext().get(rh6.y) != null) {
                        this.y = true;
                        Object invoke3 = ub2Var.invoke(this);
                        if (invoke3 == w11Var) {
                            return w11Var;
                        }
                        return invoke3;
                    }
                    ze0.m("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y31(byte b, vz0 vz0Var, ub2 ub2Var) {
        super(2, vz0Var);
        this.x = b;
        this.A = ub2Var;
    }
}
