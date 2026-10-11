package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tc0 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ nc0 y;

    public /* synthetic */ tc0(nc0 nc0Var, byte b) {
        this.x = b;
        this.y = nc0Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        nc0 nc0Var = this.y;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                if (th != null) {
                    nc0Var.a(th);
                }
                return pn6Var;
            case 1:
                if (th != null && !nc0Var.h()) {
                    nc0Var.a(th);
                }
                return pn6Var;
            case 2:
                if (th != null && !nc0Var.m()) {
                    nc0Var.a(th);
                }
                return pn6Var;
            default:
                h41.h(nc0Var, th);
                return pn6Var;
        }
    }
}
