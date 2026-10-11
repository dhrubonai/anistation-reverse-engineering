package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gv3 implements aw3, bw3, ay0 {
    public final /* synthetic */ gw3 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ gv3(gw3 gw3Var, int i, int i2) {
        this.x = gw3Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.bw3
    public void a(fq4 fq4Var, dt3 dt3Var, List list) {
        gw3 gw3Var = this.x;
        fq4Var.y0(list, gw3Var.N(dt3Var, fq4Var, this.y), gw3Var.N(dt3Var, fq4Var, this.z));
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        gw3 gw3Var = this.x;
        ((bu3) gw3Var.e.get()).getClass();
        ew3 ew3Var = gw3Var.p;
        if (ew3Var != null) {
            ew3Var.setFixedSize(this.y, this.z);
        }
    }

    @Override // defpackage.aw3
    public void b(fq4 fq4Var, dt3 dt3Var) {
        gw3 gw3Var = this.x;
        fq4Var.R(gw3Var.N(dt3Var, fq4Var, this.y), gw3Var.N(dt3Var, fq4Var, this.z));
    }
}
