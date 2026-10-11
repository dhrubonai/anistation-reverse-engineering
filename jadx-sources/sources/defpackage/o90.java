package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class o90 implements ic2 {
    public final /* synthetic */ byte A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ short z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o90(yz3 yz3Var, e7 e7Var, os0 os0Var, int i, int i2) {
        this.y = yz3Var;
        this.B = e7Var;
        this.C = os0Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        short s = this.z;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(s | 1);
                x97.b(this.y, (e7) obj4, (os0) obj3, (kd2) obj, N, this.A);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(s | 1);
                h98.d((String) obj4, (String) obj3, this.y, (kd2) obj, N2, this.A);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o90(String str, String str2, yz3 yz3Var, int i, int i2) {
        this.B = str;
        this.C = str2;
        this.y = yz3Var;
        this.z = i;
        this.A = i2;
    }
}
