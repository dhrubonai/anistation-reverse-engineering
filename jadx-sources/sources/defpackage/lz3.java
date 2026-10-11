package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lz3 implements sb2 {
    public final /* synthetic */ v11 A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ do5 y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ lz3(do5 do5Var, v11 v11Var, sb2 sb2Var) {
        this.y = do5Var;
        this.A = v11Var;
        this.z = sb2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = this.A;
        sb2 sb2Var = this.z;
        do5 do5Var = this.y;
        switch (b) {
            case 0:
                if (((Boolean) do5Var.e.d.invoke(eo5.x)).booleanValue()) {
                    tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 9), 3).l0(new hz3(do5Var, sb2Var, (byte) 0));
                }
                return pn6Var;
            default:
                int ordinal = do5Var.c().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 11), 3);
                    } else {
                        tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 10), 3);
                    }
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ lz3(do5 do5Var, sb2 sb2Var, v11 v11Var) {
        this.y = do5Var;
        this.z = sb2Var;
        this.A = v11Var;
    }
}
