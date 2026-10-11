package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wo implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                sb2 sb2Var = (sb2) obj;
                if (sb2Var != null) {
                    sb2Var.invoke();
                    return;
                }
                return;
            default:
                ((od4) obj).a();
                return;
        }
    }
}
