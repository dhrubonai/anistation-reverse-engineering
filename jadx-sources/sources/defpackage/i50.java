package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i50 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng6 b;

    public /* synthetic */ i50(ng6 ng6Var, byte b) {
        this.a = b;
        this.b = ng6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        byte b = this.a;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        vz0 vz0Var2 = null;
        ng6 ng6Var = this.b;
        switch (b) {
            case 0:
                Object K = db.K(new h50(yq4Var, ng6Var, vz0Var2, (byte) 0), vz0Var);
                if (K == w11Var) {
                    return K;
                }
                return pn6Var;
            default:
                Object K2 = db.K(new h50(yq4Var, ng6Var, vz0Var2, (byte) 1), vz0Var);
                if (K2 == w11Var) {
                    return K2;
                }
                return pn6Var;
        }
    }
}
