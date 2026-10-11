package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ga1 {
    public static final ou a;
    public static final yk3 b;

    static {
        al6 al6Var;
        im0 a2 = z05.a(pn6.class);
        try {
            al6Var = z05.c(pn6.class);
        } catch (Throwable unused) {
            al6Var = null;
        }
        a = new ou("ValidateMark", new vk6(a2, false, al6Var));
        b = u93.a("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
