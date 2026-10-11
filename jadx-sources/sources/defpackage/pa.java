package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ va y;

    public /* synthetic */ pa(va vaVar, byte b) {
        this.x = b;
        this.y = vaVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        va vaVar = this.y;
        switch (b) {
            case 0:
                View view = vaVar.A;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                vc5 vc5Var = (vc5) obj;
                if (vc5Var.y.contains(vc5Var)) {
                    mh4 snapshotObserver = vaVar.A.getSnapshotObserver();
                    snapshotObserver.a.d(vc5Var, vaVar.j0, new n(vc5Var, vaVar, (byte) 3));
                }
                return pn6.a;
        }
    }
}
