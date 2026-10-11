package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k88 extends m88 {
    public static final m88 e;

    static {
        m88 a = new m88(null, new so5(0)).a();
        e = a;
        m88 m88Var = new m88(a, new so5(0));
        boolean z = !m88Var.c;
        Boolean bool = Boolean.TRUE;
        io3.A("Can't mutate after handing to trace", z);
        io3.A("Key already present", !m88Var.b());
        m88Var.b.put(m88.d, bool);
        m88Var.a();
    }
}
