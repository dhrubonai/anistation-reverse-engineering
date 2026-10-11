package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fq2 {
    public static final ou a;

    static {
        al6 al6Var;
        im0 a2 = z05.a(Map.class);
        try {
            a83 y = sw0.y(z05.d(eq2.class, a83.c));
            a83 y2 = sw0.y(z05.c(Object.class));
            a15 a15Var = z05.a;
            im0 a3 = z05.a(Map.class);
            List asList = Arrays.asList(y, y2);
            a15Var.getClass();
            asList.getClass();
            al6Var = new al6(a3, asList, 2);
        } catch (Throwable unused) {
            al6Var = null;
        }
        a = new ou("EngineCapabilities", new vk6(a2, false, al6Var));
        te4.O(rs2.a);
    }
}
