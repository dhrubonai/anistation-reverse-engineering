package defpackage;

import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class om0 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ bx5 y;

    public /* synthetic */ om0(bx5 bx5Var, byte b) {
        this.x = b;
        this.y = bx5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 invoke$lambda$2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        bx5 bx5Var = this.y;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                invoke$lambda$2 = CleanUpWhenOpportunityExpires.invoke$lambda$2(bx5Var, th);
                return invoke$lambda$2;
            case 1:
                bx5Var.l(null);
                return pn6Var;
            default:
                bx5Var.l(null);
                return pn6Var;
        }
    }
}
