package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nb6 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ud1 y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ nb6(ud1 ud1Var, w44 w44Var, byte b) {
        this.x = b;
        this.y = ud1Var;
        this.z = w44Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        w44 w44Var = this.z;
        ud1 ud1Var = this.y;
        switch (b) {
            case 0:
                pk2 pk2Var = pk2.b0;
                mm mmVar = new mm((sb2) obj, (byte) 12);
                nb6 nb6Var = new nb6(ud1Var, w44Var, (byte) 1);
                ai5 ai5Var = lm3.a;
                return new im3(mmVar, nb6Var, pk2Var);
            default:
                w44Var.setValue(new k13((ud1Var.x0(ym1.a(r7.a)) & 4294967295L) | (ud1Var.x0(ym1.b(((ym1) obj).a)) << 32)));
                return pn6.a;
        }
    }
}
