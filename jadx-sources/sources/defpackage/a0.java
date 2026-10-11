package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ k0 y;

    public /* synthetic */ a0(k0 k0Var, byte b) {
        this.x = b;
        this.y = k0Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        yc1 yc1Var;
        byte b = this.x;
        k0 k0Var = this.y;
        switch (b) {
            case 0:
                by2 by2Var = (by2) t80.C(k0Var, yx2.a);
                if (by2Var == null) {
                    hz2.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + by2Var);
                }
                by2 by2Var2 = k0Var.V;
                k0Var.V = by2Var;
                if (by2Var2 != null && !a34.i(by2Var, by2Var2) && ((yc1Var = k0Var.Y) != null || !k0Var.f0)) {
                    if (yc1Var != null) {
                        k0Var.b1(yc1Var);
                    }
                    k0Var.Y = null;
                    k0Var.l1();
                }
                return pn6.a;
            default:
                k0Var.p1();
                return Boolean.TRUE;
        }
    }
}
