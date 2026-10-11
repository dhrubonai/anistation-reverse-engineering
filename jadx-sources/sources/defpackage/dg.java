package defpackage;

import android.view.MotionEvent;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sv6 y;

    public /* synthetic */ dg(sv6 sv6Var, byte b) {
        this.x = b;
        this.y = sv6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        oa oaVar;
        boolean dispatchTouchEvent;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sv6 sv6Var = this.y;
        switch (b) {
            case 0:
                sv6Var.N = (ub2) obj;
                return pn6Var;
            case 1:
                kh4 kh4Var = (kh4) obj;
                if (kh4Var instanceof oa) {
                    oaVar = (oa) kh4Var;
                } else {
                    oaVar = null;
                }
                if (oaVar != null) {
                    oaVar.getAndroidViewsHandler$ui().removeViewInLayout(sv6Var);
                    HashMap<za3, jg> layoutNodeToHolder = oaVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder();
                    wk6.i(layoutNodeToHolder).remove(oaVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(sv6Var));
                    sv6Var.setImportantForAccessibility(0);
                }
                sv6Var.removeAllViewsInLayout();
                return pn6Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = sv6Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = sv6Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
