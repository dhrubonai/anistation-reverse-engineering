package defpackage;

import com.anistation.model.library.WatchProgress;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ jh(yz3 yz3Var, ic2 ic2Var, boolean z, ub2 ub2Var, om5 om5Var, boolean z2, th4 th4Var, int i) {
        this.y = yz3Var;
        this.C = ic2Var;
        this.z = z;
        this.B = ub2Var;
        this.D = om5Var;
        this.A = z2;
        this.E = th4Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(385);
                db.n(this.y, (ic2) obj5, this.z, this.B, (om5) obj4, this.A, (th4) obj3, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(1);
                oi4.a((WatchProgress) obj5, this.y, this.z, this.A, (sb2) obj4, this.B, (sb2) obj3, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ jh(WatchProgress watchProgress, yz3 yz3Var, boolean z, boolean z2, sb2 sb2Var, ub2 ub2Var, sb2 sb2Var2, int i) {
        this.C = watchProgress;
        this.y = yz3Var;
        this.z = z;
        this.A = z2;
        this.D = sb2Var;
        this.B = ub2Var;
        this.E = sb2Var2;
    }
}
