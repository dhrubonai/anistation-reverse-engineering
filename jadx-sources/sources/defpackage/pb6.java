package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pb6 implements sb2 {
    public final /* synthetic */ cc6 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ v05 y;
    public final /* synthetic */ v05 z;

    public /* synthetic */ pb6(v05 v05Var, v05 v05Var2, cc6 cc6Var, byte b) {
        this.x = b;
        this.y = v05Var;
        this.z = v05Var2;
        this.A = cc6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v05 v05Var = this.z;
        cc6 cc6Var = this.A;
        v05 v05Var2 = this.y;
        switch (b) {
            case 0:
                cc6.h(v05Var2, v05Var, cc6Var);
                return pn6Var;
            case 1:
                cc6.f(v05Var2, v05Var, cc6Var);
                return pn6Var;
            case 2:
                cc6.f(v05Var2, v05Var, cc6Var);
                return pn6Var;
            default:
                cc6.h(v05Var2, v05Var, cc6Var);
                return pn6Var;
        }
    }

    public /* synthetic */ pb6(v05 v05Var, cc6 cc6Var, v05 v05Var2, byte b) {
        this.x = b;
        this.y = v05Var;
        this.A = cc6Var;
        this.z = v05Var2;
    }
}
