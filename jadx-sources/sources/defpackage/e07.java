package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e07 extends t36 implements ic2 {
    public final /* synthetic */ wj A;
    public /* synthetic */ Object x;
    public final /* synthetic */ wj y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(wj wjVar, long j, wj wjVar2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = wjVar;
        this.z = j;
        this.A = wjVar2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        e07 e07Var = new e07(this.y, this.z, this.A, vz0Var);
        e07Var.x = obj;
        return e07Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((e07) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        v11 v11Var = (v11) this.x;
        m37.N(obj);
        tl7.z(v11Var, null, null, new jh5(this.y, this.z, null, (byte) 1), 3);
        return tl7.z(v11Var, null, null, new mz3(this.A, null, (byte) 1), 3);
    }
}
