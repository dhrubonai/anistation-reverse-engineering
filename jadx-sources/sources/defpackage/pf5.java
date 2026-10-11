package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pf5 extends t36 implements ub2 {
    public final /* synthetic */ sf5 A;
    public final /* synthetic */ xi6 B;
    public final /* synthetic */ float C;
    public boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf5(Object obj, Object obj2, sf5 sf5Var, xi6 xi6Var, float f, vz0 vz0Var) {
        super(1, vz0Var);
        this.y = obj;
        this.z = obj2;
        this.A = sf5Var;
        this.B = xi6Var;
        this.C = f;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new pf5(this.y, this.z, this.A, this.B, this.C, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((pf5) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            of5 of5Var = new of5(this.y, this.z, this.A, this.B, this.C, null);
            this.x = true;
            Object K = db.K(of5Var, this);
            w11 w11Var = w11.x;
            if (K == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
