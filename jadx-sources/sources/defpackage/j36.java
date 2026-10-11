package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j36 implements PointerInputEventHandler {
    public static final j36 b = new j36(0);
    public static final j36 c = new j36(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ j36(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [x45, ic2] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        byte b2 = this.a;
        pn6 pn6Var = pn6.a;
        switch (b2) {
            case 0:
                return pn6Var;
            default:
                Object a1 = ((a46) yq4Var).a1(new x45(2, null), vz0Var);
                if (a1 == w11.x) {
                    return a1;
                }
                return pn6Var;
        }
    }
}
