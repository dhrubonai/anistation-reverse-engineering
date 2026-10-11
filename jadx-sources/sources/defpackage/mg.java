package defpackage;

import com.anistation.model.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements ic2 {
    public final /* synthetic */ byte A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ ec2 E;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ int z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mg(ub2 ub2Var, yz3 yz3Var, ub2 ub2Var2, ub2 ub2Var3, ub2 ub2Var4, int i, int i2) {
        this.B = ub2Var;
        this.y = yz3Var;
        this.C = ub2Var2;
        this.D = ub2Var3;
        this.E = ub2Var4;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.z;
        ec2 ec2Var = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(i | 1);
                a34.a((ub2) obj5, this.y, (ub2) obj4, (ub2) obj3, (ub2) ec2Var, (kd2) obj, N, this.A);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                zz.b((String) obj5, (Status) obj4, this.y, (String) obj3, (sb2) ec2Var, (kd2) obj, N2, this.A);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mg(String str, Status status, yz3 yz3Var, String str2, sb2 sb2Var, int i, int i2) {
        this.B = str;
        this.C = status;
        this.y = yz3Var;
        this.D = str2;
        this.E = sb2Var;
        this.z = i;
        this.A = i2;
    }
}
