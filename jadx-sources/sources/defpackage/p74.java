package defpackage;

import com.anistation.model.AnimeWatchOrderItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class p74 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ ec2 C;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ p74(w74 w74Var, boolean z, sb2 sb2Var, sb2 sb2Var2, int i) {
        this.A = w74Var;
        this.z = z;
        this.B = sb2Var;
        this.C = sb2Var2;
        this.y = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(this.y | 1);
                oi4.d((w74) obj4, this.z, (sb2) obj3, (sb2) ec2Var, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(1);
                et5.a((AnimeWatchOrderItem) obj4, this.y, (yz3) obj3, this.z, (ub2) ec2Var, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ p74(AnimeWatchOrderItem animeWatchOrderItem, int i, yz3 yz3Var, boolean z, ub2 ub2Var, int i2) {
        this.A = animeWatchOrderItem;
        this.y = i;
        this.B = yz3Var;
        this.z = z;
        this.C = ub2Var;
    }
}
