package defpackage;

import com.anistation.model.Recent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hs6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ Recent z;

    public /* synthetic */ hs6(ub2 ub2Var, Recent recent, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = recent;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Recent recent = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(Integer.valueOf(recent.getEpisodeNumber()));
                return pn6Var;
            default:
                ub2Var.invoke(vc2.a(recent.getAnilistId(), recent.getId()));
                return pn6Var;
        }
    }
}
