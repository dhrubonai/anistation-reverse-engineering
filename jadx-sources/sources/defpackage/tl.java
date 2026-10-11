package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 3;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    public /* synthetic */ tl(int i, yc5 yc5Var, boolean z, List list, ic2 ic2Var, sb2 sb2Var, yz3 yz3Var, int i2) {
        this.z = i;
        this.A = yc5Var;
        this.y = z;
        this.B = list;
        this.C = ic2Var;
        this.D = sb2Var;
        this.E = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        int i = this.z;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        switch (b) {
            case 0:
                or2 or2Var = (or2) obj7;
                hm6 hm6Var = (hm6) obj;
                hm6Var.getClass();
                ((hm6) obj2).getClass();
                im6.c(hm6Var, "https://open.anistation.top");
                jy5.a(hm6Var, new String[]{"v2", "anime", "sources"});
                rv5.f(or2Var, "animeId", (String) obj6);
                rv5.f(or2Var, "malId", (Integer) obj3);
                rv5.f(or2Var, "episodeNumber", Integer.valueOf(i));
                rv5.f(or2Var, HandleInvocationsFromAdViewer.KEY_AD_TYPE, (String) obj5);
                rv5.f(or2Var, "providerId", (String) obj4);
                rv5.f(or2Var, "playbackCapability", "shiro-direct-v1");
                if (this.y) {
                    rv5.f(or2Var, "refreshPlayback", Boolean.TRUE);
                }
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                int N = kb0.N(i | 1);
                io3.d((xr4) obj7, (ng6) obj6, (v11) obj5, this.y, (w44) obj4, (os0) obj3, (kd2) obj, N);
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                uz0.c((String) obj6, this.y, (qz0) obj7, (yz3) obj5, (jc2) obj4, (sb2) obj3, (kd2) obj, N2);
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                int N3 = kb0.N(1);
                kn2.a(this.z, (yc5) obj7, this.y, (List) obj6, (ic2) obj5, (sb2) obj4, (yz3) obj3, (kd2) obj, N3);
                return pn6Var;
            case 4:
                ((Integer) obj2).getClass();
                int N4 = kb0.N(i | 1);
                sr5.c((yz3) obj7, (tr5) obj6, this.y, (u34) obj5, (os0) obj4, (os0) obj3, (kd2) obj, N4);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N5 = kb0.N(i | 1);
                jg6.b((xr4) obj7, (os0) obj6, (ng6) obj5, (yz3) obj4, this.y, (os0) obj3, (kd2) obj, N5);
                return pn6Var;
        }
    }

    public /* synthetic */ tl(or2 or2Var, String str, Integer num, int i, String str2, String str3, boolean z) {
        this.A = or2Var;
        this.B = str;
        this.E = num;
        this.z = i;
        this.C = str2;
        this.D = str3;
        this.y = z;
    }

    public /* synthetic */ tl(yz3 yz3Var, tr5 tr5Var, boolean z, u34 u34Var, os0 os0Var, os0 os0Var2, int i) {
        this.A = yz3Var;
        this.B = tr5Var;
        this.y = z;
        this.C = u34Var;
        this.D = os0Var;
        this.E = os0Var2;
        this.z = i;
    }

    public /* synthetic */ tl(xr4 xr4Var, os0 os0Var, ng6 ng6Var, yz3 yz3Var, boolean z, os0 os0Var2, int i) {
        this.A = xr4Var;
        this.B = os0Var;
        this.C = ng6Var;
        this.D = yz3Var;
        this.y = z;
        this.E = os0Var2;
        this.z = i;
    }

    public /* synthetic */ tl(xr4 xr4Var, ng6 ng6Var, v11 v11Var, boolean z, w44 w44Var, os0 os0Var, int i) {
        this.A = xr4Var;
        this.B = ng6Var;
        this.C = v11Var;
        this.y = z;
        this.D = w44Var;
        this.E = os0Var;
        this.z = i;
    }

    public /* synthetic */ tl(String str, boolean z, qz0 qz0Var, yz3 yz3Var, jc2 jc2Var, sb2 sb2Var, int i) {
        this.B = str;
        this.y = z;
        this.A = qz0Var;
        this.C = yz3Var;
        this.D = jc2Var;
        this.E = sb2Var;
        this.z = i;
    }
}
