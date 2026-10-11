package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class z05 {
    public static final a15 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a15] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r0 = 0;
        try {
            r0 = (a15) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
    }

    public static im0 a(Class cls) {
        a.getClass();
        return new im0(cls);
    }

    public static void b(yk6 yk6Var, al6 al6Var) {
        a15 a15Var = a;
        List singletonList = Collections.singletonList(al6Var);
        a15Var.getClass();
        singletonList.getClass();
        if (yk6Var.A == null) {
            yk6Var.A = singletonList;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + yk6Var + "' have already been initialized.").toString());
    }

    public static al6 c(Class cls) {
        im0 a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new al6(a2, list, 0);
    }

    public static al6 d(Class cls, a83 a83Var) {
        im0 a2 = a(cls);
        List singletonList = Collections.singletonList(a83Var);
        a.getClass();
        singletonList.getClass();
        return new al6(a2, singletonList, 0);
    }

    public static al6 e(Class cls, a83... a83VarArr) {
        im0 a2 = a(cls);
        List S0 = ms.S0(a83VarArr);
        a.getClass();
        return new al6(a2, S0, 0);
    }
}
