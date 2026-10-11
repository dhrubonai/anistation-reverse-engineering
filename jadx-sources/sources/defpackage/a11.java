package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a11 implements PointerInputEventHandler {
    public final /* synthetic */ k96 a;
    public final /* synthetic */ jb6 b;

    public a11(k96 k96Var, jb6 jb6Var) {
        this.a = k96Var;
        this.b = jb6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        Object K = db.K(new z01(yq4Var, this.a, this.b, null), vz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }
}
