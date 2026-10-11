package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zo4 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean[] C;
    public final /* synthetic */ ub2 D;
    public final /* synthetic */ w44 E;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean[] zArr, ub2 ub2Var, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = z;
        this.y = z2;
        this.z = z3;
        this.A = z4;
        this.B = z5;
        this.C = zArr;
        this.D = ub2Var;
        this.E = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new zo4(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        zo4 zo4Var = (zo4) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        zo4Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        boolean z = this.x;
        pn6 pn6Var = pn6.a;
        if (z && this.y && !((Boolean) this.E.getValue()).booleanValue() && !this.z) {
            boolean z2 = this.B;
            boolean z3 = this.A;
            if (z3 != z2) {
                this.C[0] = true;
                this.D.invoke(Boolean.valueOf(z3));
            }
        }
        return pn6Var;
    }
}
