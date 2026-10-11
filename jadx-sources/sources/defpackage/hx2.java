package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hx2 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ sb2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ hx2(xh4 xh4Var, List list, SubtitleStyleSettings subtitleStyleSettings, af3 af3Var, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2, int i) {
        this.C = xh4Var;
        this.D = list;
        this.E = subtitleStyleSettings;
        this.F = af3Var;
        this.y = ub2Var;
        this.z = ub2Var2;
        this.A = sb2Var;
        this.B = sb2Var2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(9);
                jx2.a((xm6) obj6, this.y, this.A, this.z, (ub2) obj5, (ub2) obj4, this.B, (sb2) obj3, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(24585);
                h26.f((xh4) obj6, (List) obj5, (SubtitleStyleSettings) obj4, (af3) obj3, this.y, this.z, this.A, this.B, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ hx2(xm6 xm6Var, ub2 ub2Var, sb2 sb2Var, ub2 ub2Var2, ub2 ub2Var3, ub2 ub2Var4, sb2 sb2Var2, sb2 sb2Var3, int i) {
        this.C = xm6Var;
        this.y = ub2Var;
        this.A = sb2Var;
        this.z = ub2Var2;
        this.D = ub2Var3;
        this.E = ub2Var4;
        this.B = sb2Var2;
        this.F = sb2Var3;
    }
}
