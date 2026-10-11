package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ oa y;

    public /* synthetic */ y9(oa oaVar, byte b) {
        this.x = b;
        this.y = oaVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Looper looper;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        oa oaVar = this.y;
        switch (b) {
            case 0:
                return new pd(oaVar, oaVar.getTextInputService(), (v11) obj);
            case 1:
                sb2 sb2Var = (sb2) obj;
                Handler handler = oaVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sb2Var.invoke();
                } else {
                    Handler handler2 = oaVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ca(sb2Var, (byte) 0));
                    }
                }
                return pn6Var;
            case 2:
                ((r72) oaVar.getFocusOwner()).h(((f72) obj).a, false);
                return pn6Var;
            case 3:
                return oaVar.getSavedStateRegistry();
            case 4:
                return Boolean.valueOf(oaVar.getScrollCaptureInProgress());
            case 5:
                return oaVar.getInputModeManager();
            case 6:
                return oaVar.getTextInputService();
            case 7:
                return oaVar.getSoftwareKeyboardController();
            case 8:
                return oaVar.getTextToolbar();
            default:
                return oaVar.getPointerIconService();
        }
    }
}
