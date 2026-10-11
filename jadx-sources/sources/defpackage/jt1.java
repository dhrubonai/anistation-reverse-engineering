package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jt1 implements w42 {
    public static final jt1 y = new jt1(0);
    public final /* synthetic */ byte x;

    public /* synthetic */ jt1(byte b) {
        this.x = b;
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return pn6Var;
            default:
                Object emit = x42Var.emit(tn5.x, vz0Var);
                if (emit == w11.x) {
                    return emit;
                }
                return pn6Var;
        }
    }
}
