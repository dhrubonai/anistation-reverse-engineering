package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ex implements ac4 {
    public static final ex a = new Object();
    public static final u12 b = u12.a("eventTimeMs");
    public static final u12 c = u12.a("eventCode");
    public static final u12 d = u12.a("eventUptimeMs");
    public static final u12 e = u12.a("sourceExtension");
    public static final u12 f = u12.a("sourceExtensionJsonProto3");
    public static final u12 g = u12.a("timezoneOffsetSeconds");
    public static final u12 h = u12.a("networkConnectionInfo");

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        qk3 qk3Var = (qk3) obj;
        bc4 bc4Var = (bc4) obj2;
        bc4Var.d(b, ((dy) qk3Var).a);
        dy dyVar = (dy) qk3Var;
        bc4Var.a(c, dyVar.b);
        bc4Var.d(d, dyVar.c);
        bc4Var.a(e, dyVar.d);
        bc4Var.a(f, dyVar.e);
        bc4Var.d(g, dyVar.f);
        bc4Var.a(h, dyVar.g);
    }
}
