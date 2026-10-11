package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class oj2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ u05 y;
    public final /* synthetic */ u05 z;

    public /* synthetic */ oj2(u05 u05Var, u05 u05Var2, byte b) {
        this.x = b;
        this.y = u05Var;
        this.z = u05Var2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        u05 u05Var = this.z;
        u05 u05Var2 = this.y;
        do3 do3Var = (do3) obj;
        switch (b) {
            case 0:
                if (u05Var2.x == -1) {
                    u05Var2.x = do3Var.b().x;
                }
                u05Var.x = do3Var.b().y + 1;
                return "";
            default:
                if (u05Var2.x == -1) {
                    u05Var2.x = do3Var.b().x;
                }
                u05Var.x = do3Var.b().y + 1;
                return "";
        }
    }
}
