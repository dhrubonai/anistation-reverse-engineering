package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class p10 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p10(os0 os0Var, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.z = os0Var;
        this.A = obj;
        this.B = bool;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.y = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        Object obj3 = this.B;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                s10.a((xm6) obj4, (ub2) this.A, (ub2) obj3, (sb2) this.C, (sb2) this.D, (sb2) this.E, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N = kb0.N(i) | 1;
                ((os0) obj4).c(this.A, (Boolean) obj3, this.C, this.D, this.E, (kd2) obj, N);
                return pn6Var;
        }
    }

    public /* synthetic */ p10(xm6 xm6Var, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2, sb2 sb2Var3, int i) {
        this.z = xm6Var;
        this.A = ub2Var;
        this.B = ub2Var2;
        this.C = sb2Var;
        this.D = sb2Var2;
        this.E = sb2Var3;
        this.y = i;
    }
}
