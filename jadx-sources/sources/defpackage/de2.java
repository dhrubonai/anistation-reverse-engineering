package defpackage;

import com.anistation.model.connectivity.NetworkState;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class de2 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ de2(fe2 fe2Var, int i, boolean z, yz3 yz3Var, int i2) {
        this.B = fe2Var;
        this.A = i;
        this.y = z;
        this.z = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        int i = this.A;
        boolean z = this.y;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.z;
        Object obj4 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(24577);
                nx7.d((fe2) obj4, this.A, this.y, (yz3) obj3, (kd2) obj, N);
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                m37.a((NetworkState) obj4, z, (yz3) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                te4.l((yz3) obj3, (ic2) obj4, (kd2) obj, kb0.N(i | 1), z ? 1 : 0);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                nu5.a(z, (c45) obj4, (jb6) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ de2(yz3 yz3Var, ic2 ic2Var, int i, int i2) {
        this.z = yz3Var;
        this.B = ic2Var;
        this.A = i;
        this.y = i2;
    }

    public /* synthetic */ de2(NetworkState networkState, boolean z, yz3 yz3Var, int i) {
        this.B = networkState;
        this.y = z;
        this.z = yz3Var;
        this.A = i;
    }

    public /* synthetic */ de2(boolean z, c45 c45Var, jb6 jb6Var, int i) {
        this.y = z;
        this.B = c45Var;
        this.z = jb6Var;
        this.A = i;
    }
}
