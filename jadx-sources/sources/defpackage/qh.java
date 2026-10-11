package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ px5 y;

    public /* synthetic */ qh(px5 px5Var, byte b) {
        this.x = b;
        this.y = px5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        px5 px5Var = this.y;
        switch (b) {
            case 0:
                bp1 bp1Var = (bp1) obj;
                bp1Var.getClass();
                if (((Number) px5Var.getValue()).floatValue() > 0.0f) {
                    bp1.k0(bp1Var, ep0.b, 0L, 0L, ((Number) px5Var.getValue()).floatValue(), 118);
                }
                return pn6Var;
            case 1:
                ((ud1) obj).getClass();
                return new c13(r14.x0(((vm1) px5Var.getValue()).x) << 32);
            case 2:
                ((ud1) obj).getClass();
                return new c13(r14.x0(((vm1) px5Var.getValue()).x) << 32);
            case 3:
                p55 p55Var = (p55) obj;
                p55Var.getClass();
                p55Var.h(((Number) px5Var.getValue()).floatValue());
                p55Var.i(((Number) px5Var.getValue()).floatValue());
                p55Var.m(xh6.b);
                return pn6Var;
            default:
                p55 p55Var2 = (p55) obj;
                p55Var2.getClass();
                p55Var2.c(db.B(1.0f - (((Number) px5Var.getValue()).floatValue() / 0.3f), 0.0f, 1.0f));
                return pn6Var;
        }
    }
}
