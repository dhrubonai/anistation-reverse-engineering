package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lj4 extends t36 implements ub2 {
    public final /* synthetic */ mj4 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ ub2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj4(mj4 mj4Var, String str, ub2 ub2Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.x = mj4Var;
        this.y = str;
        this.z = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new lj4(this.x, this.y, this.z, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((lj4) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        m85 s0 = this.x.b.s0(this.y);
        try {
            Object invoke = this.z.invoke(s0);
            o80.r(s0, null);
            return invoke;
        } finally {
        }
    }
}
