package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a8 extends t36 implements jc2 {
    public /* synthetic */ v11 x;
    public /* synthetic */ float y;
    public final /* synthetic */ d9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(d9 d9Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.z = d9Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        a8 a8Var = new a8(this.z, (vz0) obj3);
        a8Var.x = (v11) obj;
        a8Var.y = floatValue;
        pn6 pn6Var = pn6.a;
        a8Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        tl7.z(this.x, null, null, new z7(this.z, this.y, null), 3);
        return pn6.a;
    }
}
