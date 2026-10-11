package defpackage;

import com.anistation.model.Anime;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gm implements ic2 {
    public final /* synthetic */ yz3 A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ Anime y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ gm(Anime anime, ub2 ub2Var, yz3 yz3Var, int i) {
        this.y = anime;
        this.z = ub2Var;
        this.A = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        yz3 yz3Var = this.A;
        ub2 ub2Var = this.z;
        Anime anime = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                a34.c(kb0.N(1), ub2Var, kd2Var, yz3Var, anime);
                return pn6Var;
            default:
                wc7.e(kb0.N(1), ub2Var, kd2Var, yz3Var, anime);
                return pn6Var;
        }
    }

    public /* synthetic */ gm(Anime anime, yz3 yz3Var, ub2 ub2Var, int i) {
        this.y = anime;
        this.A = yz3Var;
        this.z = ub2Var;
    }
}
