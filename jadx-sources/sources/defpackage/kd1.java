package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class kd1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ld1 y;

    public /* synthetic */ kd1(ld1 ld1Var, byte b) {
        this.x = b;
        this.y = ld1Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        ld1 ld1Var = this.y;
        switch (b) {
            case 0:
                g65 g65Var = (g65) t80.C(ld1Var, j65.a);
                ee eeVar = ld1Var.R;
                if (g65Var == null) {
                    if (eeVar != null) {
                        ld1Var.b1(eeVar);
                    }
                    ld1Var.R = null;
                } else if (eeVar == null) {
                    i75 i75Var = new i75((Object) ld1Var, (byte) 18);
                    kd1 kd1Var = new kd1(ld1Var, (byte) 1);
                    u34 u34Var = ld1Var.N;
                    boolean z = ld1Var.O;
                    float f = ld1Var.P;
                    sk6 sk6Var = k65.a;
                    ee eeVar2 = new ee(u34Var, z, f, i75Var, kd1Var);
                    ld1Var.a1(eeVar2);
                    ld1Var.R = eeVar2;
                }
                return pn6.a;
            default:
                return te4.i;
        }
    }
}
