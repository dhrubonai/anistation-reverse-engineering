package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nj1 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ nj1(DownloadAnimeGroup downloadAnimeGroup, List list, boolean z, Set set, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2) {
        this.A = downloadAnimeGroup;
        this.B = list;
        this.y = z;
        this.C = set;
        this.D = ub2Var;
        this.z = sb2Var;
        this.E = sb2Var2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        switch (b) {
            case 0:
                pe3 pe3Var = (pe3) obj;
                pe3Var.getClass();
                pe3.A0(pe3Var, "download-hero", new os0(-1318810739, true, new qj1((DownloadAnimeGroup) obj6, (List) obj5, this.y, (Set) obj4, (ub2) obj3, this.z, (sb2) obj2, (byte) 0)), 2);
                return pn6Var;
            default:
                do5 do5Var = (do5) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                v11 v11Var = (v11) obj2;
                bi5 bi5Var = (bi5) obj;
                if (this.y) {
                    kz3 kz3Var = new kz3(this.z, (byte) 1);
                    w73[] w73VarArr = zh5.a;
                    bi5Var.b(oh5.v, new o3(str, kz3Var));
                    eo5 c = do5Var.c();
                    eo5 eo5Var = eo5.z;
                    if (c == eo5Var) {
                        bi5Var.b(oh5.t, new o3(str2, new mi(do5Var, v11Var, do5Var, (byte) 11)));
                    } else if (do5Var.e.d().a.containsKey(eo5Var)) {
                        bi5Var.b(oh5.u, new o3(str3, new h80(do5Var, v11Var, (byte) 5)));
                    }
                }
                return pn6Var;
        }
    }

    public /* synthetic */ nj1(boolean z, do5 do5Var, String str, String str2, String str3, sb2 sb2Var, v11 v11Var) {
        this.y = z;
        this.A = do5Var;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.z = sb2Var;
        this.E = v11Var;
    }
}
