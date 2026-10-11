package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t31 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ub2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t31(byte b, vz0 vz0Var, ub2 ub2Var) {
        super(2, vz0Var);
        this.x = b;
        this.z = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        ub2 ub2Var = this.z;
        switch (b) {
            case 0:
                t31 t31Var = new t31((byte) 0, vz0Var, ub2Var);
                t31Var.y = obj;
                return t31Var;
            case 1:
                t31 t31Var2 = new t31((byte) 1, vz0Var, ub2Var);
                t31Var2.y = obj;
                return t31Var2;
            default:
                t31 t31Var3 = new t31(ub2Var, vz0Var);
                t31Var3.y = obj;
                return t31Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((t31) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((t31) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                ((t31) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        ub2 ub2Var = this.z;
        switch (b) {
            case 0:
                m37.N(obj);
                ij4 ij4Var = (ij4) this.y;
                ij4Var.getClass();
                return ub2Var.invoke(ij4Var.d());
            case 1:
                m37.N(obj);
                ij4 ij4Var2 = (ij4) this.y;
                ij4Var2.getClass();
                return ub2Var.invoke(ij4Var2.d());
            default:
                m37.N(obj);
                ub2Var.invoke((j44) this.y);
                return pn6.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(ub2 ub2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.z = ub2Var;
    }
}
