package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zi1 {
    public static final ou a;
    public static final ou b;
    public static final d46 c;
    public static final dn0 d;

    static {
        al6 al6Var;
        al6 al6Var2;
        im0 a2 = z05.a(pn6.class);
        al6 al6Var3 = null;
        try {
            al6Var = z05.c(pn6.class);
        } catch (Throwable unused) {
            al6Var = null;
        }
        a = new ou("SkipSaveBody", new vk6(a2, false, al6Var));
        im0 a3 = z05.a(pn6.class);
        try {
            al6Var2 = z05.c(pn6.class);
        } catch (Throwable unused2) {
            al6Var2 = null;
        }
        b = new ou("ResponseBodySaved", new vk6(a3, false, al6Var2));
        c = new d46(new zu0((byte) 29));
        d = new dn0("SaveBody", new zu0((byte) 25), new f01((byte) 6));
        int i = yi1.x;
        im0 a4 = z05.a(en0.class);
        try {
            a83 a83Var = a83.c;
            im0 a5 = z05.a(dn0.class);
            z05.a.getClass();
            yk6 yk6Var = new yk6(a5);
            z05.b(yk6Var, z05.c(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            al6Var3 = z05.d(en0.class, sw0.y(new al6(yk6Var, list, 0)));
        } catch (Throwable unused3) {
        }
        new ou("DoubleReceivePlugin", new vk6(a4, false, al6Var3));
    }
}
