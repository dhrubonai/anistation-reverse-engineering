package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class uj1 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ ub2 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ List z;

    public /* synthetic */ uj1(List list, int i, ub2 ub2Var, ub2 ub2Var2, List list2, String str, ub2 ub2Var3, yz3 yz3Var, boolean z, int i2) {
        this.x = (byte) 2;
        this.z = list;
        this.G = i;
        this.B = ub2Var;
        this.C = ub2Var2;
        this.y = list2;
        this.D = str;
        this.E = ub2Var3;
        this.F = yz3Var;
        this.A = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        int i = this.G;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.F;
        Object obj4 = this.D;
        Object obj5 = this.y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(i | 1);
                dk1.d((DownloadAnimeGroup) obj5, this.z, this.A, this.B, this.C, (ic2) obj4, this.E, (sb2) obj3, (kd2) obj, N);
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                dk1.d((DownloadAnimeGroup) obj5, this.z, this.A, this.B, this.C, (ic2) obj4, this.E, (sb2) obj3, (kd2) obj, N2);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N3 = kb0.N(12582913);
                xt5.b(this.z, this.G, this.B, this.C, (List) obj5, (String) obj4, this.E, (yz3) obj3, this.A, (kd2) obj, N3);
                return pn6Var;
        }
    }

    public /* synthetic */ uj1(DownloadAnimeGroup downloadAnimeGroup, List list, boolean z, ub2 ub2Var, ub2 ub2Var2, ic2 ic2Var, ub2 ub2Var3, sb2 sb2Var, int i, byte b) {
        this.x = b;
        this.y = downloadAnimeGroup;
        this.z = list;
        this.A = z;
        this.B = ub2Var;
        this.C = ub2Var2;
        this.D = ic2Var;
        this.E = ub2Var3;
        this.F = sb2Var;
        this.G = i;
    }
}
