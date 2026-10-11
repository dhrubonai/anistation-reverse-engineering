package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v31 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public final /* synthetic */ v65 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(vz0 vz0Var, v65 v65Var, boolean z, boolean z2, ub2 ub2Var) {
        super(2, vz0Var);
        this.z = v65Var;
        this.A = z;
        this.B = z2;
        this.C = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new v31(this.z, this.A, this.B, this.C, vz0Var);
            default:
                return new v31(vz0Var, this.z, this.A, this.B, this.C);
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
                return ((v31) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((v31) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.x;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
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
                v65 v65Var = this.z;
                if ((!v65Var.inCompatibilityMode() || !v65Var.inTransaction()) && this.A) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = this.B;
                v65 v65Var2 = this.z;
                u31 u31Var = new u31(z, z3, v65Var2, null, this.C, (byte) 0);
                this.y = true;
                Object useConnection = v65Var2.useConnection(z3, u31Var, this);
                if (useConnection == w11Var) {
                    return w11Var;
                }
                return useConnection;
            default:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                boolean z5 = this.B;
                boolean z6 = this.A;
                v65 v65Var3 = this.z;
                u31 u31Var2 = new u31(z5, z6, v65Var3, null, this.C, (byte) 1);
                this.y = true;
                Object useConnection2 = v65Var3.useConnection(z6, u31Var2, this);
                if (useConnection2 == w11Var) {
                    return w11Var;
                }
                return useConnection2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(v65 v65Var, boolean z, boolean z2, ub2 ub2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = v65Var;
        this.A = z;
        this.B = z2;
        this.C = ub2Var;
    }
}
