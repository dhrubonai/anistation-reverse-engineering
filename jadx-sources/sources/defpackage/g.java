package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ic2 {
    public final /* synthetic */ yz3 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ g(int i, String str, String str2, yz3 yz3Var, boolean z, sb2 sb2Var, int i2) {
        this.B = i;
        this.C = str;
        this.D = str2;
        this.A = yz3Var;
        this.y = z;
        this.z = sb2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(24577);
                u.a(this.B, (String) obj4, (String) obj3, this.A, this.y, this.z, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(this.B | 1);
                zz.e(this.y, (hp4) obj4, this.z, (sb2) obj3, this.A, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ g(boolean z, hp4 hp4Var, sb2 sb2Var, sb2 sb2Var2, yz3 yz3Var, int i) {
        this.y = z;
        this.C = hp4Var;
        this.z = sb2Var;
        this.D = sb2Var2;
        this.A = yz3Var;
        this.B = i;
    }
}
