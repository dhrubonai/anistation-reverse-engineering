package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class id5 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ jd5 y;

    public /* synthetic */ id5(jd5 jd5Var, byte b) {
        this.x = b;
        this.y = jd5Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        jd5 jd5Var = this.y;
        switch (b) {
            case 0:
                return Boolean.valueOf(jd5Var.K);
            default:
                h82 h82Var = jd5Var.q0;
                if (!h82Var.x.K) {
                    return null;
                }
                d82 f1 = h82Var.f1();
                int ordinal = f1.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    ze0.l();
                    return null;
                }
                if (f1.a()) {
                    return h82Var.d1(null);
                }
                h82 g = ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).g();
                if (g == null) {
                    return null;
                }
                return g.d1(wc7.N(h82Var));
        }
    }
}
