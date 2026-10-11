package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ez7 extends ll7 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ zz7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez7(zz7 zz7Var, rv7 rv7Var, byte b) {
        super(rv7Var);
        this.e = b;
        this.f = zz7Var;
    }

    @Override // defpackage.ll7
    public final void a() {
        byte b = this.e;
        zz7 zz7Var = this.f;
        switch (b) {
            case 0:
                zz7Var.L();
                if (zz7Var.c0()) {
                    es7 es7Var = ((gu7) zz7Var.x).C;
                    gu7.l(es7Var);
                    es7Var.K.a("Inactivity, disconnecting from the service");
                    zz7Var.T();
                    return;
                }
                return;
            default:
                es7 es7Var2 = ((gu7) zz7Var.x).C;
                gu7.l(es7Var2);
                es7Var2.F.a("Tasks have been queued for a long time");
                return;
        }
    }
}
