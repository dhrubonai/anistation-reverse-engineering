package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class w31 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ l11 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(ls0 ls0Var, ae0 ae0Var, boolean z, boolean z2, l11 l11Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = ls0Var;
        this.D = ae0Var;
        this.z = z;
        this.A = z2;
        this.B = l11Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (b) {
            case 0:
                return new w31(this.B, (v65) obj3, this.z, this.A, (ub2) obj2, vz0Var);
            default:
                return new w31((ls0) obj3, (ae0) obj2, this.z, this.A, this.B, vz0Var);
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
                return ((w31) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((w31) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        l11 l11Var = this.B;
        w11 w11Var = w11.x;
        Object obj2 = this.C;
        Object obj3 = this.D;
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
                v31 v31Var = new v31((v65) obj2, this.z, this.A, (ub2) obj3, (vz0) null);
                this.y = true;
                Object V = tl7.V(l11Var, v31Var, this);
                if (V == w11Var) {
                    return w11Var;
                }
                return V;
            default:
                ae0 ae0Var = (ae0) obj3;
                ls0 ls0Var = (ls0) obj2;
                boolean z2 = this.y;
                boolean z3 = this.A;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    this.y = true;
                    if (ov5.k(ls0Var, ae0Var, this.z, z3, this) == w11Var) {
                        return w11Var;
                    }
                }
                return ov5.j(ls0Var, ae0Var, l11Var, z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(l11 l11Var, v65 v65Var, boolean z, boolean z2, ub2 ub2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = l11Var;
        this.C = v65Var;
        this.z = z;
        this.A = z2;
        this.D = ub2Var;
    }
}
