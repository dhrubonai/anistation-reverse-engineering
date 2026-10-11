package defpackage;

import com.anistation.model.Episode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wh implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ ec2 G;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ String z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wh(ic6 ic6Var, yz3 yz3Var, String str, om5 om5Var, int i, o83 o83Var, he5 he5Var, ic2 ic2Var, ic2 ic2Var2, int i2) {
        this.B = ic6Var;
        this.y = yz3Var;
        this.z = str;
        this.C = om5Var;
        this.A = i;
        this.D = o83Var;
        this.E = he5Var;
        this.F = ic2Var;
        this.G = ic2Var2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(905969665);
                o80.b((ic6) obj7, this.y, this.z, (om5) obj6, this.A ? 1 : 0, (o83) obj5, (he5) obj4, (ic2) obj3, (ic2) ec2Var, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(1);
                kb0.d((Episode) obj7, this.y, this.z, (Integer) obj6, (Long) obj5, (Long) obj4, (String) obj3, this.A, (sb2) ec2Var, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ wh(Episode episode, yz3 yz3Var, String str, Integer num, Long l, Long l2, String str2, boolean z, sb2 sb2Var, int i) {
        this.B = episode;
        this.y = yz3Var;
        this.z = str;
        this.C = num;
        this.D = l;
        this.E = l2;
        this.F = str2;
        this.A = z;
        this.G = sb2Var;
    }
}
