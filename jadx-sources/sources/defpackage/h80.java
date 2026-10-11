package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h80 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ v11 y;
    public final /* synthetic */ do5 z;

    public /* synthetic */ h80(v11 v11Var, do5 do5Var, byte b) {
        this.x = b;
        this.y = v11Var;
        this.z = do5Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = this.y;
        do5 do5Var = this.z;
        switch (b) {
            case 0:
                int ordinal = do5Var.c().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 1), 3);
                    } else {
                        tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 0), 3);
                    }
                } else {
                    tl7.z(v11Var, null, null, new nf6(do5Var, null, (byte) 1), 3);
                }
                return pn6Var;
            case 1:
                tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 2), 3);
                break;
            case 2:
                tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 3), 3);
                break;
            case 3:
                tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 4), 3);
                break;
            case 4:
                tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 5), 3);
                return pn6Var;
            default:
                if (((Boolean) do5Var.e.d.invoke(eo5.z)).booleanValue()) {
                    tl7.z(v11Var, null, null, new j80(do5Var, null, (byte) 13), 3);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ h80(do5 do5Var, v11 v11Var, byte b) {
        this.x = b;
        this.z = do5Var;
        this.y = v11Var;
    }
}
