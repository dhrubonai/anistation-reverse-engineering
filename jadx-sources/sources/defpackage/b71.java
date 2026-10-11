package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b71 implements ri3 {
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ hv6 y;

    public /* synthetic */ b71(q7 q7Var, hv6 hv6Var) {
        this.y = hv6Var;
    }

    @Override // defpackage.ri3
    public final void invoke(Object obj) {
        byte b = this.x;
        hv6 hv6Var = this.y;
        switch (b) {
            case 0:
                mr3 mr3Var = (mr3) ((r7) obj);
                eb2 eb2Var = mr3Var.p;
                if (eb2Var != null) {
                    ea2 ea2Var = (ea2) eb2Var.z;
                    if (ea2Var.x == -1) {
                        da2 a = ea2Var.a();
                        a.v = hv6Var.a;
                        a.w = hv6Var.b;
                        mr3Var.p = new eb2(new ea2(a), eb2Var.y, (String) eb2Var.A, (byte) 4);
                    }
                }
                int i = hv6Var.a;
                return;
            default:
                ((io4) obj).a(hv6Var);
                return;
        }
    }

    public /* synthetic */ b71(hv6 hv6Var) {
        this.y = hv6Var;
    }
}
