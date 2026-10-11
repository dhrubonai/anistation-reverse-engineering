package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oz3 extends t36 implements jc2 {
    public /* synthetic */ float x;
    public final /* synthetic */ ub2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz3(ub2 ub2Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.y = ub2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        oz3 oz3Var = new oz3(this.y, (vz0) obj3);
        oz3Var.x = floatValue;
        pn6 pn6Var = pn6.a;
        oz3Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        this.y.invoke(new Float(this.x));
        return pn6.a;
    }
}
