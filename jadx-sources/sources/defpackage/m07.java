package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class m07 extends uc2 implements ub2 {
    public final /* synthetic */ byte x = 1;

    public m07(v27 v27Var) {
        super(1, v27Var, v27.class, "setIsFullscreen", "setIsFullscreen(Z)V", 0);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((v27) this.receiver).P(((Boolean) obj).booleanValue());
                return pn6Var;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hm5 hm5Var = (hm5) this.receiver;
                sx5 sx5Var = hm5Var.j;
                while (true) {
                    Object value = sx5Var.getValue();
                    pn6 pn6Var2 = pn6Var;
                    boolean z = booleanValue;
                    if (sx5Var.j(value, xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, booleanValue, null, null, false, false, false, false, 266338303))) {
                        tl7.z(zz.J(hm5Var), null, null, new em5(hm5Var, z, null, (byte) 6), 3);
                        return pn6Var2;
                    }
                    booleanValue = z;
                    pn6Var = pn6Var2;
                }
        }
    }

    public /* synthetic */ m07(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
