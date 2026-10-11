package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q07 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e9 b;

    public q07(boolean z, e9 e9Var) {
        this.a = z;
        this.b = e9Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        boolean z = this.a;
        pn6 pn6Var = pn6.a;
        if (!z) {
            return pn6Var;
        }
        Object t = n77.t(yq4Var, new p07(this.b, null), vz0Var);
        if (t == w11.x) {
            return t;
        }
        return pn6Var;
    }
}
