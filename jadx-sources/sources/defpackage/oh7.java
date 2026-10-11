package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oh7 {
    public static final s08 a;
    public static volatile String b;
    public static final qb7 c;

    /* JADX WARN: Type inference failed for: r2v0, types: [yh2, java.lang.Object] */
    static {
        nh7 nh7Var = nh7.b;
        int i = zw2.z;
        d18 d18Var = new d18(nh7Var, true, v15.G);
        ?? obj = new Object();
        obj.y = d18Var;
        c = new qb7((Object) obj, (byte) 10);
        a = new s08("__phenotype_server_token", obj, "");
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
