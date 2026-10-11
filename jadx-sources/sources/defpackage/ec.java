package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ec implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        byte b = this.a;
        byte b2 = 1;
        vz0 vz0Var2 = null;
        w11 w11Var = w11.x;
        Object obj = this.b;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                Object t = n77.t(yq4Var, new dc((fc) obj, vz0Var2, (byte) 0), vz0Var);
                if (t == w11Var) {
                    return t;
                }
                return pn6Var;
            case 1:
                Object d = j76.d(yq4Var, null, new mm((sb2) obj, (byte) 8), vz0Var, 7);
                if (d == w11Var) {
                    return d;
                }
                return pn6Var;
            case 2:
                Object d2 = j76.d(yq4Var, new b9(obj, vz0Var2, (byte) 4), null, vz0Var, 11);
                if (d2 == w11Var) {
                    return d2;
                }
                return pn6Var;
            case 3:
                Object a1 = ((a46) yq4Var).a1(new f50((r01) obj, vz0Var2, b2), vz0Var);
                if (a1 == w11Var) {
                    return a1;
                }
                return pn6Var;
            case 4:
                tr5 tr5Var = (tr5) obj;
                Object d3 = j76.d(yq4Var, new rr5(tr5Var, null), new nr5(tr5Var, (byte) 2), vz0Var, 3);
                if (d3 == w11Var) {
                    return d3;
                }
                return pn6Var;
            case 5:
                Object t2 = n77.t(yq4Var, new lt4((n06) obj, null), vz0Var);
                if (t2 == w11Var) {
                    return t2;
                }
                return pn6Var;
            case 6:
                Object t3 = n77.t(yq4Var, new dc(new nl5(1, (u86) obj, u86.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 11), vz0Var2, b2), vz0Var);
                if (t3 != w11Var) {
                    t3 = pn6Var;
                }
                if (t3 == w11Var) {
                    return t3;
                }
                return pn6Var;
            case 7:
                Object K = db.K(new xg((fa6) obj, yq4Var, vz0Var2, (byte) 9), vz0Var);
                if (K == w11Var) {
                    return K;
                }
                return pn6Var;
            case 8:
                jb6 jb6Var = (jb6) obj;
                Object m = o80.m(yq4Var, jb6Var.z, jb6Var.y, vz0Var);
                if (m == w11Var) {
                    return m;
                }
                return pn6Var;
            default:
                Object K2 = db.K(new xg(yq4Var, (k96) obj, vz0Var2, (byte) 5), vz0Var);
                if (K2 != w11Var) {
                    K2 = pn6Var;
                }
                if (K2 == w11Var) {
                    return K2;
                }
                return pn6Var;
        }
    }
}
