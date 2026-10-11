package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class za6 implements PointerInputEventHandler {
    public final /* synthetic */ v11 a;
    public final /* synthetic */ w44 b;
    public final /* synthetic */ w44 c;

    public za6(v11 v11Var, w44 w44Var, w44 w44Var2) {
        this.a = v11Var;
        this.b = w44Var;
        this.c = w44Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        ya6 ya6Var = new ya6(this.a, this.b, null, (byte) 0);
        ef efVar = new ef(this.c, (byte) 19);
        qo1 qo1Var = j76.a;
        Object K = db.K(new sc(yq4Var, ya6Var, efVar, new ot4(yq4Var), (vz0) null), vz0Var);
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        if (K != w11Var) {
            K = pn6Var;
        }
        if (K == w11Var) {
            return K;
        }
        return pn6Var;
    }
}
