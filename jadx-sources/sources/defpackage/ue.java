package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ af y;

    public /* synthetic */ ue(af afVar, byte b) {
        this.x = b;
        this.y = afVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Looper looper;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        af afVar = this.y;
        switch (b) {
            case 0:
                sb2 sb2Var = (sb2) obj;
                View view = afVar.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sb2Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ca(sb2Var, (byte) 2));
                    }
                }
                return pn6Var;
            case 1:
                ActionMode actionMode = afVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return pn6Var;
            case 2:
                ActionMode actionMode2 = afVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return pn6Var;
            default:
                afVar.e.e();
                return new i5(afVar, (byte) 3);
        }
    }
}
