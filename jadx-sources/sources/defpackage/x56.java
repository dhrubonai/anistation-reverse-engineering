package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class x56 extends t36 implements ic2 {
    public final /* synthetic */ y56 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x56(y56 y56Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = y56Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        y56 y56Var = this.A;
        switch (b) {
            case 0:
                x56 x56Var = new x56(y56Var, vz0Var, (byte) 0);
                x56Var.z = obj;
                return x56Var;
            default:
                x56 x56Var2 = new x56(y56Var, vz0Var, (byte) 1);
                x56Var2.z = obj;
                return x56Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((x56) create((l97) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((x56) create((ry4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        y56 y56Var = this.A;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                l97 l97Var = (l97) this.z;
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
                ae0 ae0Var = l97Var.x;
                this.z = null;
                this.y = true;
                if (y56Var.q(ae0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                ry4 ry4Var = (ry4) this.z;
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
                wc0 wc0Var = ry4Var.x;
                this.z = null;
                this.y = true;
                if (y56Var.t(wc0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
