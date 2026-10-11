package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vj extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj(Object obj, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return new vj((wj) obj, vz0Var, (byte) 0);
            default:
                return new vj((u96) obj, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                ((vj) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((vj) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                ((wj) obj2).c();
                return pn6Var;
            default:
                m37.N(obj);
                ((u96) obj2).R.t.setValue(Boolean.FALSE);
                return pn6Var;
        }
    }
}
