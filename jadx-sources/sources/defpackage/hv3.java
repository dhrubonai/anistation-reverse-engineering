package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hv3 implements aw3, bw3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ gw3 y;
    public final /* synthetic */ int z;

    public /* synthetic */ hv3(gw3 gw3Var, int i, byte b) {
        this.x = b;
        this.y = gw3Var;
        this.z = i;
    }

    @Override // defpackage.bw3
    public void a(fq4 fq4Var, dt3 dt3Var, List list) {
        byte b = this.x;
        int i = this.z;
        gw3 gw3Var = this.y;
        switch (b) {
            case 2:
                fq4Var.c0(gw3Var.N(dt3Var, fq4Var, i), list);
                return;
            case 3:
                if (list.size() == 1) {
                    fq4Var.I0(gw3Var.N(dt3Var, fq4Var, i), (ar3) list.get(0));
                    return;
                } else {
                    fq4Var.y0(list, gw3Var.N(dt3Var, fq4Var, i), gw3Var.N(dt3Var, fq4Var, i + 1));
                    return;
                }
            default:
                fq4Var.c0(gw3Var.N(dt3Var, fq4Var, i), list);
                return;
        }
    }

    @Override // defpackage.aw3
    public void b(fq4 fq4Var, dt3 dt3Var) {
        byte b = this.x;
        int i = this.z;
        gw3 gw3Var = this.y;
        switch (b) {
            case 0:
                fq4Var.N(gw3Var.N(dt3Var, fq4Var, i));
                return;
            default:
                fq4Var.Z(gw3Var.N(dt3Var, fq4Var, i));
                return;
        }
    }
}
