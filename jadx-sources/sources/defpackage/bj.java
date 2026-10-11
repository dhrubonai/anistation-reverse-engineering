package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bj implements lg3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ bj(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ko4 ko4Var = (ko4) obj2;
                w44 w44Var = (w44) obj;
                if (rj.a[dg3Var.ordinal()] == 1 && !((dq4) w44Var.getValue()).j) {
                    ko4Var.J();
                    return;
                }
                return;
            case 1:
                wd4 wd4Var = (wd4) obj2;
                yr0 yr0Var = (yr0) obj;
                if (dg3Var == dg3.ON_CREATE) {
                    onBackInvokedDispatcher = yr0Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    wd4Var.c(onBackInvokedDispatcher);
                    return;
                }
                return;
            default:
                kx3 kx3Var = (kx3) obj2;
                qx3 qx3Var = (qx3) obj;
                kx3Var.getClass();
                if (dg3Var == dg3.ON_DESTROY) {
                    kx3Var.a(qx3Var);
                    return;
                }
                return;
        }
    }
}
