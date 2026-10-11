package defpackage;

import com.anistation.model.MediaStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ nm(int i, Integer num, int i2, MediaStatus mediaStatus, yz3 yz3Var, int i3) {
        this.y = i;
        this.A = num;
        this.z = i2;
        this.B = mediaStatus;
        this.C = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(24577);
                wk6.f(this.y, (Integer) this.A, this.z, (MediaStatus) obj4, (yz3) obj3, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(this.z | 1);
                Object obj5 = this.A;
                int i = this.y;
                t80.e(obj5, i, (yd3) obj4, (os0) obj3, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ nm(Object obj, int i, yd3 yd3Var, os0 os0Var, int i2) {
        this.A = obj;
        this.y = i;
        this.B = yd3Var;
        this.C = os0Var;
        this.z = i2;
    }
}
