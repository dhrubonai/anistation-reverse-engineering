package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class n36 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ic2 y;

    public /* synthetic */ n36(ic2 ic2Var, byte b) {
        this.x = b;
        this.y = ic2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ic2 ic2Var = this.y;
        switch (b) {
            case 0:
                kl klVar = (kl) obj;
                ic2Var.invoke(klVar.e.getValue(), db.l.b.invoke(klVar.f));
                return pn6Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                ic2Var.invoke(bm1.x, str);
                return pn6Var;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ic2Var.invoke(bm1.y, str2);
                return pn6Var;
        }
    }
}
