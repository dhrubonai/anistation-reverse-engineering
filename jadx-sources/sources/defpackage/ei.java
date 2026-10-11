package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ ei(String str, sb2 sb2Var, int i, byte b) {
        this.x = b;
        this.y = str;
        this.z = sb2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sb2 sb2Var = this.z;
        String str = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                li.a(str, sb2Var, kd2Var, kb0.N(1));
                return pn6Var;
            default:
                n77.e(str, sb2Var, kd2Var, kb0.N(1));
                return pn6Var;
        }
    }
}
