package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ float y;

    public /* synthetic */ tg(float f, byte b) {
        this.x = b;
        this.y = f;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        float f = this.y;
        switch (b) {
            case 0:
                p55 p55Var = (p55) obj;
                p55Var.getClass();
                p55Var.n(Float.intBitsToFloat((int) (p55Var.O & 4294967295L)) * f);
                return pn6Var;
            case 1:
                p55 p55Var2 = (p55) obj;
                p55Var2.getClass();
                p55Var2.h(f);
                p55Var2.i(f);
                return pn6Var;
            case 2:
                ((ud1) obj).getClass();
                return new c13(((int) r7.g0(f)) & 4294967295L);
            default:
                p55 p55Var3 = (p55) obj;
                p55Var3.getClass();
                p55Var3.m(wt5.c(0.5f, 0.5f));
                p55Var3.h(f);
                p55Var3.i(f);
                return pn6Var;
        }
    }
}
