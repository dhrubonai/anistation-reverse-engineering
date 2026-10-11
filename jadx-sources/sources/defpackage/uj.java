package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uj extends t36 implements ub2 {
    public final /* synthetic */ wj x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(wj wjVar, Object obj, vz0 vz0Var) {
        super(1, vz0Var);
        this.x = wjVar;
        this.y = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new uj(this.x, this.y, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        uj ujVar = (uj) create((vz0) obj);
        pn6 pn6Var = pn6.a;
        ujVar.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        wj wjVar = this.x;
        wjVar.c();
        Object b = wjVar.b(this.y);
        wjVar.c.y.setValue(b);
        wjVar.e.setValue(b);
        return pn6.a;
    }
}
