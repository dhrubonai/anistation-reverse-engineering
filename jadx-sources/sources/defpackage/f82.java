package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f82 extends zc1 implements mc4, wu0 {
    public final h82 N;
    public xd3 O;

    public f82() {
        h82 h82Var = new h82(0, new hj1(2, this, f82.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 1), 9);
        a1(h82Var);
        this.N = h82Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    @Override // defpackage.mc4
    public final void q0() {
        ?? obj = new Object();
        h98.I(this, new va1(obj, this, (byte) 6));
        xd3 xd3Var = (xd3) obj.x;
        if (this.N.f1().a()) {
            xd3 xd3Var2 = this.O;
            if (xd3Var2 != null) {
                xd3Var2.b();
            }
            if (xd3Var != null) {
                xd3Var.a();
            } else {
                xd3Var = null;
            }
            this.O = xd3Var;
        }
    }
}
