package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class k18 implements gt {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k18(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.gt
    public final ii3 apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a28 a28Var = (a28) obj2;
                int i = ((cz7) obj).x;
                if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !a28Var.g.k()) {
                    a28Var.b();
                }
                return aw2.y;
            case 1:
                xf6 xf6Var = (xf6) obj2;
                ju7 ju7Var = new ju7(xf6Var, (q38) obj);
                p04 a = ((sx7) xf6Var.y).a();
                hk6 hk6Var = new hk6(ju7Var);
                a.execute(hk6Var);
                return hk6Var;
            default:
                return wc7.G((ii3) ((g48) obj2).e.get());
        }
    }
}
