package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qj1 implements jc2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ sb2 D;
    public final /* synthetic */ sb2 E;
    public final /* synthetic */ byte x;
    public final /* synthetic */ DownloadAnimeGroup y;
    public final /* synthetic */ List z;

    public /* synthetic */ qj1(DownloadAnimeGroup downloadAnimeGroup, List list, boolean z, Set set, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2, byte b) {
        this.x = b;
        this.y = downloadAnimeGroup;
        this.z = list;
        this.A = z;
        this.B = set;
        this.C = ub2Var;
        this.D = sb2Var;
        this.E = sb2Var2;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        zc3 zc3Var = (zc3) obj;
        kd2 kd2Var = (kd2) obj2;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    dk1.b(this.y, this.z, this.A, this.B, this.C, this.D, this.E, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue2 & 1, z)) {
                    dk1.b(this.y, this.z, this.A, this.B, this.C, this.D, this.E, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }
}
