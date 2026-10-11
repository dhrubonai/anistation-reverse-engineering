package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fx implements ac4 {
    public static final fx a = new Object();
    public static final u12 b = u12.a("requestTimeMs");
    public static final u12 c = u12.a("requestUptimeMs");
    public static final u12 d = u12.a("clientInfo");
    public static final u12 e = u12.a("logSource");
    public static final u12 f = u12.a("logSourceName");
    public static final u12 g = u12.a("logEvent");
    public static final u12 h = u12.a("qosTier");

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        tk3 tk3Var = (tk3) obj;
        bc4 bc4Var = (bc4) obj2;
        bc4Var.d(b, ((ey) tk3Var).a);
        ey eyVar = (ey) tk3Var;
        bc4Var.d(c, eyVar.b);
        bc4Var.a(d, eyVar.c);
        bc4Var.a(e, eyVar.d);
        bc4Var.a(f, eyVar.e);
        bc4Var.a(g, eyVar.f);
        bc4Var.a(h, nx4.x);
    }
}
