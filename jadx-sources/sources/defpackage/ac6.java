package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ac6 extends t36 implements ic2 {
    public final /* synthetic */ yq4 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public final /* synthetic */ cc6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac6(yq4 yq4Var, cc6 cc6Var, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = yq4Var;
        this.z = cc6Var;
        this.B = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        boolean z = this.B;
        yq4 yq4Var = this.A;
        cc6 cc6Var = this.z;
        switch (b) {
            case 0:
                return new ac6(yq4Var, cc6Var, z, vz0Var);
            default:
                return new ac6(cc6Var, yq4Var, z, vz0Var);
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
                return ((ac6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ac6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = this.B;
        yq4 yq4Var = this.A;
        cc6 cc6Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
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
                mn0 mn0Var = new mn0(cc6Var, z);
                g40 g40Var = new g40(cc6Var, (byte) 6);
                this.y = true;
                Object t = n77.t(yq4Var, new lt4(mn0Var, g40Var, null), this);
                if (t != w11Var) {
                    t = pn6Var;
                }
                if (t == w11Var) {
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
                if (cc6Var.g(yq4Var, z, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac6(cc6 cc6Var, yq4 yq4Var, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = cc6Var;
        this.A = yq4Var;
        this.B = z;
    }
}
