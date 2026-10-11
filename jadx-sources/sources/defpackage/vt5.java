package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vt5 extends t36 implements ic2 {
    public final /* synthetic */ ic2 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt5(ic2 ic2Var, w44 w44Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = ic2Var;
        this.B = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                vt5 vt5Var = new vt5(this.A, this.B, vz0Var, (byte) 0);
                vt5Var.z = obj;
                return vt5Var;
            default:
                vt5 vt5Var2 = new vt5(this.A, this.B, vz0Var, (byte) 1);
                vt5Var2.z = obj;
                return vt5Var2;
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
                return ((vt5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((vt5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.B;
        ic2 ic2Var = this.A;
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
                ru4 ru4Var = new ru4(w44Var, ((v11) this.z).getCoroutineContext());
                this.y = true;
                if (ic2Var.invoke(ru4Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
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
                ru4 ru4Var2 = new ru4(w44Var, ((v11) this.z).getCoroutineContext());
                this.y = true;
                if (ic2Var.invoke(ru4Var2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
