package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gn1 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gn1(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                jj6 jj6Var = (jj6) obj;
                hn1 hn1Var = (hn1) jj6Var;
                if (((bc) ((oa) wc7.P((hn1) obj3)).m159getDragAndDropManager()).b.contains(hn1Var) && q23.r(hn1Var, a34.e0((an1) obj2))) {
                    ((w05) obj4).x = jj6Var;
                    return ij6.z;
                }
                return ij6.x;
            default:
                sz4 sz4Var = (sz4) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                mw6 mw6Var = (mw6) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(mw6Var);
                } else {
                    sz4Var.x.getViewTreeObserver().removeOnPreDrawListener(mw6Var);
                }
                return pn6.a;
        }
    }
}
