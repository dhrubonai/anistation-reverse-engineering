package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class e03 implements ub2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ em4 z;

    public /* synthetic */ e03(int i, em4 em4Var, int i2) {
        this.x = (byte) 1;
        this.y = i;
        this.z = em4Var;
        this.A = i2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.A;
        int i2 = this.y;
        em4 em4Var = this.z;
        dm4 dm4Var = (dm4) obj;
        switch (b) {
            case 0:
                dm4Var.f(em4Var, i2, i, 0.0f);
                return pn6Var;
            case 1:
                dm4Var.f(em4Var, io3.h0((i2 - em4Var.x) / 2.0f), io3.h0((i - em4Var.y) / 2.0f), 0.0f);
                return pn6Var;
            default:
                dm4Var.f(em4Var, i2, i, 0.0f);
                return pn6Var;
        }
    }

    public /* synthetic */ e03(em4 em4Var, int i, int i2, byte b) {
        this.x = b;
        this.z = em4Var;
        this.y = i;
        this.A = i2;
    }
}
