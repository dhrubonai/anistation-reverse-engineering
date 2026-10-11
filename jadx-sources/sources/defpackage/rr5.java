package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr5 extends t36 implements jc2 {
    public /* synthetic */ long x;
    public final /* synthetic */ tr5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr5(tr5 tr5Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.y = tr5Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((xc4) obj2).a;
        rr5 rr5Var = new rr5(this.y, (vz0) obj3);
        rr5Var.x = j;
        pn6 pn6Var = pn6.a;
        rr5Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float intBitsToFloat;
        m37.N(obj);
        long j = this.x;
        tr5 tr5Var = this.y;
        if (tr5Var.J == rg4.x) {
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        } else if (tr5Var.G) {
            intBitsToFloat = tr5Var.E.h() - Float.intBitsToFloat((int) (j >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        tr5Var.N.i(intBitsToFloat - tr5Var.M.h());
        return pn6.a;
    }
}
