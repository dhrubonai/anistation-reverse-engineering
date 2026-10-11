package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class i70 {
    public static final ou a;
    public static final ou b;
    public static final dn0 c;

    static {
        al6 al6Var;
        im0 a2 = z05.a(dv4.class);
        al6 al6Var2 = null;
        try {
            al6Var = z05.c(dv4.class);
        } catch (Throwable unused) {
            al6Var = null;
        }
        a = new ou("UploadProgressListenerAttributeKey", new vk6(a2, false, al6Var));
        im0 a3 = z05.a(dv4.class);
        try {
            al6Var2 = z05.c(dv4.class);
        } catch (Throwable unused2) {
        }
        b = new ou("DownloadProgressListenerAttributeKey", new vk6(a3, false, al6Var2));
        c = new dn0("BodyProgress", new zu0((byte) 25), new ui((byte) 20));
    }
}
