package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ba0 extends t36 implements ic2 {
    public final /* synthetic */ n A;
    public final /* synthetic */ mi B;
    public /* synthetic */ Object x;
    public final /* synthetic */ ca0 y;
    public final /* synthetic */ fa4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(ca0 ca0Var, fa4 fa4Var, n nVar, mi miVar, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = ca0Var;
        this.z = fa4Var;
        this.A = nVar;
        this.B = miVar;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ba0 ba0Var = new ba0(this.y, this.z, this.A, this.B, vz0Var);
        ba0Var.x = obj;
        return ba0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((ba0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        v11 v11Var = (v11) this.x;
        n nVar = this.A;
        ca0 ca0Var = this.y;
        tl7.z(v11Var, null, null, new e0(ca0Var, this.z, nVar, (vz0) null, (byte) 9), 3);
        return tl7.z(v11Var, null, null, new c0(ca0Var, this.B, null, (byte) 14), 3);
    }
}
