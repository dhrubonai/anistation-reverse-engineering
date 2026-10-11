package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cg implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sv6 y;
    public final /* synthetic */ za3 z;

    public /* synthetic */ cg(sv6 sv6Var, za3 za3Var, byte b) {
        this.x = b;
        this.y = sv6Var;
        this.z = za3Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        WindowInsets b;
        oa oaVar;
        byte b2 = this.x;
        pn6 pn6Var = pn6.a;
        za3 za3Var = this.z;
        sv6 sv6Var = this.y;
        switch (b2) {
            case 0:
                q23.H(sv6Var, za3Var);
                ((oa) sv6Var.z).d0 = true;
                int[] iArr = sv6Var.K;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = sv6Var.y;
                view.getLocationOnScreen(iArr);
                long j = sv6Var.L;
                long j2 = ((ha3) obj).j();
                sv6Var.L = j2;
                v57 v57Var = sv6Var.M;
                if (v57Var != null && ((i != iArr[0] || i2 != iArr[1] || !k13.a(j, j2)) && (b = sv6Var.k(v57Var).b()) != null)) {
                    view.dispatchApplyWindowInsets(b);
                }
                return pn6Var;
            case 1:
                View view2 = sv6Var.y;
                kh4 kh4Var = (kh4) obj;
                if (kh4Var instanceof oa) {
                    oaVar = (oa) kh4Var;
                } else {
                    oaVar = null;
                }
                if (oaVar != null) {
                    oaVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(sv6Var, za3Var);
                    oaVar.getAndroidViewsHandler$ui().addView(sv6Var);
                    oaVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(za3Var, sv6Var);
                    sv6Var.setImportantForAccessibility(1);
                    pv6.a(sv6Var, new ha(oaVar, za3Var, oaVar));
                }
                if (view2.getParent() != sv6Var) {
                    sv6Var.addView(view2);
                }
                return pn6Var;
            default:
                q23.H(sv6Var, za3Var);
                return pn6Var;
        }
    }
}
