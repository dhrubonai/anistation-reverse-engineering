package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class f76 extends x45 implements ic2 {
    public final /* synthetic */ v11 A;
    public final /* synthetic */ ot4 B;
    public final /* synthetic */ jc2 C;
    public final /* synthetic */ ub2 D;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f76(vz0 vz0Var, v11 v11Var, ub2 ub2Var, jc2 jc2Var, ot4 ot4Var) {
        super(2, vz0Var);
        this.A = v11Var;
        this.B = ot4Var;
        this.C = jc2Var;
        this.D = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        jc2 jc2Var = this.C;
        f76 f76Var = new f76(vz0Var, this.A, this.D, jc2Var, this.B);
        f76Var.z = obj;
        return f76Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((f76) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.y;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            z36 z36Var = (z36) this.z;
            this.y = true;
            Object g = j76.g(z36Var, this.A, this.B, this.C, this.D, this);
            w11 w11Var = w11.x;
            if (g == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
