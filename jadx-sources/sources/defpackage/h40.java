package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h40 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cc6 y;

    public /* synthetic */ h40(cc6 cc6Var, int i, byte b) {
        this.x = b;
        this.y = cc6Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        cc6 cc6Var = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                s40.e(cc6Var, kd2Var, kb0.N(1));
                return pn6Var;
            default:
                s40.d(cc6Var, kd2Var, kb0.N(1));
                return pn6Var;
        }
    }
}
