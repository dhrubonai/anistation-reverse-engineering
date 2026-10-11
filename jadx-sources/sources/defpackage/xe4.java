package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xe4 extends fg4 {
    public static final xe4 c = new fg4(0, 2, 1);

    /* JADX WARN: Type inference failed for: r0v2, types: [ed4, java.lang.Object] */
    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        int i;
        y23 y23Var;
        h13 h13Var = (h13) fm0Var.h(1);
        if (h13Var != null) {
            i = h13Var.a;
        } else {
            i = 0;
        }
        hj0 hj0Var = (hj0) fm0Var.h(0);
        if (i > 0) {
            ?? obj = new Object();
            obj.z = nrVar;
            obj.x = i;
            nrVar = obj;
        }
        if (gg4Var != null) {
            y23Var = new y23(gg4Var, bs5Var, (byte) 9);
        } else {
            y23Var = null;
        }
        hj0Var.S(nrVar, bs5Var, b25Var, y23Var);
    }
}
