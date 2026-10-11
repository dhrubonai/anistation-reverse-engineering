package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ze3 extends t36 implements ic2 {
    public final /* synthetic */ af3 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze3(af3 af3Var, int i, int i2, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = af3Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ze3(this.x, this.y, this.z, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ze3 ze3Var = (ze3) create((wc5) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        ze3Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        this.x.m(this.y, this.z);
        return pn6.a;
    }
}
