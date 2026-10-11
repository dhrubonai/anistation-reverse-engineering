package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r40 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cc6 b;

    public /* synthetic */ r40(cc6 cc6Var, byte b) {
        this.a = b;
        this.b = cc6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        byte b = this.a;
        w11 w11Var = w11.x;
        cc6 cc6Var = this.b;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                Object K = db.K(new xg(cc6Var, yq4Var, null, (byte) 10), vz0Var);
                if (K != w11Var) {
                    K = pn6Var;
                }
                if (K == w11Var) {
                    return K;
                }
                return pn6Var;
            case 1:
                Object K2 = db.K(new e05(cc6Var, yq4Var, true, (vz0) null), vz0Var);
                if (K2 != w11Var) {
                    K2 = pn6Var;
                }
                if (K2 == w11Var) {
                    return K2;
                }
                return pn6Var;
            default:
                Object K3 = db.K(new e05(cc6Var, yq4Var, false, (vz0) null), vz0Var);
                if (K3 != w11Var) {
                    K3 = pn6Var;
                }
                if (K3 == w11Var) {
                    return K3;
                }
                return pn6Var;
        }
    }
}
