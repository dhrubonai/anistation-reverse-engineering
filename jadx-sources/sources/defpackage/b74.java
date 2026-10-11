package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b74 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ float z;

    public /* synthetic */ b74(ub2 ub2Var, float f, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = f;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        float f = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                kk kkVar = (kk) obj;
                return new ez0(((ez0) ub2Var.invoke(kkVar)).a, ((ez0) ub2Var.invoke(kkVar)).b, f, null);
            default:
                ((String) obj).getClass();
                ub2Var.invoke(Float.valueOf(f));
                return pn6.a;
        }
    }
}
