package defpackage;

import com.anistation.model.SearchSuggestion;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oe5 implements kc2 {
    public final /* synthetic */ p72 A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ w72 D;
    public final /* synthetic */ List x;
    public final /* synthetic */ String y;
    public final /* synthetic */ ic6 z;

    public oe5(List list, String str, ic6 ic6Var, p72 p72Var, ub2 ub2Var, ub2 ub2Var2, w72 w72Var) {
        this.x = list;
        this.y = str;
        this.z = ic6Var;
        this.A = p72Var;
        this.B = ub2Var;
        this.C = ub2Var2;
        this.D = w72Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        zc3 zc3Var = (zc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(zc3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (kd2Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            SearchSuggestion searchSuggestion = (SearchSuggestion) this.x.get(intValue);
            kd2Var.e0(1802143091);
            String title = searchSuggestion.getTitle();
            String thumbnailImage = searchSuggestion.getThumbnailImage();
            boolean V = uz5.V(this.y);
            ic6 ic6Var = this.z;
            boolean f = kd2Var.f(ic6Var) | kd2Var.h(searchSuggestion);
            p72 p72Var = this.A;
            boolean h = f | kd2Var.h(p72Var);
            ub2 ub2Var = this.B;
            boolean f2 = h | kd2Var.f(ub2Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f2 || Q == q18Var) {
                me5 me5Var = new me5(ic6Var, searchSuggestion, p72Var, ub2Var, (byte) 3);
                kd2Var.n0(me5Var);
                Q = me5Var;
            }
            sb2 sb2Var = (sb2) Q;
            boolean f3 = kd2Var.f(ic6Var) | kd2Var.h(searchSuggestion);
            ub2 ub2Var2 = this.C;
            boolean f4 = f3 | kd2Var.f(ub2Var2);
            Object Q2 = kd2Var.Q();
            if (f4 || Q2 == q18Var) {
                me5 me5Var2 = new me5(ic6Var, searchSuggestion, ub2Var2, this.D, (byte) 4);
                kd2Var.n0(me5Var2);
                Q2 = me5Var2;
            }
            nx7.f(title, thumbnailImage, V, sb2Var, (sb2) Q2, zc3.a(zc3Var, vz3.x), kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
