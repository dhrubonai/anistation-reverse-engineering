package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e25 extends t0 implements p11 {
    public final /* synthetic */ tu0 x;
    public final /* synthetic */ f25 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e25(tu0 tu0Var, f25 f25Var) {
        super(o11.x);
        this.x = tu0Var;
        this.y = f25Var;
    }

    @Override // defpackage.p11
    public final void handleException(l11 l11Var, Throwable th) {
        tu0 tu0Var = this.x;
        f25 f25Var = this.y;
        iv.Q(th, new n(tu0Var, f25Var, (byte) 28));
        p11 p11Var = (p11) f25Var.x.get(o11.x);
        if (p11Var != null) {
            p11Var.handleException(l11Var, th);
            return;
        }
        throw th;
    }
}
