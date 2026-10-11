package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oj extends t36 implements ic2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ ko4 D;
    public boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ dq4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(boolean z, dq4 dq4Var, ub2 ub2Var, boolean z2, ub2 ub2Var2, ko4 ko4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = dq4Var;
        this.A = ub2Var;
        this.B = z2;
        this.C = ub2Var2;
        this.D = ko4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new oj(this.y, this.z, this.A, this.B, this.C, this.D, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((oj) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        pn6 pn6Var = pn6.a;
        dq4 dq4Var = this.z;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            if (!this.y && !dq4Var.j) {
                m18 m18Var = fq1.y;
                long W = w65.W(3000L, jq1.MILLISECONDS);
                this.x = true;
                Object v = x97.v(W, this);
                w11 w11Var = w11.x;
                if (v == w11Var) {
                    return w11Var;
                }
            }
            return pn6Var;
        }
        boolean z2 = dq4Var.b;
        ub2 ub2Var = this.A;
        if (z2 && !dq4Var.g && !dq4Var.i) {
            ub2Var.invoke(Boolean.FALSE);
        }
        if (this.B) {
            this.C.invoke(new Long(this.D.getDuration()));
            ub2Var.invoke(Boolean.TRUE);
        }
        return pn6Var;
    }
}
